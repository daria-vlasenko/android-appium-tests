# LinkedIn: пакет для копипаста. Профиль на английском

Версия от 19.09.2026. Заполняется сверху вниз — порядок имеет значение: пока стоит русский язык профиля, английские тексты будут выглядеть как русскоязычный профиль с английским содержимым и хуже ловиться фильтрами.

---

## 0. Технические настройки (сделать первыми, 5 минут)

**Язык профиля.** `Settings` → `Account preferences` → `Language` → `Profile language` → English. Русский оставить второй версией профиля не нужно: делит показы, а рекрутеры РБ/РФ читают английские профили нормально.

**Имя.** Сейчас отображается «Vlasenko (eqlllh) Daria» — ник вписан в поле имени. Убрать.

- First name: `Daria`
- Last name: `Vlasenko`

**Публичный URL.** `Профиль` → блок справа `Общедоступный профиль и URL-адрес` → карандаш → `Edit your custom URL`.

```
linkedin.com/in/eqlllh
```

Адрес свободен — проверено 19.09, отдаёт «страница не существует». Ставим именно его: резюме с этой ссылкой уже ушло работодателю, и после установки ссылка заработает задним числом. Поменять потом можно, но старый адрес сразу перестаёт работать и освобождается для других, а LinkedIn ограничивает частоту смены — так что менять стоит один раз и осознанно.

**Локация.** `Minsk, Belarus`. Не «Belarus» и не пусто — пустая локация выпадает из географических фильтров, а remote-вакансии всё равно фильтруются по стране.

**Industry:** `IT Services and IT Consulting`
**Pronouns / прочее:** не трогаем.

---

## 1. Headline

220 символов лимит. Рекрутерский поиск LinkedIn ранжирует вхождения отсюда выше, чем из любой другой секции, поэтому здесь только те слова, которые реально вбивают в строку поиска.

```
QA Automation Engineer | Java · JUnit 5 · REST Assured · Selenide · API & UI Test Automation · CI/CD · Allure
```

108 символов. Слово «Junior» не ставим намеренно — то же решение, что принято по резюме: позиционирование даёт заголовок, честность даёт первая строка About.

---

## 2. About

Лимит 2600 символов. Первые ~230 символов видны до кнопки «…see more» — поэтому Java и test automation стоят в первом предложении.

```
QA Automation Engineer working with Java across the API, UI and unit levels. I build test frameworks with JUnit 5, REST Assured, Selenide and Maven, and run them in CI on every push, with Allure reports as the output the team actually reads.

What I work with:

• API automation — REST Assured, Jackson, Datafaker, POJO models, a steps layer, positive and negative scenarios, parameterized tests
• UI automation — Selenide, Page Object pattern, stable locators, explicit waits
• Unit testing — JUnit 5, Mockito (@Mock, @InjectMocks, verify, ArgumentCaptor), parameterization via @CsvSource and @ValueSource
• CI/CD and reporting — Git, GitHub Actions, Maven, Allure Report, Docker
• Databases — SQL (PostgreSQL): joins, grouping, aggregate functions; JDBC
• Manual QA — test design (equivalence partitioning, boundary values, decision tables, pairwise), test cases, checklists, bug reports with severity and priority, accessibility and basic web security checks

Before moving fully into QA I spent two years building commercial automation — REST API integrations, webhooks and workflow automation (Python, n8n, Make) for B2B clients. That is where I learned to read API documentation, debug integrations and think about what happens when a request fails rather than when it succeeds.

Currently a 4th-year Software Engineering student at BSUIR, extending my stack into mobile automation (Appium) and deepening Java Core.

Open to QA Automation Engineer / SDET roles — Belarus, remote, or relocation.

Code: github.com/daria-vlasenko
```

---

## 3. Experience

LinkedIn ищет по полю Title не меньше, чем по описанию, поэтому названия должностей написаны так, как их вбивают рекрутеры.

### 3.1 Modsen

- **Title:** `QA Automation Engineer Intern (Java)`
- **Employment type:** `Internship`
- **Company:** Modsen
- **Dates:** June 2026 — July 2026
- **Location:** Minsk, Belarus · On-site
- **Description:**

