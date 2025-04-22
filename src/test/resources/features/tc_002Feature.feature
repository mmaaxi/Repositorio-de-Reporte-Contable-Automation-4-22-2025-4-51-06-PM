Feature: Verificar la creación de la nueva columna 'Estado Código'

  Scenario: Verificar la columna 'Estado Código' en el reporte exportado
    Given el usuario ha exportado el reporte en formato Excel
    When el usuario revisa la ubicación de las columnas en el archivo Excel
    Then se observa que la columna 'Estado Código' está a la derecha de la columna 'i'