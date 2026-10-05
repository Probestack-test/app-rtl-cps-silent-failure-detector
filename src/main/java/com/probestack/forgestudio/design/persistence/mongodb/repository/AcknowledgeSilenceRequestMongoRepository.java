package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.AcknowledgeSilenceRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for AcknowledgeSilenceRequest documents.
 */
public interface AcknowledgeSilenceRequestMongoRepository extends MongoRepository<AcknowledgeSilenceRequestDocument, String> {
}
