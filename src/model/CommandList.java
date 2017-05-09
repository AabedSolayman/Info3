package model;

public class CommandList {
	private Element root = null;
/**
 * @exception 	add einen neuen Command der in einer verketteten Liste gespeichert wird
 * 				wenn erster add dann auf den Anker neues Objekt legen
 * 				Anschlie�end geht man die Liste solange durch bis man zu "NULL" angekommen ist und �berschreibt diese mit dem Wert/String
 * @param 		c Befehl was man f�r die add Funktion ben�tigt
 * @return 		true f�r Bool--> das erfolgreich
 * @author 		Lukas Erkert 
 */
	public boolean add(Command c) {
		Element newElement = new Element(c);
		if (root == null)
			root = newElement;
		else /*if(root.next == null)*/{
			Element hilfsElement = root;
			root = newElement;
			root.setNext(hilfsElement);
		}
		return true;
	}
/**
 * @exception 	remove einen Command der aus einer verketteten Liste gel�scht wird
 * 				verschiedene Bedinungen werden abgearbeitet:
 * 				- man keine Stelle die negativ ist l�schen
 * 				- wenn das erste Element gel�scht wird m�ssen die Zeiger so gelegt werden das der Anker auf dieses Objekt zeigt
 * 				- sonst wird die Stelle an dem gel�scht werden soll aufgerufen und die zeiger neu verlegt
 * 					--> Das voherige Element wird auf das nachfolgende Element gelegt des gel�schten Element gelegt  	
 * @param 		c an Stelle int c
 * @return 		true f�r Bool--> das erfolgreich
 * @author 		Lukas Erkert 
 */
	public boolean remove(int c) {
		return true;
	}
/**
 * @exception 	get die Position f�r das Command
 * 				geht die verkettete Liste solange durch, bis Parameter pos erreicht wird
 * @param 		pos int Zahl f�r Position
 * @return 		element 
 * @author 		Lukas Erkert 
 */
	public Command get(int pos) {
		Command element = root.getElement();
		return element;
	}
/**
 * @exception 	moveUp die verkettete List an der Stelle x um eins nach oben verchieben
 * 				Idee dahinter das es die gleiche Mehtode aufruft wie in MoveDown nur das es das n�chste Element nimmt
 * 				--> hat den Effekt das es statt das Element MoveDown, MoveUp macht
 * @param 		x	Position des Commands
 * @return 		true f�r Bool--> das erfolgreich
 * @author 		Lukas Erkert 
 */
	
	public boolean moveUp(int x) {
	public boolean moveUp(int x) {
		return true;
	}

/**
 * @exception 	moveDown: die verkettete List an der Stelle x um eins nach unten verschieben
 * 				- wenn die Position des Commands kleiner als oder gleich  null dann funktioniert das nicht weil man nicht unter der Anker verschiben kann
 * 					- das voherige voherige  Element des zu verschiebene Element zeigt auf das eigentliche Element
 * 					- das eigentliche Element zeigt auf das voherige Element
 * 					- das voherige Element zeigt auf das n�chste Element
 * 				--> und anderstrum f�r doppelt verkette Liste
 * @param 		x Position des Commands
 * @return 		true f�r Bool--> das erfolgreich
 * @author 		Lukas Erkert
 */
	public boolean moveDown(int x) {
		if (root == null || x <= 0)
			return false;
		Element hilfsElement = root;
		for (int i = 0; i < x; i++) {
			hilfsElement = hilfsElement.getNext();
			if (hilfsElement == null)
				return false;
		}
		Element next = hilfsElement.getNext();
		Element prev = hilfsElement.getPrev();
		if (prev.getPrev() != null)
			prev.getPrev().setNext(hilfsElement);   // 1
		else 
			root=hilfsElement;
		hilfsElement.setNext(prev);                 // 2
		prev.setNext(next);                         // 3
		if (next != null)
			next.setPrev(prev);                     // 4
		hilfsElement.setPrev(prev.getPrev());       // 6  sonst �berschreiben von prev und man kann nicht auf das Element zugreifen
		prev.setPrev(hilfsElement);                 // 5

	public boolean moveDown(int x) {
		return true;
	}
}
