
package Dominio;


public class Jubilado_discapacidad extends Pension_jubilado {
    private int discapacidad;

    public Jubilado_discapacidad(String cedula, String nombre, float salario, int aniosAporte,int discapacidad) {
        super(cedula, nombre, salario, aniosAporte);
        this.discapacidad = discapacidad;
    }

    public int getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(int discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    @Override
    
    public float calcularPension() {
        float pi = this.getPensionInicial();
        float bono = this.getSalario() * this.discapacidad / 100;
        return pi + bono;
    }

    @Override
    
    public String getTipoPension_jubilacion() {
        return "Jubilación por discapacidad.";
    }

}

