package os.tec.controller;

import os.tec.dao.ClienteDAO;
import os.tec.dao.ProdutoDAO;
import os.tec.model.Cliente;
import os.tec.model.Produto;
import os.tec.model.Orcamento;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import os.tec.dao.OrcamentoDAO;

@ViewScoped
@ManagedBean(name = "orcamentoBean")
public class OrcamentoBean {

    private Orcamento orcamento = new Orcamento();
    private Cliente cliente;
    private Produto produto = new Produto();
    
    public void salvar() {
        OrcamentoDAO dao = new OrcamentoDAO();
        orcamento.setCliente(cliente);
        System.out.println(orcamento);
        dao.insert(orcamento);
        limparForm();
    }
    
    private void limparForm() {
        orcamento = new Orcamento();
        produto = new Produto();
        cliente = new Cliente();
    }
    
    public void adicionarProduto() {
        this.orcamento.adicionarProduto(this.produto);
        System.out.println(this.produto);
        this.produto = new Produto();
    }
    
    public List<Produto> getProdutosPorNome(String nome) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.buscarPorNome(nome);
    }

    public List<Cliente> getClientesPorCpf(String cpf) {
        ClienteDAO dao = new ClienteDAO();
        return dao.buscarPorCpf(cpf);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
    
}
