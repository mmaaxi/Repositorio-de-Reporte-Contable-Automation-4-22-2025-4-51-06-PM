package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("El usuario ya exportó el reporte contable a Excel")
    public void usuarioExportoReporteContable() {
        page.exportarReporteContable();
    }

    @When("El usuario realiza una revisión completa del Excel generado")
    public void usuarioRevisaExcelGenerado() {
        page.revisarExcelGenerado();
    }

    @Then("El Excel cumple con todos los cambios y ajustes descritos en la documentación de mejoras en la sábana contable")
    public void verificarCambiosYDocumentacion() {
        page.verificarIntegridadYConsistencia();
    }
}