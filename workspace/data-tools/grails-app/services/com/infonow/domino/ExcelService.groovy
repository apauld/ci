package com.infonow.domino

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

class ExcelService{
	
	def excelToCsv(InputStream inputStream){
		String csvData
		
		WorkbookFactory wb = WorkbookFactory.create(inputStream)
		Sheet sheet = wb.getSheetAt(0);
		
		for(Row row: sheet){
			for(Cell cell: row){
				csvData += cell				
				if(row.getLastCellNum()==cell.columnIndex)
					csvData += "'"
			}
		}	
		
		return csvData
	}
	
}


