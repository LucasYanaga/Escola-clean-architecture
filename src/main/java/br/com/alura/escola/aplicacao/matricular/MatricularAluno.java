package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAluno;

public class MatricularAluno {
    private final RepositorioDeAluno repositorio;

    public MatricularAluno(RepositorioDeAluno repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(MatricularAlunoDTO dados){
       Aluno aluno = dados.criarAluno();
       repositorio.matricular(aluno);
    }
}
