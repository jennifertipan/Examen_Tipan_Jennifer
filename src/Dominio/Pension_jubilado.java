
package Dominio;

public abstract class Pension_jubilado {
    private String N_cedula;
    private String Nombre;
    private float Salario;
    private int Aportedeanio;
    
    
    public Pension_jubilado() {
    }

    public Pension_jubilado(String N_cedula, String Nombre, float Salario, int Aportedeanio) {
        this.N_cedula =  N_cedula;
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Aportedeanio = Aportedeanio;
    }

    public String getN_cedula() {
        return N_cedula;
    }

    public void setN_cedula(String N_cedula) {
        this.N_cedula = N_cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public int getAportedeanio() {
        return Aportedeanio;
    }

    public void setAportedeanio(int Aportedeanio) {
        this.Aportedeanio = Aportedeanio;
    }
    
    public float getPensionInicial(){
        
        if(this.Aportedeanio>0 && this.Aportedeanio<11){
            return this.Salario*50/100;
        }else if(this.Aportedeanio>10 && this.Aportedeanio<21){
            return this.Salario*60/100;
        }else if(this.Aportedeanio>20 && this.Aportedeanio<31){
            return this.Salario*70/100;
        }else if(this.Aportedeanio>30 && this.Aportedeanio<36){
            return this.Salario*80/100;
        }else if(this.Aportedeanio>35 && this.Aportedeanio<40){
            return this.Salario*90/100;
        }else if(this.Aportedeanio>39){
            return this.Salario*100/100;
        }
        return 0;
    }
    @Override
     public String toString() {
        return this.Nombre+" "+getTipoPension_jubilacion()+" Pension: $"+calcularPension();
    }
    public abstract String getTipoPension_jubilacion();
    public abstract float calcularPension();
}
