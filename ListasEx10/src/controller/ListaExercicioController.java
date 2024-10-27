package controller;
import model.Lista;

public class ListaExercicioController {
	
	public ListaExercicioController() {
		super();
	}
	
	Lista<Integer> lista = new Lista<>();
	
	Lista<Integer> listadois = new Lista<>();
	
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
	
	private void popularlista2() {
		listadois.addFirst(3);
		listadois.addLast(5);
		listadois.addLast(8);
		listadois.addLast(12);
		listadois.addLast(9);
		listadois.addLast(7);
		listadois.addLast(6);
		listadois.addLast(2);
		listadois.addLast(3);
		listadois.addLast(7);
		listadois.addLast(16);
	}
	
	public void doismaiores() throws Exception {
		popularlista2();
		int tamanho = listadois.size();
		int maior = 0;
		int segmaior = maior;
		for (int i = 0; i < tamanho; i++) {
			if (listadois.get(i) > maior) {
				segmaior = maior;
				maior = listadois.get(i);
			}
		}
		System.out.println(maior +" "+ segmaior);
	}
	
	
}
