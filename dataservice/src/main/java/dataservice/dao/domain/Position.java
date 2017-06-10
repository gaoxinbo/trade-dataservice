package dataservice.dao.domain;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Position {

    private Integer id;
    private String account;
    private String symbol;
    private String secType;
    private String currency;
    private BigDecimal pos;
    private BigDecimal avgCost;
    private String exchange;
    private Date gmtCreated;
}
