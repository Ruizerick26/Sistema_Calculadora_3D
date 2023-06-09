public class Metodos_Sistema {

    //Variables-atributos
    private float lado; //Usar para calcular perimetros de bases como cubo, trapecio, piramide
    private float altura; // usar para calcular piramides y cilindro
    private float radio; // Usar para esfera y cilidro
    private float area;
    private float perimtero;
    private float volumen;

    public Metodos_Sistema(float lado, float altura, float radio) {
        this.lado = lado;
        this.altura = altura;
        this.radio = radio;
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

}
