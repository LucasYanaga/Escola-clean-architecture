package br.com.alura.escola.dominio.aluno;

public class FabricaDeAluno {
    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmailIdade(String nome, String cpf, String email, int idade){
        this.aluno = new Aluno(new CPF(cpf),new Email(email), nome, idade);
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar(){
        return this.aluno;
    }
}
