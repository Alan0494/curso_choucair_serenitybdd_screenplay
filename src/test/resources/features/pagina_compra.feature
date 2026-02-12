#language: es
#encoding: UTF-8


Característica: Compra en la  SauceDemo
  Yo usuario de la tienda
  Quiero iniciar sesion y agregar productos al carrito
  Para finalizar la compra


  @SwagLabs
  @UserHistory=001
  Escenario: Usuario inicia sesión y compra un producto
    Dado que Alan abre la página de SauceDemo
    Cuando inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
    Y agrega 5 producto al carrito y finaliza la compra
    Entonces debería ver el mensaje "Thank you for your order!"