[[Programas, ejecutables, procesos y servicios|]]
- Maximizar: 
	- **Uso de la CPU**: Porcentaje de tiempo que la CPU está en uso. 
	- **Rendimiento**: Número de trabajos terminados por unidad de tiempo.
- Minimizar: 
	- **Tiempo de retorno**: Tiempo transcurrido entre la llegada de un proceso y su finalización. 
	- **Tiempo de servicio**: Tiempo dedicado a tareas productivas.
	- **Tiempo de espera**: Tiempo que el proceso está esperando.
### Como calcular cada uno en un ejercicio

Siendo "x" un proceso. Y las casillas siendo tiempo.

1. Mirar cuando entra cada proceso, cuando ==llegan==.
2. Uso de la CPU x = (Nº de casillas utilizadas de x * 100) / Nº de casillas total
3. Rendimiento x = Nº de CPU / Rango de casillas utilizadas por x
4. T. retorno x = Nº de casillas utilizadas por X desde que ==llega==
5. T. servicio x = Nº de casillas utilizadas por X
6. T. espera x = Nº de casillas que no se utilizan desde el inicio (cuando ==llegan==) hasta el final del proceso