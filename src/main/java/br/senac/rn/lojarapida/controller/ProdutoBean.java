package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.dao.ProdutoDAO;
import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.model.Produto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "produtoBean")
public class ProdutoBean {
    
    private Produto produto = new Produto();
    
    public void salvar() {
        ProdutoDAO dao = new ProdutoDAO();
        dao.insert(this.produto);
        this.produto = new Produto();
    }

    public List<Categoria> getCategorias() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
    public List<Produto> getProdutos() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.selectAll();
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}