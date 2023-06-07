public class PlanoSaude {
    private String nome;
    private String cobertura;

    public PlanoSaude(String nome, String cobertura) {
        this.nome = nome;
        this.cobertura = cobertura;
    }

    public void detalhes() {
        System.out.println("Nome do Plano: " + nome);
        System.out.println("Cobertura: " + cobertura);
    }
}