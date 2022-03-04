package br.com.githu.zik.client.bot.models.settings.authBot;

import br.com.githu.zik.client.bot.models.settings.BotSettingsBuilder;

public abstract class Auth {
	
	private BotSettingsBuilder settingsBuilder;
	
	public void onInitialize(BotSettingsBuilder settingsBuilder) {
		this.settingsBuilder = settingsBuilder;
	}
	
	public boolean hasPassword(String arg0) {
		return this.settingsBuilder.getAuthPassword().equals(arg0);
	}
}
