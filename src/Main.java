import com.ud5problema1.superlist.SuperList;

public class Main {
    public static void main(String[] args) {

        SuperList<Integer> miLista = new SuperList<>();

        miLista.addElement(69);
        miLista.addElement(5);
        miLista.addElement(42069);
        miLista.addElement(695);

        System.out.println(miLista + "\n");
        miLista.showElements();
        System.out.println("\n" + " ---------- " + "\n");
        miLista.showReversedElements();
        System.out.println("\n" + " ----- Eliminando el elemento en la posicion 3 ----- " + "\n");

        miLista.removeElement(3);

        miLista.showElements();







    }
}
