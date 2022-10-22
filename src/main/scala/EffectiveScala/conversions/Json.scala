// package conversions

// sealed trait Json
// case class JNumber(value: BigDecimal) extends Json
// case class JString(value: String) extends Json
// case class JBoolean(value: Boolean) extends Json
// case class JArray(elems: List[Json]) extends Json
// case class JObject(fields: (String, Json)*) extends Json

// case class JsonField(json: Json)

// object Json {
//   def obj(fields: (String, JsonField)*): Json =
//     JObject(fields.map(_.json)*)
// }

// object JsonField:

//   given fromString: Conversion[String, JsonField] with
//     def apply(s: String) = JsonField(JString(s))

//   given fromInt: Conversion[Int, JsonField] with
//       def apply(i: Int) = JsonField(JNumber(i))

//   given fromBoolean: Conversion[String, JsonField] with
//       def apply(b: Boolean) = JsonField(JBoolean(b))

//   given fromString: Conversion[String, JsonField] with
//       def apply(s: String) = JsonField(JString)

//   given fromString: Conversion[String, JsonField] with
//       def apply(s: String) = JsonField(JString)