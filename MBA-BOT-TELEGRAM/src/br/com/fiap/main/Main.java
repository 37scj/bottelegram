package br.com.fiap.main;

import br.com.fiap.connectionTelegrambot.ConversationController;

public class Main {

	public static void main(String[] args) {


		ConversationController conversationController = new ConversationController();
		conversationController.receiveMessages();

	}
}
