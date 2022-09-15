public class ejercicio9 {
    public static void main(String[] args) {
        cliente sandra = new cliente();
        sandra.setNombre("Sandra");
        sandra.setEdad(27);
        sandra.setTelefono(70897);
        sandra.setCredito(2500.5);

        System.out.println(sandra.getNombre());
        System.out.println(sandra.getEdad());
        System.out.println(sandra.getTelefono());
        System.out.println(sandra.getCredito());

        trabajador andres = new trabajador();
        andres.setNombre("Andres");
        andres.setEdad(35);
        andres.setTelefono(76548);
        andres.setSalario(4500);

        System.out.println(andres.getNombre());
        System.out.println(andres.getEdad());
        System.out.println(andres.getTelefono());
        System.out.println(andres.getSalario());



    }
}
class persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad){

        this.edad = edad;
    }
    public String getEdad(){

        return "Edad: " + this.edad;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){

        return "Nombre: " + this.nombre;
    }
    public void setTelefono(int telefono){

        this.telefono = telefono;
    }
    public String getTelefono(){

        return "Telefono: " + this.telefono;
    }
}

class cliente extends persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public String getCredito() {
        return "Credito: " + this.credito;
    }

}

class trabajador extends persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getSalario() {
        return "Salario: " + this.salario;
    }
}