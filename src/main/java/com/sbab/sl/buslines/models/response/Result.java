package com.sbab.sl.buslines.models.response;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("LineNumber")
    int lineNumber;
    @SerializedName("DirectionCode")
    int directionCode;
    @SerializedName("JourneyPatternPointNumber")
    String journeyPatternPointNumber;
    @SerializedName("LastModifiedUtcDateTime")
    String lastModifiedUtcDateTime;
    @SerializedName("ExistsFromDate")
    String existsFromDate;
    @SerializedName("StopPointNumber")
    String stopPointNumber;
    @SerializedName("StopPointName")
    String stopPointName;
    @SerializedName("StopAreaNumber")
    String stopAreaNumber;
    @SerializedName("LocationNorthingCoordinate")
    String locationNorthingCoordinate;
    @SerializedName("LocationEastingCoordinate")
    String locationEastingCoordinate;
    @SerializedName("ZoneShortName")
    String zoneShortName;
    @SerializedName("StopAreaTypeCode")
    String stopAreaTypeCode;

    public Result(int lineNumber, int directionCode, String journeyPatternPointNumber, String lastModifiedUtcDateTime, String existsFromDate) {
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

    public String getJourneyPatternPointNumber() {
        return journeyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(String journeyPatternPointNumber) {
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

    public String getStopPointNumber() {
        return stopPointNumber;
    }

    public void setStopPointNumber(String stopPointNumber) {
        this.stopPointNumber = stopPointNumber;
    }

    public String getStopPointName() {
        return stopPointName;
    }

    public void setStopPointName(String stopPointName) {
        this.stopPointName = stopPointName;
    }

    public String getStopAreaNumber() {
        return stopAreaNumber;
    }

    public void setStopAreaNumber(String stopAreaNumber) {
        this.stopAreaNumber = stopAreaNumber;
    }

    public String getLocationNorthingCoordinate() {
        return locationNorthingCoordinate;
    }

    public void setLocationNorthingCoordinate(String locationNorthingCoordinate) {
        this.locationNorthingCoordinate = locationNorthingCoordinate;
    }

    public String getLocationEastingCoordinate() {
        return locationEastingCoordinate;
    }

    public void setLocationEastingCoordinate(String locationEastingCoordinate) {
        this.locationEastingCoordinate = locationEastingCoordinate;
    }

    public String getZoneShortName() {
        return zoneShortName;
    }

    public void setZoneShortName(String zoneShortName) {
        this.zoneShortName = zoneShortName;
    }

    public String getStopAreaTypeCode() {
        return stopAreaTypeCode;
    }

    public void setStopAreaTypeCode(String stopAreaTypeCode) {
        this.stopAreaTypeCode = stopAreaTypeCode;
    }

    @Override
    public String toString() {
        return "Result{" +
                "lineNumber=" + lineNumber +
                ", directionCode=" + directionCode +
                ", journeyPatternPointNumber=" + journeyPatternPointNumber +
                ", lastModifiedUtcDateTime='" + lastModifiedUtcDateTime + '\'' +
                ", existsFromDate='" + existsFromDate + '\'' +
                ", stopPointNumber='" + stopPointNumber + '\'' +
                ", stopPointName='" + stopPointName + '\'' +
                ", stopAreaNumber='" + stopAreaNumber + '\'' +
                ", locationNorthingCoordinate='" + locationNorthingCoordinate + '\'' +
                ", locationEastingCoordinate='" + locationEastingCoordinate + '\'' +
                ", zoneShortName='" + zoneShortName + '\'' +
                ", stopAreaTypeCode='" + stopAreaTypeCode + '\'' +
                '}';
    }
}
