package examen;

public class Operacion {
    String nombreOperacion;
    int cantidadOperaciones;
    int resultado;

    public Operacion(String nombreOperacion, int cantidadOperaciones, int resultado){
        this.cantidadOperaciones = cantidadOperaciones;
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public int getCantidadOperaciones() {
        return cantidadOperaciones;
    }

    public void setCantidadOperaciones(int cantidadOperaciones) {
        this.cantidadOperaciones = cantidadOperaciones;
    }
}
