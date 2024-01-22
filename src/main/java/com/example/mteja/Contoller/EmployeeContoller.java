package com.example.mteja.Contoller;

import com.example.mteja.Model.Employee;
import com.example.mteja.Service.EmployeeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mteja/users")
public class EmployeeContoller {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getUsers(){
        List<Employee> employees = employeeService.getEmployees();
        return new ResponseEntity(employees, HttpStatus.OK);
    }
    @GetMapping("/{userID}")
    public ResponseEntity<Employee> getUser(@PathVariable Long userID){
        Optional<Employee> employee = employeeService.getEmployeeById(userID);
        if (employee.isPresent()){
            return new ResponseEntity(employee.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addUser")
    public ResponseEntity<Employee> addUser(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.addEmployee(employee), HttpStatus.OK);
    }

    @PutMapping("{userID}")
    public ResponseEntity updateUser(@RequestBody Employee employee,@PathVariable Long userID){

        return new ResponseEntity(employeeService.updateEmployee(employee,userID),HttpStatus.OK);
    }
    @DeleteMapping("{userID}")
    public ResponseEntity deleteUserById(@PathVariable Long userID){
        employeeService.deleteEmployeeById(userID);
        return new ResponseEntity("User Deleted successfully",HttpStatus.OK);
    }
}
