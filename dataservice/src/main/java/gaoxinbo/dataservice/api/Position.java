package gaoxinbo.dataservice.api;


import gaoxinbo.dataservice.model.Model;
import org.glassfish.jersey.server.JSONP;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("position")
public class Position {

    @Inject
    JdbcTemplate jdbcTemplate;


    @GET
    @Produces("application/javascript")
    @JSONP(queryParam="callback")
    public Model getCurrentPosition() {
        final Model model = new Model();
        model.setName("gaoxinbo");
        model.setNumber(1);

        return model;
    }
}
