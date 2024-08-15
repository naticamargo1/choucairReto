package com.co.choucair.interactions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Espera {

    private static final Logger logger = LoggerFactory.getLogger(Espera.class);
    public static void esperar(int milisegundos) {
        try {
            TimeUnit.MILLISECONDS.sleep(milisegundos);
        } catch (InterruptedException e) {
            logger.info("Interrupted! " + e);
            Thread.currentThread().interrupt();
        }
    }

}
