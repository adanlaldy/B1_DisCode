package exceptions;

public class Only_numbers extends Exception {
    public Only_numbers(String s) {
        super(s);
    }

    public static void check_input_3_max(int input) throws Only_numbers {
        if (!(input > 0 && input < 4)) {
            throw new Only_numbers("Enter a number between 1 and 3");
        }
    }

    public static void check_input_4_max(int input) throws Only_numbers {
        if (!(input > 0 && input < 5)) {
            throw new Only_numbers("Enter a number between 1 and 4");
        }
    }

    public static void check_input_5_max(int input) throws Only_numbers {
        if (!(input > 0 && input < 6)) {
            throw new Only_numbers("Enter a number between 1 and 5");
        }
    }
}
