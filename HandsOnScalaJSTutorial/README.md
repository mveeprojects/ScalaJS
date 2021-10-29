# Hands On ScalaJS Tutorial

Based on [Lihaoyi's Hands On ScalaJS Tutorial](https://www.lihaoyi.com/hands-on-scala-js/#HandsOn).

### Building and Running the app:

**Generate JS**

First thing you'll need to do is compile your Scala code into JavaScript.

```shell
sbt "project handsonscalajstutorial;; ~fastLinkJS"
```
As a result of running this, the JavaScript will be generated in `target/scala-2.13/handsonscalajstutorial-fastopt/main.js`.

**View the UI**

Open `src/main/resources/index-dev.html` in your preferred browser after running the `fastLinkJS` command as shown above.