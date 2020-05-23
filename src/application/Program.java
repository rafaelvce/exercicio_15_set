package application;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("How many students for course A: ");
			int qtdStudents = sc.nextInt();

			Set<Integer> set = new HashSet<>();

			for (int i = 1; i <= qtdStudents; i++) {
				set.add(sc.nextInt());
			}

			System.out.print("How many students for course B: ");
			qtdStudents = sc.nextInt();

			for (int i = 1; i <= qtdStudents; i++) {
				set.add(sc.nextInt());
			}

			System.out.print("How many students for course C: ");
			qtdStudents = sc.nextInt();

			for (int i = 1; i <= qtdStudents; i++) {
				set.add(sc.nextInt());
			}

			System.out.println("\nTotal students: " + set.size());
			
		} catch (InputMismatchException e) {
			System.out.println("\nError: Field must be type integer!");
		}
		
		sc.close();	
		

	}

}
