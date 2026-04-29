# HeadlessBenchmarker

## What is it?

A simple tool for gathering performance stats about running NetLogo models.

## How do you run it?

```sh
sbt 'run "<path>" <runCount> <tickCount>'
```

  * `<path>`: Path to your target `.nlogo`/`.nlogox` file
  * `<runCount>`: Number of runs to perform (optional; default: 20)
  * `<tickCount>`: Number of ticks per run (optional; default: 1000)

The result will be the number of milliseconds taken to run the whole thing.

## How can I configure which version of NetLogo it uses?

Change the part of the `libraryDependencies` in `build.sbt` that says something like `"org.nlogo" % "netlogo" % "7.0.3"`.  It gets versions of NetLogo from [our Cloudsmith resolver](https://cloudsmith.io/~netlogo/repos/netlogo/packages/), so whatever versions are there are versions that you can use here.
