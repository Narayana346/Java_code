# Java Design Patterns & DSA Learning Project

A comprehensive Java project covering **Design Patterns** and **Data Structures & Algorithms (DSA)** with practical implementations and interview preparation materials.

---

## 📚 Table of Contents

1. [Creational Patterns](#creational-patterns)
2. [Structural Patterns](#structural-patterns)
3. [Behavioral Patterns](#behavioral-patterns)
4. [Project Structure](#project-structure)

---

## 🏗️ CREATIONAL PATTERNS

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

### 1. **Singleton Pattern**

**Definition:** Ensures that a class has only one instance (object) and provides a global point of access to it.

**Use Cases:**
- Logging
- Database connections
- Configuration managers
- Thread pools

**Diagram:**
```
┌─────────────────────────┐
│   BasicSingleton        │
├─────────────────────────┤
│ - instance: static      │
├─────────────────────────┤
│ - BasicSingleton()      │ ◄── Private Constructor
│ + getInstance()         │     (Lazy Initialization)
└─────────────────────────┘
        ▲
        │
        └── Only ONE instance
```

**Key Implementation Details:**
- Static instance variable
- Private constructor to prevent instantiation
- Public `getInstance()` method for lazy initialization
- **Note:** Not thread-safe in basic implementation

---

### 2. **Factory Pattern**

**Definition:** Defines an interface for creating an object, but let's subclasses or factory decide which class to instantiate. It encapsulates object creation logic in a factory class.

**Use Cases:**
- GUI framework (creating buttons, windows)
- Database drivers
- Framework extensions
- Plugin systems

**Diagram:**
```
         ┌──────────────────┐
         │   ShapeFactory   │
         ├──────────────────┤
         │ + getShape()     │
         └──────────────────┘
                  │
        ┌─────────┼─────────┐
        │         │         │
        ▼         ▼         ▼
    ┌─────────┐ ┌───────────┐ ┌──────────┐
    │ Circle  │ │ Rectangle │ │ Triangle │
    └─────────┘ └───────────┘ └──────────┘
        all implement Shape interface
```

**Key Implementation Details:**
- Factory class with `getShape()` method
- Based on string input, returns appropriate shape instance
- Centralizes object creation logic
- Easy to extend with new shape types

---

### 3. **Builder Pattern**

**Definition:** Separates the construction of a complex object from its representation so that the same construction process can create different representations. Provides a fluent interface for creating objects with many optional parameters.

**Use Cases:**
- Creating objects with many parameters
- Complex object construction
- API request builders
- Configuration builders

**Diagram:**
```
┌────────────────────┐
│      User          │
├────────────────────┤
│ - name             │
│ - email            │
│ - address          │
│ - age              │
└────────────────────┘
          ▲
          │
┌─────────────────────────────┐
│    User.Builder             │
├─────────────────────────────┤
│ + setName()                 │
│ + setEmail()                │
│ + setAddress()              │
│ + setAge()                  │
│ + build()                   │
└─────────────────────────────┘
   (Returns Builder for chaining)
```

**Key Implementation Details:**
- Static nested `Builder` class
- Setter methods return `this` for method chaining
- `build()` method creates the final object
- Provides fluent interface for readability

**Usage Example:**
```java
User user = User.Builder()
    .setName("Narayanamaharana")
    .setEmail("email@example.com")
    .setAge(30)
    .build();
```

---

### 4. **Prototype Pattern**

**Definition:** Creates new objects by copying an existing object (prototype) rather than creating from scratch. Uses cloning to create objects without knowing their concrete classes.

**Use Cases:**
- Object cloning
- Undo/Redo functionality
- Avoiding expensive object creation
- Deep copy scenarios

**Diagram:**
```
┌──────────────────────┐
│   Prototype          │
├──────────────────────┤
│ - name: String       │
├──────────────────────┤
│ + clone()            │
│ + equals()           │
└──────────────────────┘
         │
         │ implements Cloneable
         │
    ┌────┴────┐
    │          │
    ▼          ▼
   p1         p2  (identical content, different instances)
```

**Key Implementation Details:**
- Implements `Cloneable` interface
- Overrides `clone()` method
- `super.clone()` creates shallow copy
- `equals()` compares content

**Important Note:** `p1 == p2` is `false` (different objects), but `p1.equals(p2)` is `true` (same content)

---

### 5. **Abstract Factory Pattern**

**Definition:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes. Useful for creating themed sets of objects.

**Use Cases:**
- GUI toolkits (Windows/Mac/Linux themes)
- Cross-platform UI components
- Database abstraction layers
- Operating system specific operations

**Diagram:**
```
┌─────────────────────┐
│   GUIFactory        │
├─────────────────────┤
│ + createButton()    │
└─────────────────────┘
         ▲
         │
    ┌────┴─────┐
    │           │
    ▼           ▼
┌──────────┐  ┌──────────┐
│ Windows  │  │   Mac    │
│ Factory  │  │ Factory  │
└──────────┘  └──────────┘
    │              │
    ├─ Button  ├─ Button
    ├─ Input   ├─ Input
    └─ Menu    └─ Menu
    (Platform-specific components)
```

**Key Implementation Details:**
- Factory interface for creating families of objects
- Concrete factories for each family (Windows, Mac)
- All created objects implement common interfaces
- Maintains consistency within a family

---

## 🔗 STRUCTURAL PATTERNS

Structural patterns deal with object composition, creating relationships between entities to form larger structures.

### 1. **Adapter Pattern**

**Definition:** Converts the interface of a class into another interface clients expect. Allows incompatible interfaces to work together by wrapping an incompatible object in an adapter.

**Use Cases:**
- Legacy code integration
- Third-party library integration
- Converting between different APIs
- Format conversion (audio, video)

**Diagram:**
```
┌──────────────────┐
│   MediaPlayer    │  ◄── Expected Interface
│  + play()        │
└──────────────────┘
         ▲
         │ implements
┌────────────────────────┐
│     Adapter            │
├────────────────────────┤
│ - advancedPlayer       │
│ + play(fileName)       │
└────────────────────────┘
         │ uses
         │
┌────────────────────────┐
│ AdvancedPlayer         │
├────────────────────────┤
│ + playMp4()            │  ◄── Incompatible Interface
│ + playVlc()            │
└────────────────────────┘
```

**Key Implementation Details:**
- Adapter implements the expected interface
- Contains reference to the incompatible class
- Maps methods from expected interface to actual interface

---

### 2. **Bridge Pattern**

**Definition:** Decouples an abstraction from its implementation so that the two can vary independently. Creates a bridge between abstraction and implementation.

**Use Cases:**
- Separating UI from business logic
- Device abstraction (printer drivers)
- Database abstraction layers
- Graphics rendering systems

**Diagram:**
```
         Abstraction
        ┌─────────────┐
        │   Remote    │
        ├─────────────┤
        │ - device    │◄─── Bridge
        │ + power()   │
        └─────────────┘
                │
                │ has-a
                │
        ┌───────────────────┐
        │  Implementation   │
        ├───────────────────┤
        │   + powerOn()     │
        │   + powerOff()    │
        └───────────────────┘
            ▲
            │
        ┌───┴───┐
        │       │
    ┌────────┐ ┌────┐
    │   TV   │ │ Fan│
    └────────┘ └────┘
```

---

### 3. **Composite Pattern**

**Definition:** Composes objects into tree structures to represent part-whole hierarchies. Lets clients treat individual objects and compositions of objects uniformly.

**Use Cases:**
- File system structures
- Organization hierarchies (Manager/Employee)
- GUI component trees
- Document structures (folders, files)

**Diagram:**
```
           Manager
          /      \
       Dev1      Dev2
       
  (Composite)   (Leaf)
  
  Manager acts as container
  Developer acts as individual
  Both can be treated uniformly
```

---

### 4. **Decorator Pattern**

**Definition:** Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Use Cases:**
- Adding features to existing objects
- Input/Output stream wrapping
- UI component enhancement
- Pizza ordering system (toppings)

**Diagram:**
```
┌─────────────┐
│   Coffee    │
├─────────────┤
│ + getDesc() │
└─────────────┘
       ▲
       │ implements
    ┌──┴──────────────────┐
    │                     │
┌─────────────┐  ┌────────────────┐
│SimpleCoffee │  │ MilkDecorator  │
└─────────────┘  ├────────────────┤
                 │ - coffee       │
                 │ + getDesc()    │
                 └────────────────┘
                       │
                  wraps and enhances
```

**Example Flow:**
```
SimpleCoffee → "Coffee"
SimpleCoffee + MilkDecorator → "Coffee, Milk"
SimpleCoffee + MilkDecorator + SugarDecorator → "Coffee, Milk, Sugar"
```

---

### 5. **Facade Pattern**

**Definition:** Provides a unified, simplified interface to a set of interfaces in a subsystem. Hides the complexity of multiple classes/interactions behind a single interface.

**Use Cases:**
- Simplifying complex systems
- Library APIs
- Database connection pooling
- Computer startup (CPU, Memory, Disk)

**Diagram:**
```
         ┌──────────────────┐
         │ ComputerFacade   │
         ├──────────────────┤
         │ + start()        │◄─── Unified Interface
         └──────────────────┘
              │
    ┌─────────┼──────────┐
    │         │          │
    ▼         ▼          ▼
  ┌────┐   ┌────────┐  ┌────┐
  │CPU │   │ Memory │  │Disk│
  └────┘   └────────┘  └────┘
  (Complex subsystems hidden)
```

---

### 6. **Flyweight Pattern**

**Definition:** Uses sharing to support large numbers of fine-grained objects efficiently by sharing common state between multiple objects.

**Use Cases:**
- String pooling
- Object pooling
- Texture caching in games
- Character rendering (fonts)

**Diagram:**
```
┌────────────────────┐
│  ShapeFactory      │
├────────────────────┤
│ - shapeMap         │
│ + getShape()       │
└────────────────────┘
        │
        ├─ "red"   ─► Red Shape (shared)
        ├─ "blue"  ─► Blue Shape (shared)
        ├─ "black" ─► Black Shape (shared)
        └─ ...
        
Same objects reused instead of creating new ones
```

---

### 7. **Proxy Pattern**

**Definition:** Provides a substitute or placeholder for another object to control access to it. Acts as a surrogate to regulate access to the actual object.

**Use Cases:**
- Access control (authentication)
- Lazy loading
- Logging/monitoring
- Caching
- Remote object access

**Diagram:**
```
     Client
        │
        │ uses
        ▼
┌──────────────────┐
│ ProxyInternet    │
├──────────────────┤
│ + connectTo()    │ ◄─── Controls Access
└──────────────────┘
        │
    ┌───┴─── Validates request
    │
    ▼
┌──────────────────┐
│ RealInternet     │
├──────────────────┤
│ + connectTo()    │ ◄─── Actual Object
└──────────────────┘
```

---

## 👥 BEHAVIORAL PATTERNS

Behavioral patterns deal with object collaboration and distribution of responsibility. They identify common communication patterns and object relationships.

### 1. **Observer Pattern**

**Definition:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

**Use Cases:**
- Event handling systems
- Publisher-subscriber systems
- Model-View-Controller (MVC)
- Real-time notifications
- Social media subscriptions

**Diagram:**
```
┌─────────────┐
│   Channel   │
│  (Subject)  │
├─────────────┤
│ - observers │
│ + subscribe │
│ + notify    │
└─────────────┘
        │
        │ notifies
    ┌───┼───┐
    │   │   │
    ▼   ▼   ▼
  ┌──────────────┐
  │  Observer 1  │
  │  Observer 2  │ ◄─── Multiple Observers
  │  Observer 3  │
  └──────────────┘
     All updated
```

**Example Flow:**
```
1. Observable objects subscribe to Channel
2. Channel notifyAll("Hello") is called
3. All observers receive the message and update
4. Observers can unsubscribe
```

---

### 2. **Strategy Pattern**

**Definition:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Lets the algorithm vary independently from clients that use it.

**Use Cases:**
- Payment methods (Credit Card, UPI, Wallet)
- Sorting algorithms
- Compression formats
- Authentication methods
- Route planning

**Diagram:**
```
┌──────────────────┐
│ PaymentContext   │
├──────────────────┤
│ - payment        │
│ + executePayment │
└──────────────────┘
        │
        │ uses
        ▼
┌──────────────────┐
│   Payment        │ ◄─── Strategy Interface
│ + pay()          │
└──────────────────┘
        ▲
        │
    ┌───┴───┐
    │       │
┌────────┐ ┌────────┐
│CreditC │ │  UPI   │ ◄─── Concrete Strategies
└────────┘ └────────┘
```

**Usage Pattern:**
```
PaymentContext context = new PaymentContext();
context.setPayment(new CreditCard());  // Strategy 1
context.executePayment();

context.setPayment(new UPI());          // Strategy 2
context.executePayment();
```

---

### 3. **Command Pattern**

**Definition:** Encapsulates a request as an object thereby letting you parameterize clients with different requests, queue requests, and log the requests.

**Use Cases:**
- Undo/Redo functionality
- Queuing tasks
- Macro recording
- Remote controls
- GUI button actions

**Diagram:**
```
┌──────────────────┐
│   Command        │ ◄─── Command Interface
├──────────────────┤
│ + execute()      │
└──────────────────┘
        ▲
        │
┌───────────────────────┐
│LightOperationCommand  │
├───────────────────────┤
│ - light               │
│ - operation           │
│ + execute()           │
└───────────────────────┘
        │
        │ invokes
        ▼
┌─────────┐
│  Light  │
│ + on()  │
│ + off() │
└─────────┘
```

---

### 4. **Chain of Responsibility Pattern**

**Definition:** Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Passes the request along a chain of handlers.

**Use Cases:**
- Request approval workflows (low/medium/high)
- Event handling chains
- Logging frameworks with levels
- Exception handling
- Middleware in web frameworks

**Diagram:**
```
           Request (value: 5, 15)
              │
              ▼
        ┌────────────┐
        │ LowHandler │ (handles < 10)
        └────────────┘
              │
         if not handled
              │
              ▼
        ┌────────────┐
        │HighHandler │ (handles >= 10)
        └────────────┘
              │
         if not handled
              │
              ▼
          Request not handled
```

---

### 5. **Mediator Pattern**

**Definition:** Defines an object that encapsulates how a set of objects interact. Promotes loose coupling by keeping objects from referring to each other explicitly and letting a mediator object handle their interactions.

**Use Cases:**
- Chat room (mediator for messages)
- Air traffic control system
- GUI dialog boxes
- Game AI coordination
- MVC controllers

**Diagram:**
```
┌──────────────┐
│   Mediator   │ ◄─── Central Communication Hub
└──────────────┘
      ▲  ▲
      │  │
    ┌─┘  └─┐
    │      │
  Sender1  Sender2

All communication through Mediator
(No direct Sender-to-Sender communication)
```

---

### 6. **Memento Pattern**

**Definition:** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later (Undo functionality).

**Use Cases:**
- Undo/Redo functionality
- Snapshots/Save states
- Transaction rollback
- Application state restoration
- Game checkpoints

**Diagram:**
```
┌─────────────────┐
│   Originator    │
├─────────────────┤
│ - state         │
│ + getState()    │
│ + setState()    │
│ + saveState()   │
│ + restore()     │
└─────────────────┘
        │
  saves state
        │
        ▼
┌─────────────────┐
│    Memento      │ ◄─── Immutable snapshot
├─────────────────┤
│ - state         │
│ + getState()    │
└─────────────────┘

Originator → "State 1"
Save Memento → {state: "State 1"}
Change → "State 2"
Restore from Memento → "State 1" (recovered)
```

---

### 7. **State Pattern**

**Definition:** Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Use Cases:**
- Traffic light states (Red/Yellow/Green)
- Media player states (Play/Pause/Stop)
- User session states (Login/Logout)
- Order states (Pending/Processing/Delivered)
- Game character states (Idle/Running/Jumping)

**Diagram:**
```
┌────────────┐
│  Context   │
├────────────┤
│ - state    │
│ + request()│
└────────────┘
       │
    uses
       │
       ▼
┌────────────┐
│   State    │ ◄─── Abstract State
├────────────┤
│ + handle() │
└────────────┘
       ▲
       │
    ┌──┴──┐
    │     │
┌────┐  ┌────┐
│ ON │  │OFF │ ◄─── Concrete States
└────┘  └────┘
```

**State Transitions:**
```
ON → request() → OFF
OFF → request() → ON
```

---

### 8. **Template Method Pattern**

**Definition:** Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

**Use Cases:**
- Framework templates
- Game algorithms
- Document processing
- Database operations
- Build processes

**Diagram:**
```
┌──────────────────┐
│      Game        │ ◄─── Template
├──────────────────┤
│ + run()          │ ◄─── Final template method
│ # initialize()   │ ┐
│ # startPlay()    │ ├─── Overridable steps
│ # endPlay()      │ ┘
└──────────────────┘
       ▲
       │
    ┌──┴──┐
    │     │
┌────────┐  ┌──────────┐
│Cricket │  │ Football │ ◄─── Concrete implementations
└────────┘  └──────────┘
```

---

### 9. **Iterator Pattern**

**Definition:** Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

**Use Cases:**
- Collection iteration (List, Set, Map)
- Tree traversal
- Custom data structure traversal
- Page navigation
- Cursor operations

**Diagram:**
```
┌─────────────────┐
│  Aggregate      │
├─────────────────┤
│ + iterator()    │
└─────────────────┘
        │
        │ creates
        ▼
┌─────────────────┐
│   Iterator      │
├─────────────────┤
│ + hasNext()     │
│ + next()        │
│ + remove()      │
└─────────────────┘
        │
        └─ Sequentially accesses elements
```

---

### 10. **Visitor Pattern**

**Definition:** Represents an operation to be performed on the elements of an object structure. Lets you define a new operation without changing the classes of the elements on which it operates.

**Use Cases:**
- Compiler abstract syntax tree (AST) traversal
- Document structure processing
- Game object behaviors
- Reporting engines
- File system operations

**Diagram:**
```
┌─────────────┐
│   Element   │ ◄─── Object Structure
├─────────────┤
│ + accept()  │
└─────────────┘
       │
       │ accepts
       │
       ▼
┌──────────────┐
│   Visitor    │ ◄─── New Operation
├──────────────┤
│ + visit()    │
└──────────────┘
```

---

### 11. **Interpreter Pattern**

**Definition:** Defines a representation for a grammar and an interpreter to interpret sentences in that language. Used to build domain-specific languages (DSLs).

**Use Cases:**
- SQL parsers
- Expression evaluators
- Configuration language interpreters
- Pattern matching
- Query languages

**Diagram:**
```
┌──────────────┐
│  Expression  │ ◄─── Grammar
├──────────────┤
│ + interpret()│
└──────────────┘
       ▲
       │
    ┌──┴──┐
    │     │
┌────────┐  ┌────────┐
│ Number │  │Operator│ ◄─── Implementations
└────────┘  └────────┘
```

---

## 📁 Project Structure

```
Java_code/
├── java_DSA/
│   └── src/
│       ├── design_patten/
│       │   ├── creational/
│       │   │   ├── Main.java
│       │   │   ├── singleton/
│       │   │   ├── factory/
│       │   │   ├── builder/
│       │   │   ├── prototype/
│       │   │   └── abstract_factory/
│       │   ├── behavioral/
│       │   │   ├── Main.java
│       │   │   ├── observer/
│       │   │   ├── strategy/
│       │   │   ├── command/
│       │   │   ├── chain_of_resposibility/
│       │   │   ├── mediator/
│       │   │   ├── memento/
│       │   │   ├── state/
│       │   │   ├── tamplate_method/
│       │   │   ├── iterator/
│       │   │   ├── visitor/
│       │   │   └── interpreter/
│       │   └── structural/
│       │       ├── Main.java
│       │       ├── adpter/
│       │       ├── bridge/
│       │       ├── composite/
│       │       ├── decorator/
│       │       ├── facade/
│       │       ├── flyweight/
│       │       └── proxy/
│       ├── DSA/
│       │   ├── Algorithm/
│       │   │   ├── Backtracking/
│       │   │   ├── Bit_Manipulation/
│       │   │   ├── Greedy/
│       │   │   ├── Mathematics_and_Number_Theory/
│       │   │   ├── Recursion/
│       │   │   ├── Sliding_Window/
│       │   │   └── Sorting_and_Searching/
│       │   └── Data_structure/
│       │       ├── ListDataStructure/
│       │       ├── MapDataStructure/
│       │       ├── QueueDataStructure/
│       │       └── Set_Data_Structure/
│       ├── pratice_section/
│       │   ├── Accenture/
│       │   ├── Array_QUS/
│       │   ├── String_QUS/
│       │   ├── Pattern_Question/
│       │   └── Class_Pratice/
│       └── java_basic/
│           ├── exceptionHandelling/
│           ├── generic/
│           ├── JDBC/
│           ├── OPPS_IN_JAVA/
│           ├── RegularExpression/
│           ├── staticDemo/
│           └── Threading/
├── AGENTS.md
└── README.md
```

---

## 🚀 Running the Project

### Prerequisites
- Java 8 or higher
- IntelliJ IDEA (or any Java IDE)

### Running Design Patterns

**Creational Patterns:**
```bash
cd java_DSA/src
javac design_patten/creational/Main.java
java -cp . design_patten.creational.Main
```

**Behavioral Patterns:**
```bash
javac design_patten/behavioral/Main.java
java -cp . design_patten.behavioral.Main
```

**Structural Patterns:**
```bash
javac design_patten/structural/Main.java
java -cp . design_patten.structural.Main
```

### Running DSA Problems
```bash
javac pratice_section/Array_QUS/Q1.java
java -cp . pratice_section.Array_QUS.Q1
```

---

## 📖 Key Learning Points

| Pattern | Benefit | Complexity |
|---------|---------|-----------|
| Singleton | Global access, single instance | Low |
| Factory | Flexible object creation | Medium |
| Builder | Complex object construction | Medium |
| Observer | Loose coupling, event handling | Medium |
| Strategy | Flexible algorithm selection | Medium |
| Decorator | Dynamic feature addition | Medium |
| Adapter | Legacy code integration | Low |
| Facade | Simplified interface | Low |
| Template Method | Code reuse, structure | Low |
| Chain of Resp. | Request routing | Medium |

---

## 💡 Best Practices

1. **Use appropriate patterns** - Don't force patterns where they don't fit
2. **Keep patterns simple** - Avoid over-engineering
3. **Combine patterns** - Multiple patterns often work together
4. **Follow SOLID principles** - Especially Single Responsibility and Open/Closed
5. **Document your patterns** - Make it clear why a pattern is used
6. **Test thoroughly** - Ensure pattern implementations work correctly
7. **Refactor regularly** - Patterns can be optimized over time

---

## 📚 Resources

- Gang of Four (GoF) Design Patterns Book
- Refactoring Guru Design Patterns
- Head First Design Patterns
- Official Java Documentation

---

**Last Updated:** April 14, 2026
**Author:** Learning Project
**License:** Open Source
