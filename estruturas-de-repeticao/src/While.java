import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
	double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
    } //Método para originar valores aleatório para o algoritmo
    private static double valorAleatorio() {
     return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
