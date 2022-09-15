public class ejemplo_negrito {
    public static void main(String[] args) {
        persona2 andres = new persona2();
        andres.setNombre("Andres");
        System.out.println(andres.getNombre());
    }
}
class persona2 {
    int resultado;
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
