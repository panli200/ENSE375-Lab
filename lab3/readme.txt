Li Pan
200371281
ENSE375Lab3

Please compile following these commands:

javac -d bin ./src/DateValidator.java

javac -d bin -cp 'bin:junit-platform-console-standalone-1.7.0-all.jar' ./test/DateValidatorTest.java

java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path
