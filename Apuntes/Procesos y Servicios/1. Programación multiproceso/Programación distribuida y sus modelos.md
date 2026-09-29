[[Programas, ejecutables, procesos y servicios|]]
- Un sistema distribuido se base en compartir recursos. Algunos ejemplos son la *WWW* y la computación en la nube.
- En función de cómo se comunican sus procesos, existen 3 modelos de sistemas distribuidos:
	- **Sockets:** Proporcionan los puntos para la comunicación entre procesos. Es la base de la comunicación actual.
	- **RPC** (*Remote Procedure Call*): Permite a un programa cliente llamar a un procedimiento de otro que se está ejecutando en un proceso servidor. El proceso servidor define en su interfaz de servicio los procedimientos que pueden ser utilizados.
	- **RMI**(*Remote Method Invocation*): Objetos distribuidos. Un objeto que reside en un proceso puede invocar métodos de un objeto que reside en otro proceso distinto.