package za.co.discovery.model;

import java.util.List;

import org.javafunk.excelparser.annotations.ExcelObject;
import org.javafunk.excelparser.annotations.MappedExcelObject;
import org.javafunk.excelparser.annotations.ParseType;

@ExcelObject(parseType = ParseType.COLUMN, start = 1, end = 1)
public class RoutesModel {

  @MappedExcelObject
  private List<Route> routes;

  @Override
  public String toString() {
    final StringBuilder output = new StringBuilder();
    routes.forEach(route -> {
      output.append(route.toString());
      output.append("\n");
    });
    return output.toString();
  }

  public List<Route> getRoutes() {
    return routes;
  }
}
