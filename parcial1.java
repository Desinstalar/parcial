public class Calculatora {

    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return oprand1 % operand2;
            case '^':
                return Math.pow(operand1,operand2);
        }

    
        return 0;
    }
}
