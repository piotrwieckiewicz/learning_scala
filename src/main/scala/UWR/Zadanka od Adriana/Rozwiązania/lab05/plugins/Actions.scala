// package lab05.plugins

// object Actions {
//   val actionA: Pluginable = new Pluginable with Shortening with Doubling with SingleSpacing
//   val actionB: Pluginable = new Pluginable with Doubling with Shortening with NoSpacing
//   val actionC: Pluginable = new Pluginable with Doubling with LowerCasing
//   val actionD: Pluginable = new Pluginable with Rotating with DuplicateRemoval
//   val actionE: Pluginable = new Pluginable with Reverting with Doubling with Shortening with NoSpacing
//   val actionF: Pluginable = new Pluginable {
//     private val rotate = new Pluginable with Rotating
//     //SIP NIce, check also solution with Iterator:  Iterator.iterate(s)(super.plugin).drop(5).next()
//     //Or with Function.chain(.):  Function.chain((1 to 5).map(_ => super.plugin _))(string)
//     override def plugin(s: String): String = super.plugin((0 until 5).toList.foldLeft(s)((str, _) => rotate.plugin(str)))
//   }
//   val actionG: Pluginable = new Pluginable {
//     override def plugin(s: String): String = super.plugin(actionB.plugin(actionA.plugin(s)))
//   }
// }
