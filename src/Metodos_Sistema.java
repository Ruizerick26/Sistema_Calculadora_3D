public class Metodos_Sistema {

    //Variables-atributos
    private float lado; //Usar para calcular perímetros de bases como cubo, trapecio, piramide
    private float altura; // usar para calcular pirámides y cilindro
    private float radio; // Usar para esfera y cilindro
    private float area_base;//Usar para área y volumen de una pirámide
    private float perimtero_base;//Usar área de una pirámide
    private float apotema; //Usar para área de una pirámide
    private float volumen;
    private float pi = 3.14f;
    private double areaSuperficial;

    public Metodos_Sistema(float lado, float altura, float radio, float area_base, float perimtero_base, float apotema, float areaSuperficial) {
        this.lado = lado;
        this.altura = altura;
        this.radio = radio;
        this.area_base=area_base;
        this.perimtero_base=perimtero_base;
        this.apotema=apotema;
        this.areaSuperficial=areaSuperficial;
    }
    //Getters and Setters
    public float getLado() {return lado;}
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float perimetro_cubo(float lado){
        return 12*this.lado;
    }
    public float area_cubo(float lado){
        return 6*(this.lado*this.lado);
    }
    public float volumen_cubo(float lado){
        return this.lado*this.lado*this.lado;
    }
    public float getApotema() {return apotema;}
    public void setApotema(float apotema) {this.apotema = apotema;}

    private float calcularAreaP(float lado,float apotema){return (lado*lado)+((lado*apotema)/2);}
    public float getArea(float lado,float apotema){
        return calcularAreaP(lado,apotema);
    }

    private double calcularVolumenP(float lado,float altura){
        return 0.3333*(lado*lado)*altura;
    }

    public double getVolumenP(float lado,float altura){return calcularVolumenP(lado,altura);}

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float area_cilindro(float radio, float altura) { return 2*(this.pi * this.radio) * (this.radio + this.altura);}
    public float getVolumen(float radio, float altura) {
        return this.pi * this.radio * this.radio * this.altura;
    }
    private void setVolumen(float volumen) {
        this.volumen = volumen;
    }
    //Metodos-Esfera Jared
    public double calcularAreaSuperficial(float radio){
        return 4 * Math.PI * Math.pow(this.radio, 2);
    }
    public double calcularVolumen(float radio){
        return (float) ((4 * Math.PI * Math.pow(this.radio,3))/3);
    }
    public double getVolumen(float radio) {
        return calcularVolumen(radio);
    }
    public double getAreaSuperficial(float radio) {
        return calcularAreaSuperficial(radio);
    }



}
