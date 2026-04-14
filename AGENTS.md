# AGENTS.md - Codebase Guide for AI Coding Agents

> 📖 Full design pattern theory with diagrams: [`docs/design-patterns.md`](docs/design-patterns.md)

## Project Overview

This is a **Java learning/practice project** focused on Design Patterns and Data Structures & Algorithms (DSA). It's an IntelliJ IDEA project with modular organization, not a production system.

**Module:** `java_DSA` | **Source Root:** `java_DSA/src` | **Package Structure:** Hierarchical by algorithm/pattern type

---

## Architecture & Major Components

### 1. **Design Patterns** (`design_patten/`)
Three main categories with dedicated Main.java entry points:

- **Creational** (`creational/Main.java`): Singleton, Factory, Builder, Prototype, Abstract Factory
- **Structural** (`structural/Main.java`): Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
- **Behavioral** (`behavioral/Main.java`): Observer, Strategy, Command, Chain of Responsibility, Mediator, Memento, State, Template Method, Iterator, Visitor, Interpreter

**Key Pattern:** Each Main.java has `testPatternName()` methods calling pattern implementations. Test methods use print statements with separator comments like `--------- Testing Pattern Name ---------` for output organization.

### 2. **Data Structures & Algorithms** (`DSA/`)
Two primary sections:

- **Algorithm/** - Organized by technique: Backtracking, Bit_Manipulation, Greedy, Mathematics_and_Number_Theory, Recursion, Sliding_Window, Sorting_and_Searching
- **Data_structure/** - Types: ListDataStructure, MapDataStructure, QueueDataStructure, Set_Data_Structure

### 3. **Practice Section** (`pratice_section/`)
Interview & placement prep problems:

- **Accenture/** - Company-specific questions (q1.java through q8.java + Test.java)
- **Array_QUS/** - Array problems (Q1.java through Q22.java)
- **String_QUS/** - String manipulation problems
- **Pattern_Question/** - Pattern printing problems (q1.java through q13.java)
- **Class_Pratice/** - Object-oriented practice (c1.java through c6.java)

### 4. **Java Basics** (`java_basic/`)
Foundation topics with subdirectories:
- `exceptionHandelling/` - Exception handling examples
- `generic/` - Generics practice
- `JDBC/` - Database connectivity
- `OPPS_IN_JAVA/` - OOP concepts
- `RegularExpression/` - Regex patterns
- `staticDemo/` - Static members
- `Threading/` - Multithreading examples

---

## Critical Developer Workflows

### Running Code
- **IDE Setup:** IntelliJ IDEA is configured. Right-click Main.java → Run (no external build tool)
- **Compilation:** Use IDE's built-in compiler or `javac`
- **Execution:** Main classes exist as entry points; single-file problems can be run directly
- **No Build Tool:** No Maven/Gradle - purely classpath-based Java project

### File Execution Pattern
Single Java files with `main()` are self-contained and runnable. Examples:
```bash
javac java_DSA/src/design_patten/creational/Main.java
java -cp java_DSA/src design_patten.creational.Main
```

### Testing Approach
- Manual testing via print statements (no JUnit framework)
- Test methods print before/after separators for clarity
- No automated test suite - direct output verification

---

## Project-Specific Conventions

### Naming Conventions
- **Package names:** Lowercase with underscores for multi-word (e.g., `chain_of_resposibility`, `sliding_window`)
- **Class names:** PascalCase for patterns, sometimes lowercase for practice files (e.g., `q1.java`, `Q1.java` inconsistency)
- **Method names:** camelCase with `test` prefix for pattern demonstrations (`testSingleton`, `testFactory`)

### ⚠️ Known Typos — Naming Policy

These typos exist in the codebase. **Do not rename existing packages** (breaks existing class references). Apply correct spelling only when creating **new** folders/classes.

| Current (keep as-is) | Correct spelling for new code |
|----------------------|-------------------------------|
| `adpter/` | `adapter/` |
| `tamplate_method/` | `template_method/` |
| `chain_of_resposibility/` | `chain_of_responsibility/` |
| `Manger` (class) | `Manager` |
| `ConcreateVisitor` (class) | `ConcreteVisitor` |
| `pratice_section/` | `practice_section/` |

### Code Organization Patterns
1. **Pattern implementations:** Each pattern has its own package with interface/abstract class + concrete implementations
2. **Main.java structure:** Sequential test method calls with clear output separation
3. **Algorithm problems:** Direct problem solution in main() or static methods, no class abstraction for simple problems
4. **Scanner-based input:** Used in interview questions (e.g., Accenture section)

### Comment Style
- Comments limited to algorithm explanations (e.g., `// sliding - window Algorithm approach`)
- No Javadoc; minimal documentation
- Output separators are primary documentation mechanism

---

## Integration Points & Dependencies

### External Dependencies
**None.** Project uses only Java standard library (java.util, java.util.Scanner, java.io).

### Cross-Component Communication
- **Design Patterns → Main.java**: Patterns are instantiated and called from Main.java entry points
- **DSA problems:** Standalone—each file solves independently
- **No shared utilities:** Each problem/pattern is self-contained

### Package Dependencies
- Patterns import only their own package classes
- Practice section files import only Java.util and Scanner
- No inter-pattern or inter-algorithm dependencies

---

## File Modification Guidelines

### When Adding Patterns
1. Create new package under `design_patten/{creational|behavioral|structural}/pattern_name/`
2. Implement pattern classes (interface/abstract + concrete)
3. Add `testPatternName()` method to the respective Main.java
4. Call test method from main()
5. Follow existing separator comment style

**Copy-paste template for a new pattern class:**
```java
package design_patten.creational.your_pattern;

public class YourClass {
    // implementation
}
```

**Copy-paste template for a new `testXxx()` method in Main.java:**
```java
private static void testYourPattern() {
    System.out.println("--------- Testing YourPattern Pattern ---------");
    // instantiate and exercise your pattern here
    System.out.println("--------- Testing YourPattern Pattern ---------");
}
```

### When Adding DSA Problems
1. Create file in appropriate Algorithm subdirectory with PascalCase name (Q#.java or Pattern matching existing folder)
2. Structure: package declaration → imports → class with main() → helper methods
3. Use static methods for problem solutions
4. Input via hardcoded values or Scanner for interview problems
5. Output via System.out.println()

**Copy-paste template for a DSA problem:**
```java
package DSA.Algorithm.sliding_window;

public class Q1 {
    public static void main(String[] args) {
        // hardcoded test input
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        // your solution
        return 0;
    }
}
```

### When Adding Practice Questions
1. Match existing file naming: lowercase `q#.java` for Accenture, `Q#.java` for Array/String
2. Use Scanner for user input patterns (interview simulation)
3. Single solution method (e.g., `sol()`) called from main()
4. No external dependencies

**Copy-paste template for interview practice (Scanner-based):**
```java
package pratice_section.Accenture;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        int n = sc.nextInt();
        System.out.println(sol(n));
    }

    public static int sol(int n) {
        // solution
        return n;
    }
}
```

---

## Code Examples from Codebase

### Pattern Implementation Example
```java
// From design_patten/creational/Main.java - Demonstrates entry point structure
private static void testBuilder(){
    System.out.println("--------- Testing Builder Pattern ---------");
    User user = User.Builder()
            .setName("Narayanamaharana")
            .setEmail("narayanamaharana@gmail.com")
            .setAge(30)
            .build();
    System.out.println(user);
    System.out.println("--------- Testing Builder Pattern ---------");
}
```

### Algorithm Problem Example
```java
// From pratice_section/Array_QUS/Q1.java - Sliding window pattern
static int maxSumOfSubArray(int[] arr,int k,int[]res){
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int i = 0, j = 0;
    while (j<arr.length){
        // Window logic here
    }
    return max;
}
```

---

## AI Agent Specific Instructions

### Before Adding Code
1. **Check existing patterns:** Verify if a similar pattern/algorithm exists in the codebase
2. **Respect module structure:** New code goes in appropriate java_DSA subdirectory
3. **Follow package naming:** Use the established hierarchy (no random new packages at root level)

### When Debugging Problems
1. Look at Main.java entry points first—they demonstrate the intended usage
2. For pattern problems, check the test method in Main.java to understand expected behavior
3. For DSA problems, run the file directly to see output

### Common Tasks
- **Adding a new design pattern:** See `design_patten/{category}/pattern_name/` and add test to Main.java
- **Adding an algorithm:** Place in DSA/Algorithm/{category}/ and ensure it has static main() or is called from existing entry point
- **Adding interview questions:** Mirror structure in `pratice_section/{company_or_topic}/`
- **Fixing package conflicts:** Check java_DSA/src/ is the only source root (confirmed in Java_code.iml)

---

## Quick Reference

| Task | Location | File Pattern | Entry Point |
|------|----------|--------------|-------------|
| View design patterns | `design_patten/{creational,behavioral,structural}/` | `Main.java` | `testPatternName()` |
| Browse DSA | `DSA/Algorithm/` or `DSA/Data_structure/` | `*.java` | `main()` per file |
| Interview prep | `pratice_section/{Accenture,Array_QUS,String_QUS}` | `q#.java` or `Q#.java` | `main()` with Scanner |
| Java basics | `java_basic/{topic}/` | `*.java` | `main()` |

---

## Build & Runtime Notes

- **JDK Version:** IntelliJ project; uses system JDK
- **Output:** `out/` directory contains compiled classes
- **No dependencies to manage:** Standard Java only
- **IDE Configuration:** See `.idea/` and `Java_code.iml` for IntelliJ settings

