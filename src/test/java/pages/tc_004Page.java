package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    By amountReservaColumn = By.xpath("//th[text()='Monto (reserva)']");
    By cumulativeAmountColumn = By.xpath("//th[text()='Monto acumulado Folio Reserva 5401']");
    By previousReservationAmount = By.id("previous-reservation-amount");
    By currentReservationAmount = By.id("current-reservation-amount");
    By displayedCumulativeAmount = By.id("displayed-cumulative-amount");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAmountCumulativeColumnLocatedCorrectly() {
        WebElement amountColumn = driver.findElement(amountReservaColumn);
        WebElement cumulativeColumn = driver.findElement(cumulativeAmountColumn);

        return cumulativeColumn.getLocation().getX() > amountColumn.getLocation().getX();
    }

    public double calculateExpectedSum() {
        double previous = Double.parseDouble(driver.findElement(previousReservationAmount).getText());
        double current = Double.parseDouble(driver.findElement(currentReservationAmount).getText());

        return previous + current;
    }

    public double getDisplayedSum() {
        return Double.parseDouble(driver.findElement(displayedCumulativeAmount).getText());
    }
}