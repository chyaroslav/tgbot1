/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yarco.tgbot1;

/**
 *
 * @author бегемот
 */

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
public class Main {
        public static void main(String[] args) {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
            try {
                
                telegramBotsApi.registerBot(new tgbot1());
            } catch (TelegramApiException err) {
                err.printStackTrace();
            }
        }
    }
