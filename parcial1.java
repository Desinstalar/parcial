public class potencia{

    int exponente=3;
    int potencia=4;
    int respuesta=0;

    public void calcular() {
        respuesta=(exponente * (exponente-1) * exponente);
        }

    public static void main(String[] args) {
        potencia r = new potencia();
        r.calcular(); 
        System.out.println("El resultado es: "+r);
    }

}