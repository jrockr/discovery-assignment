package za.co.discovery.model;

import java.util.List;

public class PlanetNamesModel {

  private List<Planet> planets;

  @Override
  public String toString() {
    final StringBuilder output = new StringBuilder();
    planets.forEach(planet -> {
      output.append(planet.toString());
      output.append("\n");
    });
    return output.toString();
  }

  public List<Planet> getPlanets() {
    return planets;
  }
}
