package ch.carve.sayhello.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    @Produces("application/json")
    public Response doGet() {
        return Response.ok("Hello").build();
    }
}