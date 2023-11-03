/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Strategy.Calculater.Strategy;

/**
 *
 * @author fa20-bse-047
 */
public class OperationSubtract extends ComputationChainHandler {
    private ComputationChainHandler next;

    public OperationSubtract() {
        this.setNext(null);
    }

    public OperationSubtract(ComputationChainHandler next) {
        this.setNext(next);
    }

    public int doOperation(int num1, int num2) {
        System.out.print("Subtraction: " + num1 + " - " + num2 + " = ");
        return num1 - num2;
    }

    public void setNext(ComputationChainHandler handler) {
        this.next = handler;
    }

    public int computeInRange(int num1, int num2) {
        boolean num1InRange = num1 >= 100 && num1 <= 1000,
                num2InRange = num2 >= 100 && num2 <= 1000;
        if (num1InRange && num2InRange) {
            return doOperation(num1, num2);
        } else if (next != null) {
            return next.computeInRange(num1, num2);
        } else {
            System.out.println("No handler For this range: " + num1 + "," + num2);
            return Integer.MIN_VALUE;
        }
    }

}