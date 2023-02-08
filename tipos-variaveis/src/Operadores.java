public class Operadores {
    
    public static void main(String[] args) {
        // String nomeCompleto = "Linguagem " + "Java";

        // System.out.println(nomeCompleto);
        // int numero = 5;

        // numero = - numero;

        // System.out.println(numero);

        // numero = numero * -1;

        // System.out.println(numero);

        // int numero = 5;
        //X repetição
        // numero++;
        //numero = numero+2;
        // System.out.println(++ numero );
        
        // System.out.println(numero);
        // boolean variavel = true;

        // variavel = !variavel;
        // System.out.println(variavel);

        // int a, b;
        // a = 5;
        // b = 5;

        // String resultado = a==b ?"verdadeiro" : "falso" ;

        // System.out.println(resultado);
        /*EXEMPLO DE CONSIDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         If(a==b)
            resultado ="verdadeiro"
         else
            resultado = "falso"          
        */

        // String nomeUm = "Priscila ";
        // String nomeDois = new String( "Priscila ");

        // System.out.println(nomeUm.equals(nomeDois));


        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if(numero1 < numero2){
        //     System.out.println("a condição é verdadeira");
        // }

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições são verdadeiras");
        }

        System.out.println("Fim");
    }

}
