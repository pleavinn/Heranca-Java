class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    PlanoEmpresarial planoEmpresarial = new PlanoEmpresarial("Plano Empresarial", "Cobertura para equipe", true);
planoEmpresarial.detalhes();

PlanoCoparticipacao planoCoparticipacao = new PlanoCoparticipacao("Plano com Coparticipação", "Cobertura com compartilhamento de custos", 0.2);
planoCoparticipacao.detalhes();

PlanoRegional planoRegional = new PlanoRegional("Plano Regional", "Cobertura restrita a uma região", "Sudeste");
planoRegional.detalhes();
  }
}