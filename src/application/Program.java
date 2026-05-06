package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===TEST 1: Testing Seller findById");
		Seller seller = sellerDao.finById(3);
		System.out.println(seller);
	}
}
