#language: es
#Autor: Harold Altamiranda
@hu
  Característica: Simulacion en la pagina de Falabella consulta y pago de productos
    Como un usuario no registrado de Falabella
    Quiero consultar una de las categorías
    Para seleccionar uno de sus productos y simular la compra
    Antecedentes:
      Dado que estoy en la pagina falabella
    @CP
      Escenario: Simular la compra de un producto
      Cuando selecciono una categoria y subcategoria
      Y selecciono un producto de esa categoria
      Y diligencio los formularios opciones de despacho
      |direccion       |barrio      |
      |Cra 36 # 34 - 89|Buenos Aires|
      Y escojo el medio de pago tarjeta de credito
      Y diligencio el formulario de tarjeta
      |nombreTarjeta     |numeroTarjeta   |codigoCVV|
      |harold altamiranda|5452986875735484|206      |
      Y diligencio el formulario de datos personales
      |nombre|apellido   |correo              |cedula    |celular   |
      |Harold|Altamiranda|harold29as@gmail.com|1052942912|3004639870|
      Entonces valido que el mensaje modal tenga el siguiente valor "INGRESAR TU ORDEN"