[[Programas, ejecutables, procesos y servicios|]]
- Un programa se puede componer de varios procesos. Cuando las instrucciones de estos procesos se solapan intercaladamente, se dice que son procesos concurrentes.
### Beneficios de la programación concurrente

- **Mejor aprovechamiento de la CPU:** Cuando un proceso está esperando un evento. otro puede aprovechar la CPU.
- **Velocidad de ejecución:** Al dividir el programa en procesos, éstos se pueden repartir mejor entre el o los procesadores.
- Solucionan problemas de naturaleza concurrente:
	- **Sistemas de control:** Capturan datos, los analizan y actúan.
	- **Tecnologías web:**: Los servidores atienden múltiples peticiones.
	- **Aplicaciones basadas en GUI:** Mientras se atiende al usuario, la aplicación puede estar realizando tareas.
	- **Simulaciones:** Modelización de sistemas físicos con autonomía.
	- **Sistemas Gestores de Bases de Datos:** Atienden múltiples peticiones.

### Problemas de la programación concurrente

- **Exclusión mutua:** Cuando dos o más procesos hacen uso a la vez de una variable se puede producir inconsistencia de datos (uno puede estar escribiendo en ella y otro leyéndola). Para conseguir la exclusión mutua se define la **región crítica**, que limita el acceso a la variable a un único proceso a la vez.
- **Condición de sincronización:** A veces se producen situaciones en que un proceso tiene que esperar a que otro llegue a cierto punto. Para ello se proporcionan mecanismos para bloquear procesos a la espera de que ocurra el evento necesario.