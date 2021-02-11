Please compile following these commands:
javac -d bin ./src/Ingredient.java
javac -d bin -cp bin ./src/Burger.java
javac -d bin -cp 'bin:junit-platform-console-standalone-1.7.0-all.jar' ./test/BurgerTest.java
java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path
