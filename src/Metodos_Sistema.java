public class Metodos_Sistema {

    //Variables-atributos
    private float lado; //Usar para calcular perimetros de bases como cubo, trapecio, piramide
    private float altura; // usar para calcular piramides y cilindro
    private float radio; // Usar para esfera y cilidro
    private float area;
    private float perimtero;
    private float volumen;
    private float pi = 3.14f;
    private double areaSuperficial;

    public Metodos_Sistema(float lado, float altura, float radio, float areaSuperficial) {
        this.lado = lado;
        this.altura = altura;
        this.radio = radio;
        this.areaSuperficial=areaSuperficial;
    }
    //Getters and Setters
    public float getLado() {
        return lado;
    }

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
    public void calcularAreaSuperficial(){
        areaSuperficial = 4 * Math.PI * Math.pow(this.radio, 2);
    }
    public void calcularVolumen(){
        volumen = (float) ((4 * Math.PI * Math.pow(this.radio,3))/3);
    }
    public double getVolumen() {
        return volumen;
    }
    public double getAreaSuperficial() {
        return areaSuperficial ;
    }
}
