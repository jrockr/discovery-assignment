package za.co.discovery.util;

import java.util.function.Consumer;

import org.javafunk.excelparser.exception.ExcelParsingException;

public class ExcelParserErrorHandler implements Consumer<ExcelParsingException> {

	@Override
	public void accept(ExcelParsingException t) {
		System.out.println("- excel parsing exception encountered = " + t + ", message = " + t.getMessage());
	}
}
