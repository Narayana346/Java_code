# Design Patterns — Full Reference

All 23 GoF patterns implemented in this project, with definitions, diagrams, and use cases.

---

## 🏗️ CREATIONAL PATTERNS

> Deal with object creation mechanisms.

### 1. Singleton

**Definition:** Ensures a class has only **one instance** and provides a global access point to it.

**Source:** `design_patten/creational/singleton/BasicSingleton.java`

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
        └── Only ONE instance ever created
```

**Details:**
- Static instance variable holds the single object
- Private constructor blocks direct `new` calls
- `getInstance()` creates lazily on first call
- ⚠️ Basic version is **not thread-safe** — multiple threads can create multiple instances

**Real use cases:** Logging, DB connection pools, config managers

---

### 2. Factory

**Definition:** Defines an interface for creating objects, but lets a factory class decide which concrete class to instantiate.

**Source:** `design_patten/creational/factory/ShapeFactory.java`

```
         ┌──────────────────┐
         │   ShapeFactory   │
         ├──────────────────┤
         │ + getShape(type) │
         └──────────────────┘
                  │
        ┌─────────┼─────────┐
        ▼         ▼         ▼
    ┌─────────┐ ┌───────────┐ ┌──────────┐
    │ Circle  │ │ Rectangle │ │  (more)  │
    └─────────┘ └───────────┘ └──────────┘
         all implement Shape interface
```

**Details:**
- `ShapeFactory.getShape(String)` returns correct subtype
- Centralises creation logic — callers don't know concrete classes
- Add new shapes without touching existing code (Open/Closed)

**Real use cases:** GUI widget toolkits, DB driver selection, plugin systems

---

### 3. Builder

**Definition:** Separates complex object construction from its representation using a **fluent interface**.

**Source:** `design_patten/creational/builder/User.java`

```
┌────────────────────┐
│      User          │
├────────────────────┤
│ - name             │
│ - email            │
│ - address          │     ◄── Final product
│ - age              │
└────────────────────┘
          ▲
          │ build()
┌─────────────────────────────┐
│    User.Builder (inner)     │
├─────────────────────────────┤
│ + setName()   → Builder     │
│ + setEmail()  → Builder     │  ◄── Chained setters
│ + setAddress()→ Builder     │
│ + setAge()    → Builder     │
│ + build()     → User        │
└─────────────────────────────┘
```

**Usage:**
```java
User user = User.Builder()
    .setName("Narayanamaharana")
    .setEmail("email@example.com")
    .setAge(30)
    .build();
```

**Real use cases:** HTTP request builders, SQL query builders, config objects

---

### 4. Prototype

**Definition:** Creates new objects by **cloning** an existing prototype instead of constructing from scratch.

**Source:** `design_patten/creational/prototype/Prototype.java`

```
┌──────────────────────┐
│   Prototype          │
│  implements Cloneable│
├──────────────────────┤
│ - name: String       │
├──────────────────────┤
│ + clone()            │  ◄── Returns new copy
│ + equals()           │
└──────────────────────┘
         │
    ┌────┴────┐
    ▼          ▼
   p1         p2   ← same content, different objects
```

**Key behaviour:**
- `p1 == p2` → `false` (different heap objects)
- `p1.equals(p2)` → `true` (same name field)

**Real use cases:** Object pools, undo/redo, game level templates

---

### 5. Abstract Factory

**Definition:** Provides an interface for creating **families** of related objects without specifying their concrete classes.

**Source:** `design_patten/creational/abstract_factory/`

```
┌─────────────────────┐
│   GUIFactory        │  ◄── Abstract factory
├─────────────────────┤
│ + createButton()    │
└─────────────────────┘
         ▲
    ┌────┴─────┐
    ▼           ▼
┌──────────┐  ┌──────────┐
│ Windows  │  │   Mac    │  ◄── Concrete factories
│ Factory  │  │ Factory  │
└──────────┘  └──────────┘
    │              │
  WinButton     MacButton    ◄── Different but compatible products
