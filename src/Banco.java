import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private String codigo;
	private List<Conta> contas;

    public Banco(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.contas = new ArrayList<>();
    }
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void adicionarConta(Conta conta) {
	        this.contas.add(conta);
	 }
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
