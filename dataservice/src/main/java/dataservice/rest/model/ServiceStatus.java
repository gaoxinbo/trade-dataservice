package dataservice.rest.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ServiceStatus {
    String serviceName;
    String status;
}
