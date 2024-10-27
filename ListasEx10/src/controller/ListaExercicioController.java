package controller;
import model.Lista;

public class ListaExercicioController {
	
	public ListaExercicioController() {
		super();
	}
	
	Lista<Integer> lista = new Lista<>();
	
	public void listaAdd (int[] vetor) {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			if (lista.isEmpty()) {
				lista.addFirst(vetor[i]*2);
			} else if (lista.size() < 3){
				lista.addLast((int) (vetor[i] / 2));
			} else if (lista.size() > 10) {
				try {
					lista.add(5, (vetor[i] * 3));
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else {
				try {
					lista.add(1, vetor[i]);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public void listaRemove () throws Exception{
		while (!lista.isEmpty()) {
			if (lista.size() > 10) {
				System.out.println(lista.get(3));
				lista.remove(3);
			} else if (lista.size() > 5) {
				int tamanho = lista.size();
				System.out.println(lista.get(tamanho -1));
				lista.removeLast();
			} else if (lista.size() > 3) {
				System.out.println(lista.get(1));
				lista.remove(1);
			} else {
				System.out.println(lista.get(0));
				lista.removeFirst();
			}
		}
	}
	
	
}
