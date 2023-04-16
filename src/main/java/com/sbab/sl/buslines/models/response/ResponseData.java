package com.sbab.sl.buslines.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseData {
    @SerializedName("Version")
    String version;
    @SerializedName("Type")
    String type;
    @SerializedName("Result")
    List<Result> result;

    ResponseData() {

    }

    public ResponseData(String version, String type, List<Result> result) {
        this.version = version;
        this.type = type;
        this.result = result;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "Version='" + version + '\'' +
                ", Type='" + type + '\'' +
                ", Result=" + result +
                '}';
    }
}