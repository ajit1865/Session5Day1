# Session5Day1

# Reader-Writer Problem


## What is scala

Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## Question
Implement a writers-preference reader-writer lock.

In the reader-writer problem we consider that some threads may read and some may write. We want to prevent more than one thread modifying the shared resource simultaneously and allow for two or more readers to access the shared resource at the same time.

Make sure that if there is a writer thread waiting then it should get access to the resource as soon as possible i.e. as soon as it is available for someone to acquire it.

## Question description


A writer's-preference reader-writer lock is a synchronization mechanism that allows multiple threads to read a shared resource concurrently, but ensures that only one thread can write to the resource at a time. If there is a writer thread waiting, it should be granted access to the resource as soon as it becomes available.

### output 


WriteLock 1

Unlock WriteLock of 1

Read Lock 1

Read Unlock 1

WriteLock 2

Unlock WriteLock of 2

Read Lock 2

Read Lock 2

Read Unlock 2

Read Unlock 2




## Run Locally

Clone the project

```bash
  git clone https://github.com/ajit1865/Session5Day1.git
```

