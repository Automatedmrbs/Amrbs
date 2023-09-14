package View;

import java.sql.SQLException;

import Dao.AdminDAOImpl;
import Dao.MemberDAOImpl;
import service.AdminService;
import service.AdminServiceImpl;
import service.ManagerService;
import service.MemberService;
import service.MemberServiceImpl;
import service.ManagerService;
import service.ManagerServiceImpl;

public class Main {

	 public static void main(String[] args) throws SQLException {
		 AdminService adminService = new AdminServiceImpl(new AdminDAOImpl());
	        // Initialize the service and view
	        //AdminService adminService = new AdminServiceImpl(new AdminDAOImpl());
		 AdminView adminView = new AdminView(adminService);
		 MemberService memberService = new MemberServiceImpl(new MemberDAOImpl()); // Instantiate MemberService
	     MemberView memberView = new MemberView(memberService); // Pass MemberService to the view
	        // Run the member view
	     memberView.run();
	        // Run the admin view
	     adminView.run();
		ManagerService managerService = new ManagerServiceImpl();
		 ManagerView managerView = new ManagerView(managerService);
		 managerView.run();
	     }
}
