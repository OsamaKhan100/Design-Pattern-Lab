/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Composite.Labwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Director extends BaseEmployee{
    List<IEmployee> subordinatesList;

    public Director(String name, int salary) {
        super(name, salary);
        subordinatesList=new LinkedList<>();
    }

    @Override
    public void giveBonus(int percent) {
        System.out.println("Director "+name+" got "+(percent*salary/100)+" bonus");
    }

    public void addSubordinate(IEmployee subordinate){
        subordinatesList.add(subordinate);
    }

    @Override
    public List<IEmployee> getSubordinatesList() {
        return subordinatesList;
    }

    @Override
    public void update(String change){
        System.out.println("Director "+name+" got notification from University of change:"+change);
    }

    @Override
    public String toString() {
        return "\nDirector{" +
                "\nName='" + name + '\'' +
                ",\nSalary=" + salary +
                ",\nSubordinatesList=" + subordinatesList +
                "\n}";
    }
}