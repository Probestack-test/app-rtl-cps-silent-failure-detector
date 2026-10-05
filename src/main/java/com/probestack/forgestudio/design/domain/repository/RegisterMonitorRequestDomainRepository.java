package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.RegisterMonitorRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for RegisterMonitorRequest domain operations.
 */
public interface RegisterMonitorRequestDomainRepository {
    RegisterMonitorRequest save(RegisterMonitorRequest registerMonitorRequest);

    Optional<RegisterMonitorRequest> findById(String id);

    List<RegisterMonitorRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
