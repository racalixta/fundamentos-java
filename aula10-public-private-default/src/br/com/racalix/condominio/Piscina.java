package br.com.racalix.condominio;

class Piscina {
  //String boia; // default
  private String boia; // private

  // getters e setters
  public String getBoia() {
    registrarEmprestimo();
    return boia;
  }

  public void setBoia(String boia) {
    // pode verificar se a boia nao esta furada
    this.boia = boia;
  };

  private void registrarEmprestimo() {

  }
}
