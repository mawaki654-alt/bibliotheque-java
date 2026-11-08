import java.util.ArrayList;

public class Membre {

    private String nom;
    private ArrayList<Livre> livresEmpruntes = new ArrayList<>();

    public Membre(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public int getNombreEmprunts(){
        int nbr = livresEmpruntes.size();
        return nbr;
    }
    public boolean aEmprunte(Livre livre){
        if (livresEmpruntes.contains(livre)) {
            return true;            
        } else {
            return false;
        }
    }
    public void ajouterEmprunt(Livre livre){
        livresEmpruntes.add(livre);
    }
    public void retirerEmprunt(Livre livre){
        livresEmpruntes.remove(livre);
    }
    public boolean livrePosseder(Livre livre){
        if (livresEmpruntes.contains(livre)) {
            return true;
        } else {
            return false;
        }
    }
}
