package com.redhat.training.service;

import com.redhat.training.event.RequestCreatedEvent;
import com.redhat.training.model.RepairRequest;
import com.redhat.training.model.RepairRequestStatus;
import io.debezium.outbox.quarkus.ExportedEvent;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@ApplicationScoped
public class RepairRequestService {

    @Inject
    Event<ExportedEvent<?, ?>> event;

    public List<RepairRequest> get() {
        return RepairRequest.listAll(Sort.by("id"));
    }

    @Transactional
    public Long create(RepairRequest repairRequest) {
        if (repairRequest.getId() != null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }

        repairRequest.setRequestDate(LocalDateTime.now());
        repairRequest.setStatus(RepairRequestStatus.CREATED);
        repairRequest.setPlumberId(ThreadLocalRandom.current().nextLong(1, 7));

        repairRequest.persist();

        // TODO: Fire a RequestCreatedEvent event
        event.fire(RequestCreatedEvent.of(repairRequest));

        return repairRequest.getId();
    }

}
