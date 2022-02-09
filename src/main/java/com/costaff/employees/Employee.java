package com.costaff.employees;

public class Employee {
    private int eid;
    private String name;
    private int salary;
    private Address address;
    private int depid;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                ", depid=" + depid +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public Employee(int eid, String name, int salary, Address address, int depid) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.depid = depid;
    }
}
