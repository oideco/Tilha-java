import java.util.Date;

public class Operadores {
    
    public static void main(String[] args) {
    
        // Classe operadores java - Atribuição com o sinal de =
        String nome = "Alessandro";
        int idade = 41;
        char sexo = 'M';
        double peso = 99.90;
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Classe operadores java - Aritimético
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisão = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        //O operador de adição (+), quando utilizado em variáveis do tipo texto (String), realizará a "concatenação de textos"
       // String nomeCompleto = "linguagem" + "java";
        //    System.out.println(nomeCompleto);

    
        String concatenação = "?";

        concatenação = 1+1+1+"1";
       
        System.out.println(concatenação);
        concatenação = 1+"1"+1+1;
        
        System.out.println(concatenação);
        
        concatenação = 1+"1"+1+"1";

        System.out.println(concatenação);
       
        concatenação = "1"+1+1+1;
        
        System.out.println(concatenação);
        
        concatenação = "1"+(1+1+"1");
   
        System.out.println(concatenação);

        // X Repetição encrementar
        int numero = 5;
        numero = numero - 2;
            System.out.println(numero);
     
        int numero2 = 5;
        //numero = numero + 1;
        System.out.println( ++ numero);

        System.out.println(numero);

        // Trabalhando com o sinal de ! (exclamação) para negar uma operação
        boolean variavel = true;
        System.out.println(!variavel);
        
        System.out.println(variavel);
    
        // variavel = !variavel; essa é a forma de inverter o valor de uma variavel do tipo boolean
    
        variavel = !variavel;

        System.out.println(variavel);


        // Operador Ternário
         // Exemplo de condiocional utilizando uma estrutura IF/ELSE
        int a, b;
       
        a = 5;
        b = 6;
       
        String resultado1 = "";
        if(a==b)
            resultado1 = "verdadeiro";
        else
            resultado1 = "falso";

                System.out.println(resultado1);

                int a1, b1;
       
                a1 = 6;
                b1 = 6;
               
                String resultado2 = "";
                if(a1==b1)
                    resultado2 = "verdadeiro";
                else
                    resultado2 = "falso";
        
                        System.out.println(resultado2);
                


        // Relacionais
        int numero01 = 1;
        int numero02 = 2;

        boolean simNao = numero01 == numero02;
        
        if(numero01 < numero02){
            System.out.println("a condição é verdadeira");
        }


        System.out.println( "numeroUm é igual a numeroDois? " + simNao);

        simNao = numero01 != numero02;
           
            System.out.println( "numeroUm é diferente a numeroDois? " + simNao);
  
        simNao = numero01 <= numero02;
           
            System.out.println( "numeroUm é menor ou igual a numeroDois? " + simNao);

        simNao = numero01 >= numero02;
           
            System.out.println( "numeroUm é maior ou igual a numeroDois? " + simNao);    

        simNao = numero01 < numero02;
           
            System.out.println( "numeroUm é menor que o numeroDois? " + simNao);    

        simNao = numero01 > numero02;
            
            System.out.println( "numeroUm é maior que o numeroDois? " + simNao); 
        // Quando for objetos ou texto, usamos o método (equals) para comparar conteudos (objetos,textos)
        String nomeUm = "Alessandro";
        String nomeDois = "Alessandro";

            System.out.println(nomeUm.equals(nomeDois));
    
        // opradores lógicos
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("AS DUAS CONDIÇÕES SÃO VERDADEIRAS");
        }    

        if(condicao1 || condicao2){
            System.out.println("UMA DAS CONDIÇÕES É VERDADEIRA");
        } 
            System.out.println("Fim");

    }





}
