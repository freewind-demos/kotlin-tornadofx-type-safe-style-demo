package example

import javafx.geometry.Pos
import tornadofx.*

class HelloWorld : View() {
    override val root = hbox {
        label("Hello world") {
            addClass(HelloWorldStyle.title)
        }
    }
}

class HelloWorldStyle : Stylesheet() {
    companion object {
        val title by cssclass()
    }

    init {
        root {
            prefWidth = 400.px
            prefHeight = 400.px
            alignment = Pos.CENTER
        }
        title {
            fontSize = 50.px
        }
    }
}

class HelloWorldApp : App(HelloWorld::class, HelloWorldStyle::class)

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}