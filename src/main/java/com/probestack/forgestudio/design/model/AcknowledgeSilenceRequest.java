package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AcknowledgeSilenceRequest
 */
@JsonTypeName("acknowledgeSilence_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class AcknowledgeSilenceRequest {

  /**
   * Action to take on the silence.
   */
  public enum ActionEnum {
    ACKNOWLEDGE("ACKNOWLEDGE"),
    
    RESOLVE("RESOLVE"),
    
    MARK_FALSE_POSITIVE("MARK_FALSE_POSITIVE");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActionEnum action;

  private String reason;

  private String resolvedBy;

  private String rootCause;

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

  public AcknowledgeSilenceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AcknowledgeSilenceRequest(ActionEnum action, String reason) {
    this.action = action;
    this.reason = reason;
  }

  public AcknowledgeSilenceRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action to take on the silence.
   * @return action
  */
  @NotNull   @Schema(name = "action", example = "ACKNOWLEDGE", description = "Action to take on the silence.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AcknowledgeSilenceRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the action (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Investigating — Kafka consumer group rebalanced unexpectedly.", description = "Reason for the action (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AcknowledgeSilenceRequest resolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

  /**
   * Engineer taking the action.
   * @return resolvedBy
  */
    @Schema(name = "resolvedBy", example = "sre.oncall@forgesphere.example.com", description = "Engineer taking the action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedBy")
  public String getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public AcknowledgeSilenceRequest rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * Root cause if known (for RESOLVE action).
   * @return rootCause
  */
    @Schema(name = "rootCause", example = "Consumer pod OOMKilled; restarted with higher memory limit.", description = "Root cause if known (for RESOLVE action).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCause")
  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }

  public AcknowledgeSilenceRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public AcknowledgeSilenceRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify of the state change.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify of the state change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcknowledgeSilenceRequest acknowledgeSilenceRequest = (AcknowledgeSilenceRequest) o;
    return Objects.equals(this.action, acknowledgeSilenceRequest.action) &&
        Objects.equals(this.reason, acknowledgeSilenceRequest.reason) &&
        Objects.equals(this.resolvedBy, acknowledgeSilenceRequest.resolvedBy) &&
        Objects.equals(this.rootCause, acknowledgeSilenceRequest.rootCause) &&
        Objects.equals(this.notifyChannels, acknowledgeSilenceRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, reason, resolvedBy, rootCause, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcknowledgeSilenceRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

