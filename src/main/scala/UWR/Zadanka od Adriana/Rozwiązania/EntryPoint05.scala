// import lab05.plugins.Actions._

// object EntryPoint05 extends App{
//   val s = "Ala   ma  pierogi"

//   // "Ala   ma  pierogi" -> "Ala ma pierogi" -> "Alla  maa ppieeroogii" -> "Al mapieogi"
//   assert(actionA.plugin(s) == "Al mapieogi")

//   // "Ala   ma  pierogi" -> "Alamapierogi" -> "Aaairg" -> "Aaaaiirgg"
//   assert(actionB.plugin(s) == "Aaaaiirgg")

//   // "Ala   ma  pierogi" -> "ala   ma  pierogi" -> "alla     maa   piierroggi"
//   assert(actionC.plugin(s) == "alla     maa   piierroggi")

//   // "Ala   ma  pierogi" -> "Almperog" -> "gAlmpero"
//   assert(actionD.plugin(s) == "gAlmpero")

//   // "Ala   ma  pierogi" -> "Alamapierogi" -> "Aaairg" -> "Aaaaiirgg" -> "ggriiaaaA"
//   assert(actionE.plugin(s) == "ggriiaaaA")

//   // "Ala   ma  pierogi" -> "erogiAla   ma  pi"
//   assert(actionF.plugin(s) == "erogiAla   ma  pi")

//   // actionA: "Ala   ma  pierogi" -> "Ala ma pierogi" -> "Alla  maa ppieeroogii" -> "Al mapieogi"
//   // actionB: "Al mapieogi" -> "Almapieogi" -> "Ampeg" -> "Ammpeeg"
//   assert(actionG.plugin(s) == "Ammpeeg")
// }
