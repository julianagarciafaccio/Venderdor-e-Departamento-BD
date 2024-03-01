package application;

import db.DB;
import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println("=== TESTE N1 seller findByID");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("=== TESTE N2 seller findByDepartment");
        Department department = new Department(2 , null);
        List<Seller> list = sellerDao.findByDepartment(department);

        System.out.println("teste 3 findall");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
