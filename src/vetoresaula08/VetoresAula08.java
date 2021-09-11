package vetoresaula08;

public class VetoresAula08 {

    public static void main(String[] args) {
        double[] notas = new double[5];

        notas[0] = 7.8;
        notas[1] = 8.4;
        notas[2] = 4.2;
        notas[3] = 1.8;
        notas[4] = 6.4;
        
//        System.out.println(notas.length);
//        System.out.println(notas[0]);
//        System.out.println(notas[1]);
//        System.out.println(notas[2]);
//        System.out.println(notas[3]);
//        System.out.println(notas[4]);
//        System.out.println(notas[5]);
//
//        System.out.println("O valor da nota 3 é: " + notas[2]);
////
//        System.out.println("O tamanho do array é: " + notas.length);

//        System.out.println(notas); //mostra o endereço de memória




        // Criar o array e atribuir-lhe valores a partir de uma lista de inicialização:
        double[] valores = { 4.5, 5.9, 4.1, 2.0, 8.9, 6.3, 7.8, 5.3, 1.2, 0.8 };
//        System.out.println(valores.length);
        
//        // Acessando seu quinto elemento (número de posição 4)
        System.out.println("Elemento 5 do array: " + valores[4]);
        // Alterando os valores de duas posições no array:
        valores[4] = 2.3;
        System.out.println(valores[6]);
        valores[6] = 7.1;
//        // Acessando os elementos alterados:
//        System.out.println("Valor alterado para: " + valores[4]);
//        System.out.println("Valor alterado para: " + valores[6]);

                                           //10
        for (int indice = 0; indice < valores.length; indice++) {
           valores[indice] = 2 * valores[indice];
           System.out.println("Oi tudo bem?");
           System.out.println("Elemento na posição " + indice + " = " + valores[indice]);
        }

        
    }
    
}
