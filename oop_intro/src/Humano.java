public class Humano {
    private String nombre;
    private byte edad;
    private String identificacion;

    public Humano(String nuevoNombre, byte nuevaEdad, String nuevaIdentificacion){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        identificacion = nuevaIdentificacion;
    }

    public Humano(){}

    public void saludar(){
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años y mi cedula es " + identificacion);
    }

    public String estrato(int salario){
        if(salario == 0){
            return "Pobre";
        }else {
            return "Rico";
        }
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEdad(byte nuevaEdad){
        edad = nuevaEdad;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(String nuevaIdentificacion){
        identificacion = nuevaIdentificacion;
    }

}