package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class tc_003Page {

    private static final String FILE_PATH = "ruta/al/archivo/exportado.xlsx";
    private static final String HOJA_NOMBRE = "NombreDeLaHoja";

    public void abrirArchivoExcel() {
        try {
            FileInputStream file = new FileInputStream(new File(FILE_PATH));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(HOJA_NOMBRE);
            // Continue with accessing and validating data
            workbook.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void revisarValoresColumnaEstado() {
        try {
            FileInputStream file = new FileInputStream(new File(FILE_PATH));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(HOJA_NOMBRE);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell estadoCell = row.getCell(colIndexEstado);
                // Implement logic to process each cell value
            }
            workbook.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validarValoresConDocumentacion() {
        // Implement logic to verify the values against some documentation
        return true;
    }
}