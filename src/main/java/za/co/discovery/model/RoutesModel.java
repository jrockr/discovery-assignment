package za.co.discovery.model;

import java.util.List;

public class RoutesModel {

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
