# Program 3 - Invoice Processing

## Author
Faisal Mayar

## Description
This Java program reads invoice data from a file (`Program3.txt`), stores it in `Invoice` objects, and performs the following operations using Java Streams:

-  Sort invoices by part description.
-  Sort invoices by price per item.
-  Map invoices to description and quantity.
-  Map invoices to description and total invoice value.
-  Filter invoices with value between $200 and $500.
-  Find all invoices where the description contains the word “saw”.

The results are printed in the terminal and also saved to `Program3-output.txt`.

---

##  Files Included

| File Name             | Description                                   |
|----------------------|-----------------------------------------------|
| `Program3.java`       | Main driver class                             |
| `ProcessInvoices.java`| Contains logic for processing invoice data    |
| `Invoice.java`        | Class representing an invoice object          |
| `Program3.txt`        | Input file with invoice data                  |
| `Program3-output.txt` | Output with formatted results                 |

---

##  How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java

