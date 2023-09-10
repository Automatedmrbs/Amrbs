package View;

import java.sql.SQLException;

import Dao.AdminDAOImpl;
import service.AdminService;
import service.AdminServiceImpl;

public class Main {

	 public static void main(String[] args) throws SQLException {
		 AdminService adminService = new AdminServiceImpl(new AdminDAOImpl());
	        // Initialize the service and view
	        //AdminService adminService = new AdminServiceImpl(new AdminDAOImpl());
		 AdminView adminView = new AdminView(adminService);

	        // Run the admin view
	     adminView.run();
	     }
}
