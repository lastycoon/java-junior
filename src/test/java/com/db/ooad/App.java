package com.db.ooad;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger(new MessageLengthFilter(6),
                new ConsoleSaver()
        );
        logger.log()
    }
}
