# 🎮 Hang Man Game

<p align="center">
  <img src=https://github.com/LeeRoa/HangManGame/assets/132882290/6892aa88-03b5-4e9f-90b3-a51235991395 width=1000>
</p>

---

# 🛠 Hang Man Dev
개발 기간 : 2023.06.02 ~ 2023.06.03

---

## 개발자 소개
<table>
  <tr>
    <th>이로아(Ro A Lee)</th>
    <td rowspan="3" width = 500>안녕하세요 백엔드 개발자 이로아입니다.</td>
  <tr>
    <td> 
      <img src="원하는 이미지 url" width = 200>
    </td>
  </tr>
  <tr>
    <td>Developer</td>
  </tr>
</table>

---

## 프로젝트 동기

프로그램을 구현하는 실력을 향상시키기 위해 개인적으로 간단한 미니 프로젝트를 진행하였습니다.

이 프로젝트는 기능적으로 매우 간단한 게임이지만, 주요 목적은 배웠던 프로그래밍 개념을 복습하고 로직 구성 능력을 향상시키기 위한 것입니다. 

미숙한 실력으로 인해 버그가 발생할 수도 있습니다. 따라서 버그를 발견하시거나 더 나은 방안을 언제든지 말씀해주시면 개선하도록 하겠습니다. 

협력에 감사드리며, 도움이 필요한 부분은 언제든지 말씀해주세요. 감사합니다.

I recently undertook a simple mini project personally to enhance my programming skills.

This project is a very basic game in terms of functionality, but its main purpose is to review the programming concepts I've learned and improve my logical thinking abilities.

Due to my limited experience, there may be bugs in the program. Therefore, if you come across any bugs or have suggestions for improvements, please feel free to let me know, and I will work on resolving them.

Thank you for your collaboration, and please don't hesitate to reach out if you need any assistance. Thank you.

## 프로그램 소개

이 프로그램은 단어를 맞추는 미니 게임입니다.

컴퓨터는 랜덤으로 단어를 선택하고 유저는 그 단어를 맞추기 위해 시도합니다. 

게임은 다음과 같은 절차로 진행됩니다:

1. 단어 표시: 정답은 글자 수만큼 하이픈 또는 언더스코어로 표시됩니다. 예를 들어, "Hello"라는 단어가 정답이라면 "-----"으로 표시됩니다.

2. 글자 추측: 유저는 한 글자씩 추측하여 맞춰야 할 단어를 알아내려고 시도합니다. 추측한 글자가 단어에 포함되어 있다면, 해당 위치에 맞는 글자로 표시됩니다. 예를 들어, "l"을 추측했다면 "l---l"로 표시됩니다. 추측한 글자가 단어에 포함되어 있지 않다면, 틀린 횟수가 기록되며 게임 진행에 영향을 미칩니다.

3. 행맨 그리기: 틀린 추측을 할 때마다, 행맨의 부위가 하나씩 그려집니다. 일반적으로 행맨은 머리, 몸통, 팔, 다리, 그리고 손과 발을 그리는 순서로 그려집니다. 모든 부위가 그려진 후에는 게임이 종료됩니다. (횟수는 총 10회)

4. 게임 종료: 게임은 성공 또는 실패로 종료됩니다. 유저가 맞추기 전에 행맨이 완성되면 실패로 간주됩니다. 반대로, 유저가 단어를 성공적으로 추측하면 승리로 간주됩니다.

행맨 게임은 언어 실력과 추리력을 향상시키는 데 도움이 되는 재미있는 게임입니다.

This program is a mini game where you have to guess a word.

The computer randomly selects a word, and the user attempts to guess the word. 

The game progresses as follows:

1. Word Display: The answer is displayed using dashes or underscores to represent each letter. For example, if the word is "Hello," it would be displayed as "-----".

2. Letter Guessing: The user guesses one letter at a time to try and uncover the word. If the guessed letter is part of the word, it is revealed in the correct position. For example, if the letter "l" is guessed, it would be displayed as "-l--l". If the guessed letter is not part of the word, an incorrect guess is recorded, affecting the progress of the game.

3. Drawing the Hangman: With each incorrect guess, a part of the hangman is drawn. Typically, the hangman is drawn in the order of head, body, arms, legs, and sometimes eyes. The game ends when all parts of the hangman are drawn. (A total of 10 incorrect guesses)

4. Game End: The game ends in either success or failure. If the hangman is completed before the user guesses the word, it is considered a failure. On the other hand, if the user successfully guesses the word, it is considered a victory.

The Hangman game is a fun game that helps improve language skills and logical thinking abilities.

---

# 📝 시작 가이드

### 요구사항 (Requirements)
#### To set up the environment for running the program, the following components need to be provided:
* [jdk1.8.0_281](https://www.oracle.com/kr/java/technologies/downloads/)
* [Eclipse 4.19](https://www.eclipse.org/downloads/packages/)


## 실제 프로그램 화면
<p align="center">
  <img src=https://github.com/LeeRoa/HangManGame/assets/132882290/ad1cedcc-758c-4856-8507-ce41a63f4282 width=1000>
</p>

---

# 🎢 기술 스택(Stacks)
### Environment
<img src="https://img.shields.io/badge/eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white">  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

### Development
<img src="https://img.shields.io/badge/java-2A6379?style=for-the-badge&logo=java&logoColor=white">

---

# 🌏 라이선스(license)
Open Source
