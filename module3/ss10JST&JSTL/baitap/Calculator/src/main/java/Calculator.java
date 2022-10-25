public class Calculator {
    public int calculate(int a, int b, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "x":
                return a * b;
            case "/":
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    throw new ArithmeticException();

                }

        }
        return 0;
    }
}


