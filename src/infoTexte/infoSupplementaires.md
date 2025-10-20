# 💡 Concepts Clés en Java

## 🔒 Visibilité des Membres (Modificateurs d'accès)

Ce tableau récapitule qui peut accéder à un membre (attribut ou méthode) en fonction de son modificateur de visibilité.

| Mot-clé     | Même Classe | Même Package | Sous-classe (Héritage) | Ailleurs |
|:------------|:-----------:|:------------:|:----------------------:|:--------:|
| `public`    |      ✅      |      ✅       |           ✅            |    ✅     |
| `protected` |      ✅      |      ✅       |           ✅            |    ❌     |
| *(default)* |      ✅      |      ✅       |   ❌ (sauf si même package)   |    ❌     |
| `private`   |      ✅      |      ❌       |           ❌            |    ❌     |

---

## 🔑 Mots-clés Essentiels

| Mot-clé                            | Rôle                                                   |
|:-----------------------------------|:-------------------------------------------------------|
| `class`                            | Définit une classe.                                    |
| `public` / `private` / `protected` | Contrôle la visibilité.                                |
| `static`                           | Appartient à la classe (pas à l’objet).                |
| `final`                            | Empêche la modification (variable, méthode ou classe). |
| `void`                             | Indique qu'une méthode ne retourne aucune valeur.      |
| `this`                             | Fait référence à l’objet courant.                      |
| `super`                            | Fait référence à la classe mère (super-classe).        |
| `return`                           | Retourne une valeur depuis une méthode.                |
| `new`                              | Crée une nouvelle instance d'un objet.                 |
| `extends`                          | Indique l'héritage d'une classe.                       |
| `abstract`                         | Utilisé pour les classes et méthodes abstraites.       |
| `interface`                        | Définit un contrat de méthodes à implémenter.          |

---

## 📦 Principe d'Encapsulation

> Seul l'objet peut accéder directement à ses propres données privées. Pour qu'un objet extérieur y accède, il faut que l'objet ait été conçu pour proposer ce service (généralement via des méthodes publiques comme les getters et setters).

---

## 👨‍👩‍👧 Héritage et Super-classe

L'héritage permet à une classe (la **sous-classe** ou classe "fille") d'acquérir les attributs et méthodes d'une autre classe (la **super-classe** ou classe "mère").

➡️ **On utilise le mot-clé `extends`** pour établir cette relation.

Le mot-clé `super` est utilisé depuis la sous-classe pour faire référence à sa super-classe :

- `super(arguments)` : Appelle le **constructeur** de la super-classe. Doit être la toute première instruction du constructeur de la sous-classe.
- `super.methode()` : Appelle une **méthode** de la super-classe.

C'est un mécanisme puissant pour réutiliser du code et créer des hiérarchies d'objets logiques (ex: `lesBases.Etudiant` est une `lesBases.Personne`).

---

## 🎭 Polymorphisme et Transtypage (Cast)

Le polymorphisme permet de manipuler un objet d'une sous-classe à travers une référence de sa super-classe.

`superClasse variable = new sousClasse();`

- Cela s'appelle l'**upcasting** (transtypage vers le haut), et c'est automatique en Java.
- La `variable` est de type `superClasse`, donc on ne peut appeler que les méthodes définies dans `superClasse`, même si l'objet réel est une `sousClasse`.

Pour vérifier le type réel d'un objet et accéder aux méthodes de la sous-classe, on utilise :

- **`instanceof`** : L'opérateur `variable instanceof Classe` renvoie `true` si l'objet est une instance de `Classe` (ou d'une de ses sous-classes).
- **Transtypage explicite (downcasting)** : Si on est certain du type, on peut forcer la conversion : `sousClasse var2 = (sousClasse) variable;`. Il est plus sûr de toujours le faire après une vérification avec `instanceof`.

---

## 🏛️ Classes Abstraites

Une classe abstraite est une classe qu’on ne peut pas instancier directement.
➡️ **Elle sert de modèle commun** à plusieurs sous-classes.

Elle peut contenir :

- Des méthodes normales (avec un corps).
- Des méthodes **abstraites** (sans corps, qui doivent obligatoirement être redéfinies dans les classes filles).

👉 C’est un concept à mi-chemin entre une classe normale et une interface.

---

## 📐 Types de Données Primitifs et Objets

| Catégorie     | Type      | Taille (bits) | Exemple       | Description                                               |
|:--------------|:----------|:-------------:|:--------------|:----------------------------------------------------------|
| **Entiers**   | `byte`    |       8       | `10`          | Petit entier signé (-128 à 127).                          |
|               | `short`   |      16       | `1000`        | Entier court (-32 768 à 32 767).                          |
|               | `int`     |      32       | `50000`       | Entier standard (valeur par défaut).                      |
|               | `long`    |      64       | `10L`         | Grand entier (suffixe `L` obligatoire).                   |
| **Réels**     | `float`   |      32       | `3.14f`       | Nombre à virgule, simple précision (`f` obligatoire).     |
|               | `double`  |      64       | `3.14159`     | Nombre à virgule, double précision (par défaut).          |
| **Caractère** | `char`    |      16       | `'A'`         | Un seul caractère Unicode (apostrophes).                  |
| **Booléen**   | `boolean` |       1       | `true`        | Valeur logique `true` ou `false`.                         |
| **Texte**     | `String`  |       -       | `"Bonjour"`   | Chaîne de caractères (c'est une classe, pas un primitif). |
| **Autres**    | Objets    |       -       | `new Point()` | Toute instance créée à partir d'une classe.               |

---

## 🍎 Les Annotations (`@...`)

Les annotations fournissent des informations sur le code au compilateur ou à l'environnement d'exécution. Elles ne modifient pas directement l'exécution du code.

| Annotation | Rôle et Explication |
|:--- |:---|
| **`@Override`** | Indique au compilateur que la méthode qui suit **doit redéfinir** une méthode de sa super-classe (ou implémenter une méthode d'une interface). C'est une sécurité essentielle : si tu te trompes dans le nom ou les paramètres, le compilateur signalera une erreur. |
