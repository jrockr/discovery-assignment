/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.util;

import com.creditdatamw.zerocell.Reader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.javafunk.excelparser.SheetParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import za.co.discovery.model.Planet;
import za.co.discovery.model.PlanetNamesModel;
import za.co.discovery.model.RoutesModel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Vinay.Joshi
 */
@Service
public class ExcelParserService {

  private final SheetParser parser = new SheetParser();
  private final ExcelParserErrorHandler errorHandler = new ExcelParserErrorHandler();
  private final Logger logger = LoggerFactory.getLogger(getClass());

  public void parser(final InputStream inputStream) throws IOException, InvalidFormatException {
    System.out.println("Parsing...");
    Workbook workbook = WorkbookFactory.create(inputStream);
    // Retrieving the number of sheets in the Workbook
		/*System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		DataFormatter dataFormatter = new DataFormatter();

		workbook.forEach(sheet -> {
			System.out.println("=> " + sheet.getSheetName());
			sheet.forEach(row -> {
				row.forEach(cell -> {
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.println(cellValue + "\t");
				});
			});
		});*/

    // load planet names
    parser.createEntity(getSheet(workbook, Constants.SHEET_PLANET_NAMES), PlanetNamesModel.class, errorHandler)
        .forEach(this::processPlanetNamesModel);

    // load routes
    parser.createEntity(getSheet(workbook, Constants.SHEET_ROUTES), RoutesModel.class, errorHandler)
        .forEach(this::processRoutesModel);

    workbook.close();
  }

  private Sheet getSheet(final Workbook workbook, final String inputSheetName) {
    Sheet sheetFound = null;
    for (int sheetCount = 0; sheetCount < workbook.getNumberOfSheets(); sheetCount++) {
      Sheet sourceSheet = workbook.getSheetAt(sheetCount);
      if (sourceSheet.getSheetName().equalsIgnoreCase(inputSheetName)) {
        sheetFound = sourceSheet;
        break;
      }
    }
    logger.info("- sheet found = {}", sheetFound);
    return sheetFound;
  }

  private void processPlanetNamesModel(final PlanetNamesModel model) {
    logger.info("- processPlanetNamesModel - START");
    logger.info("- processPlanetNamesModel model = {}", model);
    model.getPlanets().forEach(planet -> {
      logger.info("- planet - {}", planet);
    });
    logger.info("- processPlanetNamesModel - END");
  }

  private void processRoutesModel(final RoutesModel model) {
    logger.info("- processRoutesModel - START");
    logger.info("- processRoutesModel model = {}", model);
    model.getRoutes().forEach(route -> {
      logger.info("- route - {}", route);
    });
    logger.info("- processRoutesModel - END");
  }

  public void parseExcel(String path) {
    File file = new File(path);
    String sheet = "Planet Names";
    List<Planet> planets = Reader.of(Planet.class).from(new File(path)).sheet("Planet Names").list();
    logger.info("RECORDS READ {}",planets.size());
  }

}
