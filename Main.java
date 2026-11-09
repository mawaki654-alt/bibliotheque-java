public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre cidLivre = new Livre("le cid", "Pierre Conrneille");
        bibliotheque.ajouterLivre(cidLivre);
        Livre pagne = new Livre("pagne noir", "Bernard dadié");
        bibliotheque.ajouterLivre(pagne);
        Livre candide = new Livre("candide", "Voltaire");
        bibliotheque.ajouterLivre(candide);
        Livre maimouna = new Livre("Maimouna", "Abdoulaye Sadji");
        bibliotheque.ajouterLivre(maimouna);
        Livre nuit = new Livre("Nuit", "Elie Wiesel");

        Membre jack = new Membre("Jean jack ruso");
        bibliotheque.inscrireMembre(jack);
        Membre arthur = new Membre("Arthur Pendragon");

        System.out.println("test 1 :" + bibliotheque.emprunter(jack, cidLivre));
        System.out.println("test 2 :" + bibliotheque.emprunter(jack, cidLivre));
        System.out.println("test 3 :" + bibliotheque.emprunter(arthur, pagne));
        System.out.println("test 4 :" + bibliotheque.emprunter(jack, nuit));
        System.out.println("test 5a :" + bibliotheque.emprunter(jack, pagne));
        System.out.println("test 5b :" + bibliotheque.emprunter(jack, candide));
        System.out.println("test 5c :" + bibliotheque.emprunter(jack, maimouna));
        System.out.println("test 6 :" + bibliotheque.rendre(jack, cidLivre));
        System.out.println("test 7 :" + bibliotheque.rendre(jack, cidLivre));
        System.out.println("test 8 :" + bibliotheque.emprunter(jack, maimouna));

    }
}
