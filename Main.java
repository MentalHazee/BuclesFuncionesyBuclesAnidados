import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion de los planetas
        Planeta planeta1 = new Planeta("Júpiter", 95, 1.899e27, 1.4313e15, 139820, 750000000, TipoPlaneta.GASEOSO, true, 12, 0);
        Planeta planeta2 = new Planeta("Tierra", 10928, 5.927e24, 1.08321e12, 12742, 150000000, TipoPlaneta.TERRESTRE, true, 1, 1);

        System.out.println("Planeta 1:");
        planeta1.mostrarDatos();
        System.out.println("Densidad: " +planeta1.calcularDensidad());
        if (planeta1.esPlanetaExterior()){
            System.out.println("¿Es planeta exterior?: SI");
        } else {
            System.out.println("¿Es planeta exterior?: NO");
        }
        System.out.println();


        System.out.println("Planeta 2:");
        planeta2.mostrarDatos();
        System.out.println("Densidad: " + planeta2.calcularDensidad());
        if (planeta2.esPlanetaExterior()){
            System.out.println("¿Es planeta exterior?: SI");
        } else {
            System.out.println("¿Es planeta exterior?: NO");
        }

        //CREACION DE UNA PERSONA

        Persona p1 = new Persona("Jorge", "Pérez", "30986743", 1987, "Argentina", 'H');
        Persona p2 = new Persona("Ángela", "Rodriguez", "42567891", 2000, "Argentina", 'M');

        System.out.println("PERSONAS");
        System.out.println();
        p1.imprimirDatos();
        System.out.println();
        p2.imprimirDatos();
    }
    }
