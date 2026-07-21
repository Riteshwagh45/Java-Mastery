# 🔷 Abstraction & Interface in Java

## 📖 Overview

**Abstraction** is one of the four fundamental pillars of Object-Oriented Programming (OOP). It focuses on **hiding implementation details** while exposing only the essential functionality to the user.

Instead of worrying about *how* an operation is performed, abstraction allows us to focus on *what* the object can do.

Java provides two ways to achieve abstraction:

- **Abstract Class**
- **Interface**

---

# 🎯 Learning Objectives

This module covers:

- Why Abstraction is needed
- Abstract Classes
- Abstract Methods
- Concrete Methods in Abstract Classes
- Constructors in Abstract Classes
- Real-World Abstraction Examples
- Abstract Class vs Interface
- Interface Fundamentals

---

# 📂 Folder Structure

```text
Abstraction
│
├── WhyAbstraction
├── AbstractClass
├── AbstractMethod
├── ConcreteMethods
├── ConstructorInAbstractClass
├── RealWorldExample
└── Abstraction_vs_Interface
```

---

# 🔹 What is Abstraction?

Abstraction is the process of **showing only the necessary features** while **hiding the internal implementation**.

### Real-Life Example

When you drive a car:

- You use the steering wheel
- You press the accelerator
- You apply the brakes

You don't need to know how the engine, transmission, or fuel injection system works internally.

That's **Abstraction**.

---

# 🔹 Abstract Class

An **abstract class** is a partially implemented class that cannot be instantiated directly.

It can contain:

- Abstract Methods
- Concrete Methods
- Constructors
- Variables
- Static Methods
- Final Methods

Used when multiple subclasses share common state and behavior.

Example:

```java
abstract class Vehicle {

    abstract void startEngine();

    void stop() {
        System.out.println("Vehicle Stopped");
    }

}
```

---

# 🔹 Abstract Method

An abstract method contains **only the declaration** and **no implementation**.

```java
abstract void calculateSalary();
```

Every concrete subclass **must implement** the abstract method.

This creates a common contract for all child classes.

---

# 🔹 Concrete Methods

Abstract classes can also contain normal methods.

```java
public void companyName() {
    System.out.println("OpenAI");
}
```

Concrete methods allow code reuse and reduce duplication across subclasses.

---

# 🔹 Constructor in Abstract Class

Although an abstract class cannot be instantiated, it **can have constructors**.

The constructor executes whenever a child object is created.

Execution Order:

```text
Parent Constructor
        ↓
Child Constructor
```

This is useful for initializing common data shared by all subclasses.

---

# 🔹 Real World Use Cases

Abstraction is heavily used in:

- Banking Systems
- Payment Gateways
- E-Commerce Applications
- Employee Management Systems
- Hospital Management Systems
- Spring Framework
- Hibernate
- JDBC Drivers

---

# 🔹 Interface

An **Interface** defines a contract that classes agree to implement.

It focuses on **behavior** rather than shared implementation.

Example:

```java
interface MusicPlayer {

    void playMusic();

}
```

Interfaces are ideal when unrelated classes share the same capability.

Examples:

- Flyable
- Printable
- Runnable
- Serializable
- Cloneable

---

# 🧠 IS-A vs CAN-DO

### Abstract Class

Represents an **IS-A** relationship.

```text
Car
  │
  ▼
Vehicle
```

A Car **is a** Vehicle.

---

### Interface

Represents a **CAN-DO** relationship.

```text
Car
  │
  ▼
MusicPlayer
```

A Car **can play music**.

---

# 🚀 Why Use Abstraction?

- Hides unnecessary implementation details
- Improves security
- Reduces code duplication
- Encourages clean architecture
- Improves maintainability
- Supports runtime polymorphism
- Makes applications easier to extend

---

# 💡 Interview Points

✔ Abstract classes can have constructors.

✔ Abstract classes can contain both abstract and concrete methods.

✔ Interfaces support multiple inheritance.

✔ A class can extend only one abstract class but implement multiple interfaces.

✔ Abstract methods must be implemented by the first concrete subclass.

✔ Interfaces define behavior, while abstract classes provide common implementation.

---

# 📊 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|----------|----------------|-----------|
| Keyword | `abstract class` | `interface` |
| Constructor | ✅ Yes | ❌ No |
| Object Creation | ❌ No | ❌ No |
| Variables | Instance + Static + Final | `public static final` only |
| Methods | Abstract + Concrete | Abstract, Default, Static (Java 8+) |
| Inheritance | `extends` | `implements` |
| Multiple Inheritance | ❌ Not Supported | ✅ Supported |
| Access Modifiers | Any | Methods are `public` by default |
| State | Can store object state | Cannot store object state |
| Best Used For | Shared implementation | Common capability / contract |

---

# 🎯 Key Takeaway

- **Abstract Class** → Represents **what an object IS**.
- **Interface** → Represents **what an object CAN DO**.

Use an **Abstract Class** when classes share common state and implementation.

Use an **Interface** when different classes share common behavior.

Understanding the difference between these two is essential for writing scalable, maintainable, and interview-ready Java applications.