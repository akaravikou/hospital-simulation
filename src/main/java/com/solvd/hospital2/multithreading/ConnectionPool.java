package com.solvd.hospital2.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool instance = null;

    List<Connection> availableConnections = new ArrayList<>();
    List<Connection> usedConnections = new ArrayList<>();
    private Integer quantityConnection;

    private ConnectionPool(Integer quantityConnection) {
        this.quantityConnection = quantityConnection;
        for (int i = 0; i < quantityConnection; i++) {
            this.availableConnections.add(new Connection());
            new Thread((Runnable) this.availableConnections.get(i)).start();}
        }

    public static ConnectionPool getInstance(){
        if (instance==null)
            instance = new ConnectionPool(10);
        return instance;
    }

    private static Connection getConnection() {
        Connection connection = null;
        try {
            connection = new Connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public synchronized void releaseConnection (Connection connection) throws NullPointerException {
        if (connection != null) {
            if (usedConnections.remove(connection)) {
                availableConnections.add(connection);
            } else {
                throw new NullPointerException("Connection not in the usedConnections");
            }
        }
    }
}