```

**Real use cases:** Cross-platform UI (Windows/Mac/Linux), theme engines

---

## 🔗 STRUCTURAL PATTERNS

> Deal with object composition and relationships.

### 1. Adapter

**Definition:** Converts an incompatible interface into one the client expects. A wrapper that bridges two interfaces.

**Source:** `design_patten/structural/adpter/Adapter.java`

```
┌──────────────────┐
│   MediaPlayer    │  ◄── What client expects
│  + play()        │
└──────────────────┘
         ▲
         │ implements
┌────────────────────────┐
│     Adapter            │  ◄── The bridge
├────────────────────────┤
│ - advancedPlayer       │
│ + play(fileName)       │  maps to → playMp4()
└────────────────────────┘
         │ wraps
┌────────────────────────┐
│ AdvancedPlayer         │  ◄── Incompatible class
├────────────────────────┤
│ + playMp4()            │
└────────────────────────┘
```

**Real use cases:** Legacy code integration, third-party library wrappers

---

### 2. Bridge

**Definition:** Decouples abstraction from implementation so the two can vary independently.

**Source:** `design_patten/structural/bridge/`

```
   Abstraction                  Implementation
  ┌─────────────┐               ┌───────────────┐
  │   Remote    │──── has-a ───►│    Device     │
  ├─────────────┤               ├───────────────┤
  │ + power()   │               │ + powerOn()   │
  │ + powerOff()│               │ + powerOff()  │
  └─────────────┘               └───────────────┘
                                      ▲
                                  ┌───┴───┐
                                  ▼       ▼
                                 TV      Fan
```

**Real use cases:** Device drivers, rendering engines, UI/business logic separation

---

### 3. Composite

**Definition:** Composes objects into **tree structures** to represent part-whole hierarchies; clients treat leaf and composite nodes uniformly.

**Source:** `design_patten/structural/composite/`

```
          Employee (interface)
         /         \
    Manager        Developer
   (composite)      (leaf)
        |
   [Developer, Developer, ...]

manager.showDetails() → calls showDetails() on all children
```

**Real use cases:** File systems, org charts, GUI component trees

---

### 4. Decorator

**Definition:** Attaches additional behavior to objects **dynamically** — a flexible alternative to subclassing.

**Source:** `design_patten/structural/decorator/`

```
┌─────────────┐
│   Coffee    │  ◄── Component interface
│ + getDesc() │
└─────────────┘
       ▲
  ┌────┴──────────────────┐
  │                       │
SimpleCoffee         MilkDecorator
"Coffee"         wraps Coffee → "Coffee, Milk"
```

**Stacking:**
```
new MilkDecorator(new SimpleCoffee()) → "Coffee, Milk"
new SugarDecorator(new MilkDecorator(new SimpleCoffee())) → "Coffee, Milk, Sugar"
```

**Real use cases:** Java I/O streams, HTTP request middleware, UI enhancements

---

### 5. Facade

**Definition:** Provides a single **simplified interface** to a complex subsystem.

**Source:** `design_patten/structural/facade/ComputerFacade.java`

```
         ┌──────────────────┐
         │ ComputerFacade   │  ◄── One clean entry point
         ├──────────────────┤
         │ + start()        │
         └──────────────────┘
              │
    ┌─────────┼──────────┐
    ▼         ▼          ▼
  ┌────┐   ┌────────┐  ┌────┐
  │CPU │   │ Memory │  │Disk│   ◄── Hidden complexity
  └────┘   └────────┘  └────┘
```

**Real use cases:** Home theatre systems, cloud SDK clients, compiler front-ends

---

### 6. Flyweight

**Definition:** Shares common state between many objects to reduce memory usage when large numbers of similar objects are needed.

**Source:** `design_patten/structural/flyweight/`

```
┌────────────────────┐
│  ShapeFactory      │  ◄── Cache / pool
├────────────────────┤
│ - shapeMap (cache) │
│ + getShape(color)  │
└────────────────────┘
        │
        ├─ "red"   ─► RedShape  (created once, reused)
        ├─ "blue"  ─► BlueShape (created once, reused)
        └─ "black" ─► BlackShape
```

**Real use cases:** String interning, game particle systems, font rendering

---

### 7. Proxy

**Definition:** Provides a **placeholder** that controls access to another object (e.g. for security, caching, lazy loading).

**Source:** `design_patten/structural/proxy/ProxyInternet.java`

```
     Client
        │
        ▼
