package com.Test.RANKMFSELENIUM;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExecutionSummaryReport {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();

        // Tester Info Sheet
        Sheet testerSheet = workbook.createSheet("Tester Info");
        Object[][] testerInfo = {
                {"Tester Name", "Ravindra Ramesh Chavan"},
                {"Designation", "Senior Software Engineer"},
                {"Date", "22/05/2025"},
                {"Sprint", "Sprint 45"}
        };
        writeToSheet(testerSheet, testerInfo);

        // Web Application Sheet
        Sheet webSheet = workbook.createSheet("Web Application");
        Object[][] webData = {
                {"Module", "TC_Count", "Tested", "Pass", "Fail", "Remaining TestCases", "%Pass", "%Completion", "Defect", "Status"},
                {"Regression Testing", 1, 1, 0, 12, 0, "0%", "100%", 2, "DONE"},
                {"Sanity Testing", 1, 1, 0, 0, 0, "0%", "100%", 0, "DONE"},
                {"DataBase", 1, 1, 0, 0, 0, "0%", "100%", 0, "DONE"},
                {"Total Count", 1, 1, 0, 0, 0, "0%", "100%", 0, "DONE"}
        };
        writeToSheet(webSheet, webData);

        // Android Mobile Sheet
        Sheet androidSheet = workbook.createSheet("Android Mobile");
        Object[][] androidData = {
                {"Module", "TC_Count", "Tested", "Pass", "Fail", "Remaining TestCases", "%Pass", "%Completion", "Defect", "Status"},
                {"Regression Testing", 1, 1, 0, 12, 0, "0%", "100%", "", ""},
                {"Sanity Testing", 1, 1, 0, 12, 0, "0%", "100%", "", ""},
                {"DataBase", 1, 1, 0, 4, 0, "0%", "100%", "", ""},
                {"Total Count", 1, 1, 0, "", 0, "0%", "100%", "", ""}
        };
        writeToSheet(androidSheet, androidData);

        // iOS Mobile Sheet
        Sheet iosSheet = workbook.createSheet("iOS Mobile Application");
        Object[][] iosData = {
                {"Module", "TC_Count", "Tested", "Pass", "Fail", "Remaining TestCases", "%Pass", "%Completion", "Defect", "Status"},
                {"Regression Testing", 123, 7, 20, 12, 116, "286%", "6%", "", ""},
                {"Sanity Testing", 23, 23, 23, "", 0, "100%", "100%", "", ""},
                {"DataBase", 34, 34, 34, "", 0, "100%", "100%", "", ""},
                {"Total Count", 180, 64, "", "", "", "0%", "36%", "", ""}
        };
        writeToSheet(iosSheet, iosData);

        // Save the workbook
        try (FileOutputStream fileOut = new FileOutputStream("Execution_Summary_Report.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            System.out.println("Excel report generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToSheet(Sheet sheet, Object[][] data) {
        int rowNum = 0;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else {
                    cell.setCellValue(String.valueOf(field));
                }
            }
        }
    }
}
