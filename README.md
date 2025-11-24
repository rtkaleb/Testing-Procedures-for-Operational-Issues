
# 📘 Banking QA Application – Challenge 8
### Black-Box Testing · Equivalence Classes · Test Cases · Java Simulation

## 👤 Students
**Johan Alejandro Gloria González** &
**Iván Kaleb Ramírez Torres**  
TechnoReady In-Mexico Bootcamp – Challenge 8  

---

# 📑 Table of Contents
1. Project Overview  
2. Context  
3. Objectives  
4. Project Deliverables per Sprint  
5. Table 1 – Requirements List  
6. Table 2 – Prioritize List  
7. Equivalence Classes (Sprint 1)  
8. Test Cases (Sprint 2)  
9. Java Simulation (Sprint 3)  
10. Folder Structure  
11. How to Run the Java Simulation  
12. Findings & Best Practices  
13. License  

---

# 📘 Project Overview
This project consists of the **design and execution of software tests** for a digital banking application using:

- Black-box testing  
- Equivalence Class Partitioning  
- Test Case Design (12 cases)  
- Java-based simulation of input validation  

The goal is to ensure the correctness, robustness, and functional quality of the system through systematic QA activities.

---

# 🏦 Context
Developed for **REM**, a consultancy specialized in software quality.  
Users must enter: bank code, branch code, account number, personal key, and order value (checkbook or account statement).  
Tests validate accuracy, security, and behavior of the banking online request application.

---

# 🎯 Objectives
- Apply equivalence class partitioning  
- Design 12 comprehensive test cases  
- Simulate banking behavior using Java  
- Validate input data and generate success/error messages  
- Produce documentation suitable for QA review  

---

# 🚀 Project Deliverables per Sprint

### Sprint 1 – Equivalence Classes
- Identify valid/invalid ranges  
- Build equivalence class tables  
- PDF executive presentation  

### Sprint 2 – Test Case Design
- 12 detailed test cases  
- Excel report with alignment column  
- Describe state transitions  

### Sprint 3 – Java Simulation
- Java validation program  
- Execution of one valid, boundary, invalid test  
- README instructions  
- Third‑party review  
- Findings report  

---

# 📋 Table 1 – Requirements List
(Only summary included; full detail in repository docs.)

| Sprint | Requirements |
|--------|-------------|
| Sprint 1 | Define equivalence classes, document decisions, produce PDF |
| Sprint 2 | Design 12 test cases, create Excel report, classify cases |
| Sprint 3 | Implement Java simulation, run examples, write README |
| Final Project | Organize repository, integrate results, produce final summary |

---

# 📊 Table 2 – Prioritize List

| Requirements | Stages (Steps) | Time Estimation | Deliverables |
|--------------|----------------|----------------|--------------|
| Equivalence Class Definition | Identify fields, rules, classes, examples | 3h | EquivalenceClassesTable.pdf |
| Class Documentation | Intro, table, explanation, PDF | 2h | Sprint1_Presentation.pdf |
| Test Case Design | Select values, define results, include variants | 4h | 12_Test_Cases.xlsx |
| Test Case Documentation | Create cover, table, alignment | 1.5h | TestCases_Report.xlsx |
| Java Validation Logic | Implement validation, messages, compile | 4h | BankSimulation.java |
| Execution Examples | Run valid, invalid, boundary | 2h | ConsoleExecutionEvidence.txt |
| Simulation README | Compile/run instructions | 1h | README.txt |
| Third-Party Review | Review code & README | 1h | PeerReviewNotes.txt |
| Findings Report | Errors, insights, best practices | 1h | Findings_Report.md |

---

# 🧩 Equivalence Classes (Sprint 1)
Each field includes:

- Valid classes  
- Invalid classes  
- Boundary cases  
- Example values  

Full tables available in `/docs/sprint1/`.

---

# 🧪 Test Cases (Sprint 2)

The following section presents the 12 test cases designed for Sprint 2 of the Banking QA Application project.  
All cases were derived from the equivalence classes established in Sprint 1, ensuring broad and systematic coverage across valid, invalid, and boundary input conditions.

The banking application requires validation of the following fields:
- Bank Code  
- Branch Code  
- Account Number  
- Personal Key  
- Order Value  

Each test case includes:
- A unique Test Case ID  
- A concise scenario description  
- Input values for all required fields  
- The corresponding equivalence class alignment  
- The expected system behavior  
- The initial and final application state  

