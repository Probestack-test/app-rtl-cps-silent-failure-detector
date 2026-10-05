package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.RegisterMonitorRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for RegisterMonitorRequest documents.
 */
public interface RegisterMonitorRequestMongoRepository extends MongoRepository<RegisterMonitorRequestDocument, String> {
}
