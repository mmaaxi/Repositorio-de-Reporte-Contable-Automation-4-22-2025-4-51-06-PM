Feature: Verify inclusion of 'Monto acumulado Folio Reserva 5401' column

  Scenario: Verify correct position and calculation of 'Monto acumulado Folio Reserva 5401' column
    Given I am on the reservation page
    When I check the position of the 'Monto acumulado Folio Reserva 5401' column
    Then 'Monto acumulado Folio Reserva 5401' is located to the right of 'Monto (reserva)'
    And the correct sum of previous and current reservation amounts is displayed