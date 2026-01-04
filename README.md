# TP-Strings-and-Arrays-in-Java
Exercise 1:
# Problem
The aim of this exercise is to create a Java program that stores student grades entered from the keyboard in an array named grades.
The program allows the user to perform several operations on the stored grades, including:
sorting and displaying the list of grades,
calculating and displaying the average grade,
displaying the highest and lowest grades,
displaying the number of students who obtained a specific grade entered by the user.
To sort the grades, the program must use the predefined method Arrays.sort().
# Solution
Student grades are stored in an array named grades.
A program allows sorting the grades using Arrays.sort(), calculating the average grade, displaying the highest and lowest grades, and counting how many students obtained a specific grade entered by the user.

<img width="1283" height="253" alt="exercice1java" src="https://github.com/user-attachments/assets/bb6b9bd2-3291-4456-8a0e-3a132dfceab6" />

Exercise 2:
# Problem 
The aim of the exercise is to create  a java program that reads a first group verb and displays its conjugation in the present tense in
the following form:
Entrez un verbe du premier groupe : chanter
➔ je chante
➔ tu chantes
➔ il/elle chante
➔ nous chantons
➔ vous chantez
➔ ils/elles chantant
The program will check that the verb ends in er (in French) and assume that it is a regular verb.
# solution
The solution involves:
Reading the verb from the keyboard using a Scanner.
Checking if the verb ends with "er" to ensure it belongs to the first group.
Removing the "er" ending to get the stem of the verb.
Adding the present tense endings to the stem according to French conjugation rules
<img width="1305" height="271" alt="exercice2java" src="https://github.com/user-attachments/assets/94072d5a-8294-439c-93af-bff8618dae18" />

Exercice 3:
# Problem
this exercise is to create a Java program that allows the user to perform several operations on a character string entered from the keyboard.The program must:
Read a string from the user and store it in a variable.
Display the entered string.
Reverse the string and display it.
Count and display the number of words in the string. Spaces (' ') are considered word separators, and multiple consecutive spaces should be handled correctly.
After each operation, the program should display the message:
“Press any key to return to the menu” and return to the menu until the user chooses to exit.
# Solution
The program stores the string entered by the user in a variable text and provides a menu to perform operations: display the string, reverse it using StringBuilder.reverse(), or count the number of words using split("\\s+"). Each operation executes immediately, and the program pauses after each action before returning to the menu.
<img width="1126" height="380" alt="exercice3 1" src="https://github.com/user-attachments/assets/5cc548ab-2c78-4672-a3a4-620668d5660b" />
<img width="980" height="403" alt="exe3 " src="https://github.com/user-attachments/assets/f89deace-2ebb-4b57-a6c3-c0a160dc3ed4" />

Exercice4
# Problem
Write a Java program that reads a string of characters ch from the keyboard and counts the
occurrences of letters in the alphabet without distinguishing between uppercase and lowercase
letters. Use a 26-dimensional array nb_occurrences to store the result. Display only the number
of letters that appear at least once in the text.
# Solution
The program reads a string, converts it to the same case, and counts each letter using a 26-element array nb_occurrences. Only letters with at least one occurrence are displayed.
<img width="1306" height="125" alt="exercice4" src="https://github.com/user-attachments/assets/925dfa5d-99b3-402b-85f3-4ccf8596c6bf" />
