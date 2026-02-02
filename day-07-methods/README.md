## 🚀 Day 07: Methods, Modularity & Calculator Power 🧮⚡

### Welcome to Day 7 of my 🔥 Full-Stack Java Developer Journey!

Today was a huge mindset shift: I stopped writing long, messy code and started breaking logic into methods that actually make sense.

### The result?

A modular Java calculator where each operation lives in its own method like a well-behaved citizen 😌🏡.

## 🧩 Mini Project: Modular Calculator Using Methods 👾

### 📌 Overview

- This project is a console-based calculator that:

    - Uses separate methods for each operation

    - Keeps main() clean and readable

    - Handles division-by-zero safely 🚫

    - Allows the user to perform multiple calculations in one run

- This is the same structure used in real-world Java applications


## 🧠 Concepts Practiced Today

### 🧩 Methods & Modularity

- Creating reusable methods (add, subtract, multiply, divide)

- Understanding return values vs printing

- Using static methods correctly

- Separating logic into different classes

## 🧠 Control Flow

- switch statements for operator selection

- Infinite while(true) loop with clean exit conditions

- Input validation basics

## ⚠️ Error Handling

- Preventing division by zero

- Using Double.NaN as an error indicator


## ⚙️ How the Program Works

### 🔹 User Flow

1. User enters the first number

2. User chooses an operator (+ - * /)

3. User enters the second number

4. Program calls the correct method from the Calculator class

5. Result is printed

6. User decides whether to continue or exit

## 🧠 Method Breakdown

```
Calculator.add(a, b);

Calculator.subtract(a, b);

Calculator.multiply(a, b);

Calculator.divide(a, b);

```

- Each method:

    - Does one job

    - Returns a result

    - Keeps main() clean and readable

- This is textbook modular design 📚✨

### 🛑 Division-by-Zero Protection

```
return Double.NaN;

```

- Prevents program crashes

- Signals an invalid calculation

- Mimics how real APIs handle invalid numeric results

🔥 Very professional move for Day 7.


## 🗂️ Project Structure

```
/day-07-methods-calculator/
├── README.md
├── Calculator.java
└── CalculatorMethods.java

```

- Calculator → logic & math

- CalculatorMethods → user interaction & flow

- Clean separation = clean thinking 🧼🧠

## 🧠 Key Lessons Learned

- Why methods make code reusable

- How classes can work together

- Why main() should not do everything

- How return values control program flow

- How to design programs that scale


## 🔥 Day 7 Takeaway

``` “Good code isn’t shorter — it’s organized.” ```

- Today I learned how to:

- Think in reusable blocks

- Design cleaner programs

- Read my own code without crying 😭➡️😌

- This is the foundation of:

    - Object-Oriented Programming 🧱

    - Backend services ⚙️

    - Large-scale Java applications 🚀


### 📌 Next Up:

Day 08 → Method Overloading & Smarter APIs 🧠⚡

Same method name. Different inputs. Java starts feeling slick 😎


```
Built with ☕, methods, and confidence by BuhleMtshali

```