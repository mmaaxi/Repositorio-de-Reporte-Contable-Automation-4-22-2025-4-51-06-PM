package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("^El usuario abre el archivo Excel exportado$")
    public void abrirExcelExportado() {
        page.abrirArchivoExcel();
    }

    @When("^El usuario revisa los valores de la columna estado$")
    public void revisarColumnaEstado() {
        page.revisarValoresColumnaEstado();
    }

    @Then("^Los valores deben coincidir con lo definido en la documentación$")
    public void validarValoresConDocumentacion() {
        assertTrue("Los valores de la columna 'estado' no coinciden con la documentación.", 
            page.validarValoresConDocumentacion());
    }
}