public class PlanoEmpresarial extends PlanoSaude {
    private boolean custoReduzido;

    public PlanoEmpresarial(String nome, String cobertura, boolean custoReduzido) {
        super(nome, cobertura);
        this.custoReduzido = custoReduzido;
    }

    @Override
    public void detalhes() {
        super.detalhes();
        System.out.println("Custo reduzido: " + custoReduzido);
    }
}