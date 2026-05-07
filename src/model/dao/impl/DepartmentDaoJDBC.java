package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entites.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	Connection conn = null;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Department obj) {

		
		
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department finById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			
			st = conn.prepareStatement(
					"SELECT * FROM department"
					);
			
			rs = st.executeQuery();
			
			List<Department> list = new ArrayList<>();
			
			while (rs.next()) {
				
				list.add(new Department(rs.getInt("Id"), rs.getString("Name")));
			}
			
			return list;
		}
		catch (SQLException e) {
			throw new DbException("Unexpected error trying to show all departments.");
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
