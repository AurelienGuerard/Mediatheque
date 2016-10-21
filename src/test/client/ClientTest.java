package test.client;

import mediatheque.*;
import mediatheque.client.CategorieClient;
import mediatheque.client.Client;
import mediatheque.document.Audio;
import mediatheque.document.Document;
import org.junit.Assert;
import org.junit.Test;
import util.InvariantBroken;

/**
 * Created by DamnAug on 19/10/2016.
 */
public class ClientTest {

    @Test
    public void peutEmprunterTest() throws OperationImpossible, InvariantBroken {

        Client client = new Client("georgel", "edgar", "50 du des chèvres Paris 75016", new CategorieClient("Livre"));

        client.emprunter(new FicheEmprunt(new Mediatheque("Mediatheque"), client, new Audio("code", new Localisation("salle", "rayon"),
                "titre", "auteur", "annee", new Genre("genre")));
        client.emprunter();
        client.emprunter();
        Assert.assertFalse(client.peutEmprunter());
    }


}
