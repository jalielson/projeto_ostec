package os.tec.dao;

import os.tec.model.Sexo;
import os.tec.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}
