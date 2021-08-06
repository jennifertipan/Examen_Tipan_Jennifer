
package Dominio;

public class Jubilado_vejez extends Pension_jubilado {

    public Jubilado_vejez(String cedula, String nombre, float salario, int aniosAporte) {
        super(cedula, nombre, salario, aniosAporte);
    }
    
    @Override
    public float calcularPension() {
        float pi=this.getPensionInicial();
        float bono=this.getSalario()*15/100;
        return pi+bono;
    }

    @Override
    public String getTipoPension_jubilacion() {
        return "Jubilación por vejez.";
    }
    
}
