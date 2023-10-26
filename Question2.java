public class CheckNthBit {
    public static void main(String[] args) {
        int num = 12;
        int n = 2;
        int bitStatus = (num >> n) & 1;
        if (bitStatus == 1) {
            System.out.println("The " + n + "th bit of " + num + " is SET (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is NOT SET (0).");
        }
    }
}
