/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.discovery.model;

import java.math.BigDecimal;

import org.javafunk.excelparser.annotations.ExcelField;
import org.javafunk.excelparser.annotations.ExcelObject;
import org.javafunk.excelparser.annotations.ParseType;

import za.co.discovery.util.Constants;

/**
 *
 * @author Vinay Joshi
 */
@ExcelObject(parseType = ParseType.ROW, start = 2, end = Constants.PROCESS_ALL_ROWS)
public class Route {
	
	@ExcelField(position = 1)
    private int routeId;
	
	@ExcelField(position = 2)
    private String planetOrigin;
	
	@ExcelField(position = 3)
    private String planetDestination;
	
	@ExcelField(position = 4)
    private BigDecimal distance;

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getPlanetOrigin() {
        return planetOrigin;
    }

    public void setPlanetOrigin(String planetOrigin) {
        this.planetOrigin = planetOrigin;
    }

    public String getPlanetDestination() {
        return planetDestination;
    }

    public void setPlanetDestination(String planetDestination) {
        this.planetDestination = planetDestination;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", planetOrigin=" + planetOrigin + ", planetDestination="
				+ planetDestination + ", distance=" + distance + "]";
	}
}
