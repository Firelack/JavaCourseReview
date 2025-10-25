# ☕ Projet de Révision - Programmation Orientée Objet en Java

Ce projet regroupe un ensemble de notes, de fiches de révision et d'exemples de code Java conçus pour préparer un contrôle sur les concepts de la Programmation Orientée Objet (POO).

## 🎯 À propos de ce projet

L'objectif principal est de centraliser les notions fondamentales de la POO en Java à travers des exemples pratiques et des fiches synthétiques. Le code est volontairement commenté et structuré pour faciliter la compréhension.

Chapitres :

1. Introduction à la POO, bases
2. Objets et classes
3. Héritages

    *Pas encore abordé dans ce projet :*
4. Interfaces
5. Généricité
6. Classes internes
7. Exceptions
8. Bibliothèques de collections

---

## 🍎 NotesToDo

- [ ] Ajouter les imports des classes méthodes
- [ ] Ajouter les interfaces (chap 4)
- [ ] Ajouter la généricité (chap 5)
- [ ] Ajouter les classes internes (chap 6)
- [ ] Ajouter les exceptions (chap 7)
- [ ] Ajouter les bibliothèques des collections java (chap 8)

---

## 📂 Structure du Projet

Le projet est organisé en plusieurs packages pour séparer les différents concepts abordés :

- **`/src`** : Contient l'ensemble du code source Java.
  - **`/lesBases`** : Exemples sur les fondamentaux de la POO.
    - `Personne.java` : Une classe de base avec encapsulation, constructeurs et membres `static`.
    - `Etudiant.java` : Une sous-classe de `Personne` pour illustrer l'héritage.
    - `Main.java` : Démontre la création d'objets, les boucles, les tableaux et le transtypage (cast).
  - **`/classeAbstraite`** : Un cas pratique sur l'abstraction.
    - `Animal.java` : Une classe abstraite servant de modèle.
    - `Chien.java` et `Chat.java` : Des classes concrètes qui héritent d'`Animal`.
    - `Main.java` : Montre l'utilisation du polymorphisme avec des classes abstraites.
- **`/infoTexte`** : Contient les fiches de révision au format Markdown.
  - `infoSupplementaires.md` : Fiche sur les concepts clés (visibilité, mots-clés, héritage, polymorphisme).
  - `classesMethodes.md` : Fiche récapitulative des méthodes utiles des classes standards de Java (`String`, `Scanner`, `Arrays`, etc.).

---

## 💡 Concepts Abordés

Ce projet couvre les notions suivantes :

- **Classes et Objets** : Création et instanciation d'objets.
- **Encapsulation** : Utilisation des modificateurs d'accès (`private`, `public`) et des getters/setters.
- **Héritage** : Utilisation des mots-clés `extends` et `super` pour créer des hiérarchies de classes.
- **Polymorphisme et Transtypage** : Manipulation d'objets via des références de super-classe et utilisation de `instanceof`.
- **Abstraction** : Création et utilisation de classes et méthodes abstraites.
- **Membres `static`** : Attributs et méthodes appartenant à la classe plutôt qu'aux instances.
- **Bases de Java** : Boucles (`for`, `while`), tableaux, `switch`, opérateurs, etc.

---

## 🚀 Comment Utiliser

1. **Cloner le projet** (Ou télécharger le dossier):

    ```bash
    git clone https://github.com/Firelack/JavaCourseReview.git
    ```

2. **Ouvrir dans un IDE** :
    Ouvrez le projet dans un IDE Java comme IntelliJ IDEA ou Eclipse.
3. **Exécuter le code** :
    Chaque package (`lesBases` et `classeAbstraite`) contient son propre fichier `Main.java` qui peut être exécuté indépendamment pour tester les concepts qui lui sont associés.
