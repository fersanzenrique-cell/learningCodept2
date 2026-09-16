[[Programas, ejecutables, procesos y servicios|]]

- **FCFS (First Come, First Served)**: El primero en llegar es el primero en entrar a la CPU. [[Tipos de planificación de procesos#^4aa489|No apropiativo.]]
	- + Fácil de implementar.
	- - Tiempo de espera promedio bastante largo.
	
- **SJF (Shortest Job First)**: Primero el trabajo más corto. No apropiativo.
	- + Minimiza el tiempo de espera medio.
	- - Riesgo de inanición de los procesos largos.
	- - En la práctica se basa en estimaciones de la duración de los procesos.
	- Son ideales para *batches*.
	
- **Por prioridad**: Entra el de mayor prioridad. [[Tipos de planificación de procesos#^f0235a|Apropiativo]] o no apropiativo.
	- - Los procesos con prioridad más baja tienen riesgo de inanición. Solución: envejecimiento (aumentar prioridad con el tiempo).

- **RR (Round Robin)**: Como FCFS pero cada proceso dispone de un tiempo máximo (Q). Apropiativo.
	- Si Q es muy grande, los procesos terminan de usar la CPU antes del límite de tiempo. En este caso es idéntico a FCFS. 
	- Si Q es muy pequeño, al estar cambiando constantemente de proceso, el rendimiento disminuye mucho.