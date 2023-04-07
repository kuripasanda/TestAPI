package com.github.kuripasanda.testapi.listener

import com.github.kuripasanda.testapi.TestAPI
import com.github.kuripasanda.testapi.api.listener.TestPlayerChatEvent
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class AsyncPlayerChat: Listener {

    @EventHandler
    fun playerChat(event: AsyncPlayerChatEvent) {

        // カスタムイベントを呼び出し
        Bukkit.getScheduler().runTaskLater(TestAPI.getPlugin(), Runnable {
            Bukkit.getServer().pluginManager.callEvent(TestPlayerChatEvent(event.player, event.message))
        }, 0L)

    }

}