package br.com.githu.zik.client.bot.connector;

import java.io.File;

import br.com.githu.zik.client.bot.engine.PacketAction;
import br.com.githu.zik.client.bot.models.callBacks.Response;
import br.com.githu.zik.client.bot.models.settings.BotSettings;

public interface Bot {

	String getName();

	BotSettings getSettings();
	
	File getRootDirectory();

	void on(String arg0, PacketAction arg1);

	Response emit(String arg0, Object arg1);

}
