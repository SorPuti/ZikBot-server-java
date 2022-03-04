package br.com.githu.zik.client.bot.engine;

import java.io.Serializable;

public class Packet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String channel;
	public Object value;

	public Packet(String channel, Object value) {
		this.channel = channel;
		this.value = value;
	}
	
	@SuppressWarnings("unchecked")
	public <R> R cast(Class<R> cast) {
		return (R) value;
	}

}
