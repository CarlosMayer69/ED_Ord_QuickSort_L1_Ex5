package controller;

import br.edu.fateczl.quicksort.QuickSort;

public class OrdQuickSortController {

	public OrdQuickSortController() {
		super();
	}

	public int[] ordenar(int[] vetor) {
		QuickSort quickSort = new QuickSort();
		return quickSort.quickSort(vetor, 0, vetor.length - 1);
	}
}