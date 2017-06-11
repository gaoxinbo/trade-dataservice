package gaoxinbo.dataservice.model.dal;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Data
public class DailyPriceMapper {
    String symbol;
    Date tradeDate;
    BigDecimal openPrice;
    BigDecimal closePrice;
}
