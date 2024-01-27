package com.muendo.mteja.Contoller;

import com.muendo.mteja.Model.Employee;
import com.muendo.mteja.Service.EmployeeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mteja/users")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getUsers(){
        List<Employee> employees = employeeService.getEmployees();
        return new ResponseEntity(employees, HttpStatus.OK);
    }
    @GetMapping("/{employeeID}")
    public ResponseEntity<Employee> getUser(@PathVariable Long employeeID){
        Optional<Employee> employee = employeeService.getEmployeeById(employeeID);
        if (employee.isPresent()){
            return new ResponseEntity(employee.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addUser(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.addEmployee(employee), HttpStatus.OK);
    }

    @PutMapping("{employeeID}")
    public ResponseEntity updateUser(@RequestBody Employee employee,@PathVariable Long employeeID){

        return new ResponseEntity(employeeService.updateEmployee(employee,employeeID),HttpStatus.OK);
    }
    @DeleteMapping("{employeeID}")
    public ResponseEntity deleteUserById(@PathVariable Long employeeID){
        employeeService.deleteEmployeeById(employeeID);
        return new ResponseEntity("User Deleted successfully",HttpStatus.OK);
    }
}
