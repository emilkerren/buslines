package com.sbab.sl.buslines.models.response;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("LineNumber")

    int lineNumber;
    @SerializedName("DirectionCode")

    int directionCode;
    @SerializedName("JourneyPatternPointNumber")
    int journeyPatternPointNumber;
    @SerializedName("LastModifiedUtcDateTime")
    String lastModifiedUtcDateTime;
    @SerializedName("ExistsFromDate")
    String existsFromDate;

    public Result(int lineNumber, int directionCode, int journeyPatternPointNumber, String lastModifiedUtcDateTime, String existsFromDate) {
        this.lineNumber = lineNumber;
        this.directionCode = directionCode;
        this.journeyPatternPointNumber = journeyPatternPointNumber;
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
        this.existsFromDate = existsFromDate;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(int directionCode) {
        this.directionCode = directionCode;
    }

    public int getJourneyPatternPointNumber() {
        return journeyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(int journeyPatternPointNumber) {
        this.journeyPatternPointNumber = journeyPatternPointNumber;
    }

    public String getLastModifiedUtcDateTime() {
        return lastModifiedUtcDateTime;
    }

    public void setLastModifiedUtcDateTime(String lastModifiedUtcDateTime) {
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
    }

    public String getExistsFromDate() {
        return existsFromDate;
    }
    public void setExistsFromDate(String existsFromDate) {
        this.existsFromDate = existsFromDate;
    }

    @Override
    public String toString() {
        return "Result{" +
                "LineNumber=" + lineNumber +
                ", DirectionCode=" + directionCode +
                ", JourneyPatternPointNumber=" + journeyPatternPointNumber +
                ", LastModifiedUtcDateTime='" + lastModifiedUtcDateTime + '\'' +
                ", ExistsFromDate='" + existsFromDate + '\'' +
                '}';
    }
}
