public class Pais {

  String nome;
  String confederacao;
  double populacaoGlobal;
  double audienciaGlobal;
  
  public Pais(String nome, String confederacao, double populacaoGlobal, double audienciaGlobal) {
    this.nome = nome;
    this.confederacao = confederacao;
    this.populacaoGlobal = populacaoGlobal;
    this.audienciaGlobal = audienciaGlobal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getConfederacao() {
    return confederacao;
  }

  public void setConfederacao(String confederacao) {
    this.confederacao = confederacao;
  }

  public double getPopulacaoGlobal() {
    return populacaoGlobal;
  }

  public void setPopulacaoGlobal(double populacaoGlobal) {
    this.populacaoGlobal = populacaoGlobal;
  }

  public double getAudienciaGlobal() {
    return audienciaGlobal;
  }

  public void setAudienciaGlobal(double audienciaGlobal) {
    this.audienciaGlobal = audienciaGlobal;
  }

  
}