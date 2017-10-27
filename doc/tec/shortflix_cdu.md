# Shortflix: casos de uso
## C01: usuario registrado ve un corto
* Descripción: usuario previamente registrado busca un corto y lo reproduce.
* Actor: usuario registrado en el sistema.
* Precondición: hay cortos para visualizar en la página.
* Curso normal:

Curso | | Referencia
------|-------|-----
1| El usuario ingresa al sistema.|
2| El usuario elige alguno de los cortos de la pagina principal|
3| El sistema muestra el corto junto con una breve descripción e información adicional(usuario que lo subió, puntuación, etc)|
4| Fin del caso de uso.
* Cursos secundarios:
    * Actor puede cerrar sesión en cualquier momento.
    * Actor puede dar pausa/adelantar/retrasar el video mientras lo visualiza.
    * Luego de seleccionarlo, el actor puede puntuar el video en cualquier momento.
    
 
## C02: usuario se registra
* Descripción: usuario se registra en el sistema.
* Actor: usuario no registrado en el sistema.
* Precondición: ninguna.
* Curso normal:

Curso | | Referencia
------|-------|-----
1| El usuario ingresa al sistema.|
2| El usuario ingresa a la sección 'registrarse'.|
3| El sistema muestra las opciones de registro: Facebook, Google o cuenta de Shortflix.|
4.a.1| El usuario elige registrarse con Facebook. | SubF-01
4.b.2| El usuario presiona elige registrarse con Google. | SubF-02
4.b.3| El usuario decide crear una cuenta de Shortflix.| SubF-03 
5| El sistema crea un nuevo usuario con los datos recibidos.
6| Fin de caso de uso.

SubF-01| Registro con Facebook
----|----|
4.a.2| El sistema se conecta con Facebook y chequea las credenciales del usuario.|

SubF-02| Registro con Google|
----|----|
4.b.2| El sistema se conecta con Google y chequea las credenciales del usuario.|

SubF-03| Registro de usuario de Shortflix|
----|----|
4.c.2| El usuario ingresa información requerida por el sistema (mail, clave, usuario, confirmación de clave).|
4.c.3| El usuario envia la información.

* Casos excepcionales:
 
Paso|Excepcion|
---|---|
4a.2, 4b.2|Facebook/Google no puede autenticar al usuario. |
4c.2| Usuario utiliza un mail existente en la base de datos del sistema.
5a.3, 5b.3, 5c.3| El usuario no puede ser registrado.

## C03: usuario inicia sesión
* Descripción: usuario inicia sesión en el sistema.
* Actor: usuario no registrado en el sistema.
* Precondición: ninguna.
* Curso normal:

Curso | | Referencia
------|-------|-----
1| El usuario ingresa al sistema.|
2| El ingresa a la sección 'Iniciar sesión'.|
3.a.1| El usuario elige iniciar sesión con Facebook. | SubF-01
3.b.2| El usuario elige iniciar sesión con Google. | SubF-02
3.b.3| El usuario elige inciar sesión con Shortflix.| SubF-03 
5| El sistema autentica al usuario.
6| Fin de caso de uso.

* Casos excepcionales:
 
Paso|Excepcion|
---|---|
3a.2, 3b.2|Ver casos excepcionales 4a.2, 4b.2 de C02. |
3c.2| Usuario ingresa contraseña o mail incorrecto.
4a.3, 4b.3, 4c.3| El usuario no puede iniciar sesión.

