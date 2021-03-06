/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkspaceRealTimeStatistics extends Resource {
    private static final long serialVersionUID = 239335226503820L;

    /**
     * Create a WorkspaceRealTimeStatisticsFetcher to execute fetch.
     * 
     * @param pathWorkspaceSid The workspace_sid
     * @return WorkspaceRealTimeStatisticsFetcher capable of executing the fetch
     */
    public static WorkspaceRealTimeStatisticsFetcher fetcher(final String pathWorkspaceSid) {
        return new WorkspaceRealTimeStatisticsFetcher(pathWorkspaceSid);
    }

    /**
     * Converts a JSON String into a WorkspaceRealTimeStatistics object using the
     * provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return WorkspaceRealTimeStatistics object represented by the provided JSON
     */
    public static WorkspaceRealTimeStatistics fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkspaceRealTimeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a WorkspaceRealTimeStatistics object using
     * the provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return WorkspaceRealTimeStatistics object represented by the provided JSON
     */
    public static WorkspaceRealTimeStatistics fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkspaceRealTimeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final List<Map<String, Object>> activityStatistics;
    private final Integer longestTaskWaitingAge;
    private final Map<String, Object> tasksByPriority;
    private final Map<String, Object> tasksByStatus;
    private final Integer totalTasks;
    private final Integer totalWorkers;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private WorkspaceRealTimeStatistics(@JsonProperty("account_sid")
                                        final String accountSid, 
                                        @JsonProperty("activity_statistics")
                                        final List<Map<String, Object>> activityStatistics, 
                                        @JsonProperty("longest_task_waiting_age")
                                        final Integer longestTaskWaitingAge, 
                                        @JsonProperty("tasks_by_priority")
                                        final Map<String, Object> tasksByPriority, 
                                        @JsonProperty("tasks_by_status")
                                        final Map<String, Object> tasksByStatus, 
                                        @JsonProperty("total_tasks")
                                        final Integer totalTasks, 
                                        @JsonProperty("total_workers")
                                        final Integer totalWorkers, 
                                        @JsonProperty("workspace_sid")
                                        final String workspaceSid, 
                                        @JsonProperty("url")
                                        final URI url) {
        this.accountSid = accountSid;
        this.activityStatistics = activityStatistics;
        this.longestTaskWaitingAge = longestTaskWaitingAge;
        this.tasksByPriority = tasksByPriority;
        this.tasksByStatus = tasksByStatus;
        this.totalTasks = totalTasks;
        this.totalWorkers = totalWorkers;
        this.workspaceSid = workspaceSid;
        this.url = url;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The A breakdown of Workers by Activity.
     * 
     * @return A breakdown of Workers by Activity
     */
    public final List<Map<String, Object>> getActivityStatistics() {
        return this.activityStatistics;
    }

    /**
     * Returns The The age of the longest waiting Task.
     * 
     * @return The age of the longest waiting Task
     */
    public final Integer getLongestTaskWaitingAge() {
        return this.longestTaskWaitingAge;
    }

    /**
     * Returns The The tasks_by_priority.
     * 
     * @return The tasks_by_priority
     */
    public final Map<String, Object> getTasksByPriority() {
        return this.tasksByPriority;
    }

    /**
     * Returns The The Tasks broken down by status.
     * 
     * @return The Tasks broken down by status
     */
    public final Map<String, Object> getTasksByStatus() {
        return this.tasksByStatus;
    }

    /**
     * Returns The The total number of Tasks.
     * 
     * @return The total number of Tasks
     */
    public final Integer getTotalTasks() {
        return this.totalTasks;
    }

    /**
     * Returns The The total number of Workers in the workspace.
     * 
     * @return The total number of Workers in the workspace
     */
    public final Integer getTotalWorkers() {
        return this.totalWorkers;
    }

    /**
     * Returns The The workspace_sid.
     * 
     * @return The workspace_sid
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WorkspaceRealTimeStatistics other = (WorkspaceRealTimeStatistics) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(activityStatistics, other.activityStatistics) && 
               Objects.equals(longestTaskWaitingAge, other.longestTaskWaitingAge) && 
               Objects.equals(tasksByPriority, other.tasksByPriority) && 
               Objects.equals(tasksByStatus, other.tasksByStatus) && 
               Objects.equals(totalTasks, other.totalTasks) && 
               Objects.equals(totalWorkers, other.totalWorkers) && 
               Objects.equals(workspaceSid, other.workspaceSid) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            activityStatistics,
                            longestTaskWaitingAge,
                            tasksByPriority,
                            tasksByStatus,
                            totalTasks,
                            totalWorkers,
                            workspaceSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("activityStatistics", activityStatistics)
                          .add("longestTaskWaitingAge", longestTaskWaitingAge)
                          .add("tasksByPriority", tasksByPriority)
                          .add("tasksByStatus", tasksByStatus)
                          .add("totalTasks", totalTasks)
                          .add("totalWorkers", totalWorkers)
                          .add("workspaceSid", workspaceSid)
                          .add("url", url)
                          .toString();
    }
}