//import javax.print.attribute.standard.JobOriginatingUserName;

import dionysies.Tournoi;
import src.*;

class Main {
  @SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
    String citation_antigone =
        "C'est ainsi que j'irai reposer près de lui, chère à qui m'est cher, saintement"
            + " criminelle.";

    String citation_limiers =
        "Un bruit? Voilà bien de mes froussards! Vous avez peur? Fétides individus, pétris de\n"
            + " pâte à nouilles, la pire faune de couards! La moindre ombre que vous voyez vous\n"
            + " épouvante, vous avez peur de tout! Pas de nerf, pas de tenue, pas francs du\n"
            + " collier! A vous voir, vous n'êtes que des outres, des jacasses et des\n"
            + " viédazes!";

    Auteur sophocle = new Auteur("Sophocle", 95, citation_antigone, 0, "", 60, citation_limiers);

    String citation_hécube =
        "et elle, ayant entendu la parole des maîtres, saisissant ses voiles par l'épaule, les\n"
            + " déchira jusqu'à la hanche, à hauteur du nombril, montra ses seins et son buste,\n"
            + " comme d'une statue, splendide, puis, ayant mis genou en terre, elle tint ce\n"
            + " discours, le plus héroïque en bravoure : \" Voici, jeune homme: si c'est mon"
            + " buste\n"
            + " que tu désires frapper, frappe. Mais si c'est le cou, ma gorge est là, prête, la\n"
            + " voici.\" ";

    String citation_cyclope =
        "La richesse, chétif mortel, est le dieu des sages : tout le reste n'est que vanité et\n"
            + " belles paroles. Que m'importent à moi les promontoires consacrés à mon père? et\n"
            + " pourquoi m'en fais-tu un si pompeux étalage? Étranger, la foudre de Jupiter ne me\n"
            + " fait point trembler ; je ne sais point que Jupiter soit un dieu plus puissant que\n"
            + " moi : au surplus, je ne m'en soucie guère. Et pourquoi je ne m'en soucie pas, le\n"
            + " voici : Si ce dieu verse la pluie du haut du ciel, j'ai sous ce rocher un abri\n"
            + " solide et couvert; j'y mange un veau rôti ou quelque bête sauvage, et j'arrose"
            + " mon\n"
            + " ventre étendu, en vidant une amphore pleine de lait ; et je frappe dessus,\n"
            + " rivalisant, par ce bruit, avec le tonnerre de Jupiter. Et lorsque le Thrace\n"
            + " Borée verse la neige à gros flocons, je couvre mon corps de peaux de bêtes, je"
            + " fais\n"
            + " grand feu, et je me ris de la neige. La terre, de gré ou de force, fait naître de\n"
            + " l'herbe pour engraisser mes troupeaux. Je me garde bien de les immoler à quelque\n"
            + " autre dieu qu'à moi-même et à mon ventre, qui est le plus grand des dieux. Boire"
            + " et\n"
            + " manger chaque jour, et ne s'inquiéter de rien, voilà le Jupiter des sages. Que"
            + " ceux\n"
            + " qui ont établi des lois, et embarrassé la vie humaine de mille soins inutiles,\n"
            + " soient maudits. Je ne cesserai point, pour leur plaire, de me réjouir le cœur, et\n"
            + " je ne t'en croquerai pas moins. Voici donc les dons d'hospitalité que je t'offre,\n"
            + " afin d'être irréprochable devant toi. Un bon feu, et cette marmite de la maison"
            + " de\n"
            + " mes pères, qui te fera bouillir a merveille et le vêtira chaudement. Allons,"
            + " entrez\n"
            + " là-dedans; allez à l'autel du dieu de cette caverne, et préparez-moi un bon"
            + " festin.\n"
            + " ";

    Auteur euripide = new Auteur("Euripide", 
                                 92, citation_hécube,
                                 0, "",
                                 80, citation_cyclope);

    String citation_guêpes =
        "TRYGÉE : Tiens, voilà quelqu'un qui s'amène avec une couronne de lauriers sur la tête.\n"
            + "LE SERVITEUR : Qui ça peut-il être ?\n"
            + "TRYGÉE : Il a une tête de charlatan.\n"
            + "LE SERVITEUR : Un devin peut-être ?";

    String citation_thesmophories =
        "La fortune a vite fait de changer en mal et de régner sous une autre face.";

