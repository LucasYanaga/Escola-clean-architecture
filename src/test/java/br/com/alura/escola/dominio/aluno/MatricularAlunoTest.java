package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.matricular.MatricularAlunoDTO;
import infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {
    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAluno repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno aluno = new MatricularAluno(repositorio);
        MatricularAlunoDTO dados = new MatricularAlunoDTO("fulano", "123.456.789-00", "teste@teste.com");
        aluno.executar(dados);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("fulano", alunoEncontrado.getNome());
        assertEquals("123.456.789-00", alunoEncontrado.getCpf().getNumero());
        assertEquals("teste@teste.com", alunoEncontrado.getEmail().getEndereco());
    }
}
