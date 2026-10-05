package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Monitor;
import com.probestack.forgestudio.design.model.RegisterMonitorRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.MonitorsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")
@Controller
@RequestMapping("${openapi.silentFailureDetector.base-path:/v1}")
public class MonitorsApiController implements MonitorsApi {

    private static final Logger log = LoggerFactory.getLogger(MonitorsApiController.class);

    private final MonitorsService monitorsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public MonitorsApiController(MonitorsService monitorsService, GeneratedRequestValidator generatedRequestValidator) {
        this.monitorsService = monitorsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Monitor> getMonitor(@PathVariable() UUID monitorId) {
        log.info("Processing getMonitor request");
        try {
            var response = monitorsService.getMonitor(monitorId);
            log.info("getMonitor completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getMonitor: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Monitor> registerMonitor(@RequestBody() RegisterMonitorRequest registerMonitorRequest) {
        log.info("Processing registerMonitor request");
        try {
            generatedRequestValidator.validate("registerMonitor", registerMonitorRequest);
            var response = monitorsService.registerMonitor(registerMonitorRequest);
            log.info("registerMonitor completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process registerMonitor: {}", e.getMessage(), e);
            throw e;
        }
    }
}
