package gaoxinbo.dataservice.model.dal;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@NoArgsConstructor
@Data
public class DailyPriceMapper {
    String symbol;
    Date tradeDate;
    BigDecimal openPrice;
    BigDecimal closePrice;
}
