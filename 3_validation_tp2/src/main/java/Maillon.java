/**
 * Cette classe représente un maillon d'une liste chainée. Un maillon peut en contenir un autre pour former une liste chainée.
 * Toute les méthodes ne sont pas implémentées et envoie une exception
 */
public class Maillon<T> {
    private T valeur;
    private Maillon<T> suivant;

    /**
     * Construit un maillon vide
     */
    public Maillon() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit un maillon contenant la valeur spécifiée
     * @param valeur la valeur à contenir
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public Maillon(T valeur) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit un maillon contenant la valeur spécifiée et suivant le maillon spécifié
     * @param valeur la valeur à contenir
     * @param suivant le maillon suivant
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public Maillon(T valeur, Maillon<T> suivant) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la valeur contenue dans le maillon
     * @param indice l'indice de la valeur à retourner
     * @return la valeur contenue dans le maillon
     * @throws IndexOutOfBoundsException si l'indice est négatif ou supérieur à la taille de la liste chainée
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public T getValeur(int indice) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Modifie la valeur contenue dans le maillon
     * @param indice l'indice de la valeur à modifier
     * @param valeur la nouvelle valeur
     * @throws IndexOutOfBoundsException si l'indice est négatif ou supérieur à la taille de la liste chainée
     * @throws NullPointerException si la valeur ouu l'indice est <code>null</code>
     */
    public void setValeur(int indice, T valeur) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Ajoute à la fin de la liste la valeur
     * @param valeur la valeur à ajouter
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public void ajouter(T valeur) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la taille de la liste chainée dont ce maillon est la tête
     * @return la taille de la liste chainée dont ce maillon est la tête
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le maillon contenant la valeur spécifiée dans la liste chainée dont ce maillon est la tête
     * @param valeur la valeur à rechercher
     * @return L'indice la valeur dans la liste chainée sinon -1
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public int contient(T valeur) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Ajoute à la fin de la liste le maillon spécifié
     * @param m le maillon à ajouter
     * @throws NullPointerException si le maillon est <code>null</code>
     */
    public void union(Maillon<T> m) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la représentation textuelle de la liste chainée dont ce maillon est la tête
     * @return la représentation textuelle
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}
