
package de.hpc.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hpc.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _URISyntaxException_QNAME = new QName("http://jaxws.howtodoinjava.com/", "URISyntaxException");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://jaxws.howtodoinjava.com/", "addEmployeeResponse");
    private final static QName _Employee_QNAME = new QName("http://jaxws.howtodoinjava.com/", "employee");
    private final static QName _DeleteEmployeeByIdResponse_QNAME = new QName("http://jaxws.howtodoinjava.com/", "deleteEmployeeByIdResponse");
    private final static QName _GetMsgResponse_QNAME = new QName("http://jaxws.howtodoinjava.com/", "getMsgResponse");
    private final static QName _UpdateEmployeeById_QNAME = new QName("http://jaxws.howtodoinjava.com/", "updateEmployeeById");
    private final static QName _GetMsg_QNAME = new QName("http://jaxws.howtodoinjava.com/", "getMsg");
    private final static QName _DeleteEmployeeById_QNAME = new QName("http://jaxws.howtodoinjava.com/", "deleteEmployeeById");
    private final static QName _AddEmployee_QNAME = new QName("http://jaxws.howtodoinjava.com/", "addEmployee");
    private final static QName _GetAllEmployees_QNAME = new QName("http://jaxws.howtodoinjava.com/", "getAllEmployees");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://jaxws.howtodoinjava.com/", "getAllEmployeesResponse");
    private final static QName _UpdateEmployeeByIdResponse_QNAME = new QName("http://jaxws.howtodoinjava.com/", "updateEmployeeByIdResponse");
    private final static QName _EmployeeList_QNAME = new QName("http://jaxws.howtodoinjava.com/", "employeeList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hpc.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmployeeById }
     * 
     */
    public DeleteEmployeeById createDeleteEmployeeById() {
        return new DeleteEmployeeById();
    }

    /**
     * Create an instance of {@link DeleteEmployeeByIdResponse }
     * 
     */
    public DeleteEmployeeByIdResponse createDeleteEmployeeByIdResponse() {
        return new DeleteEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link GetMsgResponse }
     * 
     */
    public GetMsgResponse createGetMsgResponse() {
        return new GetMsgResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployeeById }
     * 
     */
    public UpdateEmployeeById createUpdateEmployeeById() {
        return new UpdateEmployeeById();
    }

    /**
     * Create an instance of {@link GetMsg }
     * 
     */
    public GetMsg createGetMsg() {
        return new GetMsg();
    }

    /**
     * Create an instance of {@link URISyntaxException }
     * 
     */
    public URISyntaxException createURISyntaxException() {
        return new URISyntaxException();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link UpdateEmployeeByIdResponse }
     * 
     */
    public UpdateEmployeeByIdResponse createUpdateEmployeeByIdResponse() {
        return new UpdateEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URISyntaxException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "URISyntaxException")
    public JAXBElement<URISyntaxException> createURISyntaxException(URISyntaxException value) {
        return new JAXBElement<URISyntaxException>(_URISyntaxException_QNAME, URISyntaxException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "deleteEmployeeByIdResponse")
    public JAXBElement<DeleteEmployeeByIdResponse> createDeleteEmployeeByIdResponse(DeleteEmployeeByIdResponse value) {
        return new JAXBElement<DeleteEmployeeByIdResponse>(_DeleteEmployeeByIdResponse_QNAME, DeleteEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "getMsgResponse")
    public JAXBElement<GetMsgResponse> createGetMsgResponse(GetMsgResponse value) {
        return new JAXBElement<GetMsgResponse>(_GetMsgResponse_QNAME, GetMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "updateEmployeeById")
    public JAXBElement<UpdateEmployeeById> createUpdateEmployeeById(UpdateEmployeeById value) {
        return new JAXBElement<UpdateEmployeeById>(_UpdateEmployeeById_QNAME, UpdateEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "getMsg")
    public JAXBElement<GetMsg> createGetMsg(GetMsg value) {
        return new JAXBElement<GetMsg>(_GetMsg_QNAME, GetMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "deleteEmployeeById")
    public JAXBElement<DeleteEmployeeById> createDeleteEmployeeById(DeleteEmployeeById value) {
        return new JAXBElement<DeleteEmployeeById>(_DeleteEmployeeById_QNAME, DeleteEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "updateEmployeeByIdResponse")
    public JAXBElement<UpdateEmployeeByIdResponse> createUpdateEmployeeByIdResponse(UpdateEmployeeByIdResponse value) {
        return new JAXBElement<UpdateEmployeeByIdResponse>(_UpdateEmployeeByIdResponse_QNAME, UpdateEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.howtodoinjava.com/", name = "employeeList")
    public JAXBElement<Employees> createEmployeeList(Employees value) {
        return new JAXBElement<Employees>(_EmployeeList_QNAME, Employees.class, null, value);
    }

}
