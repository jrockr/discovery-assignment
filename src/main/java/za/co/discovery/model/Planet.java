/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.model;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.annotation.RowNumber;

/**
 * @author Vinay Joshi
 */
public class Planet {


  @RowNumber
  private int rowNumber;

  @Column(index = 0, name = "Planet Node")
  private String planetNode;

  @Column(index = 1, name = "Planet Name")
  private String planetName;

  public String getPlanetNode() {
    return planetNode;
  }

  public void setPlanetNode(String planetNode) {
    this.planetNode = planetNode;
  }

  public String getPlanetName() {
    return planetName;
  }

  public void setPlanetName(String planetName) {
    this.planetName = planetName;
  }

  public int getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  @Override
  public String toString() {
    return "Planet [planetNode=" + planetNode + ", planetName=" + planetName + "]";
  }
}
