package br.com.githu.zik.client.bot.models.callBacks;

import br.com.githu.zik.client.bot.models.action.ResponseAction;
import br.com.githu.zik.client.bot.models.action.VoidAction;

public interface Response {

	void then(VoidAction action);

	void error(ResponseAction action);

}
