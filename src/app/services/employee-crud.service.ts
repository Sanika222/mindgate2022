import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../pojo/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCRUDService {
  baseUrl: string="http://localhost:8080/employeecrud/employee";
  constructor(private http:HttpClient) {}

    getAllEmployees():Observable<Employee[]>{
      return this.http.get<Employee[]>(this.baseUrl);
    }

    deleteEmployee(employeeId:number):Observable<boolean>{
      console.log("In delete employee" + employeeId);
      return this.http.delete<boolean>(this.baseUrl + '/' +employeeId);

    }
    updateEmployee(employee:Employee):Observable<boolean>{
      return this.http.put<boolean>(this.baseUrl,employee);
    }


    getSingleEmployee(employeeId:number):Observable<Employee>{
      console.log('in getSingleEmployee()')
      return this.http.get<Employee>(this.baseUrl +'/' + employeeId);
    }
    
    addEmployee(employee:Employee):Observable<boolean>{
      console.log("in employeeCRUD service");
      console.log(employee);
      return this.http.post<boolean>(this.baseUrl,employee);
      console.log("EmployeeCRUDService end");
    }
  }

