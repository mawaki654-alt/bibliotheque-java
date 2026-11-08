import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> listeLivre = new ArrayList<>();
    private ArrayList<Membre> listeMembre = new ArrayList<>();

    public void ajouterLivre(Livre livre){
        listeLivre.add(livre);
    }
    public void inscrireMembre(Membre membre){
        listeMembre.add(membre);
    }
    public boolean emprunter(Membre membre, Livre livre){
        if (!listeMembre.contains(membre)) {
            return false;
        }
        if (!listeLivre.contains(livre)) {
            return false;
        }
        if (!livre.isDisponible()) {
            return false;
        }
        if (membre.getNombreEmprunts() >= 3) {
            return false;
        }else{
            membre.ajouterEmprunt(livre);
            livre.setDisponible(false);
            return true;
        }
    }
    public boolean rendre(Membre membre, Livre livre){
        if (membre.livrePosseder(livre) == false) {
            return false;
        }else{
            membre.retirerEmprunt(livre);
            livre.setDisponible(true);
            return true;
        }
    }

}
