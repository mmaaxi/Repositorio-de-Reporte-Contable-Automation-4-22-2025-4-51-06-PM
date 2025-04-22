package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("^I am on the reservation page$")
    public void iAmOnTheReservationPage() {
        // Code to navigate to the reservation page
    }

    @When("^I check the position of the 'Monto acumulado Folio Reserva 5401' column$")
    public void iCheckThePositionOfTheColumn() {
        // Code to check the position of the column
    }

    @Then("^'Monto acumulado Folio Reserva 5401' is located to the right of 'Monto \\(reserva\\)'$")
    public void columnIsLocatedCorrectly() {
        assertTrue(page.isAmountCumulativeColumnLocatedCorrectly());
    }

    @Then("^the correct sum of previous and current reservation amounts is displayed$")
    public void correctSumIsDisplayed() {
        assertEquals(page.calculateExpectedSum(), page.getDisplayedSum());
    }
}