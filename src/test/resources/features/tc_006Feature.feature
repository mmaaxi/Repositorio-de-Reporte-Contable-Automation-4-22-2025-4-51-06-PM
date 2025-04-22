Feature: Verificación de la inclusión de nuevas columnas para IVA en el reporte

  Scenario: Exportar reporte y verificar las nuevas columnas de IVA
    Given el usuario está en la página de exportación de reportes
    When el usuario exporta el reporte
    Then el reporte debe contener las columnas 'IVA 0%', 'IVA exento' e 'IVA retenido'
    And las columnas deben estar en las posiciones indicadas según el anexo