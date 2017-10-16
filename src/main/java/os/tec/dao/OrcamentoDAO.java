package os.tec.dao;

import os.tec.model.Orcamento;
import os.tec.util.GenericDAO;

public class OrcamentoDAO extends GenericDAO<Orcamento> {

    @Override
    public Class<Orcamento> getClassType() {
        return Orcamento.class;
    }
    
}
