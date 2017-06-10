package dataservice.dao.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contract {
    Integer id;
    String symbol;
    String name;
    String exchange;
}
