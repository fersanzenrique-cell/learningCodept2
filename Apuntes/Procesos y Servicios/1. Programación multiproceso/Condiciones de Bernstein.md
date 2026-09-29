[[Programación concurrente|]] [[Hilos|]]
Para que dos conjuntos se puedan ejecutar concurrentemente se deben cumplir 3 condiciones:
1. La intersección entre las variables leídas de un conjunto de instrucciones y las escritas de otro, debe ser vacío.
2. La intersección entre las variables escritas de un conjunto de instrucciones y las leídas de otro, debe ser vacío.
3. La intersección entre las variables escritas de un conjunto de instrucciones y las escritas de otro, debe ser vacío.