package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.RegisterMonitorRequestSignalSource;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RegisterMonitorRequest
 */
@JsonTypeName("registerMonitor_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class RegisterMonitorRequest {

  private String monitorName;

  private String serviceName;

  /**
   * Environment where the monitor runs.
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
   * Type of signal expected.
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

  private Integer expectedInterval;

  private Integer gracePeriod;

  private RegisterMonitorRequestSignalSource signalSource;

  /**
   * Severity of the alert if silence is detected.
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
  private SeverityEnum severity = SeverityEnum.CRITICAL;

  private String owner;

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

  private String businessImpact;

  public RegisterMonitorRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterMonitorRequest(String monitorName, String serviceName, EnvironmentEnum environment, SignalTypeEnum signalType, Integer expectedInterval, Integer gracePeriod) {
    this.monitorName = monitorName;
    this.serviceName = serviceName;
    this.environment = environment;
    this.signalType = signalType;
    this.expectedInterval = expectedInterval;
    this.gracePeriod = gracePeriod;
  }

  public RegisterMonitorRequest monitorName(String monitorName) {
    this.monitorName = monitorName;
    return this;
  }

  /**
   * Human-readable name for this monitor.
   * @return monitorName
  */
  @NotNull   @Schema(name = "monitorName", example = "payment-queue-consumer-heartbeat", description = "Human-readable name for this monitor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monitorName")
  public String getMonitorName() {
    return monitorName;
  }

  public void setMonitorName(String monitorName) {
    this.monitorName = monitorName;
  }

  public RegisterMonitorRequest serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Service being monitored.
   * @return serviceName
  */
  @NotNull   @Schema(name = "serviceName", example = "payment-processor", description = "Service being monitored.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public RegisterMonitorRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Environment where the monitor runs.
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", description = "Environment where the monitor runs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public RegisterMonitorRequest signalType(SignalTypeEnum signalType) {
    this.signalType = signalType;
    return this;
  }

  /**
   * Type of signal expected.
   * @return signalType
  */
  @NotNull   @Schema(name = "signalType", example = "QUEUE_CONSUMER_TICK", description = "Type of signal expected.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("signalType")
  public SignalTypeEnum getSignalType() {
    return signalType;
  }

  public void setSignalType(SignalTypeEnum signalType) {
    this.signalType = signalType;
  }

  public RegisterMonitorRequest expectedInterval(Integer expectedInterval) {
    this.expectedInterval = expectedInterval;
    return this;
  }

  /**
   * Expected interval between signals in seconds.
   * @return expectedInterval
  */
  @NotNull   @Schema(name = "expectedInterval", example = "60", description = "Expected interval between signals in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedInterval")
  public Integer getExpectedInterval() {
    return expectedInterval;
  }

  public void setExpectedInterval(Integer expectedInterval) {
    this.expectedInterval = expectedInterval;
  }

  public RegisterMonitorRequest gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

  /**
   * Extra seconds to wait before firing an alert.
   * @return gracePeriod
  */
  @NotNull   @Schema(name = "gracePeriod", example = "120", description = "Extra seconds to wait before firing an alert.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gracePeriod")
  public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public RegisterMonitorRequest signalSource(RegisterMonitorRequestSignalSource signalSource) {
    this.signalSource = signalSource;
    return this;
  }

  /**
   * Get signalSource
   * @return signalSource
  */
  @Valid   @Schema(name = "signalSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signalSource")
  public RegisterMonitorRequestSignalSource getSignalSource() {
    return signalSource;
  }

  public void setSignalSource(RegisterMonitorRequestSignalSource signalSource) {
    this.signalSource = signalSource;
  }

  public RegisterMonitorRequest severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity of the alert if silence is detected.
   * @return severity
  */
    @Schema(name = "severity", example = "CRITICAL", description = "Severity of the alert if silence is detected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public RegisterMonitorRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Team responsible for this monitor.
   * @return owner
  */
    @Schema(name = "owner", example = "payments-team", description = "Team responsible for this monitor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public RegisterMonitorRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public RegisterMonitorRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify on silent failure.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\",\"PAGERDUTY\"]", description = "Channels to notify on silent failure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }

  public RegisterMonitorRequest businessImpact(String businessImpact) {
    this.businessImpact = businessImpact;
    return this;
  }

  /**
   * What breaks if this signal goes silent.
   * @return businessImpact
  */
    @Schema(name = "businessImpact", example = "Payments stop being processed; customers see failures.", description = "What breaks if this signal goes silent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessImpact")
  public String getBusinessImpact() {
    return businessImpact;
  }

  public void setBusinessImpact(String businessImpact) {
    this.businessImpact = businessImpact;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterMonitorRequest registerMonitorRequest = (RegisterMonitorRequest) o;
    return Objects.equals(this.monitorName, registerMonitorRequest.monitorName) &&
        Objects.equals(this.serviceName, registerMonitorRequest.serviceName) &&
        Objects.equals(this.environment, registerMonitorRequest.environment) &&
        Objects.equals(this.signalType, registerMonitorRequest.signalType) &&
        Objects.equals(this.expectedInterval, registerMonitorRequest.expectedInterval) &&
        Objects.equals(this.gracePeriod, registerMonitorRequest.gracePeriod) &&
        Objects.equals(this.signalSource, registerMonitorRequest.signalSource) &&
        Objects.equals(this.severity, registerMonitorRequest.severity) &&
        Objects.equals(this.owner, registerMonitorRequest.owner) &&
        Objects.equals(this.notifyChannels, registerMonitorRequest.notifyChannels) &&
        Objects.equals(this.businessImpact, registerMonitorRequest.businessImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorName, serviceName, environment, signalType, expectedInterval, gracePeriod, signalSource, severity, owner, notifyChannels, businessImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterMonitorRequest {\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    signalType: ").append(toIndentedString(signalType)).append("\n");
    sb.append("    expectedInterval: ").append(toIndentedString(expectedInterval)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    signalSource: ").append(toIndentedString(signalSource)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
    sb.append("    businessImpact: ").append(toIndentedString(businessImpact)).append("\n");
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

