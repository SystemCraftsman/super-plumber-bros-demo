package com.redhat.training.rest;

import com.redhat.training.model.RepairRequest;
import com.redhat.training.service.RepairRequestService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import com.redhat.training.model.Plumber;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import com.redhat.training.service.PlumberService;

@Path("plumbers")
@Produces("application/json")
@Consumes("application/json")
public class PlumberResource {

    @Inject
    @RestClient
    PlumberService plumberService;

    @GET
    public List<Plumber> get() {
        return plumberService.get();
    }


}
