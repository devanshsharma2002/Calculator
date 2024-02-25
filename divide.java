public static double divide() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerator:");
    double numerator = scanner.nextDouble();
    System.out.println("Enter denominator:");
    double denominator = scanner.nextDouble();

    if (denominator != 0) {
        return numerator / denominator;
    } else {
        System.out.println("Cannot divide by zero. Returning 0.");
        return 0.0;
    }
}