package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.AcknowledgeSilenceRequestDomainRepository;
import com.probestack.forgestudio.design.model.AcknowledgeSilenceRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.AcknowledgeSilenceRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.AcknowledgeSilenceRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AcknowledgeSilenceRequestMongoPersistenceAdapter implements AcknowledgeSilenceRequestDomainRepository {
    private final AcknowledgeSilenceRequestMongoRepository repository;

    public AcknowledgeSilenceRequestMongoPersistenceAdapter(
            AcknowledgeSilenceRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AcknowledgeSilenceRequest save(AcknowledgeSilenceRequest acknowledgeSilenceRequest) {
        AcknowledgeSilenceRequestDocument document = toDocument(acknowledgeSilenceRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<AcknowledgeSilenceRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<AcknowledgeSilenceRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private AcknowledgeSilenceRequestDocument toDocument(
            AcknowledgeSilenceRequest acknowledgeSilenceRequest) {
        AcknowledgeSilenceRequestDocument document = new AcknowledgeSilenceRequestDocument();
        BeanUtils.copyProperties(acknowledgeSilenceRequest, document);
        return document;
    }

    private AcknowledgeSilenceRequest toDomain(AcknowledgeSilenceRequestDocument document) {
        AcknowledgeSilenceRequest domain = new AcknowledgeSilenceRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
