package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.AcknowledgeSilenceRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for AcknowledgeSilenceRequest domain operations.
 */
public interface AcknowledgeSilenceRequestDomainRepository {
    AcknowledgeSilenceRequest save(AcknowledgeSilenceRequest acknowledgeSilenceRequest);

    Optional<AcknowledgeSilenceRequest> findById(String id);

    List<AcknowledgeSilenceRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
