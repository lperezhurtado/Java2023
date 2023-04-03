
public class C003SistemasNumericos {
    public static void main(String[] args) {
        int num1 = 1500;

        System.out.println(num1 + " en binario es: " + Integer.toBinaryString(num1));
        System.out.println(0b10111011100);

        System.out.println(num1 + " en octal es: " + Integer.toOctalString(num1));
        System.out.println(02734);

        System.out.println(num1 + " en hexadecimal es: " + Integer.toHexString(num1));
        System.out.println(0x5dc);
    }
}
