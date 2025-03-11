package com.mph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mph.model.Employee;
import com.mph.util.MyDBConnection;

public class EmployeeDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	public void createEmp(Employee emp,int type)  {
		con=MyDBConnection.getMyDbConnection();
		
			try {
				if(type==1) {
					ps=con.prepareStatement("insert into memployee(empno,ename,etype,basic,hra,pf,gross,net) values (?,?,?,?,?,?,?,?)");
					ps.setInt(1, emp.getEmpno());
					ps.setString(2, emp.getEname());
					ps.setString(3,emp.getEtype());
					ps.setInt(4, emp.getFs().getBasic());
					ps.setDouble(5,emp.getFs().getHra());
					ps.setDouble(6,emp.getFs().getPf());
					ps.setDouble(7,emp.getFs().getGross());
					ps.setDouble(8,emp.getFs().getNet());
				}
				else if(type==2) {
					ps=con.prepareStatement("insert into memployee(empno,ename,etype,wages,days,dayWages) values (?,?,?,?,?,?)");
					ps.setInt(1, emp.getEmpno());
					ps.setString(2, emp.getEname());
					ps.setString(3,emp.getEtype());
					ps.setInt(4, emp.getPs().getWages());
					ps.setDouble(5,emp.getPs().getDays());
					ps.setDouble(6,emp.getPs().getDayWages());
					
				}
				int noofrows = ps.executeUpdate();
				System.out.println(noofrows + " inserted in DB successfully !!!");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		
	    
	}
	public void  showEmp() {
		con=MyDBConnection.getMyDbConnection();
		try {
			stmt = con.createStatement();
			rs=stmt.executeQuery("select * from memployee");
			while(rs.next()) {
				String etype=rs.getString(3);
				if(etype.equals("Fulltime")){
					System.out.println("EmpNo"+rs.getInt(1));
					System.out.println("EmpName"+rs.getString(2));
					System.out.println("Etpe"+rs.getString(3));
					System.out.println("Basic"+rs.getInt(4));
					System.out.println("Hra"+rs.getDouble(5));
					System.out.println("Pf"+rs.getDouble(6));
					System.out.println("Gross"+rs.getDouble(7));
					System.out.println("Net"+rs.getDouble(8));
					System.out.println("*************************");
				}
				else if(etype.equals("Parttime")) {
					System.out.println("EmpNo"+rs.getInt(1));
					System.out.println("EmpName"+rs.getString(2));
					System.out.println("Etpe"+rs.getString(3));
					System.out.println("Wages"+rs.getInt(9));
					System.out.println("Days"+rs.getDouble(10));
					System.out.println("DayWages"+rs.getDouble(11));
					System.out.println("*************************");
				}
			}


		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
