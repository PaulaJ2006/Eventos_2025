public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private boolean gobierno;

    public Carro(String marca, String modelo, String placa, boolean gobierno) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.gobierno = gobierno;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isGobierno() {
        return gobierno;
    }
    
    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }
    
    
}
