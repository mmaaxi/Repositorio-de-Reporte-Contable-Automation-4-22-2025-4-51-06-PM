Feature: Validación de actualización de campos de Excel

  Scenario: Validar actualización de los campos bajo la columna 'estado'
    Given El usuario abre el archivo Excel exportado
    When El usuario revisa los valores de la columna estado
    Then Los valores deben coincidir con lo definido en la documentación