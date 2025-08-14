# SmartSync-Inventory-Billing-System

[![Project Status](https://img.shields.io/badge/Status-Completed-brightgreen.svg?style=for-the-badge)](https://github.com/your-username/your-repo-name)
[![Last Commit](https://img.shields.io/github/last-commit/your-username/your-repo-name?style=for-the-badge)](https://github.com/your-username/your-repo-name/commits/main)
[![Open Issues](https://img.shields.io/github/issues/your-username/your-repo-name?style=for-the-badge)](https://github.com/your-username/your-repo-name/issues)
[![License](https://img.shields.io/github/license/your-username/your-repo-name?style=for-the-badge)](./LICENSE)

## Project Description

The **SmartSync Inventory & Billing System** is an all-in-one solution designed to automate and streamline inventory management and billing processes for small to medium-sized businesses. This project integrates both **desktop and mobile platforms**, **developed with Java and Android Studio** respectively, to provide a comprehensive tool for tracking inventory, managing sales, generating invoices, and optimizing business operations.

### **Key Features**
- **Role-Based Access Control (Admin & Staff):** Secure login system with two types of user roles to ensure proper access control.
- **Barcode Scanning Integration:** Facilitates quick and accurate inventory management through barcode scanning, minimizing human error and speeding up the process.
- **Billing System:** Simplifies billing by automatically generating invoices and receipts with itemized details for every sale.
- **Export to Excel:** Allows users to export transaction data and inventory lists to Excel for reporting and analysis.
- **Dark Mode:** Improves user experience with a sleek and customizable dark mode.
- **Offline Capability:** Continue using the application without an internet connection and sync data once back online.
- **Product Management:** Users can add, update, or delete products from the inventory.
- **Real-Time Stock Management:** Stock levels are updated automatically upon sale or purchase.
- **Android Integration:** A fully functional mobile app version that syncs with the desktop application for seamless user experience across platforms.

### **Technology Stack**
- **Java (Desktop Application):** The core programming language used for developing the desktop version of the application.
- **Android Studio (Mobile App):** Android-based mobile application built using Java.
- **MySQL/Room Database:** Back-end database for storing user and product data, supporting both online and offline data handling.
- **ZXing Barcode Scanner Library:** Used for barcode scanning functionality in both desktop and mobile applications.
- **Apache POI Library:** For generating and exporting Excel files from the app.
- **JavaFX (Desktop UI):** For building an interactive and user-friendly graphical interface for the desktop application.
- **Android XML (Mobile UI):** Used for designing and implementing the mobile user interface.

### **Modules**
1. **Login Module:** Handles role-based login for Admin and Staff.
2. **Inventory Management:** Enables adding, updating, and removing products from the inventory, and tracks stock levels.
3. **Billing Module:** Creates invoices and manages transaction history.
4. **Barcode Scanning:** Efficient product lookup using barcode scanning.
5. **Data Export:** Export reports and transaction data to Excel for analysis.
6. **Offline Mode:** Continue working in offline mode and synchronize data when the internet is available.

### **Future Enhancements**
**1. ☁️ Cloud Database Integration**
Shift from local databases to a cloud-based solution (e.g., Firebase, AWS, or Azure SQL) for real-time syncing between desktop and Android applications.

Allow multi-location inventory management with centralized control.

**2. 🔒 Two-Factor Authentication (2FA)**
Strengthen security during login by adding **OTP-based** two-factor authentication using email or SMS.

**3. 💵 Online Payment Integration**
Enable customers to pay bills directly via popular **UPI**, **Paytm**, **Google Pay**, or **credit/debit cards** through the Android app.

**4. 📊 Advanced Analytics Dashboard**
Introduce graphical charts (using libraries like **JFreeChart** for Desktop and **MPAndroidChart** for Android) showing:

Best-selling products

Monthly sales reports

Stock alerts for low inventory

**5. 🌐 Web Portal Development**
Develop a web-based admin dashboard for managing products, staff, sales reports, and customers online.

**6. 📦 Bulk Product Upload**
Allow uploading product lists via **CSV/Excel** files, making inventory setup quicker for large stores.

**7. 📱 Push Notifications (Android)**
Notify staff about **new product additions**, **low stock alerts**, or **important announcements** via in-app notifications.

**8. 🎨 Custom Theme Manager**
Let users choose or create **custom UI** themes apart from Light and Dark mode to personalize their experience.

**9. 🏬 Customer Management System**
Maintain a **customer database**, loyalty points, and generate invoices linked to customer profiles for better service.

**10. 🛠️ Auto Software Updates**
Add an automatic updater that checks for new software versions and patches to ensure users are always on the latest release.


### **Project Objectives**
- Simplify and automate inventory and billing processes.
- Provide a user-friendly interface for efficient business operations.
- Enable businesses to generate and manage data reports seamlessly.
- Optimize customer experience with features like barcode scanning and data export.


## Setup and Run Instructions

This section guides you on how to set up and run the Smart Inventory and Billing System on your local machine.

### Prerequisites

Ensure you have the following software installed:

* **Java Development Kit (JDK):** (Specify the version used, e.g., JDK 11 or later) - You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenAdoptium](https://adoptium.net/).
* **MySQL Server:** (Specify the version used) - Download and install from [MySQL Community Downloads](https://dev.mysql.com/downloads/community/).
* **MySQL Workbench (Optional):** A GUI tool for managing MySQL databases, helpful for setting up the database.

### Installation

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    cd SmartInventoryBillingSystem
    ```
    (Replace the link with your actual repository URL).

2.  **Database Setup:**
    * Ensure your MySQL server is running.
    * You can use MySQL Workbench or the command line to create the database and tables.
    * **Using the provided SQL script:**
        * Navigate to the `Database` directory:
            ```bash
            cd Database
            ```
        * Execute the `schema.sql` script to create the necessary tables. You might need to adjust the script based on your MySQL setup. For example, using the MySQL command line client:
            ```bash
            mysql -u <your_mysql_username> -p <database_name> < schema.sql
            ```
            (Replace `<your_mysql_username>` and `<database_name>` accordingly. You might need to create the database first using `CREATE DATABASE <database_name>;`).
        * (Optional) You can execute `sample_data.sql` to insert some initial data.

3.  **Import Libraries:**
    * The necessary JAR files (e.g., `mysql-connector-java-*.jar`, `itextpdf-*.jar` or `jasperreports-*.jar`) are located in the `SourceCode/lib` directory.
    * If you are using an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse, you need to add these JAR files to your project's dependencies or classpath.

4.  **Configure Database Connection:**
    * Locate the Java source files that handle the database connection (likely in the `com.example.inventory.database` package).
    * Update the database connection details (URL, username, password) within the Java code to match your MySQL server configuration.

### Running the Application

1.  **Using an IDE (Recommended):**
    * Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, NetBeans).
    * Ensure that the JAR files in the `SourceCode/lib` directory are added to the project's build path or dependencies.
    * Locate the main entry point of the application (usually a class with a `main` method, like `Main.java` in the `src/com/example/inventory` package).
    * Run the `Main.java` file to start the application.

2.  **Running from the Command Line:**
    * Navigate to the root directory of the project.
    * Compile the Java source files:
        ```bash
        javac -cp "SourceCode/lib/*:SourceCode/src" SourceCode/src/com/example/inventory/*.java SourceCode/src/com/example/inventory/models/*.java SourceCode/src/com/example/inventory/views/*.java SourceCode/src/com/example/inventory/controllers/*.java SourceCode/src/com/example/inventory/database/*.java SourceCode/src/com/example/inventory/utils/*.java
        ```
        (Adjust the command based on your package structure).
    * Run the application:
        ```bash
        java -cp "SourceCode/lib/*:SourceCode/src" com.example.inventory.Main
        ```
        (Replace `com.example.inventory.Main` with the actual path to your main class).

## Usage Examples/Demo

1.  **Login:** Upon starting the application, you will be presented with a login screen. Enter valid credentials to access the system.
2.  **Dashboard:** After successful login, the dashboard will display a summary of key information (if implemented).
3.  **Product Management:** Navigate to the "Products" section to add new products, view existing stock, edit product details, or delete products.
4.  **Billing:** Go to the "Billing" section to create new bills. Select products, enter quantities, and the system will calculate the total. You can then generate and save the bill as a PDF.

**Refer to the `Documentation/CompleteProjectReport.pdf` for detailed usage instructions and screenshots of the application's interface.**

## Dependencies and Configurations

* **Java:** (Specify the Java version used).
* **MySQL:** (Specify the MySQL version used). Database connection details are configured within the Java source code.
* **Swing:** The graphical user interface is built using the Java Swing library (part of the standard Java library).
* **MySQL Connector/J:** (Specify the version if known) - Used for connecting to the MySQL database. The JAR file is located in `SourceCode/lib`.
* **iText/JasperReports:** (Specify which one and the version if known) - Used for generating PDF bills. The JAR file is located in `SourceCode/lib`.

## Complete Project Report

A comprehensive project report containing:

* Cover Page, Abstract, Objective
* System Analysis
* Data Flow Diagrams (DFD - Context + Level 1)
* ER Diagram
* UML Diagrams (Use Case, Class, Activity, Sequence)
* Technologies used
* Implementation details with screenshots
* Testing procedures and results
* Future Scope
* Conclusion
* Bibliography & Appendix

is available in the `Documentation/CompleteProjectReport.pdf` file. The UML and ER diagrams can be found in the `Documentation/UMLDiagrams` directory.

## Repository Accessibility

This GitHub repository will remain **accessible at all times** for evaluation purposes.

## Contact

Rahul Kumar
rahulkr221703@gmail.com
https://github.com/rahulkr1722

Thank you for evaluating my project!
