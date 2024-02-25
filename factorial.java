public static double factorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scanner.nextInt();

    double result = 1;
    for (int i = 1; i <= num; i++) {
        result *= i;
    }

    return result;
}