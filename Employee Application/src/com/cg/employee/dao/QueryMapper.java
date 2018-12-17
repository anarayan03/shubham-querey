package com.cg.employee.dao;

public class QueryMapper {

	public final static String EXECUTE_QUERY="select projectid_sequence.nextval from dual";
	
	public final static String INSERT_QUERY="insert into projectbean values('"+sequence+"',?,?,?,?,null)";
	public final static String EXECUTE_QUERY_PROJECT="select * from projectbean where projectID='"+projectId+"'";
	public final static String EXECUTE_QUERY_FOR_ADD_EMPLOYEE="select empID_sequence.nextval from dual";
	public final static String INSERET_EMPLOYEE_QUERY="insert into employeebean values('"+sequence+"',?,?,?,SYSDATE,?,?,null)";
	public final static String EXECUTE_QUERY_EMPLOYEE="select * from employeebean where empID='"+empId+"'";
	public final static String USERNAME_QUERY_= "select * from admin where username ='"+username+"'";
	public final static String UPDATE_QUERY_=" update projectbean set no_of_emp=(select count(*) from "
			+ "employeebean where projectID='"+projectId+"') where projectID='"+projectId+"'";
	public final static String DELETE_QUERY_="delete from projectbean where projectid='" + projectID + "' ";
}
