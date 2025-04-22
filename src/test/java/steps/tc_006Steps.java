package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page reportePage = new tc_006Page();

    @Given("el usuario está en la página de exportación de reportes")
    public void elUsuarioEstaEnLaPaginaDeExportacionDeReportes() {
        reportePage.navegarAPaginaDeExportacionDeReportes();
    }

    @When("el usuario exporta el reporte")
    public void elUsuarioExportaElReporte() {
        reportePage.exportarReporte();
    }

    @Then("el reporte debe contener las columnas 'IVA 0%', 'IVA exento' e 'IVA retenido'")
    public void elReporteDebeContenerLasColumnasIVA() {
        Assert.assertTrue("Columna IVA 0% no encontrada", reportePage.verificarColumnaIVA("IVA 0%"));
        Assert.assertTrue("Columna IVA exento no encontrada", reportePage.verificarColumnaIVA("IVA exento"));
        Assert.assertTrue("Columna IVA retenido no encontrada", reportePage.verificarColumnaIVA("IVA retenido"));
    }

    @Then("las columnas deben estar en las posiciones indicadas según el anexo")
    public void lasColumnasDebenEstarEnLasPosicionesIndicadas() {
        Assert.assertTrue("Las columnas no están en las posiciones correctas", reportePage.verificarPosicionesColumnas());
    }
}