package gaoxinbo.dataservice.model.version;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BuildVersion {
    String buildDate;
    String version;
    String buildHost;
}
