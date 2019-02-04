/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.util;

import com.creditdatamw.zerocell.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import za.co.discovery.dao.PlanetRepository;
import za.co.discovery.model.Planet;

import java.io.File;
import java.util.List;

/**
 * @author Vinay.Joshi
 */
@Service
public class ExcelParserService {

  @Autowired
  private PlanetRepository planetRepository;

  private final Logger logger = LoggerFactory.getLogger(getClass());


  public void parseExcel(String path) {
    File file = new File(path);
    String sheet = "Planet Names";
    List<Planet> planets = Reader.of(Planet.class).from(new File(path)).sheet("Planet Names").list();
    logger.info("RECORDS READ {}", planets.size());
    // Save in database
    planetRepository.saveAll(planets);
    logger.info("planets saved ");

  }

  public void query(Long id) {
    logger.info("Total records {} , id : {} , record {} ", planetRepository.count(), id, planetRepository.getOne(id));
  }


}
