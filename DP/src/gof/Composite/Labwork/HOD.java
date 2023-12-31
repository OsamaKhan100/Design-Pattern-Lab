/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Composite.Labwork;

/**
 *
 * @author fa20-bse-047
 */

import java.util.LinkedList;
import java.util.List;

public class HOD extends BaseEmployee{
    List<IEmployee> subordinatesList;
    String department;

    public HOD(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
        subordinatesList=new LinkedList<>();
    }

    @Override
    public void giveBonus(int percent) {
        System.out.println("HOD "+name+" got "+(percent*salary/100)+" bonus");
    }

    public void addSubordinate(IEmployee subordinate){
        subordinatesList.add(subordinate);
    }

    public List<IEmployee> getSubordinatesList(){
        return subordinatesList;
    }

    @Override
    public void update(String change){
        System.out.println("HOD "+name+" got notification from University of change:"+change);
    }
    @Override
    public String toString() {
        return "\nHOD{" +
                "\nName='" + name + '\'' +
                ",\nDepartment='" + department + '\'' +
                ",\nSalary=" + salary +
                ",\nSubordinatesList=" + subordinatesList +
                "\n} ";
    }
}