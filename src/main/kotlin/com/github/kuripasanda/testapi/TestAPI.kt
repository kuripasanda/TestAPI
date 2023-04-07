package com.github.kuripasanda.testapi

import org.bukkit.plugin.java.JavaPlugin

class TestAPI : JavaPlugin() {
    override fun onEnable() {
        logger.info("TestAPIが起動しました")
    }

    override fun onDisable() {
    }
}
