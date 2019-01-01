[![DOI](https://zenodo.org/badge/47244756.svg)](https://zenodo.org/badge/latestdoi/47244756)

# Effective Debugging: Source Code

This repository contains the source code used in the book
[Effective Debugging](http://www.spinellis.gr/debugging) (Addison-Wesley, 2016).


## Chapter 1: High-Level Strategies

### Item 7: Diversify Your Build and Execution Environment

* [Demonstrate differences in the size of primitive elements among various architectures and operating systems](../master/size)

## Chapter 2: General-Purpose Methods and Practices

### Item 12: Automate Complex Testing Scenarios

* [Demonstrate debugging through the embedding of Lua](../master/lua)

## Chapter 4: Debugger Techniques

### Item 31: Familiarize Yourself with Reverse Debugging

* [Simple program to demonstrate reverse debugging](../master/reverse)

### Item 33: Look for Errors by Examining the Values of Variables and Expressions

* [A doubly-linked list in Python](../master/dlist)

### Item 37: Know How to View Assembly Code and Raw Memory

* [Examples of how source code is compiled into assembly language](../master/asm)

## Chapter 5: Programming Techniques

### Item 41: Add Logging Statements

* [Logging in diverse languages and frameworks](../master/logging)

### Item 42: Use Unit Tests

* [Unit testing of a simple C++ class](../master/cppunit)

### Item 43: Use Assertions

* [Demonstration of assertions](../master/assert)

### Item 49: Fix the Bug's Cause, Rather Than Its Symptom

* [Demonstrate and verify the use of modulo arithmetic rather than special cases](../master/modulo)

## Chapter 6: Compile-Time Techniques

### Item 50: Examine Generated Code

* [Demonstrate how assembly code can reveal hidden method calls](../master/long-string)

### Item 51: Use Static Program Analysis

* [Demonstrate how FindBugs will report an incorrect spin loop](../master/spin-wait)

### Item 52: Configure Deterministic Builds and Executions

* [Demonstrate deterministic and non-deterministic builds](../master/dbuild)

### Item 53: Configure the Use of Debugging Libraries and Checks

* [Examples demonstrating bugs caught by enabling compilation options](../master/dlib)

## Chapter 7: Runtime Techniques

### Item 57: Profile the Operation of Systems and Processes

* [Demonstrate resource utilization issues](../master/resource-hogs)

### Item 59: Use Dynamic Program Analysis Tools

* [Demonstrate the use of Valgrind to find memory errors](../master/valgrind)

## Chapter 8: Debugging Multi-threaded Code

### Item 60: Analyze Deadlocks with Postmortem Debugging

* [Programs that deadlock](../master/deadlock)

### Item 61: Capture and Replicate

* [Source code used for the PinPlay demonstration](../master/pthread-race)

### Item 62: Uncover Deadlocks and Race Conditions with Specialized Tools

* [A race condition in Java](../master/synchronized)
* [Source code used for Intel Inspector XE demonstration](../master/omp-race)

### Item 64: Investigate Scalability Issues by Looking at Contention

* [Demonstrate scalability problem due to lock contention](../master/lock-contention)

### Item 65: Locate False Sharing by Using Performance Counters

* [Demonstrate scalability problem due false sharing](../master/false-share)

### Item 66: Consider Rewriting the Code Using Higher-Level Abstractions

* [Demonstrate the speedup that can be obtained through the use of ATLAS](../master/atlas)
* [Demonstrate speedup of R's mclapply function](../master/mclapply)
* [Demonstrate the concurrent name resolution of IP addresses](../master/streams)
