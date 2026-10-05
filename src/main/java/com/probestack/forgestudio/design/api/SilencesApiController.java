package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AcknowledgeSilenceRequest;
import com.probestack.forgestudio.design.model.Silence;
import com.probestack.forgestudio.design.model.SilenceList;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.SilencesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")
@Controller
@RequestMapping("${openapi.silentFailureDetector.base-path:/v1}")
public class SilencesApiController implements SilencesApi {

    private static final Logger log = LoggerFactory.getLogger(SilencesApiController.class);

    private final SilencesService silencesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public SilencesApiController(SilencesService silencesService, GeneratedRequestValidator generatedRequestValidator) {
        this.silencesService = silencesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Silence> acknowledgeSilence(@PathVariable() UUID silenceId, @RequestBody() AcknowledgeSilenceRequest acknowledgeSilenceRequest) {
        log.info("Processing acknowledgeSilence request");
        try {
            generatedRequestValidator.validate("acknowledgeSilence", acknowledgeSilenceRequest);
            var response = silencesService.acknowledgeSilence(silenceId, acknowledgeSilenceRequest);
            log.info("acknowledgeSilence completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process acknowledgeSilence: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<SilenceList> listSilences(@RequestParam(value = "status", required = false) String status, @RequestParam(value = "severity", required = false) String severity, @RequestParam(value = "serviceName", required = false) String serviceName, @RequestParam(value = "environment", required = false) String environment, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listSilences request");
        try {
            var response = silencesService.listSilences(status, severity, serviceName, environment, page, size);
            log.info("listSilences completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listSilences: {}", e.getMessage(), e);
            throw e;
        }
    }
}
