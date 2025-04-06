
# Android MVC Example

This is a simple Android application demonstrating the Model-View-Controller (MVC) architectural pattern. The app allows users to input their name and age through a simple UI, then displays the entered information in a TextView. The app separates the logic into three components: Model, View, and Controller. It includes input fields for name and age, a button to submit the input, and displays the user's name and age in a TextView. It also handles empty name input by defaulting to "Unknown" and validates age input by converting it to an integer (defaults to 0 if invalid).

The project structure follows the MVC pattern:  
- **Model**: `Model.kt` - Represents the data (name and age) and contains the business logic.  
- **View**: `activity_main.xml` - The UI layout containing `EditText` for name and age, a `Button`, and a `TextView` to display the result.  
- **Controller**: `MainActivity.kt` - Manages the interaction between the View and the Model by retrieving user input, updating the Model, and updating the View with the result.  

The app works as follows: the user enters their name and age in the provided `EditText` fields, and when they click the "Submit" button, the `MainActivity` (Controller) retrieves the input, validates it (e.g., sets the name to "Unknown" if empty, converts age to an integer), creates a `Model` object with the input data, and updates the `TextView` in the View with the data from the `Model`.

To set up and run the app:  
1. Clone the repository:  
   ```bash
   git clone https://github.com/mahmoudahmedabdelrazek/Android-Architecture-Patterns---MVC.git
Open the project in Android Studio, sync it with Gradle, and run the app on an emulator or a physical device.
Prerequisites: Android Studio (latest version recommended), Android SDK, and a device or emulator running Android API 21 or higher.
Technologies Used: Kotlin, MVC (Model-View-Controller) architecture pattern, Android Studio, Minimum API 21 (Android 5.0 Lollipop).
