package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class reportDao {
	public static int id = 0;
	public static boolean upload_report(String patientname, String patientemail, String report) {
		mysql_config config = new mysql_config();
		boolean flag = false;
		try {
			Connection con = config.createConnection();
			PreparedStatement st =  con.prepareStatement("insert into report values(?,?,?,?)");
			st.setInt(1, id);
			st.setString(2, patientemail);
			st.setString(3, patientname);
			st.setString(4, report);
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
	public ArrayList<String> getReports(String name, String email) {
		// TODO Auto-generated method stub
		mysql_config config = new mysql_config();
		ArrayList<String> reports = new ArrayList<String>();
		try {
			Connection con = config.createConnection();
			PreparedStatement st =  con.prepareStatement("select * from report where patient_email = (?)");
			st.setString(1, email);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String report = rs.getString(4);
				reports.add(report.replaceAll("\n", "<br/>"));
			}
			st.close();
			con.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.print("In reportDao class, getReport function");
			System.out.println(e);
		}finally {
			return reports;
		}
	}
}
