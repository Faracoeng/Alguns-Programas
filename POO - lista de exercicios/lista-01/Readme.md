# Comandos git e linguagem de programação Java
## Linguagem de programação Java
### Tipos primitivos
```java
byte b = 65;
 char c = 'A'; // ou c = 65;

 int i = 65;
 long l = 65L;
 short s = 65;

 double d = 65.1;
 float f = 65.1f; // ou f = (float) 65.1;

boolean b = true; // ou false
```
### Classe String
```java
String s = "Engenharia";
 String sub = null; // valor nulo

 if (s.empty()){ // verifica se est´a vazia
 System.out.println("Vazia");
 }else if (s.equals("Tele")){ // para comparar Strings
 System.out.println("Iguais");
 }
 // a partir da posi¸c~ao 0 pegue 4 caracteres
 sub = s.substring(0,4);

 int tamanho = sub.length(); //obtendo o tamanho
 char c = sub.charAt(1); // obtendo caractere na posi¸c~ao 1

 String alunos = "Joao:Pedro:Ana";

 // criar´a vetor de Strings com 3 elementos
 String[] vetAlunos = alunos.split(":");

 System.out.println(vetAlunos[0]); // Joao
```
### INteração com o usuário
```java
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual seu nome?");      		  
		String nome = teclado.next();
		System.out.println("Qual sua idade?"); 
		int idade = teclado.nextInt();

	}
}
        
```
## Comandos git
### Como mesclar ramos
```shell
git checkout master
git merge primitivo
git branch -d primitivo
git merge string
```
