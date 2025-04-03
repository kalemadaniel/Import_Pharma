# Import_Pharma
  >*Nous avons une sortie des données dans CERHIS et ce dernier est difficilement interprétable. Nous avons réfléchi à l’arrangement des données sortie par CERHIS DESKTOP pour alimenter CERHIS GESTION PHARMA en utilisant la force de la requête LOAD DATA INFILE. Comme nous le savons tous, les colonnes du fichier CSV de la pharmacie doivent être dans un ordre de celui des colonnes des tables MySQL. Comment puis-je attribuer automatiquement des colonnes correspondant aux colonnes de la table MySQL ?
  Quand j'exécute
  LOAD DATA INFILE 'abc.csv' INTO TABLE abc
Cette requête ajoute toutes les données à la première colonne.
Quelle est la syntaxe automatique pour importer des données vers MySQL. Donc la bonne préparation du fichier CSV est très importante* 

## Pour commencer

Il prend en paramètre les informations qui nous permet de faire une sauvegarde directement d’une interface java et la faire pour de la partie mysql (Base des données) :

### Pré-requis

Les applications nécessaires pour contribuer au dévéloppement de ce projet :

- Netbeans (https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)
- Xampp (https://www.apachefriends.org/fr/download.html)

### Installation

Les étapes pour installer le programme sont :
1. **Télécharger le dossier**
2. **Importer le projet**
3. **Changer les paramètres de connexion**
4. **Executer le projet**

ET si vous souhaitez constituer un executable par la suite il faut faire le ``clean and build ``

## GUI Solution

L'application se presente comme suit à l'ouverture. Le mode d'utilisation est inscrit sur l'interface principale de l'application.
![IMPORT](https://github.com/kalemadaniel/Import_Pharma/assets/51014164/72d8928f-6a76-4f8f-828f-ac7919d5b975)

L'un des etats de sorti se présente comme suit :
![Uploading 286541312-d1334ed4-a8b4-4150-aaa9-ba98fa170082.jpg…]()


_les composants de construction :_

* [java.swing](https://www.javatpoint.com/java-swing) - Palette (front-end)

_Cette partie graphique va nous aider à :_

- Simplifier la communication des informations à l'utilisateur
- Fournir des éclaircissements supplémentaires pour permettre un engagement transparent à l'utilisateur
- Éclairer des informations inattendues, sous-estimées ou inconnues auparavant
- Offrir une évasion divertissante de la réalité, au moins pour une courte période
- etc.

## Contributions

J’accorde aux utilisateurs les droits d'utiliser, d'étudier, de modifier et de distribuer le logiciel et son code source à quiconque et à n'importe quelle fin.

## Versions

Ceci correspond à un état donné de l'évolution du logiciel et j'utilise le versionnage. Ci dessous les versions produites

**Dernière version stable :** 1.0

## Auteurs
le(s) auteur(s) du projet est(sont) :
* **Kalema daniel jonathan** _alias_ [@kalemadaniel](https://github.com/kalemadaniel)

## License

Ce projet est sous licence **``open source``** 

