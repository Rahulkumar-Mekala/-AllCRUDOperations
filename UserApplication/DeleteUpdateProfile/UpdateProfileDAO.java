package DeleteUpdateProfile;


import java.sql.Connection;
import java.sql.PreparedStatement;

import Register.Userbean;


public class UpdateProfileDAO {
	 public int k=0;
	 public int Update(Userbean bean) {
		 try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from register where phonenumber =?");
		

			preparedStatement.setLong(1, bean.getPhone());
			 k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}
	 
	 

}
