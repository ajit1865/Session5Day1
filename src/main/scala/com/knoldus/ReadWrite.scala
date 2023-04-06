
package com.knoldus

import java.util.concurrent.locks.{ReentrantReadWriteLock => ReadWriteLock}

class ReadWrite {
  private val lock = new ReadWriteLock()
  @volatile private var valueForSimulation = 0

  def increment(): Unit = {
    val writeLock = lock.writeLock()
    writeLock.lock() // Acquire the write lock for some process
    try {
      valueForSimulation += 1
      println(s"WriteLock $valueForSimulation")
      Thread.sleep(1000) // Simulate some processing time
    }
    finally {
      // Release the write lock
      writeLock.unlock()
      println(s"Unlock WriteLock of $valueForSimulation")
    }
  }

  def get(): Unit = {
    // Acquire the read lock
    val readLock = lock.readLock()
    readLock.lock()
    try {
      println(s"Read Lock $valueForSimulation")
      Thread.sleep(1000)
    }
    finally {
      readLock.unlock()
      println(s"Read Unlock $valueForSimulation")
      // Release the read lock
    }
  }
}
