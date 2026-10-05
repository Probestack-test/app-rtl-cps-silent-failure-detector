package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Silence
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class Silence {

  private UUID silenceId;

  private UUID monitorId;

  private String monitorName;

  private String serviceName;

  /**
   * Gets or Sets environment
   */
  public enum EnvironmentEnum {
    DEV("DEV"),
    
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DETECTED("DETECTED"),
    
    ACKNOWLEDGED("ACKNOWLEDGED"),
    
    RESOLVED("RESOLVED"),
    
    FALSE_POSITIVE("FALSE_POSITIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    WARNING("WARNING"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime detectedAt;

  private Integer expectedIntervalSeconds;

  private Integer currentSilenceDurationSeconds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastSignalAt;

  private BigDecimal lastSignalValue;

  private String estimatedCustomerImpact;

  private String businessImpact;

  private String probableCause;

  @Valid
  private List<String> relatedIncidents;

  private String acknowledgedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime acknowledgedAt;

  private String resolvedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime resolvedAt;

  private String rootCause;

  private String reason;

  private String auditReference;

  public Silence() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Silence(UUID silenceId, UUID monitorId, String serviceName, StatusEnum status, SeverityEnum severity, OffsetDateTime detectedAt, Integer expectedIntervalSeconds, Integer currentSilenceDurationSeconds) {
    this.silenceId = silenceId;
    this.monitorId = monitorId;
    this.serviceName = serviceName;
    this.status = status;
    this.severity = severity;
    this.detectedAt = detectedAt;
    this.expectedIntervalSeconds = expectedIntervalSeconds;
    this.currentSilenceDurationSeconds = currentSilenceDurationSeconds;
  }

  public Silence silenceId(UUID silenceId) {
    this.silenceId = silenceId;
    return this;
  }

  /**
   * Get silenceId
   * @return silenceId
  */
  @NotNull @Valid   @Schema(name = "silenceId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("silenceId")
  public UUID getSilenceId() {
    return silenceId;
  }

  public void setSilenceId(UUID silenceId) {
    this.silenceId = silenceId;
  }

  public Silence monitorId(UUID monitorId) {
    this.monitorId = monitorId;
    return this;
  }

  /**
   * Get monitorId
   * @return monitorId
  */
  @NotNull @Valid   @Schema(name = "monitorId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monitorId")
  public UUID getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(UUID monitorId) {
    this.monitorId = monitorId;
  }

  public Silence monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

  /**
   * Get monitorName
   * @return monitorName
  */
    @Schema(name = "monitorName", example = "payment-queue-consumer-heartbeat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitorName")
  public String getMonitorName() {
    return monitorName;
  }

  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }

  public Silence serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @NotNull   @Schema(name = "serviceName", example = "payment-processor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Silence environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
    @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public Silence status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "DETECTED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Silence severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @NotNull   @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Silence detectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
    return this;
  }

  /**
   * Get detectedAt
   * @return detectedAt
  */
  @NotNull @Valid   @Schema(name = "detectedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectedAt")
  public OffsetDateTime getDetectedAt() {
    return detectedAt;
  }

  public void setDetectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
  }

  public Silence expectedIntervalSeconds(Integer expectedIntervalSeconds) {
    this.expectedIntervalSeconds = expectedIntervalSeconds;
    return this;
  }

  /**
   * Get expectedIntervalSeconds
   * @return expectedIntervalSeconds
  */
  @NotNull   @Schema(name = "expectedIntervalSeconds", example = "60", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedIntervalSeconds")
  public Integer getExpectedIntervalSeconds() {
    return expectedIntervalSeconds;
  }

  public void setExpectedIntervalSeconds(Integer expectedIntervalSeconds) {
    this.expectedIntervalSeconds = expectedIntervalSeconds;
  }

  public Silence currentSilenceDurationSeconds(Integer currentSilenceDurationSeconds) {
    this.currentSilenceDurationSeconds = currentSilenceDurationSeconds;
    return this;
  }

  /**
   * Get currentSilenceDurationSeconds
   * @return currentSilenceDurationSeconds
  */
  @NotNull   @Schema(name = "currentSilenceDurationSeconds", example = "720", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentSilenceDurationSeconds")
  public Integer getCurrentSilenceDurationSeconds() {
    return currentSilenceDurationSeconds;
  }

  public void setCurrentSilenceDurationSeconds(Integer currentSilenceDurationSeconds) {
    this.currentSilenceDurationSeconds = currentSilenceDurationSeconds;
  }

  public Silence lastSignalAt(OffsetDateTime lastSignalAt) {
    this.lastSignalAt = lastSignalAt;
    return this;
  }

  /**
   * Get lastSignalAt
   * @return lastSignalAt
  */
  @Valid   @Schema(name = "lastSignalAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastSignalAt")
  public OffsetDateTime getLastSignalAt() {
    return lastSignalAt;
  }

  public void setLastSignalAt(OffsetDateTime lastSignalAt) {
    this.lastSignalAt = lastSignalAt;
  }

  public Silence lastSignalValue(BigDecimal lastSignalValue) {
    this.lastSignalValue = lastSignalValue;
    return this;
  }

  /**
   * Get lastSignalValue
   * @return lastSignalValue
  */
  @Valid   @Schema(name = "lastSignalValue", example = "42.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastSignalValue")
  public BigDecimal getLastSignalValue() {
    return lastSignalValue;
  }

  public void setLastSignalValue(BigDecimal lastSignalValue) {
    this.lastSignalValue = lastSignalValue;
  }

  public Silence estimatedCustomerImpact(String estimatedCustomerImpact) {
    this.estimatedCustomerImpact = estimatedCustomerImpact;
    return this;
  }

  /**
   * Get estimatedCustomerImpact
   * @return estimatedCustomerImpact
  */
    @Schema(name = "estimatedCustomerImpact", example = "Roughly 480 payments/hour not being processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedCustomerImpact")
  public String getEstimatedCustomerImpact() {
    return estimatedCustomerImpact;
  }

  public void setEstimatedCustomerImpact(String estimatedCustomerImpact) {
    this.estimatedCustomerImpact = estimatedCustomerImpact;
  }

  public Silence businessImpact(String businessImpact) {
    this.businessImpact = businessImpact;
    return this;
  }

  /**
   * Get businessImpact
   * @return businessImpact
  */
    @Schema(name = "businessImpact", example = "Payments stop being processed; customers see failures.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessImpact")
  public String getBusinessImpact() {
    return businessImpact;
  }

  public void setBusinessImpact(String businessImpact) {
    this.businessImpact = businessImpact;
  }

  public Silence probableCause(String probableCause) {
    this.probableCause = probableCause;
    return this;
  }

  /**
   * AI-generated hypothesis for why the signal stopped.
   * @return probableCause
  */
    @Schema(name = "probableCause", example = "Consumer pod likely OOMKilled; check pod restart count.", description = "AI-generated hypothesis for why the signal stopped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("probableCause")
  public String getProbableCause() {
    return probableCause;
  }

  public void setProbableCause(String probableCause) {
    this.probableCause = probableCause;
  }

  public Silence relatedIncidents(List<String> relatedIncidents) {
    this.relatedIncidents = relatedIncidents;
    return this;
  }

  public Silence addRelatedIncidentsItem(String relatedIncidentsItem) {
    if (this.relatedIncidents == null) {
      this.relatedIncidents = new ArrayList<>();
    }
    this.relatedIncidents.add(relatedIncidentsItem);
    return this;
  }

  /**
   * Get relatedIncidents
   * @return relatedIncidents
  */
    @Schema(name = "relatedIncidents", example = "[\"INC-2050\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedIncidents")
  public List<String> getRelatedIncidents() {
    return relatedIncidents;
  }

  public void setRelatedIncidents(List<String> relatedIncidents) {
    this.relatedIncidents = relatedIncidents;
  }

  public Silence acknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
    return this;
  }

  /**
   * Get acknowledgedBy
   * @return acknowledgedBy
  */
    @Schema(name = "acknowledgedBy", example = "sre.oncall@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedBy")
  public String getAcknowledgedBy() {
    return acknowledgedBy;
  }

  public void setAcknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
  }

  public Silence acknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

  /**
   * Get acknowledgedAt
   * @return acknowledgedAt
  */
  @Valid   @Schema(name = "acknowledgedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedAt")
  public OffsetDateTime getAcknowledgedAt() {
    return acknowledgedAt;
  }

  public void setAcknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  public Silence resolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

  /**
   * Get resolvedBy
   * @return resolvedBy
  */
    @Schema(name = "resolvedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedBy")
  public String getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public Silence resolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
    return this;
  }

  /**
   * Get resolvedAt
   * @return resolvedAt
  */
  @Valid   @Schema(name = "resolvedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedAt")
  public OffsetDateTime getResolvedAt() {
    return resolvedAt;
  }

  public void setResolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
  }

  public Silence rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * Get rootCause
   * @return rootCause
  */
    @Schema(name = "rootCause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCause")
  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }

  public Silence reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
    @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Silence auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://silent-detector/silence-a1b2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Silence silence = (Silence) o;
    return Objects.equals(this.silenceId, silence.silenceId) &&
        Objects.equals(this.monitorId, silence.monitorId) &&
        Objects.equals(this.monitorName, silence.monitorName) &&
        Objects.equals(this.serviceName, silence.serviceName) &&
        Objects.equals(this.environment, silence.environment) &&
        Objects.equals(this.status, silence.status) &&
        Objects.equals(this.severity, silence.severity) &&
        Objects.equals(this.detectedAt, silence.detectedAt) &&
        Objects.equals(this.expectedIntervalSeconds, silence.expectedIntervalSeconds) &&
        Objects.equals(this.currentSilenceDurationSeconds, silence.currentSilenceDurationSeconds) &&
        Objects.equals(this.lastSignalAt, silence.lastSignalAt) &&
        Objects.equals(this.lastSignalValue, silence.lastSignalValue) &&
        Objects.equals(this.estimatedCustomerImpact, silence.estimatedCustomerImpact) &&
        Objects.equals(this.businessImpact, silence.businessImpact) &&
        Objects.equals(this.probableCause, silence.probableCause) &&
        Objects.equals(this.relatedIncidents, silence.relatedIncidents) &&
        Objects.equals(this.acknowledgedBy, silence.acknowledgedBy) &&
        Objects.equals(this.acknowledgedAt, silence.acknowledgedAt) &&
        Objects.equals(this.resolvedBy, silence.resolvedBy) &&
        Objects.equals(this.resolvedAt, silence.resolvedAt) &&
        Objects.equals(this.rootCause, silence.rootCause) &&
        Objects.equals(this.reason, silence.reason) &&
        Objects.equals(this.auditReference, silence.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(silenceId, monitorId, monitorName, serviceName, environment, status, severity, detectedAt, expectedIntervalSeconds, currentSilenceDurationSeconds, lastSignalAt, lastSignalValue, estimatedCustomerImpact, businessImpact, probableCause, relatedIncidents, acknowledgedBy, acknowledgedAt, resolvedBy, resolvedAt, rootCause, reason, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Silence {\n");
    sb.append("    silenceId: ").append(toIndentedString(silenceId)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    detectedAt: ").append(toIndentedString(detectedAt)).append("\n");
    sb.append("    expectedIntervalSeconds: ").append(toIndentedString(expectedIntervalSeconds)).append("\n");
    sb.append("    currentSilenceDurationSeconds: ").append(toIndentedString(currentSilenceDurationSeconds)).append("\n");
    sb.append("    lastSignalAt: ").append(toIndentedString(lastSignalAt)).append("\n");
    sb.append("    lastSignalValue: ").append(toIndentedString(lastSignalValue)).append("\n");
    sb.append("    estimatedCustomerImpact: ").append(toIndentedString(estimatedCustomerImpact)).append("\n");
    sb.append("    businessImpact: ").append(toIndentedString(businessImpact)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    relatedIncidents: ").append(toIndentedString(relatedIncidents)).append("\n");
    sb.append("    acknowledgedBy: ").append(toIndentedString(acknowledgedBy)).append("\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

