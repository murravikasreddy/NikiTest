# Project Title

Niki is a NEW GENERATION ORDERING EXPERIENCE application, which will help customers to pay their bills through chat system (SHOP ON CHAT)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Ensure below softwares are installed.

1. Java JDK 1.7 or higher
2. Appium 1.4.13 or higher
3. Maven
4. any IDE (ex: Eclipse)
5. Android SDK
6. Node.JS


### Installing

Download it as clone.
Set following in Configuration.properties file

deviceName=HM 2LTE-IN
platformName=Android
platformVersion=4.4.4 KTU84P
Package_name=com.techbins.niki.beta
Activity_name=com.techbins.niki.SplashActivity
Appium_path=F:\\Appium\\node.exe F:\\Appium\\node_modules\\appium\\bin\\appium.js
Apk_path=S:\\src\\test\\resources\\Apk\\app-test-apk.apk

Note: Replace values based on your test environment

Then poerform below comands

Maven Clean
Maven Install

Get Reports from /NikiTest/test-output/html/index.html

