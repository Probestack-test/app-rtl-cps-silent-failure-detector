package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SilenceListSummary
 */
@JsonTypeName("SilenceList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:10:30.169222359Z[GMT]")public class SilenceListSummary {

  private Integer totalActiveSilences;

  private Integer criticalCount;

  private Integer warningCount;

  private Integer oldestSilenceMinutes;

  public SilenceListSummary totalActiveSilences(Integer totalActiveSilences) {
    this.totalActiveSilences = totalActiveSilences;
    return this;
  }

  /**
   * Get totalActiveSilences
   * @return totalActiveSilences
  */
    @Schema(name = "totalActiveSilences", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalActiveSilences")
  public Integer getTotalActiveSilences() {
    return totalActiveSilences;
  }

  public void setTotalActiveSilences(Integer totalActiveSilences) {
    this.totalActiveSilences = totalActiveSilences;
  }

  public SilenceListSummary criticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
    return this;
  }

  /**
   * Get criticalCount
   * @return criticalCount
  */
    @Schema(name = "criticalCount", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criticalCount")
  public Integer getCriticalCount() {
    return criticalCount;
  }

  public void setCriticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
  }

  public SilenceListSummary warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

  /**
   * Get warningCount
   * @return warningCount
  */
    @Schema(name = "warningCount", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningCount")
  public Integer getWarningCount() {
    return warningCount;
  }

  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }

  public SilenceListSummary oldestSilenceMinutes(Integer oldestSilenceMinutes) {
    this.oldestSilenceMinutes = oldestSilenceMinutes;
    return this;
  }

  /**
   * Get oldestSilenceMinutes
   * @return oldestSilenceMinutes
  */
    @Schema(name = "oldestSilenceMinutes", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldestSilenceMinutes")
  public Integer getOldestSilenceMinutes() {
    return oldestSilenceMinutes;
  }

  public void setOldestSilenceMinutes(Integer oldestSilenceMinutes) {
    this.oldestSilenceMinutes = oldestSilenceMinutes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SilenceListSummary silenceListSummary = (SilenceListSummary) o;
    return Objects.equals(this.totalActiveSilences, silenceListSummary.totalActiveSilences) &&
        Objects.equals(this.criticalCount, silenceListSummary.criticalCount) &&
        Objects.equals(this.warningCount, silenceListSummary.warningCount) &&
        Objects.equals(this.oldestSilenceMinutes, silenceListSummary.oldestSilenceMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalActiveSilences, criticalCount, warningCount, oldestSilenceMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SilenceListSummary {\n");
    sb.append("    totalActiveSilences: ").append(toIndentedString(totalActiveSilences)).append("\n");
    sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    oldestSilenceMinutes: ").append(toIndentedString(oldestSilenceMinutes)).append("\n");
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

