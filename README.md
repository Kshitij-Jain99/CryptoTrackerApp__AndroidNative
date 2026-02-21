# Crypto Tracker App (Native Android)

## Project Overview

A robust, scalable native Android application built with Kotlin for tracking real-time cryptocurrency data. This client-side application handles remote data retrieval, offline caching, and core business logic, serving as a comprehensive tool for monitoring crypto markets.

This project was built to demonstrate proficiency in modern Android development, including MVVM architecture, API integration, and clean code principles using Kotlin.

## Key Features

* **Real-Time Market Data:** Up-to-date tracking of cryptocurrency prices and market trends using the CoinGecko API.
* **Search Functionality:** Quickly find specific coins and tokens.
* **Detailed Coin View:** Comprehensive metrics and historical data for individual cryptocurrencies.
* **Offline Support:** Reliable local storage using Room Database to ensure data availability even without an active internet connection.
* **Clean Architecture:** Strict adherence to separation of concerns for scalable and testable code.

## Tech Stack

* **Language:** Kotlin
* **Architecture:** MVVM (Model-View-ViewModel)
* **Networking:** Retrofit2, OkHttp3
* **Concurrency:** Kotlin Coroutines and Flow
* **Data/Storage:** Room Database
* **UI:** XML / Material Design & Jetpack Compose

## Architecture & Design Patterns

The application follows a standard Layered Architecture (MVVM) to ensure separation of concerns, testability, and maintainability:

* **Views (UI):** Display data to the user and capture user interactions, observing ViewModels for state changes.
* **ViewModels:** Manage UI-related data in a lifecycle-conscious way, acting as a bridge between the repository and the UI.
* **Repository Layer:** Manages data operations, deciding whether to fetch fresh data from the network or retrieve cached data from the local database.
* **Data Sources:** Incorporates both remote (Retrofit) and local (Room) data handling for a seamless, resilient user experience.

## App Screens Overview

| Screen | Description |
| :--- | :--- |
| **Dashboard** | Displays a list of top cryptocurrencies with current prices and market caps |
| **Search** | Allows querying specific coins by name or symbol |
| **Coin Details** | Shows detailed metrics, historical charts, and stats for a selected coin |
| **Watchlist** | Displays user's saved and favorited cryptocurrencies |

## Getting Started

### Prerequisites

* Android Studio
* Java Development Kit (JDK) 17 or higher
* Git

### Installation & Setup

1. Clone the repository: 
   ```bash
   git clone [https://github.com/Kshitij-Jain99/CryptoTrackerApp__AndroidNative.git](https://github.com/Kshitij-Jain99/CryptoTrackerApp__AndroidNative.git)
   ```
2. Navigate to the project directory: 
   ```bash
   cd CryptoTrackerApp__AndroidNative
   ```
3. Open the project in Android Studio and allow Gradle to sync.
4. Build the project: 
   ```bash
   ./gradlew build
   ```
5. Run the application on an emulator or physical device.

## Future Improvements

* Implement comprehensive unit and UI testing for key user flows and ViewModels.
* Add optimization mechanisms for more efficient background data syncing.
* Introduce price alerts and push notifications for specific cryptocurrency thresholds.
* Implement user authentication to save personalized watchlists across multiple devices.
