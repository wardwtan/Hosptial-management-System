package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.model.core.ID;

import Entity.Patient;

public class UserDao {
	public static int id = 0;
	public static boolean find_user(String email) throws Exception {
		mysql_config dao = new mysql_config();
		boolean flag = false;
			Connection con = dao.createConnection();
			PreparedStatement st =  con.prepareStatement("select * from patient where email = (?)");
			st.setString(1, email);
			ResultSet rs = st.executeQuery();
			if(rs.next() == false) {
				rs.close();
				con.close();
				return false;
			}else {
				rs.close();
				con.close();
				return true;
			}
	}
	public static boolean find_user(String email, String password, String type) throws Exception {
		mysql_config dao = new mysql_config();
		boolean flag = false;
		Connection con = dao.createConnection();
		PreparedStatement st =  con.prepareStatement("select * from patient where email = (?)");
		st.setString(1, email);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			if((password.equals(rs.getString(4)))&&(type.equals(rs.getString(5)))) {
				flag = true;
			}
		}
		rs.close();
		con.close();
		return flag;
	}
	public static ArrayList<Patient> getAllUser() throws Exception {
		ArrayList<Patient> alluser = new ArrayList<Patient>();
		mysql_config dao = new mysql_config();
		Connection con = dao.createConnection();
		PreparedStatement st =  con.prepareStatement("select * from patient");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			Patient user = new Patient(rs.getString(2), rs.getString(3), rs.getString(5));
			alluser.add(user);
		}
		st.close();
		con.close();
		return alluser;
	}
	public static boolean user_reg(String name, String email, String password, String type) {
		mysql_config dao = new mysql_config();
		boolean flag = false;
		try {
			if(find_user(email))
				return false;
			else {
				Connection con = dao.createConnection();
				PreparedStatement st =  con.prepareStatement("insert into patient values(?,?,?,?,?)");
				st.setInt(1, id);
				st.setString(2, name);
				st.setString(3, email);
				st.setString(4, password);
				st.setString(5, type);
				st.execute();
				flag = true;
				con.close();
				id++;
			}
		}catch (Exception e) {
			// TODO: handle exception
			flag = false;
			System.out.print("In UserregDao class, user_reg function ");
			System.out.println(e);
		}finally {
			return flag;
		}
	}
}
