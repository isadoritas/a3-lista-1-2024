import java.util.ArrayList;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Ordenador ordenador = new Ordenador();
    Scanner sc = new Scanner(System.in);

    boolean continuar = true;
    System.out.println("Bem-Vindo!\n");
    while (continuar) {
      System.out.println("Escolha uma opção:");
      System.out.println("[1] Ordenar por Ordem Alfabética\n[2] Ordenar por audiência TV\n[3] Encerrar");
      int resposta = sc.nextInt();
      ArrayList<Pais> paises = ordenador.lerArquivo();
      
      switch (resposta) {
          case 1:
            System.out.println("\nORDENAÇÃO POR NOME\n");
            ordenador.ordenarPaisNome(paises);
            ordenador.imprimirPaises(paises);
            break;
          case 2:
          System.out.println("\nORDENAÇÃO POR AUDIÊNCIA DA TV\n");
            ordenador.ordenarPorAudiencia(paises);
            ordenador.imprimirPaises(paises);
            ordenador.verificarPosicaoBrasil(paises);
              break;
          case 3:
              System.out.println("Encerrando o programa...");
              continuar = false;
              break;
          default:
              System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
              break;
      }
    }
    sc.close();
  }

}