```
Technology internship on a logistics module, split between Java test automation, manual QA and security checks.

Automation (Java):
• Unit tests in Java 17 with JUnit 5 and Mockito for logistics services: BigDecimal calculations, interface-based tariffs, Stream API analytics, PriorityQueue, an invoice parser with a custom exception
• Parameterized tests (@CsvSource, @ValueSource), assertThrows, dependency mocking (@Mock, @InjectMocks), verify, ArgumentCaptor

Manual and security QA:
• Functional and regression testing of the company website
• Test design: equivalence partitioning, boundary values, decision tables, pairwise testing — reduced 12 combinations to 6 without losing pair coverage
• Reported 20+ defects in ClickUp, classified by severity, priority and type: functional, content and accessibility issues (aria-label, label, alt, keyboard navigation)
• Root-cause analysis with Chrome DevTools: console errors, HTTP 500 responses in the Network tab
• Web security checks against checklists (XSS, SQL injection)

Process:
• Scrum: code reviews, sprint retrospectives, demos for the team and the mentor
```

### 3.2 Maverick Frame Studio

- **Title:** `Automation Engineer (Business Process Automation)`
- **Employment type:** `Full-time` (или `Contract` — поставь то, что было по факту)
- **Dates:** 2025 — 2026
- **Location:** Remote
- **Description:**

```
Built automated workflows and integrations for the studio's B2B clients.

• REST API and webhook integrations between external services; handled authentication, payload mapping and error paths
• Designed and shipped an automation system on n8n and Make: scenario orchestration, third-party service integration, automated content publishing
• Integrated AI tools into client workflows and built analytical reports on process efficiency
• Automated team reporting and daily operations — manual steps reduced to reviewing the result
```

### 3.3 Alfa-Nedvizhimost (агентство недвижимости)

- **Title:** `SMM Specialist / Process Automation`
- **Employment type:** `Full-time`
- **Dates:** 2020 — 2023
- **Location:** Minsk, Belarus
- **Description:**

```
• On my own initiative, built a system that automatically collected property listings from real estate websites (Python, Requests, BeautifulSoup): parsing, data processing and monitoring of new listings
• Real-time trigger notifications through the Telegram Bot API — new listings arrived instantly instead of being tracked manually
• Ran the agency's social media: shooting, editing and publishing video content
```

---

## 4. Education

- **School:** Belarusian State University of Informatics and Radioelectronics (BSUIR)
- **Degree:** Bachelor's degree
- **Field of study:** Software Engineering
- **Dates:** 2023 — 2027

Описание (необязательно, но добавляет кейворды):

```
Core coursework: algorithms and data structures, object-oriented programming, databases, software testing.
```

---

## 5. Licenses & Certifications

Секция `Licenses & certifications` — каждый курс отдельной записью. Если сертификат есть ссылкой, вставить в `Credential URL`.

1. **Java Test Automation from Scratch** — Stepik — Issued 2026
2. **Test Automation Course** — Inzhenerka.tech — Issued 2026
3. **Java Core** — JavaRush — *в процессе, добавить по завершении*

---

## 6. Projects

Секция `Projects`. Каждый проект — со ссылкой на репозиторий в поле `Project URL`.

### Conduit API Test Automation Framework
- URL: `github.com/daria-vlasenko/conduit-api-tests`
- Skills: Java · JUnit 5 · REST Assured · Maven · Allure · GitHub Actions
- Description:

```
API test automation framework for a REST service. Java 17, JUnit 5, REST Assured, AssertJ, Jackson, Datafaker, Allure, Maven.

• Positive and negative scenarios, parameterized tests, a steps layer and POJO models
• Allure reporting
• Runs in GitHub Actions on every push
```

### ParaBank UI Test Automation
- URL: `github.com/daria-vlasenko/parabank-ui-tests`
- Skills: Java · Selenide · Page Object · JUnit 5 · Maven
- Description:

