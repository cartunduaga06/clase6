public class impresora {


    private String modelo;
private int cantidadHojas;
private String tipoConexion;
private String fechaFabricacion;

    public impresora(String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidadHojas = 0;
    }

    private boolean tienePapel(){
        return this.cantidadHojas > 0;
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

}
