import ecommerce.Client;
import ecommerce.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestECommerce {
    Client client;
    Product product;

    @BeforeEach
    void setup() {
        client = new Client("John", "Doe");
        product = new Product("Produit", new BigDecimal(10));
    }

    @AfterEach
    void tearDown() {
        client = null;
        product = null;
    }

    // User story 1
    // Il faut utiliser la méthode getShoppingCart du client pour récupérer son panier puis la méthode add pour ajouter un produit.
    // Il faut en donnée un produit et un client.
    // Il faut tester la méthode d'ajout au panier
    // Il faut vérifier que le produit est bien dans le panier
    @Test
    void testUserStory1() {
        client.getShoppingCart().add(product);
        assertTrue(client.getShoppingCart().contains(product));
    }

    // User story 2
    // Il faut utiliser la méthode getShoppingCart du client pour récupérer son panier puis la méthode remove pour supprimer un produit.
    // Il faut en donnée un produit et un client.
    // Il faut tester la méthode de suppression au panier
    // Il faut vérifier que le produit n'est plus dans le panier
    @Test
    void testUserStory2() {
        client.getShoppingCart().add(product);
        client.getShoppingCart().remove(product);
        assertFalse(client.getShoppingCart().contains(product));
    }
}
