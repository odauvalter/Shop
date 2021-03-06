package odauvalter.training.java.shop.service;

import odauvalter.training.java.shop.Interfaces.DepartmentInterface;
import odauvalter.training.java.shop.Interfaces.EmployeeInterface;
import odauvalter.training.java.shop.department.BaseDepartment;

public abstract class BaseEmployee implements EmployeeInterface{

    private String name;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department){
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free){
        this.free = free;
    }
}