These test cases collectively validate normal operation, error handling under malformed data, boundary limits, and multi-error scenarios.  
They also establish the foundation for automated verification through the Java simulation implemented in Sprint 3.

12 test cases include:

- ID  
- Description  
- Input values  
- Equivalence class alignment  
- Expected result  
- Initial and final state  

Excel file located at `/docs/sprint2/12_Test_Cases.xlsx`.

This document lists the 12 test cases designed from the defined equivalence classes.

| Test Case ID | Description | Bank Code | Branch Code | Account Number | Personal Key | Order Value | Equivalence Class Alignment | Expected Result | Initial State | Final State |
|--------------|-------------|-----------|-------------|----------------|--------------|-------------|-----------------------------|-----------------|---------------|-------------|
| TC01 | Valid request with all fields in valid classes (checkbook request). | 123 | 1023 | 9876543210 | 445566 | 1 | BC1, BR1, AC1, PK1, OV1 (all valid) | Request accepted. Checkbook request is successfully registered. | User with no pending checkbook request. | New checkbook request stored in the system. |
| TC02 | Valid request with all fields in valid classes (account statement request). | 123 | 1023 | 1234567890 | 112233 | 2 | BC1, BR1, AC1, PK1, OV2 (all valid) | Request accepted. Monthly account statement request is successfully registered. | User with no pending statement request. | New monthly account statement request stored in the system. |
| TC03 | Invalid bank code (too short), other fields valid. | 12 | 1023 | 9876543210 | 445566 | 1 | BC2 (invalid length), BR1, AC1, PK1, OV1 | Request rejected. Error message indicating invalid bank code length. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC04 | Invalid branch code (non-numeric characters), other fields valid. | 123 | 1A33 | 9876543210 | 445566 | 1 | BC1, BR4 (invalid characters), AC1, PK1, OV1 | Request rejected. Error message indicating invalid branch code format. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC05 | Invalid account number (contains letters). | 123 | 1023 | A234567890 | 445566 | 1 | BC1, BR1, AC4 (invalid characters), PK1, OV1 | Request rejected. Error message indicating invalid account number format. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC06 | Invalid personal key (too short). | 123 | 1023 | 9876543210 | 123 | 1 | BC1, BR1, AC1, PK2 (invalid length), OV1 | Request rejected. Error message indicating invalid personal key length. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC07 | Invalid order value (numeric but unsupported option 3). | 123 | 1023 | 9876543210 | 445566 | 3 | BC1, BR1, AC1, PK1, OV3 (invalid value) | Request rejected. Error message indicating unsupported operation type. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC08 | Invalid order value (non-numeric). | 123 | 1023 | 9876543210 | 445566 | A | BC1, BR1, AC1, PK1, OV4 (invalid type) | Request rejected. Error message indicating invalid order value type. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC09 | Multiple invalid fields (bank code too long and branch code too short). | 1234 | 999 | 9876543210 | 445566 | 1 | BC3 (too long), BR2 (too short), AC1, PK1, OV1 | Request rejected. Error messages indicating invalid bank and branch codes. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC10 | Boundary valid values (all zeros but correct length). | 000 | 0000 | 0000000000 | 000000 | 1 | BC1, BR1, AC1, PK1, OV1 (boundary but valid) | Request accepted. Checkbook request successfully registered for boundary values. | User with no pending checkbook request. | New checkbook request stored in the system. |
| TC11 | Empty input for all fields. |  |  |  |  |  | All fields in invalid classes (empty/missing). | Request rejected. Error messages indicating that all fields are mandatory. | No pending operations for the user. | No request stored; state remains unchanged. |
| TC12 | Valid lengths but personal key contains non-numeric characters. | 123 | 1023 | 1234567890 | 12A456 | 2 | BC1, BR1, AC1, PK4 (invalid characters), OV2 | Request rejected. Error message indicating invalid personal key format. | No pending operations for the user. | No request stored; state remains unchanged. |

---

## Conclusions

The completion of Sprint 2 resulted in the creation of 12 fully detailed test cases, each derived directly from the equivalence classes defined in Sprint 1. This sprint marks the transition from theoretical test modeling to practical, structured QA documentation.

### Key Outcomes
- All test cases map to at least one valid or invalid equivalence class, ensuring systematic and complete coverage.  
- The test suite includes scenarios with simple errors, multi-field errors, boundary cases, and fully valid inputs, reflecting realistic banking system behaviors.  
- Each case documents inputs, expected results, and both initial and final system states, ensuring full traceability.  
- The Excel file includes a dedicated “Equivalence Class Alignment” column for improved clarity and auditability.  
- These 12 cases form the baseline for automated input validation during the Java simulation in Sprint 3.

