public class Menu_Sistema {
    public static void main(String[] args) {
        Metodos_Sistema cubo=new Metodos_Sistema(4, 8, 9);
        cubo.setLado(5);
        System.out.println("Area del cubo: "+ cubo.area_cubo(6));
        System.out.println("Perimetro del cubo: "+ cubo.perimetro_cubo(6));
        System.out.println("Volumen del cubo: "+ cubo.volumen_cubo(6));


    }
}
