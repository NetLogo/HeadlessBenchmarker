# HeadlessBenchmarker

## What is it?

A simple tool for gathering performance stats about running NetLogo models.

## How do you configure it?

Change the model path (`workspace.open`), number of repetitions (outer `for`), and number of ticks (inner `for`) in the `HeadlessBenchmarker.scala` file.

## How do you run it?

`sbt run`

The result will be the number of milliseconds taken to run the whole thing.

## How can I configure which version of NetLogo it uses?

Change the part of the `libraryDependencies` in `build.sbt` that says something like `"org.nlogo" % "netlogo" % "7.0.3"`.  It gets versions of NetLogo from [our Cloudsmith resolver](https://cloudsmith.io/~netlogo/repos/netlogo/packages/), so whatever versions are there are versions that you can use here.