### What Was Learned
- Equivalence Class Partitioning (ECP) significantly reduces the number of required test cases while preserving test coverage.  
- Banking input fields require strict validation to prevent operational, transactional, and security issues.  
- Multi-error scenarios highlight the importance of compound error handling in financial applications.  
- Boundary values, even when valid, must be tested to ensure stability and prevent unexpected system behavior.

### Preparedness for Sprint 3
The test cases developed in Sprint 2 will be used directly within the Java simulation to validate:
- Successful workflows with valid data  
- Error responses generated under invalid inputs  
- System behavior when handling boundary conditions  

Sprint 2 provides a complete and solid test foundation, enabling Sprint 3 to be implemented accurately and efficiently.

---

# ☕ Java Simulation (Sprint 3)

Validates:
- Bank Code  
- Branch Code  
- Account Number  
- Personal Key  
- Order Value  

Outputs:
- Success messages  
- Field-specific error messages  

Examples:
- One valid case  
- One invalid case  
- One boundary case  

Source file: `/src/BankSimulation.java`

---

## Sprint 3 — Test Case Execution (English)

This section documents how the Sprint 3 test cases were executed and the successful outcomes.

- Execution environment: Windows PowerShell, JDK 11+, Maven 3.x.
- Commands used:
	- Run unit tests: `mvn test`
	- Run simulation: `mvn compile exec:java`

- Executed cases (examples saved in `BankingQAApplication/evidence/execution_results.txt`):
	1. TC01 — Valid checkbook request
		 - Input: `bankCode=123`, `branchCode=1023`, `accountNumber=9876543210`, `personalKey=445566`, `orderValue=1`
		 - Expected: Accepted (no validation errors)
		 - Result: Accepted — "RESULT: VÁLIDO"

	2. TC05/TC03 mix — Invalid multi-field request
		 - Input: `bankCode=12` (too short), `branchCode=1A33` (non-numeric), `accountNumber=A234567890` (letters), `personalKey=123` (too short), `orderValue=3` (unsupported)
		 - Expected: Rejected with field-specific error messages
		 - Result: Rejected — errors returned for bank code, branch code, account number, personal key, order value

	3. TC10 — Boundary case (zeros)
		 - Input: `bankCode=000`, `branchCode=0000`, `accountNumber=0000000000`, `personalKey=000000`, `orderValue=1`
		 - Expected: Accepted if zeros meet length and numeric rules
		 - Result: Accepted — "RESULT: VÁLIDO"

- How the cases were executed:
	1. Tests: The 12 designed cases (TC01–TC12) were encoded as a JUnit 5 parameterized test (`@MethodSource`) in `BankRequestValidatorTest`. Running `mvn test` executed them as black-box checks (input → expected validity). All 12 tests passed.
	2. Simulation: `BankSimulation` contains a small `main` that builds three representative `BankRequest` instances (valid, invalid, boundary) and prints the `ValidationResult`. Running `mvn compile exec:java` produced console output which was captured and saved to `BankingQAApplication/evidence/execution_results.txt`.

- Evidence and artifacts:
	- `BankingQAApplication/evidence/execution_results.txt` — console output showing simulation results and detected validation messages.
	- `BankingQAApplication/pom.xml` — Maven project file used to run tests and simulation.
	- Source files: `BankingQAApplication/src/main/java/com/techready/banking/**` and tests in `BankingQAApplication/src/test/java/com/techready/banking/test/`.

Summary: The Sprint 3 simulation validates the equivalence-class based test cases in an automated, repeatable way. The three representative runs verify successful acceptance of valid and boundary inputs and correct rejection with detailed error messages for invalid inputs.

# 📁 Folder Structure

Repository root (`challenge_8`):

```
challenge_8/
├── BankingQAApplication/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── com/techready/banking/
│   │   │           ├── model/
│   │   │           │   ├── BankRequest.java
│   │   │           │   └── ValidationResult.java
│   │   │           ├── validation/
│   │   │           │   └── BankRequestValidator.java
│   │   │           └── simulation/
│   │   │               └── BankSimulation.java
│   │   └── test/
│   │       └── java/
│   │           └── com/techready/banking/test/
│   │               └── BankRequestValidatorTest.java
│   ├── docs/
│   │   ├── sprint1/
│   │   └── sprint2/
│   ├── evidence/
│   │   └── execution_results.txt
│   └── README.md (project-level docs)
├── Sprint 1/
├── Sprint 2/
└── Sprint 3/
```

