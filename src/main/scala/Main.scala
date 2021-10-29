
import org.scalajs.dom.{Node, document}

import scala.scalajs.js.annotation.JSExportTopLevel

object Main extends App {

  def appendParagraph(targetNode: Node, text: String): Unit = {
    val paragraphNode = document.createElement("p")
    paragraphNode.textContent = text
    targetNode.appendChild(paragraphNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addCLickedMessage(): Unit = {
    appendParagraph(document.body, "You clicked the button.")
  }

  appendParagraph(document.body, "Hi there.")
}
