package example

object FSTree extends App {
  if (args.length == 0) {
    println(Usage.help)
  }
}

object Usage {
  final val help = "Usage: fstree directory"
}