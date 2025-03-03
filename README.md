# Expense Tracker

## Purpose
- To get familier with Collections, Stream, Lamdas and Functional Programming (Java-8)

## Overview
The **Expense Tracker** is a simple console-based Java application that allows users to record, view, and categorize their expenses. It provides an intuitive interface for managing personal finances.

## Features
- **Add Expense**: Users can input an expense by specifying its category, amount, and description.
- **View All Expenses**: Displays a list of all recorded expenses.
- **View Expenses by Category**: Filters expenses based on a specific category.
- **Calculate Total Expenses**: Computes the total sum of all expenses.
- **Exit**: Allows users to exit the application gracefully.

## Technologies Used
- **Java**: The primary programming language.
- **Java Collections (ArrayList)**: Used to store and manage expenses.
- **Java Streams & Functional Interfaces**: Used for filtering expenses by category.
- **Scanner Class**: Used for user input handling.

## Code Structure
```
expense-tracker/
│── Main.java             # Entry point of the application
│── Expense.java          # Expense class representing an individual expense
│── ExpenseTracker.java   # Handles expense management and user interaction
```

## Example Usage
```
Expense Tracker Menu:
1. Add Expense
2. View All Expenses
3. View Expenses by Category
4. Calculate Total Expenses
5. Exit
Choose an option: 1

Enter category: Food
Enter amount: 15.50
Enter description: Lunch at restaurant
Expense added successfully.
```

