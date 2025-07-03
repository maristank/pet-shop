public class Funcionario {
    private String nome;
    private String funcao; // "Banho" ou "Tosa"

    // Construtor
    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    // Getters (sem setters para simplificar)
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    // Método para exibir info básica
    public void mostrarDados() {
        System.out.println("Funcionário: " + nome + " | Função: " + funcao);
    }
}