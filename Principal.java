import java.util.Random;
public class Principal {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria(); //criando objeto do tipo arvore
        Random gerador = new Random(); //criando gerador
        gerador.setSeed(0); // setando a semente do gerador
        for(int i = 0; i < 100000; i++) // 
        {
            int valor;
            do{
                valor = Math.abs(gerador.nextInt()); 
            }while(arvore.pesquisar(valor) == true); // enquanto o valor gerado for igual a um valor da arvore, gera outro valor
        
            arvore.inserir(valor);

            if(i % 1000 == 0) // a cada 1000 inserções, imprime a altura da arvore
            {
                double log2 = Math.log(i) / Math.log(2); // calcula o log na base 2 de i 
                log2 *= 1.39; // multiplica o log por 1.39 para aproximar o valor do log na base 2
                System.out.println("Número de nós = " + i + " --- log(i,2) = " + log2 + " --- h = " + arvore.getAltura()); // imprime o numero de nós, o log na base 2 e a altura da arvore
            }
        }
    }
}
