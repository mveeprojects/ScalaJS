
import org.scalajs.dom.{Node, document}

object Main extends App {

  def appendParagraph(targetNode: Node, text: String): Unit = {
    val paragraphNode = document.createElement("p")
    paragraphNode.textContent = text
    targetNode.appendChild(paragraphNode)
  }

  appendParagraph(document.body, "Hi there.")
}
