package gaoxinbo.dataservice.api;


import gaoxinbo.dataservice.model.dal.DailyPriceMapper;
import gaoxinbo.dataservice.model.dal.PositionMapper;
import gaoxinbo.dataservice.view.CurrentPositionSummary;
import org.glassfish.jersey.server.JSONP;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;


@Path("position")
public class Position {

    @Inject
    JdbcTemplate jdbcTemplate;


    @GET
    @Produces("application/javascript")
    @JSONP(queryParam="callback")
    public Object getCurrentPosition() {

        List<PositionMapper> positionMapperList = jdbcTemplate.query("select * from position", new BeanPropertyRowMapper(PositionMapper.class));



        List<CurrentPositionSummary> list = new LinkedList<>();


        for (final PositionMapper position : positionMapperList) {
            final DailyPriceMapper dailyPriceMapper = (DailyPriceMapper)jdbcTemplate.queryForObject("select * from daily_price where symbol = ? order by trade_date desc limit 1", new Object[] {position.getSymbol()},  new BeanPropertyRowMapper(DailyPriceMapper.class));

            final CurrentPositionSummary currentPositionSummary = CurrentPositionSummary.builder()
                    .position(position.getPosition())
                    .symbol(position.getSymbol())
                    .avgCost(position.getAvgCost())
                    .currency(position.getCurrency())
                    .lastClosePrice(dailyPriceMapper.getClosePrice())
                    .lastTradingDate(dailyPriceMapper.getTradeDate())
                    .profit(dailyPriceMapper.getClosePrice().subtract(position.getAvgCost()).multiply(BigDecimal.valueOf(position.getPosition())))
                    .build();
            list.add(currentPositionSummary);
        }

        return list;
    }
}
