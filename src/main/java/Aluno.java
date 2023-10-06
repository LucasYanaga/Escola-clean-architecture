import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private Email email;
    private String nome;

    private List<Telefone> telefones = new ArrayList<Telefone>();

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
}
