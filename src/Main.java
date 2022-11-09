public class Main {
    public static void main(String[] args) {
    /*
    Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    */

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("la variable numeroIf es positiva");
        } else if (numeroIf < 0) {
            System.out.println("la variable numeroIf es negativa");

        } else {
            System.out.println("la variable numeroIf es cero");

        }

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
         */
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Ejecucion while, numero: " + numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numeroWhile++;
            System.out.println("Ejecucion do while, numero: " + numeroWhile);
        } while (numeroWhile < 3);

        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
        que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
        y deberá mostrarse por pantalla.*/
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Ejecucion for, numero: " + numeroFor);
        }


        /*
        para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
        */

        String estacion = "";
        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera ");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("El valor de la variable no es valido | " +
                        "valores validos: invierno,varano,primavera,otoño");
                break;
        }
    }
}


