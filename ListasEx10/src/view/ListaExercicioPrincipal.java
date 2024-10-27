package view;
import controller.ListaExercicioController;

public class ListaExercicioPrincipal {

	public static void main(String[] args) {
		
		int[] vetor = {25, 42, 23, 74, 80, 77, 13, 41, 59, 35, 68, 53, 75, 84, 44, 94, 93, 71, 88};
		ListaExercicioController listCon = new ListaExercicioController();
		
		listCon.listaAdd(vetor);
		try {
			listCon.listaRemove();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
			
		
		//*****************************************
		try {
			System.out.println();
			listCon.doismaiores();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
