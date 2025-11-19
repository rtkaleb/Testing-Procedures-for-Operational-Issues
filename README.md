
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
12 test cases include:

- ID  
- Description  
- Input values  
- Equivalence class alignment  
- Expected result  
- Initial and final state  

Excel file located at `/docs/sprint2/12_Test_Cases.xlsx`.

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

# 📁 Folder Structure

```
/
├── docs/
│   ├── sprint1/
│   ├── sprint2/
│   └── sprint3/
├── src/
│   └── BankSimulation.java
├── evidence/
└── README.txt
```

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