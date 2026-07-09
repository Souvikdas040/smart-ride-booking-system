# 🚖 Smart Ride Booking System

A **console-based Core Java application** that simulates a ride-booking platform. The project demonstrates Object-Oriented Programming (OOP) principles by allowing users to book different ride types, calculate fares dynamically, generate unique ride IDs, manage ride history, and search bookings.

This project was developed to strengthen Core Java concepts such as abstraction, inheritance, polymorphism, collections, exception handling, and modular class design.

---

## 📌 Features

- 🚗 Book **Mini Ride** and **Luxury Ride**
- 🆔 Automatic Ride ID generation
- 💰 Dynamic fare calculation
- 🎁 Discount calculation based on ride conditions
- 📚 Store ride history using `ArrayList`
- 🔍 Search ride using Ride ID
- 📊 Calculate total revenue
- ⚠️ Exception handling for invalid inputs
- 🖥️ Menu-driven console application

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Exception Handling
- Scanner Class

---

## 📚 Java Concepts Demonstrated

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding
- Constructors
- Static Variables
- Dynamic Method Dispatch
- Collections (`ArrayList`)
- Exception Handling
- Loops & Conditional Statements

---

## 📂 Project Structure

```
SmartRideBookingSystem
│
├── src
│   └── smartride
│       ├── Ride.java
│       ├── MiniRide.java
│       ├── LuxuryRide.java
│       ├── RideManager.java
│       └── SmartRideBookingSystem.java
│
└── README.md
```

---

## 🚗 Ride Types

### 🚕 Mini Ride

- ₹12 per kilometer
- ₹80 discount for rides exceeding **20 km**

### 🚘 Luxury Ride

- ₹20 per kilometer
- ₹200 Luxury Comfort Charge
- ₹150 discount if total fare is **₹800 or above**

---

## 📷 Sample Output

```text
========= SMART RIDE BOOKING =========

1. Book Mini Ride
2. Book Luxury Ride
3. View All Rides
4. Search Ride
5. Total Revenue
6. Exit

Enter choice : 1

Customer Name : Souvik
Pickup Location : Asansol
Distance (km): 25

Ride booked successfully!
Ride ID : R1001
Final Fare : ₹220.0
```

---

## 📊 View Ride History

```text
-------------------------------------
Ride ID      : R1001
Customer     : Souvik
Ride Type    : Mini Ride
Pickup       : Asansol
Distance     : 25.0 km
Fare         : ₹220.0
-------------------------------------

-------------------------------------
Ride ID      : R1002
Customer     : Rahul
Ride Type    : Luxury Ride
Pickup       : Kolkata
Distance     : 35.0 km
Fare         : ₹750.0
-------------------------------------
```

---

## 📈 Revenue Summary

```text
Total Bookings : 2
Total Revenue : ₹970.0
```

---

## ⚙️ How to Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/SmartRideBookingSystem.git
```

### 2️⃣ Open the Project

Open the project in:

- Eclipse IDE
- IntelliJ IDEA
- VS Code

### 3️⃣ Compile and Run

Run:

```text
SmartRideBookingSystem.java
```

---

## 🎯 Learning Outcomes

This project helped in understanding:

- Object-Oriented Programming in Java
- Abstract Classes
- Method Overriding
- Java Collections Framework
- Exception Handling
- Menu-driven Console Applications
- Modular Class Design
- Business Logic Implementation

---

## 🚀 Future Enhancements

- Driver Management System
- Customer Login & Registration
- Ride Cancellation
- Multiple Pickup & Drop Locations
- Payment Gateway Simulation
- Ride Status Tracking
- File Handling for Persistent Storage
- MySQL Database Integration using JDBC
- Admin Dashboard
- GUI using Java Swing or JavaFX

---

## 💡 Project Workflow

```text
Start
   │
   ▼
Display Main Menu
   │
   ▼
Book Ride
   │
   ▼
Enter Customer Details
   │
   ▼
Validate Input
   │
   ▼
Generate Ride ID
   │
   ▼
Calculate Fare
   │
   ▼
Store Ride in ArrayList
   │
   ▼
Display Ride Details
   │
   ▼
Search / View History / Revenue
   │
   ▼
Exit
```

---

## 📝 Resume Highlights

This project demonstrates practical implementation of:

- Core Java Programming
- Object-Oriented Programming (OOP)
- Collections Framework
- Exception Handling
- Console-based Application Development
- Software Design Principles
- Business Logic Implementation

---

## 👨‍💻 Author

**Souvik Das**

- 🔗 GitHub: https://github.com/Souvikdas040
- 💼 LinkedIn: https://www.linkedin.com/in/souvikdas040

---

⭐ If you found this project useful, consider giving it a **Star** on GitHub!
