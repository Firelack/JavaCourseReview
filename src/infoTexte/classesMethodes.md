# ☕ Méthodes Utiles en Java

## 🔡 La classe `String`

📞 Fait partie de java.lang (aucun import requis)

La classe `String` est utilisée pour manipuler les chaînes de caractères. Elles sont **immuables** (non modifiables).

- `int length()` : Retourne la longueur de la chaîne.
- `char charAt(int index)` : Récupère le caractère à un index donné.
- `char[] toCharArray()` : Convertit la chaîne en un tableau de caractères.
- `boolean equals(Object o)` : Compare la chaîne à un autre objet (sensible à la casse).
- `boolean equalsIgnoreCase(String str)` : Compare la chaîne à une autre (insensible à la casse).
- `int compareTo(String str)` : Compare lexicographiquement deux chaînes.
- `String toLowerCase()` : Met la chaîne en minuscules.
- `String toUpperCase()` : Met la chaîne en majuscules.
- `String replace(char oldChar, char newChar)` : Remplace un caractère par un autre.
- `String trim()` : Supprime les espaces au début et à la fin.
- `String subString(int beginIndex, int endIndex)` : Extrait une sous-chaîne.
- `String[] split(String regex)` : Découpe la chaîne selon une expression régulière.
- `static String valueOf(...)` : Convertit une valeur (entier, caractère, booléen) en chaîne.

## ✍️ Les classes `StringBuffer` et `StringBuilder`

📞 Font partie de java.lang (aucun import requis)

Ces classes permettent de créer des chaînes de caractères **modifiables**, utiles pour des constructions complexes.

- `append(...)` : Ajoute du contenu à la fin.
- `insert(int offset, String str)` : Insère une chaîne à une position donnée.
- `deleteCharAt(int index)` : Supprime le caractère à une position donnée.
- `replace(int start, int end, String str)` : Remplace une portion de la chaîne.

## 🔢 La classe `Integer`

📞 Fait partie de java.lang (aucun import requis)

Classe "enveloppe" (wrapper) pour le type primitif `int`.

- `Integer(int value)` : Constructeur (obsolète, préférer `valueOf`).
- `static Integer valueOf(int i)` : Méthode de fabrication statique.
- `static int compare(int x, int y)` : Compare deux entiers.
- `int intValue()` : Retourne la valeur `int` de l'objet.
- `static int parseInt(String s)` : Convertit une chaîne en entier signé.

## ⌨️ La classe `java.util.Scanner`

📞 import java.utils.Scanner;

Utilisée pour lire des entrées depuis diverses sources (console, fichier, chaîne).

**Méthodes de lecture :**

- `public String nextLine()`
- `public String next()`
- `public int nextInt()`
- `public double nextDouble()`

**Méthodes pour tester l'existence d'une entrée :**

- `public boolean hasNextLine()`
- `public boolean hasNext()`
- `public boolean hasNextInt()`
- `public boolean hasNextDouble()`
- `public boolean hasNextLong()`

## 🗃️ La classe `Arrays`

📞 import java.util.Arrays

Contient des méthodes utilitaires pour manipuler les tableaux.

- `public static int[] copyOf(int[] original, int newLength)`
- `public static void sort(int[] a)`
- `public static boolean equals(int[] a, int[] a2)`
- `public static boolean deepEquals(Object[] a1, Object[] a2)` : Pour les tableaux d'objets.
- `public static String toString(int[] a)` : Produit une représentation textuelle du tableau.
- `public static String deepToString(Object[] a)` : Idem pour les tableaux d'objets.

## 🌍 La classe `Object`

📞 Fait partie de java.lang (aucun import requis)

La super-classe de toutes les classes en Java. Chaque objet hérite de ses méthodes.

- `public boolean equals(Object o)` : Souvent redéfinie pour comparer les valeurs et non les références.
- `protected Object clone()`
- `public final Class getClass()`
- `public int hashCode()`
- `public String toString()` : Souvent redéfinie pour un affichage personnalisé.

## 🔧 La classe utilitaire `Collections`

📞 import java.util.Collections;

C'est une classe avec des méthodes `static` pour manipuler les collections (à ne pas confondre avec l'interface `Collection`).

- `Collections.sort(maListe);` : Trie une liste.
- `Collections.reverse(maListe);` : Inverse une liste.
- `Collections.shuffle(maListe);` : Mélange une liste.
- `Collections.min(maListe);` / `Collections.max(maListe);` : Trouve le min/max.
