//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int edadJuan=6;
        int edadPedro=6;
        int edadJulio=21;
        int contador=14;
        double hipotenusa=206.73;
        double cateto1=13.2;
        double cateto2=5.7;

        //a) Es true que Juan es menor de edad.

        System.out.println("Juan es menor de edad: "+(edadJuan<=18));

        //b) Es true que Juan tiene la misma edad que Pedro.
        System.out.println("Juan y Pedro tienen la misma edad: "+(edadJuan == edadPedro));

        //c) Es true que Julio tiene más edad que Pedro.
        System.out.println("Julio tiene mas edad que Pedro: " +(edadJulio>edadPedro));

        //d) Es false que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado.
        System.out.println("La hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado: " +(hipotenusa*hipotenusa==(cateto1*cateto1+cateto2*cateto2)));

        //e) Es true que el cateto1 es mayor que el cateto2.
        System.out.println("El cateto 1 es mayor que el cateto 2: "+(cateto1>cateto2));

        //f) Es false que contador es igual a 8.
        System.out.println("Contador es igual a 8: "+(contador == 8));

        //g) Es true que contador es distinto a 8.
        System.out.println("Contador es distinto a 8: "+(contador!=8));



    }
}