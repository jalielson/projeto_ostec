package os.tec.dao;

import os.tec.model.Cliente;
import os.tec.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }
    
    public List<Cliente> buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Cliente c WHERE c.cpf like :cpfCliente";
        TypedQuery<Cliente> consulta = getEm().createQuery(jpql, Cliente.class).setMaxResults(3);
        consulta.setParameter("cpfCliente", "%" + cpf + "%");
        return consulta.getResultList();
    }
    
}
