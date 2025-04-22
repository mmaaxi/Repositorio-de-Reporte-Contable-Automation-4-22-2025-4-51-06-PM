package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tc_008Page {

    private static final String FILE_PATH = "path_to_excel_file.xlsx";
    private Workbook workbook;

    public void loadExcelFile() {
        try (FileInputStream file = new FileInputStream(new File(FILE_PATH))) {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkColumnsExistence() {
        // Here we would implement the logic to check the existence of the columns
    }

    public boolean areColumnsPresentWithoutValues() {
        // Replace with actual implementation
        Sheet sheet = workbook.getSheetAt(0);
        Row headerRow = sheet.getRow(0);

        boolean folioPreSolicitudExists = headerRow.getCell(0).getStringCellValue().equals("Folio Pre solicitud");
        boolean folioDePagoExists = headerRow.getCell(1).getStringCellValue().equals("Folio de Pago");
        boolean statusPagoCodigoExists = headerRow.getCell(2).getStringCellValue().equals("Status Pago Código");

        // Further check for values in these columns
        return folioPreSolicitudExists && folioDePagoExists && statusPagoCodigoExists;
    }

    public void verifyColumnRename() {
        // Logic to verify if the column has been renamed
    }

    public boolean isColumnRenamed() {
        // Implement the logic to confirm the column is renamed
        Sheet sheet = workbook.getSheetAt(0);
        Row headerRow = sheet.getRow(0);

        return headerRow.getCell(3).getStringCellValue().equals("Descripción Status Pago");
    }
}