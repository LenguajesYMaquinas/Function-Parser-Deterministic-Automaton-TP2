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

<ol>
<li>Create a new java project on Gold Kepler</li>
<li>Copy the files of this repository on the src folder of the created project</li>
<li>Open the file and execute it</li>
<li>Write the input program and you will see the response of the automaton</li>
</ol>

# Comments

- Los nombres de los identificadores de funciones están limitados a unicamente minusculas y sin combinaciones de letras y numeros.
- Después de un if debe ir obligatoriamente un else.
- El automata reconoce la declaración de solo una función.
- Es posible asignar a identificadores valores booleanos, por lo que es permitido escribir lineas del estilo: < IDENTIFICADOR > < := > < OPERADOR_COMPARACION > (< STRING > | < NUMBER >).
- El bloque de instrucciones del if y el else solo reconocen una instrucción, la siguiente a su token.
- El programa no debe tener espacios, a excepcion de solo un espacio después de las siguientes palabras: begin, algunos numeros, if, then, algunas letras, else, comas y paréntesis derechos (para más claridad, ver los ejemplos). 










































//GOLD importation.
using gold.**

var inIf
var inArguments

// Main procedure.
procedure main(args:String[]) begin
	inIf = false
	inArguments = false
	GAutomataFrame.show(createAutomaton())
 end

// Automaton creation function.
function createAutomaton():IAutomaton

	begin
		
		Q := {
				"spaceFromBegin",
				"spaceFromNumber",
				"spaceFromNumberInIf",
				"spaceFromIf",
				"spaceFromThen",
				"spaceFromLetter",
				"spaceFromElse",
				"spaceFromComma",
				"spaceFromMod",
				"spaceFromRparen",
				"initial",
				"b",
				"be",
				"beg",
				"begi",
				"begin",
				"e",
				"en",
				"end",
				"i",
				"if",
				"e",
				"el",
				"els",
				"else",
				"t",
				"th",
				"the",
				"then", 
				":",
				"=",
				":=",
				"letter",
				"letterFromBegin",
				"letterInArguments",
				"letterInIf",
				"number", 
				"numberInIf",
				"lparen", 
				"rparen", 
				"comma",
				"<",
				">",
				"<=",
				">=",
				"operator",
				"m",
				"mo",
				"mod",
				"err"
			}
		Σ := ('a'‥'z')∪('0'‥'9')∪{'=', ':', '+', '-', '/', '*', '=', '<', '>', '(', ')', ',', ' '}
		q := "initial"
		F := {"end"}
 
 		return GDeterministicAutomaton(Q, Σ, q, F, δ)
 		
	end

