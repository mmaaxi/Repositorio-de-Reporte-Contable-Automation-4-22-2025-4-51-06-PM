Feature: Verificar la modificación de la fórmula de 'IVA Acumulado'

  Scenario: Modificar valores de IVA y verificar actualización en la fórmula de 'IVA Acumulado'
    Given el usuario abre el archivo de Excel con las fórmulas de IVA
    When examina la celda que contiene la fórmula de 'IVA Acumulado'
    Then la fórmula incluye los valores de IVA 16%, IVA FRONTERIZO, IVA 0% e IVA EXENTO, excluyendo IVA retenido

    When modifica los valores de IVA
    Then el resultado en la celda se actualiza según los nuevos valores sin considerar el IVA retenido