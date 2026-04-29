import org.nlogo.headless.HeadlessWorkspace

object HeadlessBenchmarker {

  def main(args: Array[String]): Unit = {

    val workspace = HeadlessWorkspace.newInstance

    workspace.open(args(0))

    val start = System.nanoTime()

    for (n <- 1 to args.lift(1).map(_.toInt).getOrElse(20)) {
      workspace.world.mainRNG.setSeed(1234)
      workspace.command("setup")
      for (_ <- 1 to args.lift(2).map(_.toInt).getOrElse(1000)) {
        workspace.command("go")
      }
    }

    val end = System.nanoTime()
    workspace.dispose()

    println((end - start) / 1e6)

  }

}
