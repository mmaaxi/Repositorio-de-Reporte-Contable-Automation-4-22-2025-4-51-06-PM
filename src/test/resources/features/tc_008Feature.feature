Feature: Verificar la creación de nuevas columnas sin valores definidos para futura integración

  Scenario: Validar existencia y renombramiento de columnas en Excel
    Given el archivo Excel está preparado
    When reviso la existencia de las columnas 'Folio Pre solicitud', 'Folio de Pago' y 'Status Pago Código'
    Then las columnas están presentes sin valores asignados
    When confirmo que 'Status de Pago' se ha renombrado a 'Descripción Status Pago'
    Then el nombre de la columna es 'Descripción Status Pago'