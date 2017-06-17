package gaoxinbo.dataservice.api;

import gaoxinbo.dataservice.handler.BuildVersionHandler;
import gaoxinbo.dataservice.model.version.BuildVersion;
import org.glassfish.jersey.server.JSONP;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("build")
public class BuildVersionRest {

    @Inject
    BuildVersionHandler  buildVersionHandler;

    @GET
    @Produces("application/javascript")
    @JSONP(queryParam="callback")
    public BuildVersion getCurrentPosition() {
        return buildVersionHandler.getBuildVersion();
    }
}
