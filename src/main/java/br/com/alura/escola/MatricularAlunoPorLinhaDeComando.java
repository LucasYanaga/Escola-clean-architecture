package br.com.alura.escola;

import br.com.alura.escola.aplicacao.indicacao.MatricularAluno;
import br.com.alura.escola.aplicacao.indicacao.MatricularAlunoDTO;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;
import infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Aluno teste";
        String cpf = "123.456.789-00";
        String email = "aluno.teste@teste.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executar(new MatricularAlunoDTO(nome, cpf, email));
    }
}
