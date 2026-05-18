import java.util.Scanner;

public class App {
     public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        String resultado = classificarIMC(imc);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + resultado);

        scanner.close();
      
    }
}
