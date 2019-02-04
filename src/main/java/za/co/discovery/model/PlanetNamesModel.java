package za.co.discovery.model;

import java.util.List;

import org.javafunk.excelparser.annotations.ExcelObject;
import org.javafunk.excelparser.annotations.MappedExcelObject;
import org.javafunk.excelparser.annotations.ParseType;

@ExcelObject(parseType = ParseType.COLUMN, start = 1, end = 1)
public class PlanetNamesModel {

  @MappedExcelObject
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
