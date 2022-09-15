public class Condicionales {
    public static void main(String[] args) {
        int numero = -30;

        if (numero < 0) {
            System.out.println("este numero es negativo: " + numero);

        } else {
            System.out.println("este numero es mayor o igual a 0");
        }
    }
}

class condicional2 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 3) {
            System.out.println(contador);
            contador = contador + 1;
        }

    }
}

class condicional3 {
    public static void main(String[] args) {
        int contador = 3;

        do {
            System.out.println(contador);
            contador = contador + 1;
        } while (contador <= 3);

    }
}

class condicional4 {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 3; contador = contador + 1 ){
            System.out.println(contador);
        }

    }
}

class condicional5 {
    public static void main(String[] args) {
        String estacion = "frio";

        switch(estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}