┌──────────────────┐
│ ProxyInternet    │  ◄── Gatekeeper
├──────────────────┤
│ + connectTo(url) │  checks blocked list
└──────────────────┘
        │ if allowed
        ▼
┌──────────────────┐
│ RealInternet     │  ◄── Actual resource
│ + connectTo(url) │
└──────────────────┘
```

**Real use cases:** Firewalls, lazy-loading proxies, remote object access (RMI)

---

## 👥 BEHAVIORAL PATTERNS

> Deal with object interaction and responsibility distribution.

### 1. Observer

**Definition:** One-to-many dependency — when the subject changes state, all registered observers are notified automatically.

**Source:** `design_patten/behavioral/observer/Channel.java`

```
┌─────────────┐
│   Channel   │  ◄── Subject / Publisher
├─────────────┤
│ - observers │
│ + subscribe │
│ + unsubscribe│
│ + notifyAll │
└─────────────┘
        │ notifies all
    ┌───┼───┐
    ▼   ▼   ▼
  Obs1 Obs2 Obs3   ◄── Subscribers
```

**Flow:**
```
subscribe() → notifyAll("Hello") → all observers get update
unsubscribe() → removed from future notifications
```

**Real use cases:** Event systems, MVC, pub/sub, social media feeds

---

### 2. Strategy

**Definition:** Defines a family of algorithms, encapsulates each, and makes them **interchangeable** at runtime.

**Source:** `design_patten/behavioral/strategy/`

```
┌──────────────────┐
│ PaymentContext   │  ◄── Uses a strategy
├──────────────────┤
│ - payment        │
│ + executePayment │
└──────────────────┘
        │ delegates to
        ▼
┌──────────────────┐
│ Payment          │  ◄── Strategy interface
│ + pay()          │
└──────────────────┘
        ▲
    ┌───┴───┐
CreditCard  UPI   ◄── Swappable at runtime
```

**Real use cases:** Payment gateways, sorting algorithms, compression formats

---

### 3. Command

**Definition:** Encapsulates a request as an object, allowing queuing, logging, and undo/redo.

**Source:** `design_patten/behavioral/command/`

```
┌──────────────────┐
│   Command        │  ◄── Interface
│ + execute()      │
└──────────────────┘
        ▲
┌───────────────────────┐
│LightOperationCommand  │  ◄── Concrete command
├───────────────────────┤
│ - light               │
│ - operation (ON/OFF)  │
│ + execute()           │
└───────────────────────┘
        │ invokes
        ▼
┌─────────┐
│  Light  │  ◄── Receiver
│ + on()  │
│ + off() │
└─────────┘
```

**Real use cases:** Undo/redo, task queues, macro recording, GUI buttons

---

### 4. Chain of Responsibility

**Definition:** Passes a request along a chain of handlers; each handler decides to process or forward it.

**Source:** `design_patten/behavioral/chain_of_resposibility/`

```
  Request (value)
      │
      ▼
┌────────────┐
│ LowHandler │  handles if value < 10, else passes on
└────────────┘
      │
      ▼
┌────────────┐
│HighHandler │  handles if value >= 10
└────────────┘
      │
      ▼
  (unhandled)
```

**Real use cases:** Approval workflows, HTTP middleware, logging levels

---

### 5. Mediator

**Definition:** Centralises complex communication between objects through a mediator, removing direct dependencies.

**Source:** `design_patten/behavioral/mediator/`

```
  Sender1 ──┐
             ├──► Mediator ──► routes to correct Sender
  Sender2 ──┘

No direct Sender ↔ Sender communication
```

**Real use cases:** Chat rooms, air traffic control, dialog coordinators

---

### 6. Memento

**Definition:** Captures and externalises an object's state (without breaking encapsulation) so it can be restored later.

**Source:** `design_patten/behavioral/memento/`

```
┌──────────────┐  saveState()  ┌─────────┐
│  Originator  │──────────────►│ Memento │  ◄── snapshot
└──────────────┘               └─────────┘
       │         restoreState()      │
       └────────────────────────────┘

