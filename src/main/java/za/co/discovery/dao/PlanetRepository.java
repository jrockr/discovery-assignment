package za.co.discovery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.discovery.model.Planet;


public interface  PlanetRepository extends JpaRepository<Planet,Long> {

}