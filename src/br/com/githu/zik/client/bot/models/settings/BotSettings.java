package br.com.githu.zik.client.bot.models.settings;

public interface BotSettings {
	
	boolean hasProtocol(ProtocolType arg0);
	
	boolean isAutoReconnect();

	void setAuthPassword(String arg0);

	void setProtocol(ProtocolType arg0);

	void setAutoReconnect(boolean arg0);

	public static BotSettings STANDARD = new BotSettingsBuilder();
}
