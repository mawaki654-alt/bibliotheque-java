public class Livre{
    private String titre;
    private String auteur;
    private boolean disponible = true;

    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }


    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public boolean isDisponible(){
        return disponible;
    }


    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }


    public String afficher(){
        String message = "le titre du livre est " + titre + " et son auteur est " + auteur;
        return message;
    }
}