```
UI test automation for a banking demo application. Java 17, Selenide, JUnit 5, Maven.

• Page Object pattern, configuration layer, smoke and authentication scenarios
• Dependency hygiene: resolved a known CVE in a transitive dependency through dependencyManagement
```

### Manual QA Portfolio
- URL: `github.com/daria-vlasenko/manual-qa-portfolio`
- Skills: Test Design · Test Cases · Bug Reporting
- Description:

```
Manual testing artifacts: test design techniques with worked examples, test cases, checklists and bug reports with severity and priority classification.
```

### Android Mobile Test Automation *(добавить, когда появится код)*
- URL: `github.com/daria-vlasenko/android-appium-tests`
- Skills: Java · Appium · Mobile Testing

---

## 7. Skills

Лимит 50. Первые три закрепляются как Top skills и видны прямо под About — ставим самые частотные в рекрутерском поиске.

**Закрепить первыми тремя:**

1. `Java`
2. `Test Automation`
3. `REST Assured`

**Остальные (добавлять в этом порядке):**

```
Selenide
Selenium
JUnit 5
Mockito
API Testing
UI Testing
Test Automation Framework
Maven
Git
GitHub Actions
CI/CD
Allure Report
Postman
JSON
REST APIs
SQL
PostgreSQL
JDBC
Docker
Manual Testing
Functional Testing
Regression Testing
Test Design
Test Cases
Bug Reporting
Software Testing
Quality Assurance
Object-Oriented Programming (OOP)
Java Collections Framework
IntelliJ IDEA
Agile Methodologies
Scrum
Web Accessibility
Python
Web Scraping
Webhooks
n8n
Make (Integromat)
Appium
Mobile Application Testing
```

К каждому навыку LinkedIn предлагает привязать место работы или проект — привязать Java, JUnit 5, Mockito к Modsen, а REST Assured и Selenide к проектам. Навык, привязанный к опыту, весит в поиске больше, чем висящий сам по себе.

---

## 8. Open to work

`Open to` → `Finding a new job`. Видимость — `All LinkedIn members` или `Recruiters only`, на твой выбор; зелёная рамка на фото поднимает отклик рекрутеров, но видна всем.

- **Job titles:** `QA Automation Engineer`, `Software Development Engineer in Test (SDET)`, `QA Engineer`, `Automation QA Engineer`, `Test Automation Engineer`
- **Location types:** `On-site`, `Hybrid`, `Remote`
- **Locations:** `Minsk, Belarus` + `Belarus` + добавить страны, куда рассматриваешь релокацию
- **Start date:** `Immediately`
- **Job types:** `Full-time`, `Internship`

---

## 9. Что доделать после заполнения

1. **Фото.** Без фото профиль проседает в выдаче и в отклике. Нужен нейтральный фон, лицо крупно.
2. **Баннер.** Можно собрать в Canva тем же стилем, что резюме — строка стека на однотонном фоне.
3. **Контакты.** Профиль с нулём связей почти не показывается в поиске: LinkedIn ранжирует по степени связи. Цель — 50+ в первую неделю: однокурсники БГУИР, коллеги из Modsen, QA-рекрутеры Минска, участники QA-сообществ.
4. **Featured.** Закрепить ссылку на `conduit-api-tests` — она видна сразу под About.
5. **Contact info.** Добавить GitHub и Telegram в `Contact info` → `Add website` / `Add instant messaging`.
6. **Синхронизировать ссылки.** В GitHub bio сейчас указан `vlasenko-daria` — адрес битый, заменить на `linkedin.com/in/eqlllh`.
7. **Первая публикация.** Пост о готовом проекте автотестов со ссылкой на репозиторий — профиль с активностью показывается чаще, чем мёртвый.

---

## Источники

- Проверка адресов и состояния профиля — прямой осмотр профиля в браузере 19.09.2026
- [LinkedIn Help: Manage your public profile URL](https://www.linkedin.com/help/linkedin/answer/a542685/manage-your-public-profile-url?lang=en) — страница закрыта от автоматического чтения robots.txt, точный лимит на число смен URL не подтверждён; утверждение «менять можно, старый адрес перестаёт работать» основано на общем описании функции, не на сверенной цитате
