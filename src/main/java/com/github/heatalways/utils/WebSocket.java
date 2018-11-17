package com.github.heatalways.utils;


import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

/**
 * Класс для работы с WebSocket-ми.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class WebSocket extends WebSocketClient {
    public WebSocket(URI serverUri, Draft protocolDraft) {
        super(serverUri, protocolDraft);
    }
    @Override
    public void onOpen(ServerHandshake serverHandshake) {
    }

    @Override
    public void onMessage(String s) {
    }

    @Override
    public void onClose(int i, String s, boolean b) {
    }

    @Override
    public void onError(Exception e) {

    }

    @Override
    public void onWebsocketPing(org.java_websocket.WebSocket conn, Framedata f) {
        conn.sendFrame(f);
    }

    @Override
    public void onWebsocketPong(org.java_websocket.WebSocket conn, Framedata f) {
        conn.sendFrame(f);
    }
}
