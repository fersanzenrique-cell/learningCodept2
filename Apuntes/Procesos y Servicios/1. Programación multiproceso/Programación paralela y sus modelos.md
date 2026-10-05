[[Programas, ejecutables, procesos y servicios|]]
- Los programas paralelos están diseñados para ejecutarse en sistemas con varios procesadores. El [[Programas, ejecutables, procesos y servicios#^3d25de|programa]] se divide en procesos que se ejecutan en procesadores distintos.
- Tradicionalmente la programación paralela se ha utilizado en centros de supercomputación para resolver problemas complejos en el menor tiempo posible. Actualmente con la aparición de los procesadores de múltiples núcleos, sus uso se ha incrementado.
- Los [[Programas, ejecutables, procesos y servicios#^6e2b06|procesos]] cooperan con un fin común, para lo cual necesitan intercambiar información.
- En función de cómo se intercambian esta información, tenemos dos modelos de programación paralela:
	- De **memoria compartida:** Los procesadores comparten la memoria físicamente. Un valor escrito en memoria por un procesador puede ser leído por otro.
	- De **paso de mensajes:** Cada procesador dispone de su propio espacio de memoria, solo accesible por él. El procesador que necesita la información de otro se la solicita, y éste se la envía.