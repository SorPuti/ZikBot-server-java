package br.com.githu.zik.client.bot.models.settings;

import br.com.githu.zik.client.bot.models.settings.authBot.Auth;

public class BotSettingsBuilder extends Auth implements BotSettings {

	private boolean[] values;
	private boolean autoReconnect = false;
	private String auth = null;

	public BotSettingsBuilder() {
		this.values = new boolean[3];
		this.onInitialize(this);
	}
	
	public String getAuthPassword() {
		return auth;
	}

	@Override
	public boolean isAutoReconnect() {
		return this.autoReconnect;
	}
	
	@Override
	public void setAuthPassword(String arg0) {
		this.auth = arg0;
	}

	@Override
	public void setProtocol(ProtocolType arg0) {
		this.values[arg0.index] = false;
	}

	@Override
	public void setAutoReconnect(boolean arg0) {
		this.autoReconnect = arg0;
	}

	@Override
	public boolean hasProtocol(ProtocolType arg0) {
		return values[arg0.index];
	}

}
