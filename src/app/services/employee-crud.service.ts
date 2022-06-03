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
    
    addEmployee(employee:Employee):Observable<boolean>{
      console.log("in employeeCRUD service");
      console.log(employee);
      return this.http.post<boolean>(this.baseUrl,employee);
      console.log("EmployeeCRUDService end");
    }
  }

