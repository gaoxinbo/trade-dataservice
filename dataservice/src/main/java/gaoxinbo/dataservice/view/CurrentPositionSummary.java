package gaoxinbo.dataservice.view;


import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;


@Builder
@Getter
public class CurrentPositionSummary {
    String symbol;
    String currency;
    Integer position;
    Date lastTradingDate;
    BigDecimal avgCost;
    BigDecimal lastClosePrice;
    BigDecimal profit;
}
