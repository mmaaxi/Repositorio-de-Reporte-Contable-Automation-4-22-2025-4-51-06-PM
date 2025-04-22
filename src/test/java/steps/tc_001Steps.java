package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("estoy en el reporte 'Claim Accounting Report'")
    public void estoyEnElReporte() {
        driver = new ChromeDriver();
        page = new tc_001Page(driver);
        page.navigateToClaimAccountingReport();
    }

    @When("exporto el reporte y abro el archivo de Excel generado")
    public void exportoReporteYAbroExcel() {
        page.exportReportAndOpenExcel();
    }

    @Then("el archivo de Excel se abre correctamente")
    public void elExcelSeAbreCorrectamente() {
        page.verifyExcelOpened();
    }

    @Then("la columna que muestra el nuevo orden de la llave muestra la concatenación esperada")
    public void validarConcatenacionEnColumna() {
        page.verifyConcatenatedColumn();
    }
}