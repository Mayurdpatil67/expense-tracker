import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ExpenseTracker {
    private final List<Expense> expenses = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Expenses by Category");
            System.out.println("4. Calculate Total Expenses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addExpense();
                case 2 -> viewExpenses();
                case 3 -> viewExpensesByCategory();
                case 4 -> calculateTotalExpenses();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void addExpense() {
        System.out.println("Enter category: ");
        String category = scanner.nextLine();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter description:");
        String description = scanner.nextLine();

        expenses.add(new Expense(category, amount, description));
        System.out.println("Expense added successfully.");

        pause();
    }

    private void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses available.");
        } else {
            expenses.forEach(System.out::println);
        }
        pause();
    }

    private void viewExpensesByCategory() {
        System.out.println("Enter category:");
        String category = scanner.nextLine();

        Predicate<Expense> byCategory = e -> e.getCategory().equalsIgnoreCase(category);
        List<Expense> filtered = expenses.stream().filter(byCategory).toList();

        if (filtered.isEmpty()) {
            System.out.println("No expense found for this category.");
        } else {
            filtered.forEach(System.out::println);
        }
        pause();
    }

    private void calculateTotalExpenses() {
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total expenses: $" + total);
        pause();
    }

    private void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}
