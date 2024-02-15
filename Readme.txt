# TP2 Junit et classe Auteur Tournoi Journee Syle
## Nathan randriantsoa
Question 7 :  Etape 
- Mettre en place les test : 
- faire une méthode dont le code ne fait rien pour que la classe compile 
- implémenter la méthode

# Partie Junit 
Pour lancer les test de calcul un fichier runtest.sh est a disposition contenant les commande cd ./bin
javac -d bin -cp .:../jar/junit-4.13.2.jar ./tests/TestsPetitsCalcul.java 
java -cp .:../jar/hamcrest-2.2.jar:../jar/junit-4.13.2.jar org.junit.runner.JUnitCore tests.TestsPetitsCalcul