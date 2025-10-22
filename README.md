
# LEI SHING HONG – Login Page Automation Testing

This project demonstrates automated functional testing of the **LEI SHING HONG** web application’s **login page** using **Selenium WebDriver** with **Java** and **TestNG**. The goal of this automation is to verify the login functionality, ensure element accessibility, validate navigation flow, and confirm successful authentication for valid credentials.

---

## 🧩 Project Overview

The test script automates the following workflow:
1. Launches the Chrome browser using **WebDriverManager** (no manual driver setup required).
2. Navigates to the LEI SHING HONG organization’s web portal:  
   `https://organization-frotnend3-gold.vercel.app/`
3. Locates and interacts with login form elements — **username**, **password**, and **login button**.
4. Submits valid credentials:
   - **Email:** `a**********.com`  
   - **Password:** `*******`
5. Validates successful login by verifying the redirected URL contains:  
   `/admin/UltimateHoldingCompany`
6. Closes the browser session after execution.

---

## 🧪 Tools and Technologies Used
- **Language:** Java  
- **Automation Framework:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Driver Management:** WebDriverManager  
- **Browser:** Google Chrome  

---

## ⚙️ Test Flow Summary
| Step | Action | Expected Result |
|------|---------|----------------|
| 1 | Launch the browser | Chrome browser opens successfully |
| 2 | Navigate to the login page | Page loads with title displayed |
| 3 | Enter credentials and click login | Credentials submitted |
| 4 | Verify the current URL | Confirms navigation to `/admin/UltimateHoldingCompany` |
| 5 | Close the browser | Browser terminates successfully |

---

## ✅ Key Features
- Dynamic WebDriver setup (no manual driver path needed)  
- Page title and URL verification  
- Assertion-based validation for login success  
- Clean setup and teardown using `@BeforeMethod` and `@AfterMethod` annotations  

---

## 📁 Test File
**File Name:** `Logindemo.java`  
**Package:** `demo`

---

## 🧾 Example Output
```
✅ Page title is: LEI SHING HONG Portal
✅ Login successful! Current URL: https://organization-frotnend3-gold.vercel.app/admin/UltimateHoldingCompany
Browser closed
```

---

## 🚀 Purpose
This automation test ensures that the login functionality of the LEI SHING HONG system works as expected under normal conditions. It can be integrated into a CI/CD pipeline to automatically validate the login page after every deployment or code change.

---

**Author:** Muhammad Tayyab  
**Role:** QA Automation Engineer  
**Project:** LEI SHING HONG Login Automation Test
````


