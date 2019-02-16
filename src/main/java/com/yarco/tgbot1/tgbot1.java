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
//import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class tgbot1 extends TelegramLongPollingBot {
        @Override
	public String getBotUsername() {
		return "Rturalbot";
                //возвращаем юзера
	}

	@Override
	public void onUpdateReceived(Update e) {
		
                if (e.hasMessage() && e.getMessage().hasText()) {
                SendMessage msg = new SendMessage() // Create a SendMessage object with mandatory fields
                .setChatId(e.getMessage().getChatId())
                .setText(e.getMessage().getText());
        try {
            execute(msg); // Call method to send the message
        } catch (TelegramApiException err) {
            err.printStackTrace();
            }
        }
	}

	@Override
	public String getBotToken() {
		return "793895948:AAFbON0vVcJyIiuufoWkwpH5yzmZht1qPA4";
                //Токен бота
	}
//        private void sendMsg(Message msg, String text) {
//		SendMessage s = new SendMessage();
//		s.setChatId(msg.getChatId()); // Боту может писать не один человек, и поэтому чтобы отправить сообщение, грубо говоря нужно узнать куда его отправлять
//		s.setText(text);
//		
//			sendMessage(s);
		
//	}
}
