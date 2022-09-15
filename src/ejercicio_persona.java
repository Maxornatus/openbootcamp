public class ejercicio_persona {
    public static void main(String[] args) {
        persona1 pedro = new persona1();
        pedro.setEdad(27);
        pedro.setNombre("Pedro");
        pedro.setTelefono(304564);

        System.out.println(pedro.getNombre());
        System.out.println(pedro.getEdad());
        System.out.println(pedro.getTelefono());

    }
}
class persona1 {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
