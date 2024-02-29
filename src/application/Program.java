package application;

import db.DB;
import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println("=== TESTE N1 seller findByID");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
