package server;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/event")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
    @POST
    public void postEvent() {
        System.out.println();
    }
}

