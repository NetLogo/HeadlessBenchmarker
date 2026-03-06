# HeadlessBenchmarker

## What is it?

A simple tool for gathering performance stats about running NetLogo models.

## How do you configure it?

Change the model path (`workspace.open`), number of repetitions (outer `for`), and number of ticks (inner `for`) in the `HeadlessBenchmarker.scala` file.

## How do you run it?

`sbt run`

## What do the results mean?

They're the number of milliseconds taken to run the whole thing.
