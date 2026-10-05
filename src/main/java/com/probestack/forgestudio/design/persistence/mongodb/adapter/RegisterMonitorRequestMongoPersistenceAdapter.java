package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.RegisterMonitorRequestDomainRepository;
import com.probestack.forgestudio.design.model.RegisterMonitorRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.RegisterMonitorRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.RegisterMonitorRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RegisterMonitorRequestMongoPersistenceAdapter implements RegisterMonitorRequestDomainRepository {
    private final RegisterMonitorRequestMongoRepository repository;

    public RegisterMonitorRequestMongoPersistenceAdapter(
            RegisterMonitorRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public RegisterMonitorRequest save(RegisterMonitorRequest registerMonitorRequest) {
        RegisterMonitorRequestDocument document = toDocument(registerMonitorRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<RegisterMonitorRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<RegisterMonitorRequest> findAll() {
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

    private RegisterMonitorRequestDocument toDocument(
            RegisterMonitorRequest registerMonitorRequest) {
        RegisterMonitorRequestDocument document = new RegisterMonitorRequestDocument();
        BeanUtils.copyProperties(registerMonitorRequest, document);
        return document;
    }

    private RegisterMonitorRequest toDomain(RegisterMonitorRequestDocument document) {
        RegisterMonitorRequest domain = new RegisterMonitorRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