Timeline: "State 1" → save → change to "State 2" → restore → "State 1"
```

**Real use cases:** Undo stacks, game saves, transaction rollback

---

### 7. State

**Definition:** Allows an object to change its **behavior** when its internal state changes — appears to change class.

**Source:** `design_patten/behavioral/state/`

```
┌────────────┐
│  Context   │  holds current state
├────────────┤
│ - state    │──► State.handle()
│ + request()│
└────────────┘

States: OnState → handle() prints "ON"
        OffState → handle() prints "OFF"

context.setState(onState)  → request() → "ON"
context.setState(offState) → request() → "OFF"
```

**Real use cases:** Traffic lights, media players, order lifecycle, vending machines

---

### 8. Template Method

**Definition:** Defines the **skeleton** of an algorithm in a base class, letting subclasses fill in specific steps.

**Source:** `design_patten/behavioral/tamplate_method/`

```
┌──────────────────┐
│   Game (abstract)│  ◄── Template
├──────────────────┤
│ + run()          │  calls: initialize → startPlay → endPlay
│ # initialize()   │  ┐
│ # startPlay()    │  ├── abstract — subclass must implement
│ # endPlay()      │  ┘
└──────────────────┘
       ▲
   ┌───┴────┐
   │        │
Cricket   Football   ◄── Each implements their own steps
```

**Real use cases:** Build pipelines, game loops, data processing frameworks

---

### 9. Iterator

**Definition:** Provides sequential access to elements of a collection **without exposing** its internal structure.

**Source:** `design_patten/behavioral/iterator/`

```
┌─────────────────┐
│  Aggregate      │  ◄── Collection
│ + iterator()   ─┼──► Iterator
└─────────────────┘       │
                          │ + hasNext()
                          │ + next()
                          └─ Traverses without exposing internals
```

**Real use cases:** Java `Iterator<T>`, database cursor, file reader

---

### 10. Visitor

**Definition:** Defines a new operation on an object structure **without changing** the element classes.

**Source:** `design_patten/behavioral/visitor/`

```
┌─────────────┐
│   Element   │
│ + accept(v) │──► v.visit(this)
└─────────────┘

┌──────────────────┐
│ ConcreteVisitor  │  ◄── New operation added externally
│ + visit(element) │
└──────────────────┘
```

**Real use cases:** AST traversal in compilers, document exporters, tax calculators

---

### 11. Interpreter

**Definition:** Defines a grammar and provides an interpreter to evaluate sentences in that language.

**Source:** `design_patten/behavioral/interpreter/`

```
┌──────────────┐
│  Expression  │  ◄── Grammar rule
│ + interpret()│
└──────────────┘
       ▲
   ┌───┴───┐
   │       │
Number   Operator   ◄── Terminal / Non-terminal expressions
```

**Real use cases:** SQL/regex parsers, expression evaluators, scripting engines

---

## 📊 Pattern Summary Table

| Pattern | Category | Key Role | Complexity |
|---------|----------|----------|------------|
| Singleton | Creational | Single global instance | Low |
| Factory | Creational | Centralised object creation | Low |
| Builder | Creational | Fluent complex construction | Medium |
| Prototype | Creational | Clone-based creation | Low |
| Abstract Factory | Creational | Family of related objects | Medium |
| Adapter | Structural | Interface bridge | Low |
| Bridge | Structural | Decouple abstraction/impl | Medium |
| Composite | Structural | Tree part-whole hierarchy | Medium |
| Decorator | Structural | Dynamic feature wrapping | Medium |
| Facade | Structural | Simplified subsystem API | Low |
| Flyweight | Structural | Shared object cache | High |
| Proxy | Structural | Controlled access wrapper | Medium |
| Observer | Behavioral | Pub/sub notifications | Medium |
| Strategy | Behavioral | Swappable algorithms | Low |
| Command | Behavioral | Request as object | Medium |
| Chain of Resp. | Behavioral | Request routing chain | Medium |
| Mediator | Behavioral | Central communication hub | Medium |
| Memento | Behavioral | State snapshot/restore | Medium |
| State | Behavioral | Behavior per state | Medium |
| Template Method | Behavioral | Algorithm skeleton | Low |
| Iterator | Behavioral | Sequential traversal | Low |
| Visitor | Behavioral | External operations | High |
| Interpreter | Behavioral | Grammar evaluation | High |

