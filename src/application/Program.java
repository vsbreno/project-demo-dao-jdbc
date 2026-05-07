package application;

import java.time.LocalDateTime;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: Testing Seller findById===");
		Seller seller = sellerDao.finById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("===TEST 2: Testing Seller findByDepartment===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("===TEST 3: Testing Seller findAll===");
		list = sellerDao.findAll();
		for (Seller o : list) {
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("===TEST 4: Testing Seller INSERT===");
		Seller s = new Seller(null, "Regis", "regis@gmail.com", LocalDateTime.now(), 3000.0, department);
		sellerDao.insert(s);
		System.out.println("Inserted. New ID = " + s.getId());
	}
}
