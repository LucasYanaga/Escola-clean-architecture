package br.com.alura.escola.dominio.aluno;

public interface CifradorDeSenha {
    String cifrarSenha(String senha);
    boolean validarSenhacifrada(String senhaCifrada, String senha);
}
