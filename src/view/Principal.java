package view;

import br.edu.fateczl.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		
		//int[] vetor = {2, 0, 1, 3, 7, 8, 5, 4, 9, 6};//Vetor vídeo Professor
		//int[] vetor = {71, 51, 37, 59, 56, 25, 76};//Vetor aula 11/03/2024 
		//int[] vetor = {30, 65, 95, 118, 21, 82, 60, 18, 42};//Vetor 1a Aula 11/03/2024
		//int[] vetor = {51, 52, 53, 54, 4, 3, 2, 1};//Vetor 2a Aula 11/03/2024
		
		//int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};//Vetor - Tarefa - Ex01
		//int[] vetor = {44, 43, 42, 41, 40, 39, 38};//Vetor - Tarefa - Ex02
		int[] vetor = {31, 32, 33, 34, 99, 98, 97, 96};//Vetor - Tarefa - Ex03

		QuickSort quickSort = new QuickSort();
		vetor = quickSort.quickSort(vetor, 0, vetor.length - 1);
		
		for(int valor : vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
	}

}
