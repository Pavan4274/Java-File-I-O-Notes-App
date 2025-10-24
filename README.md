# Notes App (Java File I/O)

A simple **console-based Notes Manager** application built in Java that uses **FileWriter** and **BufferedReader** to save and read notes from a text file.

---

## ✨ Features
- Write new notes and save them permanently to a file  
- Read all saved notes anytime  
- Notes are stored in `notes.txt` file  
- Automatically creates the file if it doesn’t exist  
- User-friendly console interface  

---

## ⚙️ How It Works
1. The user chooses an option from the menu:  
   - **1:** Write a note → It saves the note in the file.  
   - **2:** Read notes → It displays all saved notes.  
   - **3:** Exit → Closes the program.  
2. Data is stored using **FileWriter (append mode)**.  
3. Notes are read line by line using **BufferedReader**.

---

## ▶️ How to Run
1. Save the code as **NotesApp.java**  
2. Open terminal in the same folder  
3. Compile and run:
   ```bash
   javac NotesApp.java
   java 
   
## 🧰 Technologies Used
Language: Java

Concepts: FileWriter, BufferedReader, Exception Handling, Loops, Conditionals

## 👨‍💻 Author

Muthyamaina Pavan Kumar

💼 Full Stack & Java Developer
