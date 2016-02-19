package example

import scala.scalajs.js

@js.native
trait Funnel extends js.Object {
  def draw(values: js.Array[js.Array[Any]], options: js.Object): Unit = js.native
}
