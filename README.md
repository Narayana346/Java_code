# Java Design Patterns & DSA

A Java learning project covering **all 23 GoF Design Patterns**, **DSA algorithms**, and **interview practice problems** — built with pure Java, no build tools required.

> 📖 **Full pattern theory with diagrams →** [`docs/design-patterns.md`](docs/design-patterns.md)
> 🤖 **AI agent guide →** [`AGENTS.md`](AGENTS.md)

---

## 🚀 Quick Start

```bash
cd java_DSA/src

# Run all Creational patterns
javac design_patten/creational/Main.java && java -cp . design_patten.creational.Main

# Run all Behavioral patterns
javac design_patten/behavioral/Main.java && java -cp . design_patten.behavioral.Main

# Run all Structural patterns
javac design_patten/structural/Main.java && java -cp . design_patten.structural.Main

# Run a DSA problem
javac pratice_section/Array_QUS/Q1.java && java -cp . pratice_section.Array_QUS.Q1
```

> **IDE:** Open in IntelliJ IDEA → right-click any `Main.java` → Run. No Maven/Gradle needed.

---

## 📦 What's Inside

| Section | Location | Entry Point |
|---------|----------|-------------|
| **Creational Patterns** (5) | `design_patten/creational/` | `creational/Main.java` |
| **Structural Patterns** (7) | `design_patten/structural/` | `structural/Main.java` |
| **Behavioral Patterns** (11) | `design_patten/behavioral/` | `behavioral/Main.java` |
| **DSA Algorithms** | `DSA/Algorithm/` | per-file `main()` |
| **Data Structures** | `DSA/Data_structure/` | per-file `main()` |
| **Array Problems** (22) | `pratice_section/Array_QUS/` | per-file `main()` |
| **String Problems** | `pratice_section/String_QUS/` | per-file `main()` |
| **Accenture Prep** (8) | `pratice_section/Accenture/` | per-file `main()` with Scanner |
| **Java Basics** | `java_basic/` | per-file `main()` |

---

## 🏗️ Design Patterns At a Glance

### Creational — *How objects are created*
| Pattern | One-liner | Source |
|---------|-----------|--------|
| **Singleton** | One instance, global access | `singleton/BasicSingleton.java` |
| **Factory** | Factory decides which class to make | `factory/ShapeFactory.java` |
| **Builder** | Fluent step-by-step construction | `builder/User.java` |
| **Prototype** | Clone existing objects | `prototype/Prototype.java` |
| **Abstract Factory** | Family of related objects | `abstract_factory/` |

### Structural — *How objects are composed*
| Pattern | One-liner | Source |
|---------|-----------|--------|
| **Adapter** | Bridge incompatible interfaces | `adpter/Adapter.java` |
| **Bridge** | Decouple abstraction from implementation | `bridge/` |
| **Composite** | Tree of part-whole objects | `composite/` |
| **Decorator** | Wrap objects to add behaviour | `decorator/` |
| **Facade** | Single entry point to subsystem | `facade/ComputerFacade.java` |
| **Flyweight** | Share objects to save memory | `flyweight/` |
| **Proxy** | Controlled access placeholder | `proxy/` |

### Behavioral — *How objects communicate*
| Pattern | One-liner | Source |
|---------|-----------|--------|
| **Observer** | Notify all subscribers on change | `observer/Channel.java` |
| **Strategy** | Swap algorithms at runtime | `strategy/` |
| **Command** | Encapsulate request as object | `command/` |
| **Chain of Resp.** | Pass request along handler chain | `chain_of_resposibility/` |
| **Mediator** | Central hub for object comms | `mediator/` |
| **Memento** | Save and restore state | `memento/` |
| **State** | Behavior changes with state | `state/` |
| **Template Method** | Algorithm skeleton, steps in subclass | `tamplate_method/` |
| **Iterator** | Traverse collection without exposing internals | `iterator/` |
| **Visitor** | Add operations without changing classes | `visitor/` |
| **Interpreter** | Evaluate grammar/expressions | `interpreter/` |

> Full definitions, ASCII diagrams, and examples: [`docs/design-patterns.md`](docs/design-patterns.md)

---

## 📁 Project Structure

```
Java_code/
├── docs/
│   └── design-patterns.md    ← Full pattern reference
├── java_DSA/src/
│   ├── design_patten/
│   │   ├── creational/Main.java
│   │   ├── behavioral/Main.java
│   │   └── structural/Main.java
│   ├── DSA/
│   │   ├── Algorithm/        ← Backtracking, Greedy, Recursion, etc.
│   │   └── Data_structure/   ← List, Map, Queue, Set
│   ├── pratice_section/
│   │   ├── Array_QUS/        ← Q1–Q22
│   │   ├── String_QUS/
│   │   ├── Accenture/        ← q1–q8 (Scanner-based)
│   │   └── pattern_question/ ← q1–q13
│   └── java_basic/           ← Threading, JDBC, OOP, Generics…
├── AGENTS.md
└── README.md
```

---

## 📚 Resources

- [Refactoring Guru – Design Patterns](https://refactoring.guru/design-patterns)
- [Gang of Four (GoF) Book](https://en.wikipedia.org/wiki/Design_Patterns)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)

---

**Last Updated:** April 14, 2026

