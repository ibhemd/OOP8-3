public class HexaDecimal implements Number {

    private String hex;
    public static String testing;

    // Constructor
    public HexaDecimal(String input) {
        hex = input;
    }

    public int toIntValue() {
        System.out.print("Input: " + hex + " || ");
        int result = 0;
        int counter = hex.length();
        for (int i = 0; i < hex.length(); i++) {
            if ((hex.charAt(i) + 0) >= 48 && (hex.charAt(i) + 0) <= 57) {
                result += (hex.charAt(i) -48) * Math.pow(16, counter-1);
                counter -= 1;
            } else if ((hex.charAt(i) + 0) >= 65 && (hex.charAt(i) + 0) <= 70) {
                result += (hex.charAt(i) -55) * Math.pow(16, counter-1);
                counter -= 1;
            }
        }
        System.out.println("toIntValue: " + result);
        return result;
    }

    public void fromIntValue(int value) {
        System.out.print("Input: " + value + " || ");
        String result = "";
        if (value <= 0) {
            result = "0";
        } else {
            while (value > 0) {
                int temp = value % 16;
                if (temp <= 9) {
                    result = temp + result;
                } else {
                    temp += 55;
                    result = (char) temp + result;
                }
                value /= 16;
            }
        }
        System.out.println("fromIntValue: " + result);
        this.hex = result;
        testing = result;
    }

    public static void main(String[] args) {

        // declare test variables
        HexaDecimal alpha = new HexaDecimal("52B");
        HexaDecimal beta = new HexaDecimal("2A1");

        // hex to dec
        System.out.println("\nHexadecimal to Decimal:");
        alpha.toIntValue();
        beta.toIntValue();

        // dec to hex
        System.out.println("\nDecimal to Hexadecimal:");
        alpha.fromIntValue(1000);
        beta.fromIntValue(42);

        // add
        System.out.println("\nAdd 500, 250 :");
        alpha = new HexaDecimal("1F4");
        beta = new HexaDecimal("FA");
        alpha.add(beta);

        System.out.println("\nAdd 300, 125 :");
        alpha.fromIntValue(300);
        beta.fromIntValue(125);
        alpha.add(beta);

        // subtract
        System.out.println("\nSubstract 420, 135 :");
        alpha.fromIntValue(420);
        beta.fromIntValue(135);
        alpha.subtract(beta);

        System.out.println("\nSubstract 32, 146 :");
        alpha.fromIntValue(32);
        beta.fromIntValue(146);
        alpha.subtract(beta);

        // multiply
        System.out.println("\nMultiply 69, 69 :");
        alpha.fromIntValue(69);
        alpha.multiply(alpha);

        System.out.println("\nMultiply 27, 27 :");
        beta.fromIntValue(27);
        beta.multiply(beta);

        // divide
        System.out.println("\nDivide 90, 15 :");
        alpha.fromIntValue(90);
        beta.fromIntValue(15);
        alpha.divide(beta);

        System.out.println("\nDivide 100, 10 :");
        alpha.fromIntValue(100);
        beta.fromIntValue(10);
        alpha.divide(beta);

    }
}
