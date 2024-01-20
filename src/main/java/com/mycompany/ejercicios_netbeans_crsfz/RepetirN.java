/**
 *
 * @author crsfz
 * Este programa en Java genera un número aleatorio n entre 0 y 19,....
 * imprime el número de iteraciones (que es n + 1), y luego ejecuta un bucle for para generar y mostrar n números aleatorios
 */
public class RepetirN {

    public static void main(String[] args) {
        
        //Generación del número aleatorio n:
        //Se utiliza Math.random() para generar un número decimal aleatorio en el rango [0, 1)
        //Se multiplica por 20 para obtener un número en el rango [0, 20)
        //Se realiza un casting a int para convertir el número en un entero y almacenarlo en la variable n.
        int n = (int) (Math.random()*20);
        
        //Impresión del número de iteraciones:
        //Imprime en la consola el número de iteraciones, que es n + 1. Se suma 1 porque el rango de iteraciones es [1, n + 1]
        System.out.println("Numero de iteraciones: "+(n+1));
        
        //Bucle for para generar números aleatorios:
        //Se utiliza un bucle for que se ejecutará n veces
        //Dentro del bucle, se genera un número aleatorio x en el rango [18, 64]
        //Se imprime en la consola el número aleatorio junto con su posición en la iteración (comenzando desde 1)
        for(int i=0; i<n; i++) {
            int x = (int) (Math.random()*(65-8)+18);
            
            System.out.println("Numero aleatorio"+1+": "+x);
        }
    }
    
}
