package com.github.kuripasanda.testapi

import com.github.kuripasanda.testapi.listener.AsyncPlayerChat
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

class TestAPI : JavaPlugin() {

    companion object {

        private lateinit var plugin: Plugin

        fun getPlugin(): Plugin { return plugin }

    }

    override fun onEnable() {

        plugin = this

        server.pluginManager.registerEvents(AsyncPlayerChat(), this)

        logger.info("TestAPIが起動しました")
    }

    override fun onDisable() {
    }
}
