/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.model;

import java.math.BigDecimal;

/**
 * @author Vinay Joshi
 */
public class Route {

  private int routeId;

  private String planetOrigin;

  private String planetDestination;

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
