import com.typesafe.config.ConfigFactory

trait Config {
  private val conf       = ConfigFactory.load()
  val buttonText: String = conf.getString("html.buttonClickText")
}
