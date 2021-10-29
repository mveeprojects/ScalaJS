# ScalaJS Official Tutorial

Based on the [Official ScalaJS Basic Tutorial](https://www.scala-js.org/doc/tutorial/basic/).

### Building and Running the app:

**Generate JS**

First thing you'll need to do is compile your Scala code into JavaScript. 

```shell
sbt "project scalajsofficialtutorial; ~fastLinkJS"
```
As a result of running this, the JavaScript will be generated in `target/scala-2.13/scalajsofficialtutorial-fastopt/main.js`.

**View the UI**

Open `src/main/resources/index-dev.html` in your preferred browser after running the `fastLinkJS` command as shown above.
