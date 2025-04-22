Feature: Validar Orden de la Llave en la sábana contable

  Scenario: Exportar reporte y validar orden de la llave
    Given estoy en el reporte 'Claim Accounting Report'
    When exporto el reporte y abro el archivo de Excel generado
    Then el archivo de Excel se abre correctamente
    And la columna que muestra el nuevo orden de la llave muestra la concatenación esperada