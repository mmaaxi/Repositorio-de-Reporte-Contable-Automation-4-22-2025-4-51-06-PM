package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TC_007Page;

public class TC_007Steps {

    TC_007Page tc007Page = new TC_007Page();

    @Given("El usuario está en la página de Movimiento de Pago")
    public void elUsuarioEstaEnLaPaginaDeMovimientoDePago() {
        tc007Page.openMovimientoDePagoPage();
    }

    @When("El usuario revisa la celda correspondiente a 'Monto Acumulado Folio OPC 2121'")
    public void elUsuarioRevisaLaCeldaCorrespondienteAMontoAcumuladoFolioOPC2121() {
        tc007Page.viewFolioOpc2121Cell();
    }

    @Then("La fórmula debe ser '=Z4+AD5+AE5+AH5+AC5+AB5+AM5' y sumar los valores de IVA correctamente")
    public void laFormulaDebeSerLaDeseada() {
        String expectedFormula = "=Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        String actualFormula = tc007Page.getFormulaFromCell();
        Assert.assertEquals(expectedFormula, actualFormula);
    }

    @When("El usuario cambia los valores de IVA")
    public void elUsuarioCambiaLosValoresDeIVA() {
        tc007Page.changeIvaValues();
    }

    @Then("Los resultados del cálculo deben actualizarse correctamente")
    public void losResultadosDelCalculoDebenActualizarseCorrectamente() {
        boolean calculationCorrect = tc007Page.verifyUpdatedCalculation();
        Assert.assertTrue("La actualización del cálculo no es correcta", calculationCorrect);
    }
}