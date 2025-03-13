public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Humano humano1 = new Humano( "Pedro", (byte) 30, "123456789");
        Humano humano2 = new Humano("Juan", (byte) 20, "987654321");
        Humano humano3 = new Humano();
        humano3.setNombre("Maria");
        humano3.setEdad((byte) 25);
        humano3.setIdentificacion("456789123");
        humano1.saludar();
        humano2.saludar();
        System.out.println(humano1.estrato(2000000));
        System.out.println(humano3.getNombre());

    }
}
