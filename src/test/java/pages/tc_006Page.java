package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

import java.util.List;

public class tc_006Page {

    WebDriver driver = DriverFactory.getDriver();

    private By reporteExportadoLocator = By.id("reporte_exportado");
    private By columnasLocator = By.tagName("th");

    public void navegarAPaginaDeExportacionDeReportes() {
        driver.get("http://url_de_exportacion_reportes");
    }

    public void exportarReporte() {
        driver.findElement(By.id("exportar_btn")).click();
    }

    public boolean verificarColumnaIVA(String columnaIVA) {
        List<WebElement> columnas = driver.findElements(columnasLocator);
        for (WebElement columna : columnas) {
            if (columna.getText().equals(columnaIVA)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarPosicionesColumnas() {
        List<WebElement> columnas = driver.findElements(columnasLocator);
        return columnas.get(5).getText().equals("IVA 0%") && 
               columnas.get(6).getText().equals("IVA exento") && 
               columnas.get(7).getText().equals("IVA retenido");
    }
}