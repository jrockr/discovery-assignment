package za.co.discovery.assignment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.discovery.util.ExcelParserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssignmentApplicationTests {

  @Autowired
  private ExcelParserService excelParserService;

  @Test
  public void contextLoads() {
  }

  @Test
  public void parseExcel() {
    excelParserService.parseExcel("C:\\Users\\C740129\\Documents\\My Received Files\\assignment\\src\\main\\resources\\Assignment_Data.xlsx");
  }

}

