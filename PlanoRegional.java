public class PlanoRegional extends PlanoSaude {
    private String regiao;

    public PlanoRegional(String nome, String cobertura, String regiao) {
        super(nome, cobertura);
        this.regiao = regiao;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Região de Cobertura: " + regiao);
    }
}