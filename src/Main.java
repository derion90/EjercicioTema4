

public class Main {
    public static void main(String[] args) {
        //Call every program from here.
        //UsandoUnIf();
        //UsandoUnWhile();
        //UsandoUnDoWhile();
        //UsandoUnFor();
        //UsandoUnSwitch();

    }

    /**
     * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     */
    static void UsandoUnIf() {
        int numeroIf = 10;
        if(numeroIf > 0 ){
            System.out.println("El numero "+numeroIf+" es positivo");
        } else if (numeroIf<0) {
            System.out.println("El numero "+numeroIf+" es negativo");
        } else{
            System.out.println("El numero "+numeroIf+" es igual a cero");
        }
    }

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
     * el bloque de código que tendrá el bucle deberá:
     * -Incrementar el valor de la variable en uno cada vez que se ejecute.
     * -Mostrarlo por pantalla cada vez que se ejecute.
     */
    static void UsandoUnWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
     */
    static void UsandoUnDoWhile() {
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);
    }

    /**
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
     * la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
     * mostrarse por pantalla.
     */
    static void UsandoUnFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
     * del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
     * de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea
     * una estación.
     */
    static void UsandoUnSwitch() {
        String estacion = "Verano";
        switch (estacion){
            case "Otoño":
                System.out.println("Estamos en "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en "+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en "+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en "+estacion);
                break;
            default:
                System.out.println("Eso no es una estación");
        }
    }
}