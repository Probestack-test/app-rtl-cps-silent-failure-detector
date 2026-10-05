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
 * Monitor
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class Monitor {

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
   * Gets or Sets signalType
   */
  public enum SignalTypeEnum {
    HEARTBEAT("HEARTBEAT"),
    
    METRIC_UPDATE("METRIC_UPDATE"),
    
    LOG_PATTERN("LOG_PATTERN"),
    
    QUEUE_CONSUMER_TICK("QUEUE_CONSUMER_TICK"),
    
    SCHEDULED_JOB_COMPLETION("SCHEDULED_JOB_COMPLETION"),
    
    BUSINESS_METRIC("BUSINESS_METRIC"),
    
    CUSTOM_WEBHOOK("CUSTOM_WEBHOOK");

    private String value;

    SignalTypeEnum(String value) {
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
    public static SignalTypeEnum fromValue(String value) {
      for (SignalTypeEnum b : SignalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SignalTypeEnum signalType;

  private Integer expectedIntervalSeconds;

  private Integer gracePeriodSeconds;

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

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HEALTHY("HEALTHY"),
    
    SILENT("SILENT"),
    
    DEGRADED("DEGRADED"),
    
    PAUSED("PAUSED"),
    
    DISABLED("DISABLED");

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

  private String owner;

  private String businessImpact;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastSignalAt;

  private BigDecimal lastSignalValue;

  private Integer currentSilenceDurationSeconds;

  private Integer lifetimeSilencesDetected;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Monitor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Monitor(UUID monitorId, String monitorName, String serviceName, EnvironmentEnum environment, SignalTypeEnum signalType, StatusEnum status, OffsetDateTime createdAt) {
    this.monitorId = monitorId;
    this.monitorName = monitorName;
    this.serviceName = serviceName;
    this.environment = environment;
    this.signalType = signalType;
    this.status = status;
    this.createdAt = createdAt;
  }

  public Monitor monitorId(UUID monitorId) {
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

  public Monitor monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

  /**
   * Get monitorName
   * @return monitorName
  */
  @NotNull   @Schema(name = "monitorName", example = "payment-queue-consumer-heartbeat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monitorName")
  public String getMonitorName() {
    return monitorName;
  }

  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }

  public Monitor serviceName(String serviceName) {
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

  public Monitor environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public Monitor signalType(SignalTypeEnum signalType) {
    this.signalType = signalType;
    return this;
  }

  /**
   * Get signalType
   * @return signalType
  */
  @NotNull   @Schema(name = "signalType", example = "QUEUE_CONSUMER_TICK", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("signalType")
  public SignalTypeEnum getSignalType() {
    return signalType;
  }

  public void setSignalType(SignalTypeEnum signalType) {
    this.signalType = signalType;
  }

  public Monitor expectedIntervalSeconds(Integer expectedIntervalSeconds) {
    this.expectedIntervalSeconds = expectedIntervalSeconds;
    return this;
  }

  /**
   * Get expectedIntervalSeconds
   * @return expectedIntervalSeconds
  */
    @Schema(name = "expectedIntervalSeconds", example = "60", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedIntervalSeconds")
  public Integer getExpectedIntervalSeconds() {
    return expectedIntervalSeconds;
  }

  public void setExpectedIntervalSeconds(Integer expectedIntervalSeconds) {
    this.expectedIntervalSeconds = expectedIntervalSeconds;
  }

  public Monitor gracePeriodSeconds(Integer gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

  /**
   * Get gracePeriodSeconds
   * @return gracePeriodSeconds
  */
    @Schema(name = "gracePeriodSeconds", example = "120", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gracePeriodSeconds")
  public Integer getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }

  public void setGracePeriodSeconds(Integer gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }

  public Monitor severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
    @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Monitor status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "HEALTHY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Monitor owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
    @Schema(name = "owner", example = "payments-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Monitor businessImpact(String businessImpact) {
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

  public Monitor notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public Monitor addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Get notifyChannels
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\",\"PAGERDUTY\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }

  public Monitor lastSignalAt(OffsetDateTime lastSignalAt) {
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

  public Monitor lastSignalValue(BigDecimal lastSignalValue) {
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

  public Monitor currentSilenceDurationSeconds(Integer currentSilenceDurationSeconds) {
    this.currentSilenceDurationSeconds = currentSilenceDurationSeconds;
    return this;
  }

  /**
   * How long the signal has been missing (0 if healthy).
   * @return currentSilenceDurationSeconds
  */
    @Schema(name = "currentSilenceDurationSeconds", example = "0", description = "How long the signal has been missing (0 if healthy).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentSilenceDurationSeconds")
  public Integer getCurrentSilenceDurationSeconds() {
    return currentSilenceDurationSeconds;
  }

  public void setCurrentSilenceDurationSeconds(Integer currentSilenceDurationSeconds) {
    this.currentSilenceDurationSeconds = currentSilenceDurationSeconds;
  }

  public Monitor lifetimeSilencesDetected(Integer lifetimeSilencesDetected) {
    this.lifetimeSilencesDetected = lifetimeSilencesDetected;
    return this;
  }

  /**
   * Get lifetimeSilencesDetected
   * @return lifetimeSilencesDetected
  */
    @Schema(name = "lifetimeSilencesDetected", example = "7", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetimeSilencesDetected")
  public Integer getLifetimeSilencesDetected() {
    return lifetimeSilencesDetected;
  }

  public void setLifetimeSilencesDetected(Integer lifetimeSilencesDetected) {
    this.lifetimeSilencesDetected = lifetimeSilencesDetected;
  }

  public Monitor createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Monitor updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monitor monitor = (Monitor) o;
    return Objects.equals(this.monitorId, monitor.monitorId) &&
        Objects.equals(this.monitorName, monitor.monitorName) &&
        Objects.equals(this.serviceName, monitor.serviceName) &&
        Objects.equals(this.environment, monitor.environment) &&
        Objects.equals(this.signalType, monitor.signalType) &&
        Objects.equals(this.expectedIntervalSeconds, monitor.expectedIntervalSeconds) &&
        Objects.equals(this.gracePeriodSeconds, monitor.gracePeriodSeconds) &&
        Objects.equals(this.severity, monitor.severity) &&
        Objects.equals(this.status, monitor.status) &&
        Objects.equals(this.owner, monitor.owner) &&
        Objects.equals(this.businessImpact, monitor.businessImpact) &&
        Objects.equals(this.notifyChannels, monitor.notifyChannels) &&
        Objects.equals(this.lastSignalAt, monitor.lastSignalAt) &&
        Objects.equals(this.lastSignalValue, monitor.lastSignalValue) &&
        Objects.equals(this.currentSilenceDurationSeconds, monitor.currentSilenceDurationSeconds) &&
        Objects.equals(this.lifetimeSilencesDetected, monitor.lifetimeSilencesDetected) &&
        Objects.equals(this.createdAt, monitor.createdAt) &&
        Objects.equals(this.updatedAt, monitor.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorId, monitorName, serviceName, environment, signalType, expectedIntervalSeconds, gracePeriodSeconds, severity, status, owner, businessImpact, notifyChannels, lastSignalAt, lastSignalValue, currentSilenceDurationSeconds, lifetimeSilencesDetected, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monitor {\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    signalType: ").append(toIndentedString(signalType)).append("\n");
    sb.append("    expectedIntervalSeconds: ").append(toIndentedString(expectedIntervalSeconds)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    businessImpact: ").append(toIndentedString(businessImpact)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
    sb.append("    lastSignalAt: ").append(toIndentedString(lastSignalAt)).append("\n");
    sb.append("    lastSignalValue: ").append(toIndentedString(lastSignalValue)).append("\n");
    sb.append("    currentSilenceDurationSeconds: ").append(toIndentedString(currentSilenceDurationSeconds)).append("\n");
    sb.append("    lifetimeSilencesDetected: ").append(toIndentedString(lifetimeSilencesDetected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

