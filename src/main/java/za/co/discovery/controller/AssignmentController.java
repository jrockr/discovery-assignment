/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.discovery.controller;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import za.co.discovery.util.ExcelParserService;

import java.io.IOException;

/**
 * @author Vinay.Joshi
 */

@RestController
@RequestMapping(value = "/api", method = RequestMethod.GET)
public class AssignmentController {


  @Autowired
  private ExcelParserService parser;


  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
  public String testAPI(@RequestParam("file") MultipartFile file) throws InvalidFormatException, IOException {
//    	ExcelParser parser = new ExcelParser();
//    	file.transferTo(Fi);
    //parser.parser(file.getInputStream());
    parser.parseExcel("C:\\Users\\C740129\\Documents\\My Received Files\\assignment\\src\\main\\resources\\Assignment_Data.xlsx");
    parser.query(Long.valueOf(1));
    return "{Test Success}";
  }
}
