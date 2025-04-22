Feature: Validar la modificación de la fórmula en Movimiento de Pago

Scenario: Verificar el cálculo de la fórmula y el ajuste por cambio de IVA
  Given El usuario está en la página de Movimiento de Pago
  When El usuario revisa la celda correspondiente a 'Monto Acumulado Folio OPC 2121'
  Then La fórmula debe ser '=Z4+AD5+AE5+AH5+AC5+AB5+AM5' y sumar los valores de IVA correctamente
  When El usuario cambia los valores de IVA
  Then Los resultados del cálculo deben actualizarse correctamente