    Auteur aristophane = new Auteur("Aristophane", 
                                    5, citation_thesmophories,
                                    100, citation_guêpes,
                                    0, "");
    //test citeation tragedie
    assert citation_antigone == sophocle.getCitationTragedie();
    assert citation_hécube == euripide.getCitationTragedie();
    assert citation_thesmophories == aristophane.getCitationTragedie();

    //test citeation comedie
    assert "" == sophocle.getCitationComedie();
    assert "" == euripide.getCitationComedie();
    assert citation_guêpes == aristophane.getCitationComedie();

    //test citeation drama
    assert citation_limiers == sophocle.getCitationDrame();
    assert citation_cyclope == euripide.getCitationDrame();
    assert "" == aristophane.getCitationDrame();
    
    //test citeation tragedie+note
    //test citeation tragedie+note
    assert new StringBuilder().append(citation_antigone).append(",").append("95").toString().equals(sophocle.getPerfsTragedie());
    assert new StringBuilder().append(citation_hécube).append(",").append("92").toString().equals(euripide.getPerfsTragedie());
    assert new StringBuilder().append(citation_thesmophories).append(",").append("5").toString().equals(aristophane.getPerfsTragedie());
    
    //test citeation comedie
    assert new StringBuilder().append("").append(",").append("0").toString().equals(sophocle.getPerfsComedie());
    assert new StringBuilder().append("").append(",").append("0").toString().equals(euripide.getPerfsComedie());
    assert new StringBuilder().append(citation_guêpes).append(",").append("100").toString().equals(aristophane.getPerfsComedie());

    //test citeation drama
    assert new StringBuilder().append(citation_limiers).append(",").append("60").toString().equals(sophocle.getPerfsDrame());
    assert new StringBuilder().append(citation_cyclope).append(",").append("80").toString().equals(euripide.getPerfsDrame());
    assert new StringBuilder().append("").append(",").append("0").toString().equals(aristophane.getPerfsDrame());

    //test Pointfort des auteur : 
    assert "Tragédie" == sophocle.pointFort();
    assert "Tragédie" == euripide.pointFort();
    assert "Comédie" == aristophane.pointFort();
    

    //test
    // Epreuve (Style, Periode de la journée, nb Spec)
    // Journee (Auteur1, List<Epreuve>)
    // Periode Jour ==> Enum 
    Epreuve e1 = new Epreuve(Style.DRAME, PeriodeJour.MATIN, 55);
    Epreuve e2 = new Epreuve(Style.COMÉDIE, PeriodeJour.APRESMIDI, 25);
    Epreuve e3 = new Epreuve(Style.TRAGÉDIE, PeriodeJour.SOIREE, 32);
    Journee jEuripide = new Journee(euripide,e1,e2,e3);
    
    Journee jAristhophane = new Journee(aristophane,e1,e2,e3);
    assert "Euripide" == jEuripide.getAuteur();
    assert "Aristophane" == jAristhophane.getAuteur();
    assert Style.TRAGÉDIE.equals(e1.getStyle());
    assert PeriodeJour.MATIN.equals(e1.getPeriodeJour());
    assert 55 ==  e1.getNbSpectateur();
    assert euripide.getNom().equals(e1.winner(euripide, aristophane));
    assert (e1.getNbSpectateur()*euripide.getQualiteDrame()) == (e1.getWinnerScore(euripide, aristophane));
    assert jEuripide.volumeApplaudissement() == 0;
    System.out.println("Arrivé ici tous les test sont passsés");
    
    // 15 tournoi +ajout des 3 auteur
    Tournoi<Auteur> tournoi = new Tournoi<>("Premier Tournoi");
    tournoi.inscrire(aristophane);
    tournoi.inscrire(sophocle);
    tournoi.inscrire(euripide);
    tournoi.débute();
    //print des participant du tournoi
    // question 16 to 19
        //16
        System.out.println(tournoi.estCommencé());
    
        //17
        tournoi.enregistreRésultatJournée(true);
   
        //18
        System.out.println("Les participants de la journée 1 du tournoi : "+tournoi.getNom());
        System.out.println((tournoi.participantAProchaineJournée()));
        System.out.println(tournoi. participantBProchaineJournée());
        //19
        tournoi.afficheParticipants();   
  }
}
