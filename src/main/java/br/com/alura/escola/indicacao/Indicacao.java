package br.com.alura.escola.indicacao;

import br.com.alura.escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {
    private Aluno indicado;
    private Aluno indicante;

    private LocalDateTime dtaIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dtaIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public void setIndicado(Aluno indicado) {
        this.indicado = indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public void setIndicante(Aluno indicante) {
        this.indicante = indicante;
    }
}
