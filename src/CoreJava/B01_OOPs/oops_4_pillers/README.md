# 🏛️ Four Pillars of Object-Oriented Programming (OOP)

## 📖 Overview

Object-Oriented Programming (OOP) is a programming paradigm that models software using **objects** instead of functions and procedures.

An object combines **data (fields)** and **behavior (methods)** into a single unit, making applications more modular, reusable, secure, and easier to maintain.

Java is a fully Object-Oriented language built around four core principles known as the **Four Pillars of OOP**.

---

# 🎯 Learning Objectives

This module covers:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

By the end of this section, you'll understand how real-world Java applications are designed using these four principles.

---

# 📂 Folder Structure

```text
oops_4_pillers
│
├── Encapsulation
├── Inheritance
├── Polymorphism
└── Abstraction
```

---

# 🧠 The Four Pillars

## 🔒 1. Encapsulation

> **Wrapping data and methods together while protecting data from unauthorized access.**

Encapsulation is achieved using:

- Private variables
- Public getters/setters
- Access Modifiers

### Benefits

- Data Hiding
- Better Security
- Controlled Access
- Easy Maintenance

Example:

```java
class Student {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
```

---

## 🧬 2. Inheritance

> **Acquiring properties and behaviors from another class.**

Inheritance promotes **code reuse** and establishes an **IS-A relationship**.

Example:

```text
Animal
   ▲
   │
 Dog
```

### Types Covered

- Single
- Multilevel
- Hierarchical

### Benefits

- Code Reusability
- Easy Maintenance
- Runtime Polymorphism

---

## 🎭 3. Polymorphism

> **One interface, many implementations.**

The same method name behaves differently depending on the object or parameters.

### Types

### Compile-Time Polymorphism

- Method Overloading

```java
add(int,int)
add(double,double)
```

---

### Runtime Polymorphism

- Method Overriding

```java
Animal animal = new Dog();
animal.sound();
```

The actual method is decided at runtime.

---

## 🎯 4. Abstraction

> **Showing only essential information while hiding implementation details.**

Java provides abstraction using:

- Abstract Classes
- Interfaces

Example:

```java
abstract class Vehicle {

    abstract void start();

}
```

The user knows **what** the object can do, not **how** it does it.

---

# 🌍 Real-World Example

Imagine an **Online Banking System**.

### Encapsulation

Customer account details are private.

### Inheritance

SavingsAccount and CurrentAccount inherit from BankAccount.

### Polymorphism

Different account types calculate interest differently.

### Abstraction

Customers simply click **Transfer Money** without knowing the internal banking process.

All four pillars work together to build scalable applications.

---

# 🚀 Advantages of OOP

- Code Reusability
- Better Security
- Easy Maintenance
- Low Coupling
- High Cohesion
- Scalability
- Flexibility
- Real-World Modeling
- Easier Testing
- Cleaner Architecture

---

# 📊 Quick Comparison

| Pillar | Purpose | Keyword |
|---------|---------|----------|
| Encapsulation | Protect Data | `private`, Getters, Setters |
| Inheritance | Reuse Code | `extends` |
| Polymorphism | Multiple Behaviors | Overloading / Overriding |
| Abstraction | Hide Complexity | `abstract`, `interface` |

---

# 🧩 How They Work Together

```text
               Object-Oriented Programming
                         │
     ┌───────────────────┼───────────────────┐
     │                   │                   │
Encapsulation      Inheritance        Polymorphism
     │                   │                   │
     └───────────────────┼───────────────────┘
                         │
                    Abstraction
                         │
             Clean & Scalable Software
```

---

# 💡 Interview Points

✅ Java supports all four OOP pillars.

✅ Encapsulation protects data.

✅ Inheritance promotes code reuse.

✅ Polymorphism allows one interface to have multiple implementations.

✅ Abstraction hides implementation details.

✅ These four concepts are the foundation of frameworks like **Spring Boot**, **Hibernate**, **Android**, and many enterprise Java applications.

---

# 🎯 Key Takeaway

The Four Pillars of OOP are not isolated concepts—they work together to create software that is:

- Secure
- Reusable
- Flexible
- Maintainable
- Scalable

Mastering these pillars is essential for becoming a strong Java developer and for building production-quality applications.