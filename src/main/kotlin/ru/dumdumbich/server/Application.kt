package ru.dumdumbich.server

import io.ktor.server.application.*
import ru.dumdumbich.server.plugins.configureRouting

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
