import scala.collection.mutable.ListBuffer

class Paciente(
  var n:   String,
  var pa:  String,
  var sa:  String,
  var e:   Byte,
  var f:   ListBuffer[String],
  var hr:  ListBuffer[String],
  var nb:  ListBuffer[Int],
  var t:   ListBuffer[Double],
  var hum: ListBuffer[Double]) {

  override def toString: String = "\nNombre: " + n +
    "\nPrimer Apellido: " + pa +
    "\nSegundo Apellido: " + sa +
    "\nEdad: " + e +
    "\nFecha: " + f +
    "\nHora de registro: " + hr +
    "\nNivel de bienestar: " + nb +
    "\nTemperatura: " + t +
    "\nHumedad: " + hum

  def promedioBienestar(): Double = {
    var prom = 0.0
    for (e <- nb) {
      prom += e
    }
    prom / nb.length
  } //promedio bienestar

  def temperaturaMenor() {
    var menor = t(0)
    var cont = 0
    for (i <- 0 until t.length) {
      if (t(i) < menor) {
        menor = t(i)
        cont = i
      }

    }
    println("Datos de la temperatura mas baja registrada")
    println("Temperatura menor: " + t(cont))
    println("Fecha registrada: " + f(cont))
    println("Hora Registrada: " + hr(cont))
    println("Nivel de bienestar: " + nb(cont))
    println("Humedad registrada: " + hum(cont))
  } //temperatura menor

  def temperaturaMayor() {
    var mayor = t(0)
    var cont = 0
    for (i <- 0 until t.length) {
      if (t(i) > mayor) {
        mayor = t(i)
        cont = i
      }

    }
    println("Datos de la temperatura mas Alta registrada")
    println("Temperatura mayor: " + t(cont))
    println("Fecha registrada: " + f(cont))
    println("Hora Registrada: " + hr(cont))
    println("Nivel de bienestar: " + nb(cont))
    println("Humedad registrada: " + hum(cont))
  } //temperatura menor

} //clase paciente

object PruebaPaciente {
  def main(args: Array[String]): Unit = {
    var n = "Esteban"
    var pa = "Muñoz"
    var sa = "Hidalgo"
    var e: Byte = 22
    var f: ListBuffer[String] = ListBuffer("11-03-2020", "12-03-2020", "13-03-2020")
    var hr: ListBuffer[String] = ListBuffer("11:11", "15:33", "21:11")
    var nb: ListBuffer[Int] = ListBuffer(2, 3, 4)
    var t: ListBuffer[Double] = ListBuffer(25.3, 27, 28)
    var hum: ListBuffer[Double] = ListBuffer(45, 63, 54)
    var p = new Paciente(n, pa, sa, e, f, hr, nb, t, hum)
    println("Datos:" + p)
    println()
    println("Promedio Bienestar: " + p.promedioBienestar())
    println()
    p.temperaturaMenor()
    println()
    p.temperaturaMayor
    ()

  }

}