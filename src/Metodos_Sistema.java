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

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimtero() {
        return perimtero;
    }

    public void setPerimtero(float perimtero) {
        this.perimtero = perimtero;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }
}
