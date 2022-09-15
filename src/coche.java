public class coche {
    // Atributos
    int puertas;
    String marca;

        // Metodos Getter
        public int getPuertas(){
            return this.puertas;
        }

        public String getMarca(){
            return this.marca;
        }

        // Metdos Setter
        public void setPuertas(int p){
            this.puertas = p;
        }

        public void setMarca(String m){
            this.marca = m;
        }

        // Metodo obtener la info del coche
        public void mostrarInfo(){
            System.out.println("el numero de puertas del coche es:");
            System.out.println("puertas: " + getPuertas());
            System.out.println("marca: " + getMarca());
        }

}
