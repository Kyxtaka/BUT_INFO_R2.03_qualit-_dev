cd ./bin
javac -d bin -cp .:../jar/junit-4.13.2.jar ./tests/TestsPetitsCalcul.java 
java -cp .:../jar/hamcrest-2.2.jar:../jar/junit-4.13.2.jar org.junit.runner.JUnitCore tests.TestsPetitsCalcul