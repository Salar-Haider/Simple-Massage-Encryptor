# Simple Message Encryptor

*A Java desktop program for encrypting English letters and full‑stop symbols.*

---

## 🧐 Overview

This project is a simple desktop application built in Java. It allows you to **encrypt and decrypt all English letters (both lower‑case and upper‑case) and the full stop symbol (.)**. The application provides a form‑based interface to input your message and see the encrypted output.

It’s ideal if you’re learning encryption basics, exploring GUI design in Java, or just want a simple tool for “text scrambling”.

---

## ✅ Features

* Encrypts **all English letters** (a‑z and A‑Z).
* Encrypts the **full stop symbol (.)**.
* Aslo decryts.
* Simple GUI (form) built in Java (likely using Swing/AWT).
* Easy to extend: you can modify it to include digits, punctuation, other symbols.
* Good for educational use and learning/enhancing encryption logic.

---

## 🛠 Getting Started

### Prerequisites

* Java Development Kit (JDK) installed (version 8+ recommended).
* An IDE like NetBeans, IntelliJ IDEA, or simply the `javac`/`java` command line.

### Installation

1. Clone the repository

   ```bash
   git clone https://github.com/Salar-Haider/Simple-Massage-Encryptor.git  
   cd Simple-Massage-Encryptor  
   ```
2. Open it in your IDE, or compile manually:

   ```bash
   javac Encrpting_form.java  
   ```
3. Run the application:

   ```bash
   java Encrpting_form  
   ```

   (Replace class name/path if your structure differs.)

---

## 🎮 Usage

* Launch the application.
* Enter the plain text message you want to encrypt.
* Click the “Encrypt” button (or whatever trigger is set).
* View the encrypted result in the designated output area.
* Enter the encrypted text in the decrytion box and press decrypt button to view the decrypted text.


---

## 📁 Project Structure

```
Simple‑Message‑Encryptor/
├─ Encrpting_form.java      # Main GUI source (and logic)  
├─ README.md                # This file  
└─ (other project files…)  
```

---

## 🔍 How it Works

* The program scans each character of the input message.
* If the character is an English letter (A‑Z or a‑z) or a full‑stop (.), it applies an encryption transformation (for instance a shift or substitution).
* Other characters (digits, punctuation other than .) may remain unchanged (depending on your implementation).
* The encrypted output is displayed in the GUI.

You can open the source `Encrpting_form.java` to review/modify the encryption algorithm. This is a good opportunity for learning about substitution ciphers, ASCII codes, character ranges, etc.

---

## 🤝 Contributing

Contributions are welcome! If you’d like to improve the app (add features, fix bugs, improve UI), here’s how:

1. Fork the repository.
2. Create a new branch: `git checkout ‑b feature/YourFeatureName`
3. Make your changes, commit with descriptive message.
4. Ensure code compiles and runs correctly in your environment.
5. Submit a Pull Request describing what you changed and why.

Suggested enhancements:

* Extend to digits/special characters.
* Add configurable encryption keys/shifts.
* Improve GUI (layout, theming).
* Add unit tests for encryption logic.

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
You are free to use, modify, and distribute the software — see the license file for details.

---

## 📬 Contact

If you encounter any issues, have suggestions, or want to collaborate, feel free to open an issue on this repository or reach out via my GitHub profile: [@Salar‑Haider](https://github.com/Salar-Haider).

Thanks for checking out **Simple Message Encryptor** — happy coding!
