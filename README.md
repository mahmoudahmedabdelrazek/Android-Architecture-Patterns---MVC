📱 Android MVC Example
This is a simple Android application demonstrating the Model-View-Controller (MVC) architectural pattern. The app allows users to enter their name and age through a clean user interface, and then displays the entered information in a TextView.

🧱 Architecture (MVC Structure)
🔹 Model – Model.kt
Handles the data (name and age) and contains business logic and validation.

🔹 View – activity_main.xml
Represents the UI layout, including EditText fields for name and age, a Button to submit, and a TextView to display the result.

🔹 Controller – MainActivity.kt
Acts as the bridge between the View and the Model. It reads user input, updates the Model, and refreshes the View accordingly.

⚙️ How It Works
The user enters their name and age.

When the "Submit" button is clicked:

If the name field is empty, it defaults to "Unknown".

The age input is parsed to an integer (defaults to 0 if invalid).

A Model object is created with the validated input.

The result is displayed in the TextView.

🚀 How to Run
1. Clone the Repository
bash

git clone https://github.com/mahmoudahmedabdelrazek/Android-Architecture-Patterns---MVC.git
2. Open in Android Studio
Launch Android Studio.

Open the cloned project.

Sync Gradle and run the app on an emulator or physical device.

📋 Requirements
Android Studio (latest version recommended)

Android SDK

Device or emulator with Android API 21 (Lollipop) or higher

🛠️ Technologies Used
Kotlin

Android SDK

MVC (Model-View-Controller) Architecture Pattern

Minimum API 21 (Android 5.0 Lollipop)

📸 Screenshots
User Input Screen	Output Screen
	
