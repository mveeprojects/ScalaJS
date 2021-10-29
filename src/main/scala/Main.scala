import org.scalajs.dom.{Event, MouseEvent, Node, document}

import scala.scalajs.js.annotation.JSExportTopLevel

object Main extends App {

  document.addEventListener("DOMContentLoaded", { _: Event =>
    setupUI()
  })

  def setupUI(): Unit = {
    appendParagraph(document.body, "Hi there.")
    appendButton(document.body, "click me")
  }

  def appendParagraph(targetNode: Node, text: String): Unit = {
    val paragraph = document.createElement("p")
    paragraph.textContent = text
    targetNode.appendChild(paragraph)
  }

  def appendButton(targetNode: Node, buttonText: String): Unit = {
    val button = document.createElement("button")
    button.textContent = buttonText
    button.addEventListener(
      "click",
      { _: MouseEvent =>
        addCLickedMessage()
      }
    )
    targetNode.appendChild(button)
  }

  @JSExportTopLevel("addClickedMessage")
  def addCLickedMessage(): Unit =
    appendParagraph(document.body, "You clicked the button.")


}
