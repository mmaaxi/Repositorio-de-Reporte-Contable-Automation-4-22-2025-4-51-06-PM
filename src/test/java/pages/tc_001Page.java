package pages;

import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimAccountingReport() {
        // Lógica para navegar al reporte 'Claim Accounting Report'
    }

    public void exportReportAndOpenExcel() {
        // Lógica para exportar el reporte y abrir el archivo de Excel
    }

    public void verifyExcelOpened() {
        // Lógica para verificar que el archivo de Excel se abre correctamente
    }

    public void verifyConcatenatedColumn() {
        // Lógica para verificar que la columna muestre la concatenación esperada
        // utilizando la formula CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)
    }
}