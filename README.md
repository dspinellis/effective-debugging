# Effective Debugging: Source Code

This repository contains the source code used in the book
*Effective Debugging* (Addison-Wesley, 2016).


## Chapter 1: High-Level Strategies

### Item 7: Diversify your Build and Execution Environment

* [Demonstrate differences in the size of primitive elements among various architectures and operating systems](../blob/master/size)

## Chapter 2: General Purpose Methods and Practices

### Item 12: Automate Complex Testing Scenarios

* [Demonstrate debugging through the embedding of Lua](../blob/master/lua)

## Chapter 4: Debugger Techniques

### Item 31: Familiarize Yourself with Reverse Debugging

* [Simple program to demonstrate reverse debugging](../blob/master/reverse)

### Item 33: Look for Errors by Examining the Values of Variables and Expressions

* [A doubly-linked list in Python](../blob/master/dlist)

### Item 37: Know how to View Assembly Code and Raw Memory

* [Examples of how source code is compiled into assembly language](../blob/master/asm)

## Chapter 5: Programming Techniques

### Item 41: Add Logging Statements

* [Logging in diverse languages and frameworks](../blob/master/logging)

### Item 42: Use Unit Tests

* [Unit testing of a simple C++ class](../blob/master/cppunit)

### Item 43: Use Assertions

* [Demonstration of assertions](../blob/master/assert)

### Item 49: Fix the Bug's Cause, Rather than its Symptom

* [Demonstrate and verify the use of modulo arithmetic rather than special cases](../blob/master/modulo)

## Chapter 6: Compile-Time Techniques

### Item 50: Examine Generated Code

* [Demonstrate how assembly code can reveal hidden method calls](../blob/master/long-string)

### Item 51: Use Static Program Analysis

* [Demonstrate how FindBugs will report an incorrect spin loop](../blob/master/spin-wait)
* [Demonstrate how FindBugs will report an ignored exception](../blob/master/ex-ign)

### Item 52: Configure Deterministic Builds and Executions

* [Demonstrate deterministic and non-deterministic builds](../blob/master/dbuild)

### Item 53: Configure the Use of Debugging Libraries and Checks

* [Examples demonstrating bugs caught by enabling compilation options](../blob/master/dlib)

## Chapter 7: Runtime Techniques

### Item 57: Profile the Operation of Systems and Processes

* [Demonstrate resource utilization issues](../blob/master/resource-hogs)

### Item 59: Use Dynamic Program Analysis Tools

* [Demonstrate the use of Valgrind to find memory errors](../blob/master/valgrind)

## Chapter 8: Debugging Multithreaded Code

### Item 60: Analyze Deadlocks with Post-Mortem Debugging

* [Programs that deadlock](../blob/master/deadlock)

### Item 61: Capture and Replicate

* [Source code used for the PinPlay demonstration](../blob/master/pthread-race)

### Item 62: Uncover Deadlocks and Race Conditions with Specialized Tools

* [A race condition in Java](../blob/master/synchronized)
* [Source code used for Intel Inspector XE demonstration](../blob/master/omp-race)

### Item 64: Investigate Scalability Issues by Looking at Contention

* [Demonstrate scalability problem due to lock contention](../blob/master/lock-contention)

### Item 65: Locate False Sharing by Using Performance Counters

* [Demonstrate scalability problem due false sharing](../blob/master/false-share)

### Item 66: Consider Rewriting the Code Using Higher Level Abstractions

* [Demonstrate the speedup that can be obtained through the use of ATLAS](../blob/master/atlas)
* [Demonstrate speedup of R's mclapply function](../blob/master/mclapply)
* [Demonstrate the concurrent name resolution of IP addresses](../blob/master/streams)
