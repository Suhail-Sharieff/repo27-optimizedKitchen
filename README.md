## SuhailSharieff: Cooking Scheduler

This program helps you optimize your cooking time when you have multiple dishes to prepare and limited burners available on your stove.

###  How it Works

1. **Input:** The program prompts you to enter the number of burners and the number of dishes you want to cook. Then, for each dish, you'll provide its name and cooking time in minutes.
2. **Scheduling:** The program considers the cooking time of each dish and intelligently assigns them to burners to minimize the total cooking time. It prioritizes dishes with shorter cooking times.
3. **Output:** The program provides a schedule outlining which burner to use for each dish, the cooking time for each dish, and the total time required to cook all dishes.

###  Real-World Use Case

This program is beneficial when you're cooking a big meal or have a limited time window for preparation. By planning your cooking tasks efficiently, you can save time and ensure all dishes are cooked perfectly.

###  Running the Program

1. **Prerequisites:** Ensure you have Java installed on your system.
2. **Compilation:** Save the code as `SuhailSharieff.java` and compile it using a Java compiler (e.g., `javac SuhailSharieff.java`).
3. **Execution:** Run the program using `java SuhailSharieff`.

###  Example

Let's say you have 2 burners and 3 dishes:

* Dish 1: Pizza (Cooking Time: 20 minutes)
* Dish 2: Pasta (Cooking Time: 15 minutes)
* Dish 3: Cake (Cooking Time: 30 minutes)

The program might generate an output like this:

```
Use burner 1 for dish Cake for 30 minutes
Use burner 2 for dish Pizza for 20 minutes
Use burner 1 for dish Pasta for 15 minutes

You atleast need 30 minutes to cook all your dishes
```

In this example, the program prioritizes the cake (longest cooking time) on burner 1, then uses burner 2 for the pizza while the cake cooks. Finally, after the cake finishes, the pasta is cooked on burner 1. The total cooking time is minimized to 30 minutes, which is the cooking time of the cake.

###  Further Enhancements

* The program could be extended to handle dishes with overlapping cooking times.
* It could incorporate user preferences for burner allocation (e.g., prioritizing specific burners for certain dishes).
