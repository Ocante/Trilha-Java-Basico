public class Operador {
    public static void main(String[] args) {

        // EXEMPLOS DE OPERADORES
        // (+) Operador unário de valor positivo – números são positivos sem esse
        // operador explicitamente;

        // qual o resultado das expressoes abaixo?
        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";

        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;

        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);

        // System.out.println(concatenacao);
        // (++) Operador unário de incremento de valor – incrementa o valor em 1
        // unidade;
        // (--) Operador unário de decremento de valor – decrementa o valor em 1
        // unidade;
        // x repetição
        // numero = 5;
        // numero = -numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);
        // int numero = 5;
        // numero = 5;
        // System.out.println(numero++);
        // System.out.println(numero--);
        // System.out.println(numero);

        // (!) Operador unário lógico de negação – nega o valor de uma expressão
        // booleana.

        // boolean variavel = true;
        // System.out.println();
        // variavel = !variavel;
        // System.out.println(variavel);

        // Operador ternário
        // classe Operadores.java
        // int a, b;

        // a = 15;
        // b = 18;

        // String resultado;
        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // resultado = (a == b) ? "verdadeiro" : "false";
        // resultado = (a != b) ? "verdadeiro" : "false";

        // System.out.println(resultado);

        /*
         * Relacionais
         * Os operadores relacionais, avaliam a relação entre duas variáveis ou
         * expressões. Neste caso, mais precisamente, definem se o operando à esquerda é
         * igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita,
         * retornando um valor booleano como resultado.
         * == Quando desejamos verificar se uma variável é IGUAL A outra.
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         * < Quando desejamos verificar se uma variável é MENOR QUE outra.
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */

        // classe Operadores.java
        // int numero1 = 1;
        // int numero2 = 2;
        /*
         * if (numero1 > numero2)
         * System.out.print("Numero 1 maior que numero 2 ");
         * 
         * if (numero1 < numero2)
         * System.out.print("Numero 1 menor que numero 2 ");
         * 
         * if (numero1 >= numero2)
         * System.out.print("Numero 1 maior ou igual que numero 2 ");
         * 
         * if (numero1 <= numero2)
         * System.out.print("Numero 1 menor ou igual que numero 2 ");
         * 
         * if (numero1 != numero2)
         * System.out.print("Numero 1 é diferente de numero 2 ");
         * 
         * if (numero1 > numero2) {
         * System.out.println("esse numero é estrado");
         * } else {
         * System.out.println("Ainda faz parte no dosso universo");
         * }
         * 
         * 
         * String nomeUm = "Ocante";
         * String NomeDois = new String("Ié");
         * // System.out.println(nomeUm == NomeDois);
         * System.out.println(nomeUm.equals(NomeDois));
         * 
         * Comparações avançadas
         * Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo
         * domínio, de como o Java trata o armazenamento destes valores na memória.
         * Quando estiver mais familiarizado com a linguagem, recomendamos se aprofundar
         * no conceito de espaço em memória Stack versus Heap.
         * Vamos a alguns exemplos para ilustrar:
         * Valor e referência: Precisamos entender que em Java tudo é objeto, logo,
         * objetos diferentes podem ter as mesmas características, mas lembrando, são
         * objetos diferentes.
         * 
         * // ComparacaoAvancada.java
         * 
         * 
         * String nome1 = "JAVA";
         * String nome2 = "JAVA";
         * 
         * System.out.println(nome1 == nome2); //true
         * 
         * String nome3 = new String("JAVA");
         * 
         * System.out.println(nome1 == nome3); //false
         * 
         * String nome4 = nome3;
         * 
         * System.out.println(nome3 == nome4); //true
         * 
         * //equals na parada
         * System.out.println(nome1.equals(nome2)); //??
         * System.out.println(nome2.equals(nome3)); //??
         * System.out.println(nome3.equals(nome4)); //??
         * 
         * 
         * 
         * == versus equals: Existe uma relevância forte, em realizar
         * comparações com == e equals na qual precisamos ter uma compreensão
         * de quais as regras seguidas pela linguagem **** , exemplo:
         * 
         * 
         * int numero1 = 130;
         * int numero2 = 130;
         * System.out.println(numero1 == numero2); //true
         * 
         * Integer numero1 = 130;
         * Integer numero2 = 130;
         * 
         * System.out.println(numero1 == numero2); //false
         * 
         * // A razão pela qual o resultado é false, é devido o Java tratar os valores
         * // Como objetos a partir de agora.
         * // Qual a solução ?
         * // Quando queremos comparar objetos, usamos o método equals
         * 
         * System.out.println(numero1.equals(numero2));
         * 
         * 
         * Lógicos
         * Os operadores lógicos, representam o recurso que nos permite
         * criar expressões lógicas maiores, a partir da junção de duas ou mais
         * expressões.
         * 
         * 
         * && Operador Lógico "E"
         * || Operador Lógico "OU"
         * 
         */
        boolean condicao1 = true;

        boolean condicao2 = false;

        // * Aqui estamos utilizando o operador lógico E para fazer a união de duas
        // expressões.
        // É como se estivesse escrito:
        // "Se Condicao1 e Condicao2 forem verdadeiras, executar código"

        if (condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");

        }

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2) {
            System.out.print("Um dos valores precisa ser verdadeiro");

        } else {
            System.out.println("Agora dominei a parada pah!");
        }

    }

}
