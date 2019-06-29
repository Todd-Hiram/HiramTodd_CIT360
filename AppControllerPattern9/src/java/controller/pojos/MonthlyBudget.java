/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pojos;

/**
 *
 * @author hiramtodd
 */
public class MonthlyBudget {
    
    public MonthlyBudget() {
    }

    private double monthlyIncome = 0;
    private double budgetedLiving = 0;
    private double actualLiving = 0;
    private double actualTaxes = 0;
    private double actualTithing = 0;
    private double actualOther = 0;
    private double budgetedTaxes = 0;
    private double budgetedTithing = 0;
    private double budgetedOther = 0;
    private double actualDiff = 0;
    private double budgetedDiff = 0;

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getBudgetedLiving() {
        return budgetedLiving;
    }

    public void setBudgetedLiving(double budgetedLiving) {
        this.budgetedLiving = budgetedLiving;
    }

    public double getActualLiving() {
        return actualLiving;
    }

    public void setActualLiving(double actualLiving) {
        this.actualLiving = actualLiving;
    }

    public double getActualTaxes() {
        return actualTaxes;
    }

    public void setActualTaxes(double actualTaxes) {
        this.actualTaxes = actualTaxes;
    }

    public double getActualTithing() {
        return actualTithing;
    }

    public void setActualTithing(double actualTithing) {
        this.actualTithing = actualTithing;
    }

    public double getActualOther() {
        return actualOther;
    }

    public void setActualOther(double actualOther) {
        this.actualOther = actualOther;
    }

    public double getBudgetedTaxes() {
        return budgetedTaxes;
    }

    public void setBudgetedTaxes(double budgetedTaxes) {
        this.budgetedTaxes = budgetedTaxes;
    }

    public double getBudgetedTithing() {
        return budgetedTithing;
    }

    public void setBudgetedTithing(double budgetedTithing) {
        this.budgetedTithing = budgetedTithing;
    }

    public double getBudgetedOther() {
        return budgetedOther;
    }

    public void setBudgetedOther(double budgetedOther) {
        this.budgetedOther = budgetedOther;
    }

    public double getActualDiff() {
        return actualDiff;
    }

    public void setActualDiff(double actualDiff) {
        this.actualDiff = actualDiff;
    }

    public double getBudgetedDiff() {
        return budgetedDiff;
    }

    public void setBudgetedDiff(double budgetedDiff) {
        this.budgetedDiff = budgetedDiff;
    }
    
}
