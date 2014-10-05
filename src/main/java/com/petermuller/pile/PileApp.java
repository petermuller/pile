package com.petermuller.pile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "v1" path)
 */
@Path("v1")
public class PileApp {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @Path("/ping")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public static SimpleResponse ping() {
        return new SimpleResponse("Pong! (Success!)");
    }

}
