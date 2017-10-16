package os.tec.dao;

import os.tec.model.Categoria;
import os.tec.util.GenericDAO;

public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }

}
