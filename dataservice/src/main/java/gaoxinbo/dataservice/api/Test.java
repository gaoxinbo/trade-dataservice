package gaoxinbo.dataservice.api;


import com.google.inject.Inject;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class Test {

    @Inject
    JdbcTemplate jdbcTemplate;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        final List list = jdbcTemplate.queryForList("select * from position");
        return "It works";
    }
}
