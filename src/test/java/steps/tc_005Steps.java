package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    public tc_005Steps() {
        this.driver = Hooks.driver;
        this.page = new tc_005Page(driver);
    }

    @Given("The Excel is opened")
    public void the_excel_is_opened() {
        page.openExcel();
    }

    @When("I locate the column named 'Monto Acumulado Folio OPC'")
    public void i_locate_the_column_named() {
        page.locateAndRenameColumn("Monto Acumulado Folio OPC", "Monto Acumulado Folio OPC (2121)");
    }

    @Then("The column should be renamed to 'Monto Acumulado Folio OPC (2121)'")
    public void the_column_should_be_renamed() {
        boolean isRenamed = page.verifyColumnRenaming("Monto Acumulado Folio OPC (2121)");
        assert isRenamed : "Column was not renamed correctly";
    }
}