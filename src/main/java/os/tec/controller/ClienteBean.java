
package os.tec.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import os.tec.dao.ClienteDAO;
import os.tec.dao.SexoDAO;
import os.tec.model.Cliente;
import os.tec.model.Sexo;



@ViewScoped
@ManagedBean(name = "clienteBean")
public class ClienteBean {

    private Cliente categoria = new Cliente();

    public void salvar() {
        ClienteDAO dao = new ClienteDAO();
        if (this.categoria.getId() == 0) {
            dao.insert(this.categoria);
        } else {
            dao.update(this.categoria);
        }
        this.categoria = new Cliente();
    }
    
    public void editar(Cliente categoria) {
        this.categoria = categoria;
    }
    
    public void remover(Cliente categoria) {
        ClienteDAO dao = new ClienteDAO();
        dao.delete(categoria);
    }
    
    public List<Cliente> getClientes() {
        ClienteDAO dao = new ClienteDAO();
        return dao.selectAll();
    }
    
    public List<Sexo> getSexos() {
        SexoDAO dao = new SexoDAO();
        return dao.selectAll();
    }
    
    public Cliente getCliente() {
        return categoria;
    }

    public void setCliente(Cliente categoria) {
        this.categoria = categoria;
    }
    
}
