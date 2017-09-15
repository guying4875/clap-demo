package com.hy.webmagic.todou;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

public class TuDoPageProcess implements PageProcessor {

	 // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
	@Override
	public Site getSite() {
		return site;
	}

	@Override
	public void process(Page page) {
		// 部分二：定义如何抽取页面信息，并保存下来
//        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
		String url = page.getRequest().getUrl();
		String htmlStr = page.getHtml().get();
		Document doc = Jsoup.parse(htmlStr);
		Elements filter = doc.select("div.td__category__filter__panel__item");
		filter.forEach(new TuDoCunsumer());
        // 部分三：从页面发现后续的url地址来抓取
//        page.addTargetRequests(page.getHtml().links().regex("(https://www\\.tudou\\.com/.*)").all());
	}
	

	public static void main(String[] args) {
		Spider.create(new TuDoPageProcess())
        //从"https://github.com/code4craft"开始抓
        .addUrl("https://www.tudou.com/category/c_96.html?spm=a2h28.8514923.filter.5~5!3~A")
        //开启5个线程抓取
        .thread(5)
        //启动爬虫
        .run();

	}

}
