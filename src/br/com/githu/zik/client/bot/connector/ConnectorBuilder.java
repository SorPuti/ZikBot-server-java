package br.com.githu.zik.client.bot.connector;

import java.io.File;

import br.com.githu.zik.client.bot.engine.PacketAction;
import br.com.githu.zik.client.bot.models.callBacks.Response;
import br.com.githu.zik.client.bot.models.settings.BotSettings;

public class ConnectorBuilder implements Bot {

	private String name;
	private BotSettings settings;

	public ConnectorBuilder(String name) {
		this.name = name;
		this.settings = BotSettings.STANDARD;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public File getRootDirectory() {
		return null;
	}

	@Override
	public void on(String arg0, PacketAction arg1) {
//		this.server.on(arg0, arg1);
	}

	@Override
	public Response emit(String arg0, Object arg1) {
		return null;
	}

	@Override
	public BotSettings getSettings() {
		return this.settings;
	}

}
