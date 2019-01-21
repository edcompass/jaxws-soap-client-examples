package de.hpc.soap.service;
 
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
 
	
	public void testObj() {
		Employee newOne = new Employee();//new Employee(11, "Java To Wsdl", new Date(0), Math.PI, Float.MIN_VALUE , Long.MAX_VALUE, "java@jax.ws", Gender.BIGENDER, true);
		newOne .setAlive(false);
		newOne .setEmail("whatever@you.want");
		newOne .setLat(new Double(111111));
		XMLGregorianCalendar dateOfBirth = null ;
		newOne .setDob(dateOfBirth );
		newOne .setLon(new Float(-1));
		newOne .setName("Unit Test");
		newOne .setPhone( System.currentTimeMillis() );
		newOne .setSex(Gender.NON);
		
		
		HelloWorldServiceService service = new HelloWorldServiceService( );
		HelloWorld port = service.getHelloWorldServicePort(); 
		
		 
		newOne .setId(1);
		newOne .setName("Predd Bit");
		Employee x = port.updateEmployeeById(1,  newOne );
		assertNotNull( x ); 
		assertEquals(x.getId(), newOne.getId());
		assertEquals(x.getName() , newOne.getName() );
		assertEquals(x.getSex()  , newOne.getSex() );
		assertEquals(x.getPhone()   , newOne.getPhone() );
		assertEquals(x.getLat() , newOne.getLat() );
		assertEquals(x.getDob()  , newOne.getDob() );
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
