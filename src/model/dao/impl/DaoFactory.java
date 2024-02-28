package model.dao.impl;

import model.dao.SellerDao;

public class DaoFactory { // fabrica de daos, oper static para instanciar os daos
// essa classe q ta responsavel por usar os metodos da interface quando instanciar sso chamar essa classe.o metodo q quer q seja
    public static SellerDao creatSellerDao(){ // metodo q retorna um tipo de interface mas internamente instancia uma implementaçao
        return new SellerDaoJDBC();
    }


}
