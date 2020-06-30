1. Java é uma linguagem interpretada ou compilada?
    - **Resposta:** Java é uma linguagem interpretada, porém possui um compilador que compila seu código-fonte para um código intermediador chamado Bytecode, esse por sua vez é interpretado pela máquina virtual java (JVM).
2. O que necessário para executar uma aplicação desenvolvida em Java?
    - **Resposta:** Java Development Kit (JDK), que possui Compilador, máquina virtual Java, código fonte e documentação das APIs.
3. O que significa o conceito: *write once, run anywhere*?
    - **Resposta:** WORA é um termo que referencia um programa específico que possui a habilidade de rodar em qualquer Sistema Operacional. Um programa em java por exemplo, ao ser compilado em um bytecode padrão espera-se que possa ser executado em qualquer dispositivo equipado com uma máquina virtual Java (JVM).
4. Qual a atual versão do JDK Java? Como você faz para instalar o JDK no sistema operacional de sua preferência?
    - **Resposta:** A úlltima versão é JDK 11, ele é distribuído pela Oracle para diversos sistemas operacionais. Para instalar, basta acessar o site da Oracle e baixar a versão do JDK correspondente ao sistema operacional e arquitetura (32 ou 64 bits) utilizada. Após o download do arquivo, a instalação do JDK é feita executando-se o programa de instalação.
5. Abaixo é apresentado o conteúdo do arquivo *Exemplo.java* e o mesmo apresenta erro ao ser compilado com o comando javac *Exemplo.java*. Faça as devidas correções para que o arquivo seja compilado sem problemas.
    - **Correção:** 
```java
public class Exemplo{
	public static void main(String args[]){
		int i = 10;
		System.out.print("Olá mundo");
		double j = 2;
		j += i;
		System.out.print("Valor de j é: " + j);
	}
}
```