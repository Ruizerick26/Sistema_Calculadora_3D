import java.util.Scanner;

public class Menu_Sistema {
    public static void main(String[] args) {
        Scanner tomar = new Scanner(System.in);
        menu();
        System.out.println("Ingrese la opcion que desee:");
        int opcion = tomar.nextInt();
        while (opcion!=5){
            switch (opcion) {
                case 1:
                    //Seguir este case para el resto
                    System.out.println("CUBO");
                    Metodos_Sistema cubo = new Metodos_Sistema(0, 0, 0, 7, 8,9, 8);
                    System.out.println("Ingrese el valor de un lado del cubo");
                    float lado = tomar.nextFloat();
                    cubo.setLado(lado);
                    System.out.println("Area del cubo: " + cubo.area_cubo(cubo.getLado()));
                    System.out.println("Perimetro del cubo: " + cubo.perimetro_cubo(cubo.getLado()));
                    System.out.println("Volumen del cubo: " + cubo.volumen_cubo(cubo.getLado()));
                    break;
                case 2:
                    System.out.println("PIRAMIDE");
                    Metodos_Sistema piramide = new Metodos_Sistema(0,0,0,0,0,0,0);
                    System.out.println("Ingrese el valor de un lado de la piramide: ");
                    float lado = tomar.nextFloat();
                    piramide.setLado(lado);
                    System.out.println("Ingrese el valor de la altura: ");
                    float altura = tomar.nextFloat();
                    piramide.setAltura(altura);
                    System.out.println("Ingrese el valor del radio: ");
                    float radio = tomar.nextFloat();
                    piramide.setRadio(radio);
                    System.out.println("Area de base: " + piramide.getArea_base(piramide.getRadio(),piramide.getAltura()));
                    System.out.println("Perimetro: " +  piramide.getPerimtero_base(piramide.getLado(),piramide.getAltura()));
                    System.out.println("Area superficial: "+ piramide.getAreaSuperficial(piramide.getArea(), piramide.getAltura()));
                    break;

                case 3:
                    System.out.println("CILINDRO");
                    Metodos_Sistema cilindro = new Metodos_Sistema(0,0,0,0,0,0,0);
                    System.out.println("Ingrese el valor del altura del cilindro: ");
                    float altura = tomar.nextFloat();
                    cilindro.setAltura(altura);
                    System.out.println("Ingrese el valor del radio del cilindro: ");
                    float radio = tomar.nextFloat();
                    cilindro.setRadio(radio);
                    System.out.println("Area del cilindro: " + cilindro.area_cilindro(cilindro.getRadio(),cilindro.getAltura()));
                    System.out.println("Volumen del cilindro: " + cilindro.getVolumen(cilindro.getRadio(), cilindro.getAltura()));
                    break;
                case 4:
                    System.out.println("ESFERA");
                    Metodos_Sistema esfera = new Metodos_Sistema(0,0,0,0);
                    System.out.println("Ingrése el valor de  altura: ");
                    float altura = tomar.nextFloat();
                    esfera.setAltura(altura);
                    System.out.println("Ingrese el valor del radio");
                    float radio = tomar.nextFloat();
                    esfera.setRadio(radio);
                    System.out.println("Área Superfial: " + esfera.getAreaSuperficial(esfera.getRadio(),esfera.getAltura()));
                    System.out.println("Volumen de esfera " + esfera.getVolumen(esfera.getRadio(),esfera.getAltura()));
                    break;

            }
            menu();
            System.out.println("Ingrese la opcion que desee:");
            opcion = tomar.nextInt();
        }
        System.out.println("GRACIAS POR USAR EL SISTEMA");
    }
    public static void menu(){
        System.out.println("-----Sistema Calculadora de figuras 3D-----\n\n");
        System.out.println("1.- Calcular el area y volumen de un Cubo\n");
        System.out.println("2.- Calcular el area y volumen de un Piramide\n");
        System.out.println("3.- Calcular el area y volumen de un Cilindro\n");
        System.out.println("4.- Calcular el area y volumen de un Esfera\n");
        System.out.println("5.- Salir\n");
    }
}
