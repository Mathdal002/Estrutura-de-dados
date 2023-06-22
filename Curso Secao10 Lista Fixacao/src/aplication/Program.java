package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Empregado;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios estão registrados? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Empregado emp = new Empregado(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Informe o ID do Ususário que terá um aumento salarial: ");
		int idsalarial = sc.nextInt();
		Integer pos = position(list, idsalarial);
		if(pos == null) {
			System.out.print(" Esse Id não existe!!");
		} else {
			System.out.print("Entra com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for(Empregado emp : list) {
			System.out.println();
			System.out.println(emp);
		}
	}
	
	public static Integer position(List<Empregado> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id)
				return i;
			
		}
		return null;
	}
	
}
