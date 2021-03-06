package odauvalter.training.java.shop.department;

import odauvalter.training.java.shop.Interfaces.DepartmentInterface;
import odauvalter.training.java.shop.Interfaces.EmployeeInterface;
import odauvalter.training.java.shop.Interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class BaseDepartment implements DepartmentInterface{

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }
}
