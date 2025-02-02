# **BookMyShow - Java Console Application**

BookMyShow is a terminal-based movie ticket booking system developed in Java. It allows users to browse available movies, select showtimes, and book or cancel tickets. The application now includes a **secure user login system**, ensuring that user credentials are encrypted and protected.

## **Features**

1. **User Login with High Security**:
   - Users must log in with their credentials before accessing the movie booking system. Passwords are stored securely using encryption algorithms.

2. **View List of Movies**:
   - Users can browse through a list of movies currently showing in theaters.

3. **Book Tickets**:
   - After logging in, users can select a movie and showtime to book tickets.

4. **Cancel Bookings**:
   - Users can view their booked tickets and cancel them if necessary.

5. **Manage User Data**:
   - The application stores user login information securely and manages bookings and cancellations efficiently.

6. **Show Available Showtimes**:
   - For each movie, users can see the available time slots before making a booking.

7. **User-friendly Command-line Interface**:
   - The application provides an easy-to-navigate terminal interface for users, guiding them throughout the booking process.

## **Technologies Used**

1. **Java**:
   - The primary programming language used to build this application.

2. **Object-Oriented Programming (OOP) Principles**:
   - **Encapsulation**: Internal data is protected and can only be modified through controlled methods.
   - **Inheritance**: Class hierarchies share common functionalities to avoid code duplication.
   - **Polymorphism**: Enables dynamic decision-making within the application, making it more flexible and modular.

3. **Collections Framework**:
   - Manages lists of movies, showtimes, and bookings for efficient access and modification.

4. **File I/O**:
   - Used for reading and writing user data and booking details to files. The data persists across sessions.

5. **Encryption**:
   - Implements encryption for storing passwords securely. The system uses advanced encryption standards to ensure that user passwords are never stored in plain text.

6. **Exception Handling**:
   - Gracefully handles errors such as invalid inputs, incorrect logins, or issues with data persistence.

## **Installation**

To get started with this project, follow these steps:

### **Step 1: Clone the Repository**

Clone the GitHub repository to your local machine using the following command:

```bash
git clone https://github.com/BubalanShanmugam/BookMyShow.git
```
**step 2: Compile the application:**
```bash
javac BMS.java
```
**step 3:  Run the application:**
```bash   
java BMS
```
# **Usage Instructions**

### **User Registration**:
- On first use, users will be prompted to create a new account. Choose a secure password, which will be encrypted before being stored. The application uses AES (Advanced Encryption Standard) for password encryption to ensure high-level security.

### **Login**:
- Enter your username and password to access the system. If the credentials are correct, you will be granted access to the movie booking system.

### **Booking and Cancelling Tickets**:
- Once logged in, you can select a movie and showtime, then proceed to book or cancel tickets. All changes are saved to your user profile.

### **Data Persistence**:
- Your bookings and cancellations, along with your login credentials (encrypted), are stored and automatically loaded during future sessions.

## **Security Features**

1. **Password Encryption**:
   - The application uses AES encryption to securely store user passwords. Even if someone gains access to the database or files, they will not be able to retrieve your password in plain text.

2. **Secure Login**:
   - During login, the entered password is hashed and compared to the stored encrypted password. Only the correct hash will allow the user to log in successfully.

3. **User Session Management**:
   - User sessions are securely managed, and you will remain logged in until you explicitly log out or close the program.

## **Contact**

For any queries or feedback, contact to:

- **Developer**: Bubalan 
- **Email**: bubalanshanmugam62@gmail.com
- **LinkedIn**: www.linkedin.com/in/bubalan-s-1515a82b0







