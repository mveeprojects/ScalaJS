# ScalaJS

Basic ScalaJS implementation to figure out how it works.

### Building and Running the app:

**Generate JS**

First thing you'll need to do is compile your Scala code into JavaScript. 

```shell
sbt fastLinkJS # or sbt ~fastLinkJS to reflect changes in Scala to JS automatically
```
As a result of running this, the JavaScript will be generated in `target/scala-2.13/scalajs-fastopt/main.js`.

**View the UI**

Open `src/main/resources/index-dev.html` in your preferred browser after running `sbt fastLinkJS` as shown above.

### Sources:
* [Scala-js.org tutorial](https://www.scala-js.org/doc/tutorial/basic/index.html)
  * [build.sbt "%%%" notation](https://www.scala-js.org/doc/project/dependencies.html)
  * [exporting Scala functions to JS](https://www.scala-js.org/doc/interoperability/export-to-javascript.html)
* [Logrocket Scala JS tutorial](https://blog.logrocket.com/strongly-typed-frontend-code-scala-js)
* [Alvin Alexander Scala JS Slinky hello world tutorial](https://alvinalexander.com/scala/scala.js-slinky-hello-world-tutorial-example/)
* [Knoldus Scala JS YouTube tutorial](https://www.youtube.com/watch?v=5Ausv2CVMbM)
* [Knoldus blog - intro to Scala JS](https://blog.knoldus.com/introduction-to-scala-js/)
* [ScalaTest Scala JS documentation](https://www.scalatest.org/user_guide/using_scalajs)
* [Lihaoyi Scala JS tutorial](http://www.lihaoyi.com/hands-on-scala-js/#GettingStarted)
