package dataservice.rest.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RestResponseContainer <T> {
    String status;
    T detail;
    Integer errorCode;
    String errorMsg;
}