Notes:
- The Sprint 3 README was consolidated into the root `README.md` and the `docs/sprint3` directory removed; evidence for simulation runs is under `BankingQAApplication/evidence`.

---

# ▶️ How to Run the Java Simulation

## 1. Compile
```bash
javac BankSimulation.java
```

## 2. Run
```bash
java BankSimulation
```

## 3. Follow prompts and observe validation results.

---

# 🧠 Findings & Best Practices
- Equivalence classes reduce test volume while ensuring coverage  
- Boundary tests reveal hidden weaknesses  
- Clear error messages increase product usability  
- Automated validation helps catch input failures early  

---


# 🌱 Sustainability 

## 1. Technical Sustainability
The project promotes long-term maintainability and software quality by documenting the entire testing workflow and validating banking input data through structured methodologies.  
Using **equivalence class partitioning**, reusable test cases, and a **Java-based input validation simulation** ensures that the system remains stable, scalable, and easy to update as requirements evolve.

**Key contributions:**
- Reusable validation logic that can be integrated into backend services.  
- Standardized documentation (PDF + Excel) that improves knowledge transfer.  
- Automated validation that reduces regression risks and repeated manual checks.

---

## 2. Economic Sustainability
This project increases the banking institution’s operational efficiency by reducing the cost of:
- Manual validation of user information  
- Handling user errors and failed transactions  
- Customer service tickets due to incorrect data entry  
- Operational risks associated with inconsistent or faulty inputs  

Automation ensures long-term savings and reduces dependencies on manual review processes.

---

## 3. Social Sustainability
Improved input validation contributes to:
- More secure and reliable online banking experiences  
- Greater accessibility for users with limited technical skills  
- Increased trust in financial digital services  
- Error-prevention mechanisms that protect vulnerable users from mistakes  

A reliable online platform strengthens the institution’s social responsibility and customer satisfaction.

---

## 4. Environmental Sustainability
While the project is software-based, strong digital infrastructure indirectly supports environmental goals by:
- Reducing unnecessary branch visits  
- Lowering energy use associated with error correction or repeated transactions  
- Minimizing paper-based statements through correct digital submissions  

Better validation → fewer mistakes → fewer resource-consuming interventions.

---

# 💰 Estimated Cost

## Assumptions
- QA Analyst hourly rate: **$20 USD/hour**  
- Estimated total workload (based on prior prioritization table): **~20–22 hours**  

---

## 1. Cost Breakdown

| Activity | Estimated Hours | Cost per Hour | Estimated Cost |
|----------|-----------------|---------------|----------------|
| Equivalence Class Definition | 3h | $20 | **$60** |
| Equivalence Class Documentation (PDF) | 2h | $20 | **$40** |
| Test Case Design (12 cases) | 4h | $20 | **$80** |
| Test Case Documentation (Excel) | 1.5h | $20 | **$30** |
| Java Simulation Development | 4h | $20 | **$80** |
| Execution Examples | 2h | $20 | **$40** |
| Simulation README | 1h | $20 | **$20** |
| Third-Party Review | 1h | $20 | **$20** |
| Findings Report | 1h | $20 | **$20** |

### Total Estimated Cost:  
# **💵 $390 USD**

---

## 2. Optional/Indirect Costs

| Category | Estimated Cost |
|----------|----------------|
| Software tools (IDE, PDF tools, Office suite) | $0–$50 |
| Infrastructure (electricity, equipment wear) | $10–$20 |
| Communication cycles/feedback rounds | $15–$30 |

### Possible Grand Total:  
# **💵 $420–$460 USD**

---

## 3. Cost–Benefit Justification
A structured QA process prevents costly failures in production.  
Even one invalid banking operation may cost:

- Customer dissatisfaction  
- Compliance penalties  
- Manual correction labor  
- System fixes  

The **$390 USD investment** helps prevent losses potentially exceeding several thousand dollars.

---

# 📄 License
Academic use – TechnoReady In-Mexico Bootcamp.

---

**Developed by:**  
👤 *Johan Alejandro Gloria González* & *Iván Kaleb Ramírez Torres*  
📍 Monterrey City | TechnoReady Bootcamp 2025  
🧠 *Commitment to software reliability, learning, and sustainable innovation.*