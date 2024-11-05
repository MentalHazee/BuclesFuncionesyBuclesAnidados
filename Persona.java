public class Persona {
    //Atributos
    String nombre;
    String apellido;
    String documento;
    int anioNacimiento;
    String paisOrigen;
    char genero;

    //Contructor
    public Persona(String nombre, String apellido, String documento, int anioNacimiento, String paisOrigen, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
        this.paisOrigen = paisOrigen;
        this.genero = genero;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public char getGenero() {
        return genero;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    void imprimirDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Documento: " +documento);
        System.out.println("Año de nacimiento: " +anioNacimiento);
        System.out.println("País de Origen: " +paisOrigen);
        System.out.println("Género: " +genero);
        System.out.println();
    }
}
