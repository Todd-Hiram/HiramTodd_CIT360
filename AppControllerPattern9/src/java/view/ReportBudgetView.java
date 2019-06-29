/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.pojos.MonthlyBudget;
import java.util.Map;

/**
 *
 * @author hiramtodd
 */
public class ReportBudgetView implements IView {
    
    private void displayHeaderRow() {
        System.out.format("\t%-15s %15s %15s\n", "Item", "Budget   ", "Actual   ");
    }

    private void displaySeparationRow() {
        String sep = "=".repeat(15);
        System.out.format("\t%s %s %s\n", sep, sep, sep);
    }

    private void displayBudgetRow(String title, double budgeted, double actual) {
        System.out.format("\t%-15s %15.2f %15.2f\n", title, budgeted, actual);
    }

    @Override
    public void render(Map<String, Object> data) {
        MonthlyBudget budget = (MonthlyBudget) data.get("budget");
        System.out.println("\nThe following is a report on your monthly expenses\n");
        displayHeaderRow();
        displaySeparationRow();
        displayBudgetRow("Income",
                budget.getMonthlyIncome(), budget.getMonthlyIncome());
        displayBudgetRow("Taxes",
                budget.getBudgetedTaxes(), budget.getActualTaxes());
        displayBudgetRow("Tithing",
                budget.getBudgetedTithing(), budget.getActualTithing());
        displayBudgetRow("Living",
                budget.getBudgetedLiving(), budget.getActualLiving());
        displayBudgetRow("Other",
                budget.getBudgetedOther(), budget.getActualOther());
        displaySeparationRow();
        displayBudgetRow("Difference",
                budget.getBudgetedDiff(), budget.getActualDiff());
    }
    
}
