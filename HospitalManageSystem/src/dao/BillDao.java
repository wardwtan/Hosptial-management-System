package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Entity.Bill;

public class BillDao {
	public static int id = 0;
	public static boolean upload_bill(String patientname, String patientemail,String type,String price, String detail) {
		mysql_config config = new mysql_config();
		boolean flag = false;
		try {
			Connection con = config.createConnection();
			PreparedStatement st =  con.prepareStatement("insert into bill values(?,?,?,?,?,?)");
			st.setInt(1, id);
			st.setString(2, patientname);
			st.setString(3, patientemail);
			st.setString(4, type);
			st.setString(5, price);
			st.setString(6, detail);
			st.execute();
			flag = true;
			id++;
			st.close();
			con.close();
		}catch (Exception e) {
			// TODO: handle exception
			return flag;
		}finally {
			return flag;
		}
	}
	public ArrayList<Bill> getBills(String name, String email) throws Exception {
		// TODO Auto-generated method stub
		mysql_config config = new mysql_config();
		Connection con = config.createConnection();
		PreparedStatement st =  con.prepareStatement("select * from bill where patient_email = (?)");
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		ArrayList<Bill> bills = new ArrayList<Bill>();
		while(rs.next()) {
			Bill bill = new Bill(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
			bills.add(bill);
		}
		return bills;
	}

}
