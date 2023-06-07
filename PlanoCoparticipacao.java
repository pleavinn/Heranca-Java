public class PlanoCoparticipacao extends PlanoSaude {
    private double percentualCoparticipacao;

    public PlanoCoparticipacao(String nome, String cobertura, double percentualCoparticipacao) {
        super(nome, cobertura);
        this.percentualCoparticipacao = percentualCoparticipacao;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Percentual de Coparticipação: " + percentualCoparticipacao);
    }
}