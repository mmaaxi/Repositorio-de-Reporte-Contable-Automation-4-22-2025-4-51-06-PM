package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tc_008Page;
import org.junit.Assert;

public class Tc_008Steps {
    private Tc_008Page page = new Tc_008Page();

    @Given("el archivo Excel está preparado")
    public void prepareExcelFile() {
        page.loadExcelFile();
    }

    @When("reviso la existencia de las columnas 'Folio Pre solicitud', 'Folio de Pago' y 'Status Pago Código'")
    public void checkColumnExistence() {
        page.checkColumnsExistence();
    }

    @Then("las columnas están presentes sin valores asignados")
    public void verifyColumnsArePresentWithoutValues() {
        Assert.assertTrue(page.areColumnsPresentWithoutValues());
    }

    @When("confirmo que 'Status de Pago' se ha renombrado a 'Descripción Status Pago'")
    public void confirmRenameStatusColumn() {
        page.verifyColumnRename();
    }

    @Then("el nombre de la columna es 'Descripción Status Pago'")
    public void verifyStatusColumnIsRenamed() {
        Assert.assertTrue(page.isColumnRenamed());
    }
}