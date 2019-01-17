package de.hpc.soap.service;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	
	{
		Initializer.init();
	}

	public void testUpdateEmployeeById() {
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		Employee newOne = new Employee();
		newOne .setId(1);
		newOne .setName("Predd Bit");
		Employee x = port.updateEmployeeById(4,  newOne );
		assertNotNull( x ); 
		assertEquals(x.getId(), newOne.getId());
		assertEquals(x.getName() , newOne.getName() );
	}

	public void testDeleteEmployeeById() {
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		Employee newOne = new Employee();
		newOne .setId(1);
		newOne .setName("Predd Bit");
		Employee x = port.deleteEmployeeById(3);
		assertNotNull( x ); 
		assertEquals(new Integer(x.getId() ), new Integer(3)); 
		
	}

	public void testAddEmployee() throws URISyntaxException_Exception {
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		Employee newOne = new Employee();
		newOne .setId(1);
		newOne .setName("Predd Bit");
		Employee x = port.addEmployee(newOne );
		assertNotNull( x ); 
		assertEquals(x.getId(), newOne.getId());
		assertEquals(x.getName() , newOne.getName() );
	}

	public void testGetAllEmployees() {
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		Employees aesResponse = port.getAllEmployees();
		assertNotNull( aesResponse ); 
	}

	public void testGetMsg() {
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		String sResponse = port.getMsg("jaxws-soap-client-examples");
		assertEquals("Message requested : jaxws-soap-client-examples", sResponse); 
	}

}
