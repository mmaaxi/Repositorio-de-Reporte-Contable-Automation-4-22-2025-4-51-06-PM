Feature: Validate renaming of the column 'Monto Acumulado Folio OPC'

  Scenario: Rename 'Monto Acumulado Folio OPC' to 'Monto Acumulado Folio OPC (2121)'
    Given The Excel is opened
    When I locate the column named 'Monto Acumulado Folio OPC'
    Then The column should be renamed to 'Monto Acumulado Folio OPC (2121)'