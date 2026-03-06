import org.nlogo.headless.HeadlessWorkspace

object HeadlessBenchmarker {

  def main(args: Array[String]): Unit = {

    val workspace = HeadlessWorkspace.newInstance

    workspace.open("path/to/model.nlogox")

    val start = System.nanoTime()

    for (n <- 1 to 20) {
      workspace.command("setup")
      for (_ <- 1 to 1000) {
        workspace.command("go")
      }
    }

    val end = System.nanoTime()
    workspace.dispose()

    println((end - start) / 1e6)

  }

}
