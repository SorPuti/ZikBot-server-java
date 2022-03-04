package br.com.githu.zik.client.bot.models.settings;

public enum ProtocolType {
	AUDIO(0), VIDEO(1), FILE_MANAGER(2);

	public int index = 0;

	private ProtocolType(int index) {
		this.index = index;
	}
}
