package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_002Page;
import org.junit.Assert;

public class tc_002Steps {
    
    tc_002Page page = new tc_002Page();

    @Given("el usuario ha exportado el reporte en formato Excel")
    public void el_usuario_ha_exportado_el_reporte_en_formato_Excel() {
        page.exportReportToExcel();
    }

    @When("el usuario revisa la ubicación de las columnas en el archivo Excel")
    public void el_usuario_revisa_la_ubicación_de_las_columnas_en_el_archivo_Excel() {
        page.openExcelFile();
    }

    @Then("se observa que la columna 'Estado Código' está a la derecha de la columna 'i'")
    public void se_observa_que_la_columna_Estado_Código_está_a_la_derecha_de_la_columna_i() {
        Assert.assertTrue(page.isEstadoCodigoColumnPositionedCorrectly());
    }
}