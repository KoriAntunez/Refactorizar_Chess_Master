# RefactorChessMaster
Proyecto para refactorizar una aplicación Java de código abierto existente según los principios de programación orientada a objetos.

Cuando digo "refactorizar" me refiero a REEMPLAZAR. Originalmente pensé que el código podría modificarse para que se ajuste a OOP. Sin embargo, después de haber intentado hacerlo, puedo ver que es imposible. El código fuente es completamente procesal, de hecho, es básicamente "C en Java", como les gusta decir a algunas personas conocidas. No puedes cambiar nada sin romper todo el programa. Por lo tanto...

EL PRIMER OBJETIVO DE ESTE PROYECTO ES LOGRAR EXACTAMENTE EL MISMO COMPORTAMIENTO DEL PROGRAMA ORIGINAL UTILIZANDO OOP EN LUGAR DEL CÓDIGO FUENTE.
EL SEGUNDO OBJETIVO ES COMPARAR LAS CLASES CORRESPONDIENTES DE OOP Y DE PROCEDIMIENTO PARA DETERMINAR SUS DIFERENCIAS CLAVE.
EL TERCER OBJETIVO ES EXPLICAR POR QUÉ LAS CLASES ELIMINADAS (SI LAS HAY) FUERON ELIMINADAS.
EL CUARTO OBJETIVO ES EXPLICAR POR QUÉ SE AÑADIERON NUEVAS CLASES (SI LAS HAY).

Descargando los archivos y haciendo que funcionen:

Cuando descarga los archivos fuente, las clases de Java deben ir al paquete raíz de su proyecto de beans limpios o cualquier IDE que esté utilizando. Los archivos de imagen deben ir a un paquete de un nivel inferior llamado "chessImages". Las piezas que usan los gifs acceden a ellos con la siguiente llamada de función: getClass().getResource("chessImages/[putTheImageNameHere].gif")

Nota sobre la autenticidad del código fuente:

De hecho, cambié ligeramente el código fuente para usar la llamada anterior en lugar de "nuevo ImageIcon ([filePathHere)" o "createImageIcon ([Stringpath], [Stringdescription])". No funcionaría de otra manera. Ver https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html 
