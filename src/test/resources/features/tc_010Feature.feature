Feature: Validación final de integridad y consistencia del reporte contable exportado

  Scenario: Comprobar el orden de columnas, fórmulas y nombres en el reporte excel
    Given El usuario ya exportó el reporte contable a Excel
    When El usuario realiza una revisión completa del Excel generado
    Then El Excel cumple con todos los cambios y ajustes descritos en la documentación de mejoras en la sábana contable