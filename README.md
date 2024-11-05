# TinyC Compiler in Java

## Overview

Welcome to my **TinyC Compiler** project. This project allowed me to explore the fascinating world of compiler construction, where I implemented a full compiler that translates the TinyC programming language into MIPS assembly language. Additionally, I generated verification conditions to ensure the correctness of TinyC programs.

The TinyC Compiler is built using Java and is structured into several distinct phases that guide the transformation of TinyC source code into executable assembly language. Through this project, I engaged with various aspects of compiler design, including lexical analysis, parsing, semantic analysis, and code generation.

## Project Details

### Project Components

My TinyC Compiler consists of three main phases:

1. **Abstract Syntax Tree (AST) Construction**:
   - In this phase, I implemented the construction of an Abstract Syntax Tree to represent the structure of TinyC programs. This involved creating various nodes for statements, expressions, and declarations based on the parsed tokens.

2. **Semantic Analysis**:
   - Here, I performed checks on the AST to ensure that TinyC programs adhere to the language's semantic rules. This included type checking, scope resolution, and ensuring the proper use of variables and functions.

3. **Code Generation or Verification Condition Generation**:
   - I chose to implement both components for this phase:
     - **Code Generation**: I transformed the AST into MIPS assembly code that can be executed on MIPS architecture.
     - **Verification Condition Generation**: I also generated logical formulas to verify the correctness of TinyC programs. Implementing both aspects not only fulfilled the project requirements but also allowed me to deepen my understanding of compiler design.

### TinyC Language Overview

TinyC is a simplified version of the C programming language, designed specifically for educational purposes. It retains the core syntax and semantics of C while omitting more complex features. Here are some key restrictions I implemented:

- **Data Types**: Supports three built-in types: `char`, `int`, and `void`. Pointers and function types are included, but function pointers are not allowed.
- **Limited Constructs**: TinyC does not support structs or unions, and a function can have at most four arguments.
- **Operator Limitations**: Certain unary and binary operators were excluded to keep the language simple.

### Example TinyC Program

Here’s a simple example of a TinyC program:

```c
int globalVariable;
int foo();

int main() {
    globalVariable = 1;
    return foo();
}

int foo() {
    return globalVariable + 1;
}
