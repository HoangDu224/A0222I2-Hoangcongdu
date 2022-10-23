public class Calculator {
    public float calculate(float a, float b, String operator) {
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
                    System.out.println("Khong the chia cho 0");

                }

        }
        return 0;
    }
}


