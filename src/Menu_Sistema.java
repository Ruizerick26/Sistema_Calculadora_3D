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
                    //Siguir este case para el resto
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
                    float area_base, perimetro_base, apotema, alturaP;
                    System.out.print("Ingrese el valor del área de la base de la pirámide: ");
                    area_base=tomar.nextFloat();
                    piramide.setArea_base(area_base);
                    System.out.print("Ingrese el valor del perímetro de la base: ");
                    perimetro_base=tomar.nextFloat();
                    piramide.setPerimetro_base(perimetro_base);
                    System.out.print("Ingrese el valor de la apotema (altura inclinada de las caras triangulares): ");
                    apotema= tomar.nextFloat();
                    piramide.setApotema(apotema);
                    System.out.print("Ingrese el valor de la altura de la piramide: ");
                    alturaP= tomar.nextFloat();
                    piramide.setAltura(alturaP);

                    System.out.println("\nEl área de la pirámide es: "+piramide.getAreaP());
                    System.out.println("El volumen de la pirámide es: "+piramide.getVolumenP());
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
