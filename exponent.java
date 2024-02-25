
public static double exponentiation() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter base:");
    double base = scanner.nextDouble();
    System.out.println("Enter exponent:");
    double exponent = scanner.nextDouble();
    return Math.pow(base, exponent);
}