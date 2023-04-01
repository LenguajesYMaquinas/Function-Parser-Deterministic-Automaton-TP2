# Function Parser Deterministic Automaton TP2

## About this

This program is a parser for a programming function structure defined with the sytax described in the [statement](/statement.pdf) file.

## Technologies

- Java
- JavaCC

## Respository files

  The important files are:

- [tp2.gold](/Transducers/src/tp2.gold): this is the main file and contains the automaton.

## Examples

Examples of valid programs for the automaton.

- begin a:=33 if l mod ern=07 then gcd:=a else gcd:=gcd(b, a mod b) z:=23 w:=z-1 residuo:=z mod w if residuo>=1 then w:=w-1 else gcd:=gcd(b, a mod b) end

- begin a:=3 if b=0 then gcd:=a else gcd:=gcd(b, a mod b) end

## Execution

For the execution, you need to install and create the project with https://www.oracle.com/co/java/technologies/javase/javase8u211-later-archive-downloads.html

Download the program for execute the automaton in https://github.com/silviaTak/GoldKeplerWindows.git

- Create a new java project on Gold Kepler.
- Copy the files of this repository on the src folder of the created project.
- Open the file and execute it.
- Write the input program and you will see the response of the automaton.

# Comments

- Los nombres de los identificadores de funciones están limitados a unicamente minusculas y sin combinaciones de letras y numeros.
- Después de un if debe ir obligatoriamente un else.
- El automata reconoce la declaración de solo una función.
- Es posible asignar a identificadores valores booleanos, por lo que es permitido escribir lineas del estilo: < IDENTIFICADOR > < := > < OPERADOR_COMPARACION > (< STRING > | < NUMBER >).
- El bloque de instrucciones del if y el else solo reconocen una instrucción, la siguiente a su token.
- El programa no debe tener espacios, a excepcion de solo un espacio después de las siguientes palabras: begin, algunos numeros, if, then, algunas letras, else, comas y paréntesis derechos (para más claridad, ver los ejemplos).