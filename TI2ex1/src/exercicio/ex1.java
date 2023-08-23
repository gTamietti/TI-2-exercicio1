package exercicio;

import java.util.*;

 class Soma_numeros {
    public static Scanner sc = new Scanner(System.in); // Declare 'sc' as static
    
    public static void main(String[] args) {
        int num1, num2, soma;
        
        System.out.println("Digite um numero");
        num1 = sc.nextInt();
        
        System.out.println("Digite outro numero");
        num2 = sc.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("Soma: " + soma);
        
        sc.close();
    }
}
