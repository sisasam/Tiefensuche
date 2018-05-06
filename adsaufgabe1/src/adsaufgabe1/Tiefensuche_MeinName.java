package adsaufgabe1;

public class Tiefensuche_MeinName implements ITiefensuche {
	
	private boolean bekannt;
	private boolean fertig;
	private int vorgänger;

	public Tiefensuche_MeinName() {
		
	}

	@Override
	public Kantentyp kantenStatus(IGraph graph, 
			int indexQuelleDerKante, int indexZielDerKante) {
		for (int i = 0; i < graph.anfrageKnotenanzahl(); i++) {
			istBekannt(i) 
		}
	}
	

}
