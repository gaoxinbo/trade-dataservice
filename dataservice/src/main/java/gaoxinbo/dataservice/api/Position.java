package gaoxinbo.dataservice.api;


import gaoxinbo.dataservice.model.dal.DailyPriceMapper;
import gaoxinbo.dataservice.model.dal.PositionMapper;
import org.glassfish.jersey.server.JSONP;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("position")
public class Position {

    @Inject
    JdbcTemplate jdbcTemplate;


    @GET
    @Produces("application/javascript")
    @JSONP(queryParam="callback")
    public Object getCurrentPosition() {


        return jdbcTemplate.query("select * from daily_price where symbol = 'FB'", new BeanPropertyRowMapper(DailyPriceMapper.class));

    }
}
