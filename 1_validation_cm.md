# R4.02 - Examen

## 1 Validation CM

Répondez aux 2 questions ci-dessous directement dans ce fichier.

### Question 1
Mettez dans l'ordre ces actions dans un dévelopement piloté par des tests (test-driven development)

a) écriture du corps de la fonction
b) écriture d'un test unitaire qui échoue
c) écriture de la spécification de la fonction
d) amélioration du corps de la fonction
e) écriture d'un autre test unitaire qui échoue

Réponse: C B A E D

### Question 2
Décrivez pour un logiciel ce qu'est:

* sa maintenance évolutive:
La maintenance évolutive est la modification d'un logiciel pour qu'il valide de nouvelles fonctionnalités.
L'objectif est d'implementer de nouvelles fonctionnalités pour répondre à de nouveaux cas d'utilisation.

* sa maintenance corrective:
La maintenance corrective est la modiciation d'un logiciel pour corriger des bugs présent.
L'objectif est de les corriger en évitant des régressions (effets de bords).

À quel moment peut-on écrire des nouveaux tests?

* pour la maintenance évolutive:
Suivant le mode développement, si c'est du TDD (test-driven development) on écrit les tests avant le développement des nouvelles fonctionnalités.
Sinon, on écrit les tests après le développement des nouvelles fonctionnalités.

* pour la maintenance corrective:
Pour la maintenance corrective, on écrit les tests avant de corriger le problème pour le reproduire.
Cela doit être fait car si nous devons faire un maintenance corrective c'est qu'il manquait des tests précèdement.

---
