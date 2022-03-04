package br.com.githu.zik.client.bot.engine.promise;

import br.com.githu.zik.client.bot.models.action.ResponseAction;

public abstract class Promise {

	private ResponseAction then;
	private ResponseAction error;

	public Promise then(ResponseAction action) {
		this.then = action;
		return this;
	}
	
	public Promise error(ResponseAction action) {
		this.error = action;
		return this;
	}

	public abstract void run();

	public void resolve(Object value) {
		this.then.response(value);
	}
	
	public void error(Object value) {
		this.error.response(value);
	}

}
