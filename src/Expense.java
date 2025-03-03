public class Expense {
    private final String category;
    private final double amount;
    private final String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "[" + category + "] $" + amount + " - " + description;
    }
}