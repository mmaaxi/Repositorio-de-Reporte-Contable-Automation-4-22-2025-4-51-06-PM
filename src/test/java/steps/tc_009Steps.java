package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Tc009Page;

public class Tc009Steps {

    private Tc009Page page;

    @Given("el usuario abre el archivo de Excel con las fórmulas de IVA")
    public void openExcelFile() {
        page = new Tc009Page();
        page.openExcelFile();
    }

    @When("examina la celda que contiene la fórmula de 'IVA Acumulado'")
    public void examineCellFormulaIvaAcumulado() {
        page.navigateToIvaAcumuladoCell();
    }

    @Then("la fórmula incluye los valores de IVA 16%, IVA FRONTERIZO, IVA 0% e IVA EXENTO, excluyendo IVA retenido")
    public void verifyInitialFormula() {
        String formula = page.getIvaAcumuladoFormula();
        Assert.assertTrue(formula.contains("IVA 16%") && 
                          formula.contains("IVA FRONTERIZO") && 
                          formula.contains("IVA 0%") && 
                          formula.contains("IVA EXENTO") &&
                          !formula.contains("IVA RETENIDO"));
    }

    @When("modifica los valores de IVA")
    public void modifyIvaValues() {
        page.modifyIvaValues();
    }

    @Then("el resultado en la celda se actualiza según los nuevos valores sin considerar el IVA retenido")
    public void verifyUpdatedResult() {
        double result = page.getUpdatedIvaAcumuladoResult();
        Assert.assertEquals(page.calculateExpectedResult(), result, 0.01);
    }
}