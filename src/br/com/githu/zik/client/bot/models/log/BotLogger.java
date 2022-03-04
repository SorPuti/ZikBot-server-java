package br.com.githu.zik.client.bot.models.log;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import br.com.githu.zik.client.bot.connector.Bot;

public class BotLogger {

	private Bot bot;
	private Set<Object> logs;

	public void setBot(Bot bot) {
		this.bot = bot;
		this.logs = new HashSet<>();
	}
	
	public Bot getBot() {
		return bot;
	}
	
	public void log(Object value) {
		this.logs.add(value);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(logs.toArray());
	}

}
