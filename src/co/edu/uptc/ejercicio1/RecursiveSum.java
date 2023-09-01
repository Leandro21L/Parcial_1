package co.edu.uptc.ejercicio1;

import java.util.LinkedList;
import java.util.Scanner;

public class RecursiveSum {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Cuantos numeros desea sumar?");
        int i = scanner.nextInt();
        while (i>0){
            System.out.println("Ingrese un numero" + "\nFaltan " + i + " numeros");
            numbers.add(scanner.nextInt());
            i--;
        }

        System.out.println("La suma de los numeros es: " + numberSum(numbers));
    }

    private static int numberSum(LinkedList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            int sum = numbers.get(0);
            numbers.remove(0);
            sum += numberSum(numbers);
            return sum;
        }
    }
}
