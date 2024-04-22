import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Ordenador {

  public ArrayList<Pais> lerArquivo() {
    ArrayList<Pais> paises = new ArrayList<>();
    String linha;
    String csvArquivo = "fifa_countries_audience.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(csvArquivo))) {

      br.readLine();

        while ((linha = br.readLine()) != null) {
            String[] campos = linha.split(",");
            double campo2 = Double.parseDouble(campos[2]);
            double campo3 = Double.parseDouble(campos[3]);
            Pais pais = new Pais(campos[0], campos[1], campo2, campo3);
            paises.add(pais);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return paises;
  }

  public void imprimirPaises(ArrayList<Pais> paises) {
    for (Pais pais : paises) {
        System.out.println("País: " + pais.nome);
        System.out.println("Confedereção: " + pais.confederacao);
        System.out.println("População Global: " + pais.populacaoGlobal);
        System.out.println("Porcentagem da Audiência Global : " + pais.audienciaGlobal);
        
        System.out.println("------------------------------");
    }
  }

  // Ordenação usando Collections
  public void ordenarPaisNome(ArrayList<Pais> paises) {
    Collections.sort(paises, new Comparator<Pais>() {
      @Override
      public int compare(Pais p1, Pais p2) {
        return p1.getNome().compareTo(p2.getNome());
      }
    });
  }

  // Ordenação usando Bubble Sort
  public void ordenarPorAudiencia(ArrayList<Pais> paises) {
    int n = paises.size();
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (paises.get(j).getAudienciaGlobal() > paises.get(j+1).getAudienciaGlobal()) {
                Pais temp = paises.get(j);
                paises.set(j, paises.get(j+1));
                paises.set(j+1, temp);
            }
        }
    }
    for (int i = 0;  i < paises.size(); i++) {
      if (paises.get(i).getNome().equals("Brasil")) {
        Pais brasil = paises.remove(i);
        paises.add(1, brasil);
        break;
      }
    }
  }
  public void verificarPosicaoBrasil(ArrayList<Pais> paises) {
    int posicaoBrazil = -1;
    for (int i = 0; i < paises.size(); i++) {
        if (paises.get(i).getNome().equals("Brazil")) {
            posicaoBrazil = i + 1;
            break;
        }
    }

    if (posicaoBrazil != -1) {
        System.out.println("\n!!!! Nova posição do Brazil após ordenação por audiência em ordem crescente: " + posicaoBrazil + "º\n");
    } else {
        System.out.println("\nPaís 'Brazil' não encontrado na lista.");
    }
  }
}