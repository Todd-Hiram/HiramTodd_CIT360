package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import controller.pojos.MonthlyBudget;

/**
 *
 * @author hiramtodd
 */
public class InputDataView implements IView {
    
    private static double askValue(String prompt) {
        double value = 0;
        boolean inputValid = false;
        while (!inputValid) {
            try {
                System.out.printf("\t%s: ", prompt);
                Scanner scan = new Scanner(System.in);
                value = scan.nextDouble();
                if (value >= 0) {
                    inputValid = true;
                } else {
                    System.err.println("Please enter positive number.");
                }
            } catch (InputMismatchException ex) {
                System.err.println("Please enter numeric value.");
            }
        }
        return value;
    }

    private static double getIncome() {
        return askValue("Your monthly income");
    }

    private static double getBudgetedLiving() {
        return askValue("Your budgeted living expenses");
    }

    private static double getActualLiving() {
        return askValue("Your actual living expenses");
    }

    private static double getActualTaxes() {
        return askValue("Your actual taxes withheld");
    }

    private static double getActualTithing() {
        return askValue("Your actual tithe offerings");
    }

    private static double getActualOther() {
        return askValue("Your actual other expenses");
    }

    @Override
    public void render(Map<String, Object> data) {
        System.out.println("This program keeps track of your monthly budget.");
        System.out.println("Please enter the following:");
        MonthlyBudget monthlyBudget = new MonthlyBudget();
        monthlyBudget.setMonthlyIncome(getIncome());
        monthlyBudget.setBudgetedLiving(getBudgetedLiving());
        monthlyBudget.setActualLiving(getActualLiving());
        monthlyBudget.setActualTaxes(getActualTaxes());
        monthlyBudget.setActualTithing(getActualTithing());
        monthlyBudget.setActualOther(getActualOther());
        Map<String, Object> map = new HashMap<>();
        map.put("budget", monthlyBudget);
        Router.get("reportBudget", map);
    }
    
}
