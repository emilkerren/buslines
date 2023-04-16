package com.sbab.sl.buslines.models.response;

import com.google.gson.annotations.SerializedName;
public class ApiResponse {
    @SerializedName("StatusCode")
    int statusCode;
    @SerializedName("Message")
    String message;
    @SerializedName("ExecutionTime")
    int executionTime;
    @SerializedName("ResponseData")
    ResponseData responseData;


    public ApiResponse(int statusCode, String message, int executionTime, ResponseData responseData) {
        this.statusCode = statusCode;
        this.message = message;
        this.executionTime = executionTime;
        this.responseData = responseData;
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return "Response{" +
                "StatusCode=" + statusCode +
                ", Message='" + message + '\'' +
                ", ExecutionTime=" + executionTime +
                ", ResponseData=" + responseData +
                '}';
    }
}
