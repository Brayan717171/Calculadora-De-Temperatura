import java.util.Scanner;

public class Calcular {
    double celsius;
    double fahrenheit;
    double kelvin;
    double Resultado;
    double Resultado1;

    public void obterDados(){
        Scanner leitorDouble = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        celsius= leitorDouble.nextDouble();

        exibirResultado();
    }
    public void fahrenheitl(){Resultado=celsius * 9/5 + 32;}
    public void kelvinl(){Resultado1=celsius + 273.15;}


    public void exibirResultado(){
        fahrenheitl();
        kelvinl();
    System.out.println(celsius+"C° equivalem a: ");
    System.out.println(Resultado +"F°(fahrenheit)");
    System.out.println(Resultado1 +"K°(kelvin)");}

}


