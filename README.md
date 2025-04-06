# Android MVC Example

This is a simple Android application demonstrating the **Model-View-Controller (MVC)** architectural pattern. The app allows users to input their name and age, then displays the entered information using the MVC structure.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [How It Works](#how-it-works)
- [Screenshots](#screenshots)
- [Setup and Installation](#setup-and-installation)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Overview
This project is a basic Android app that implements the MVC pattern. The user can input their name and age through a simple UI, and the app will display the entered information in a `TextView`. The app separates the logic into three components: **Model**, **View**, and **Controller**.

## Features
- Input fields for name and age.
- A button to submit the input.
- Displays the user's name and age in a `TextView`.
- Handles empty name input by defaulting to "Unknown".
- Validates age input by converting it to an integer (defaults to 0 if invalid).

## Project Structure
The project follows the MVC pattern with the following structure:
