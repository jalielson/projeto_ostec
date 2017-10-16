package os.tec.principal;

import os.tec.dao.CategoriaDAO;
import os.tec.model.Categoria;

public class Principal {
    
    public static void main(String[] args) {
        
        new CategoriaDAO().insert(new Categoria(0, "Calçados", "Setor de Calçados"));

//        System.out.println(new CategoriaDAO().selectAll());

        System.exit(0);
        
    }
    
}
