package gaoxinbo.dataservice.model.dal;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@NoArgsConstructor
@Data
public class PositionMapper {

    String symbol;
    Integer position;
    BigDecimal avgCost;
    String currency;

}
