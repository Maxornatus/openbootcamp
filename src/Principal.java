public class Principal {
    public static void main(String[] args) {
        // crear objeto
        coche nuevoCoche = new coche();
        nuevoCoche.setPuertas(4);
        nuevoCoche.setMarca("Mazda");
        nuevoCoche.mostrarInfo();

        coche nuevoCoche2 = new coche();
        nuevoCoche2.setPuertas(2);
        nuevoCoche2.setMarca("Chevrolet");
        nuevoCoche2.mostrarInfo();

        coche miCoche = new coche();
        miCoche.setPuertas(sumarPuertas(1, 2));
        miCoche.setMarca("Kia");
        miCoche.mostrarInfo();

    }
    public static int sumarPuertas(int a, int b){
        int resultado = a + b;
        return resultado;
    }
}
