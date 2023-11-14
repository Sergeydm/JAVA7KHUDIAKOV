package exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            performOperation(1);
        } catch (CustomException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }

        try {
            performOperation(-1);
        } catch (CustomException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }
    }

    public static void performOperation(int value) throws CustomException {
        if (value > 0) throw new CustomException("Число " + value + " больше "+ 0);
        else if (value < 10) throw new CustomException("Число " + value + " меньше "+ 10);
        System.out.println("Готово");
    }
}
