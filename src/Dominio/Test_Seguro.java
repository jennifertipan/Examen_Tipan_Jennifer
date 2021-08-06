package Dominio;

import java.util.ArrayList;
import java.util.List;
public class Test_Seguro {

    
    
    public static void main(String[] args) {
        float inflacion =(float) 11.2;
        List<Pension_jubilado> jubilados= new ArrayList<>();
        Jubilado_vejez j1= new Jubilado_vejez("0500000000", "Tipan Jennifer", 800, 25);
        Jubilado_discapacidad j2 = new Jubilado_discapacidad("0501234567", "Soria Daniela", 925, 25, 60);
        Jubilado_patronal j3= new Jubilado_patronal("0534567878", "Natali Casa", 2250, 9, Empresa.Publica, inflacion);
        Jubilado_patronal j4= new Jubilado_patronal("0506666666", "Victor Casa", 350, 29, Empresa.Privada, inflacion);
        jubilados.add(j1);
        jubilados.add(j2);
        jubilados.add(j3);
        jubilados.add(j4);
        System.out.println(" Jubilación por vejez, patronal, discapacidad ");
        System.out.println("Pension de Jubilación a recibir es :");
        jubilados.forEach((jubi) -> {
            System.out.println("-"+jubi.toString());
        });
    }
    
}
