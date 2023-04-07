package com.github.kuripasanda.testapi.api.listener

import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class TestPlayerChatEvent(
        private val player: Player,
        private val message: String
): Event() {

    companion object {

        private val handlers = HandlerList()

        fun getHandlerList(): HandlerList { return handlers }

    }

    override fun getHandlers(): HandlerList { return getHandlerList() }

    // チャット送信者を返す
    fun getPlayer(): Player { return player }

    // チャットの内容を返す
    fun getMessage(): String { return message }

}