package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===TEST 1: Testing Department findAll===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("===TEST 2: Testing Department findById===");
		Department dep = departmentDao.finById(4);
		System.out.println(dep);

		System.out.println();
		System.out.println("===TEST 3: Testing Department deleteById===");
		departmentDao.deleteById(6);
		System.out.println("Deleted with successful.");
	}
}
