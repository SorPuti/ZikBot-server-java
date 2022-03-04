package br.com.githu.zik.client.load.index;

import br.com.githu.zik.client.ZikBot;
import br.com.githu.zik.client.load.extension.Loader;

public class Start {

	public static void main(String[] args) {
		Loader loader = new ZikBot();
		
		loader.onRead();
	}
}
