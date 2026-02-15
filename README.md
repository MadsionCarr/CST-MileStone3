
# CST-MileStone3 - Inventory Manager & Shopping Cart

## Overview
This project implements a simple game store application written in Java. The Store Front allows a user to browse products, purchase items, cancel purchases, view their shopping cart, and complete checkout. The application demonstrates object‑oriented design, UML modeling, flowchart logic, and JavaDoc documentation.

Milestone 3 focuses on:

- Inventory Manager implementation  
- Shopping Cart implementation  
- Integration with StoreFront  
- Comparable support in SalableProduct  
- Updated UML diagrams  
- Updated flowchart  
- JavaDoc generation  
- Screencast demonstration  

---

## Features

### Inventory Manager
The `InventoryManager` class supports:

- Initializing store inventory  
- Removing products when purchased  
- Adding products back when purchases are canceled  
- Returning the full inventory list  
- Integration with StoreFront  

### Shopping Cart
The `ShoppingCart` class supports:

- Initializing an empty cart  
- Adding products to the cart  
- Removing a single instance of a product  
- Returning the cart contents  
- Emptying the cart during checkout  
- Integration with StoreFront  

### SalableProduct Comparable
`SalableProduct` implements `Comparable<SalableProduct>`.

Sorting rules:
1. Compare by **name** (ignore case)  
2. If names match, compare by **price**  

### StoreFront Integration
The `StoreFront` class:

- Initializes InventoryManager and ShoppingCart  
- Displays a user menu  
- Supports viewing products, purchasing, canceling, viewing cart, and checkout  
- Demonstrates full integration of all components  

---

## How to Run

1. Open the project in Eclipse or another Java IDE.  
2. Ensure the package structure is preserved (`package app;`).  
3. Run `StoreFront.java`.  
4. Use the menu to interact with the store:
   - View Products  
   - Purchase Product  
   - Cancel Purchase  
   - View Cart  
   - Checkout  
   - Exit  

---

## UML Diagrams
Included in the submission ZIP:

- Class Diagram  
- Flowchart Diagram  

These diagrams reflect:

- SalableProduct hierarchy  
- InventoryManager  
- ShoppingCart  
- StoreFront  
- User interaction flow  

---

## JavaDoc
JavaDoc comments are included in all classes.

To generate JavaDocs in Eclipse:

1. Go to **Project → Generate Javadoc…**  
2. Select the project and output directory (e.g., `/javadoc`).  
3. Include all classes in the `app` package.  

The generated HTML files are included in the final ZIP submission.

---

## Screencast
The screencast demonstrates:

- Running the application  
- Purchasing and canceling items  
- Viewing and emptying the cart  
- Checkout process  
- UML and flowchart explanation  
- Code walkthrough  

**Screencast Link:**  
*(Insert link here)*

---

## GitHub Repository
All code is pushed to the required private GCU Git repository.

**Repository Link:**  
*(Insert link here)*

---

## Project Structure

