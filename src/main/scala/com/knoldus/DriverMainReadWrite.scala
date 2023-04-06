
package com.knoldus

object MainReadWrite extends App {
  val readInstance = new ReadWrite

  val writer1 = new Thread {
    override def run(): Unit = {
      readInstance.increment()
    }
  }
  val writer2 = new Thread {
    override def run(): Unit = {
      readInstance.increment()
    }
  }

  val readerFirst = new Thread {
    override def run(): Unit = {
      readInstance.get()
    }
  }
  val readerSecond = new Thread {
    override def run(): Unit = {
      readInstance.get()

    }
  }
  val readerThird = new Thread {
    override def run(): Unit = {
      readInstance.get()

    }
  }
  // starting threads
  writer1.start()
  readerFirst.start()
  writer2.start()
  readerSecond.start()
  readerThird.start()
  writer1.join()
  writer2.join()

}