// Delta function.
function δ(state, character) 
	begin
		
		lettersSet := ('a'‥'z')
		numbersSet := ('0'‥'9')
		operatorsSet := {'+', '-', '*', '/'}
		comparatorsSet := {'=', '<', '>', "<=", ">="}
	
		// " SpaceFromBegin" state
		if state=="spaceFromBegin" and character=='i' then return "i"
		elseif state=="spaceFromBegin" and character∈lettersSet then return "letterFromBegin"
		// "initial" state
		elseif state=="initial" and character=='b' then return "b"
		// "spaceFromNumber" state
		elseif state=="spaceFromNumber" and character=='t' then return "t"
		elseif state=="spaceFromNumber" and character=='i' then return "i"
		elseif state=="spaceFromNumber" and character=='e' then return "e"	
		elseif state=="spaceFromNumber" and character∈lettersSet then return "letterFromBegin"
		// "spaceFromNumberInIf" state
		elseif state=="spaceFromNumberInIf" and character=='t' then return "t"
		elseif state=="spaceFromNumberInIf" and character=='m' then return "m"
		// "spaceFromIf" state
		elseif state=="spaceFromIf" and character∈lettersSet then return "letter"
		// "spaceFromThen" state
		elseif state=="spaceFromThen" and character∈lettersSet then return "letterFromBegin"
		// "spaceFromLetter" state
		elseif state=="spaceFromLetter" and character=='m' then return "m"
		elseif state=="spaceFromLetter" and character=='e' then return "e"
		elseif state=="spaceFromLetter" and character==')' then return "rparen"
		elseif state=="letter" and character=='t' then return "t"
		elseif state=="spaceFromLetter" and character∈lettersSet then return "letter"
		elseif state=="spaceFromLetter" and character=='=' then return "="
		// "spaceFromElse" state
		elseif state=="spaceFromElse" and character∈lettersSet then return "letterFromBegin"
		// "spaceFromComma" state
		elseif state=="spaceFromComma" and character=='m' then return "m"
		elseif state=="spaceFromComma" and character∈lettersSet then return "letter"
		// "spaceFromMod" state	
		elseif state=="spaceFromMod" and character∈lettersSet then return "letter"
		// "spaceFromRparen" state
		elseif state=="spaceFromRparen" and character=='e' then return "e"
		elseif state=="spaceFromRparen" and character∈lettersSet then return "letterFromBegin"
		// "m" state	
		elseif state=="m" and character=='o' then return "mo"
		// "mo" state	
		elseif state=="mo" and character=='d' then return "mod"
		// "mod" state	
		elseif state=="mod" and character==' ' then return "spaceFromMod"
		// "b" state
		elseif state=="b" and character=='e' then return "be"
		// "be" state
		elseif state=="be" and character=='g' then return "beg"
		// "beg" state
		elseif state=="beg" and character=='i' then return "begi"
		// "begi" state
		elseif state=="begi" and character=='n' then return "begin"
		// "begin" state
		elseif state=="begin" and character==' ' then return "spaceFromBegin"
		// "i" state
		elseif state=="i" and character=='f' then return "if"
		elseif state=="i" and character∈lettersSet then return "letterFromBegin"
		// "if" state
		elseif state=="if" and character==' ' then inIf:=true return "spaceFromIf"
		// "letterInIf" state
		elseif state=="letterInIf" and character==' ' then return "spaceFromNumberInIf"
		elseif state=="letterInIf" and character∈lettersSet then return "letterInIf"
		elseif state=="letterInIf" and character=='(' then  return "lparen"
		elseif state=="letterInIf" and character∈operatorsSet then return "operator"
		// "letterInArguments" state
		elseif state=="letterInArguments" and character==',' then return "comma"
		elseif state=="letterInArguments" and character==')' then return "rparen"
		elseif state=="letterInArguments" and character==' ' then return "spaceFromLetter"
		elseif state=="letterInArguments" and character=='=' then return "="
		elseif state=="letterInArguments" and character∈lettersSet then return "letterInArguments"
		elseif state=="letterInArguments" and character∈operatorsSet then return "operator"
		elseif state=="letterInArguments" and character=='=' then return "="
		elseif state=="letterInArguments" and character=='<' then return "<"
		elseif state=="letterInArguments" and character=='>' then return ">"
		// "letterFromBegin" state
		elseif state=="letterFromBegin" and character==':' then return ":"
		elseif state=="letterFromBegin" and character∈lettersSet then return "letterFromBegin"
		// "letter" state
		elseif state=="letter" and character==' ' then return "spaceFromLetter"
		elseif state=="letter" and character=='=' then return "="
		elseif state=="letter" and character∈lettersSet then return "letter"
		elseif state=="letter" and character=='(' then inArguments:=true return "lparen"
		elseif state=="letter" and character∈operatorsSet then return "operator"
		elseif state=="letter" and character=='=' then return "="
		elseif state=="letter" and character=='<' then return "<"
		elseif state=="letter" and character=='>' then return ">"
		elseif state=="letter" and character==')' and inArguments then inArguments:=false return "rparen"
		// "rparen" state
		elseif state=="rparen" and character==' ' then return "spaceFromRparen"
		// "comma" state	
		elseif state=="comma" and character==' ' then return "spaceFromComma"
		// "lparen" state	
		elseif state=="lparen" and character=='m' then return "m"
		elseif state=="lparen" and character∈lettersSet then return "letterInArguments"
		// "e" state	
		elseif state=="e" and character=='l' then return "el"
		elseif state=="e" and character=='n' and !inIf then return "en"
		// "en" state	
		elseif state=="en" and character=='d' then return "end"
		// "el" state	
		elseif state=="el" and character=='s' then return "els"
		// "els" state	
		elseif state=="els" and character=='e' then return "else"
		// "els" state	
		elseif state=="els" and character=='e' then return "else"
		// "else" state	
		elseif state=="else" and character=' ' then inIf:=false return "spaceFromElse"
		// ":" state	
		elseif state==":" and character=='=' then return ":="
		// ":=" state	
		elseif state==":=" and character∈lettersSet then return "letter"
		elseif state==":=" and character∈numbersSet then return "number"
		// "=" state
		elseif state=="=" and character∈numbersSet then return "numberInIf"
		elseif state=="=" and character∈lettersSet then return "letterInIf"
		// "numberInIf" state
		elseif state=="numberInIf" and character∈numbersSet then return "numberInIf"
		elseif state=="numberInIf" and character==' ' then return "spaceFromNumberInIf"
		elseif state=="numberInIf" and character∈operatorsSet then return "operator"
		elseif state=="numberInIf" and character=='=' then return "="
		elseif state=="numberInIf" and character=='<' then return "<"
		elseif state=="numberInIf" and character=='>' then return ">"
		// "number" state
		elseif state=="number" and character∈numbersSet then return "number"
		elseif state=="number" and character==' ' then return "spaceFromNumber"
		elseif state=="number" and character∈operatorsSet then return "operator"
		elseif state=="number" and character=='=' then return "="
		elseif state=="number" and character=='<' then return "<"
		elseif state=="number" and character=='>' then return ">"
		// "t" state
		elseif state=="t" and character=='h' then return "th"
		// "th" state
		elseif state=="th" and character=='e' then return "the"
		// "the" state
		elseif state=="the" and character=='n' then return "then"
		// "then" state
		elseif state=="then" and character==' ' then return "spaceFromThen"
		// "=" state
		elseif state=="=" and character∈numbersSet then return "numberInIf"
		elseif state=="=" and character∈lettersSet then return "letterInIf"
		// "<" state
		elseif state=="<" and character∈numbersSet then return "number"
		elseif state=="<" and character∈lettersSet then return "letter"
		elseif state=="<" and character=='=' then return "<="	
		// "<=" state
		elseif state=="<=" and character∈numbersSet then return "number"
		elseif state=="<=" and character∈lettersSet then return "letter"	
		// ">" state
		elseif state==">" and character∈numbersSet then return "number"
		elseif state==">" and character∈lettersSet then return "letter"
		elseif state==">" and character=='=' then return ">="	
		// ">=" state
		elseif state==">=" and character∈numbersSet then return "number"
		elseif state==">=" and character∈lettersSet then return "letter"
		// "operator" state
		elseif state=="operator" and character∈numbersSet then return "number"
		elseif state=="operator" and character∈lettersSet then return "letter"
		
		else return "err"
			
			
	end
end
#   F u n c t i o n - P a r s e r - D e t e r m i n i s t i c - A u t o m a t o n - T P 2  
 