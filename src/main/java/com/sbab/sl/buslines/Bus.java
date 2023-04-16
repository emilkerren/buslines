package com.sbab.sl.buslines;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bus {
    @Id
    @GeneratedValue
    private Long id;
	private String busLine;
	private String busStops;
	private String description;

	private Bus() {}

	public Bus(String busLine, String busStops, String description) {
		this.busLine = busLine;
		this.busStops = busStops;
		this.description = description;
	}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusLine() {
        return this.busLine;
    }

    public void setBusLine(String busLine) {
        this.busLine = busLine;
    }

    public String getBusStops() {
        return this.busStops;
    }

    public void setBusStops(String busStops) {
        this.busStops = busStops;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bus{" +
            " id='" + getId() + "'" +
            ", busLine='" + getBusLine() + "'" +
            ", busStops='" + getBusStops() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
    
}