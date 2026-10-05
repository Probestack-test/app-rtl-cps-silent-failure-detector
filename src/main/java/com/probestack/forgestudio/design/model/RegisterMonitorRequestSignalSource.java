package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Where the signal comes from.
 */
@Schema(name = "registerMonitor_request_signalSource", description = "Where the signal comes from.")
@JsonTypeName("registerMonitor_request_signalSource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class RegisterMonitorRequestSignalSource {

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    PROMETHEUS("PROMETHEUS"),
    
    DATADOG("DATADOG"),
    
    CLOUDWATCH("CLOUDWATCH"),
    
    KAFKA_LAG("KAFKA_LAG"),
    
    GCP_MONITORING("GCP_MONITORING"),
    
    CUSTOM_ENDPOINT("CUSTOM_ENDPOINT");

    private String value;

    SourceTypeEnum(String value) {
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
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SourceTypeEnum sourceType;

  private String identifier;

  private String query;

  public RegisterMonitorRequestSignalSource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterMonitorRequestSignalSource(SourceTypeEnum sourceType, String identifier) {
    this.sourceType = sourceType;
    this.identifier = identifier;
  }

  public RegisterMonitorRequestSignalSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
  @NotNull   @Schema(name = "sourceType", example = "PROMETHEUS", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceType")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public RegisterMonitorRequestSignalSource identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @NotNull   @Schema(name = "identifier", example = "payment_queue_consumer_tick_total", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public RegisterMonitorRequestSignalSource query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
    @Schema(name = "query", example = "rate(payment_queue_consumer_tick_total[5m])", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterMonitorRequestSignalSource registerMonitorRequestSignalSource = (RegisterMonitorRequestSignalSource) o;
    return Objects.equals(this.sourceType, registerMonitorRequestSignalSource.sourceType) &&
        Objects.equals(this.identifier, registerMonitorRequestSignalSource.identifier) &&
        Objects.equals(this.query, registerMonitorRequestSignalSource.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, identifier, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterMonitorRequestSignalSource {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

