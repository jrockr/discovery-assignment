/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.model;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.annotation.RowNumber;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vinay Joshi
 */
@Entity
@Table(name = "assessment", schema = "planet")
public class Planet {

  @Id
  @GeneratedValue
  @javax.persistence.Column(name="planet_id")
  private Long planetId;

  @RowNumber
  private int rowNumber;

  @javax.persistence.Column(name="planet_node")
  @Column(index = 0, name = "Planet Node")
  private String planetNode;

  @javax.persistence.Column(name="planet_name")
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



  public Long getPlanetId() {
    return planetId;
  }

  public void setPlanetId(Long planetId) {
    this.planetId = planetId;
  }


  @Override
  public String toString() {
    return "Planet [planetNode=" + planetNode + ", planetName=" + planetName + "]";
  }
}
