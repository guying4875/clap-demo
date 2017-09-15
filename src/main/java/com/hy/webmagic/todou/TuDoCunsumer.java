package com.hy.webmagic.todou;

import java.util.function.Consumer;

import org.jsoup.nodes.Element;

public class TuDoCunsumer implements Consumer<Element> {

	@Override
	public void accept(Element ele) {
		Element option = ele.select("label").get(0);
		System.out.println(option.text());
	}

}
