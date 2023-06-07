public class PlanoIdosos extends PlanoSaude {
    private String coberturaEspecializada;

    public PlanoIdosos(String nome, String cobertura, String coberturaEspecializada) {
        super(nome, cobertura);
        this.coberturaEspecializada = coberturaEspecializada;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Cobertura Especializada: " + coberturaEspecializada);
    }
}