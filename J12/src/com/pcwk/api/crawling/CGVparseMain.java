package com.pcwk.api.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import com.pcwk.api.string.LoggerManager;

public class CGVparseMain implements LoggerManager {

	public static void main(String[] args) {
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";

		try {
			Document doc = Jsoup.connect(url).get();
//			LOG.debug("-------------------------------------------");
//			LOG.debug(doc);
//			LOG.debug("-------------------------------------------");

			// 제목
			// html 태그 구분자 space
			// html css 구분자 .
			Elements titles = doc.select("div.box-contents strong.title");

			// 예매율
			Elements reservRatios = doc.select("div.score strong.percent span");

			// 개봉일
			Elements openRuns = doc.select("span.txt-info strong");
			
			// 포스터
			Elements posters = doc.select("span.thumb-image img");

			for (int i = 0; i < 3; i++) {
				Element titleElement = titles.get(i);
				Element reservElement = reservRatios.get(i);
				Element openElement = openRuns.get(i);
				
				String poster = posters.get(i).attr("src");

				LOG.debug((i + 1) + "." + titleElement.text()
				+ ", 예매율: " + reservElement.text()
				+ ", 개봉일: " + openElement.text().replace("개봉", "")
				+ ", 포스터: " + poster
				);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} // try
	}// main
}
// 1.언차티드, 예매율: 34.4%, 개봉일: 2022.02.16 , 
// 포스터: https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85624/85624_320.jpg
// 2.극장판 주술회전 0, 예매율: 29.9%, 개봉일: 2022.02.17 , 
// 포스터: https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85603/85603_320.jpg
// 3.더 배트맨, 예매율: 18.0%, 개봉일: 2022.03.01  D-11, 
// 포스터: https://img.cgv.co.kr/Movie/Thumbnail/Poster/000085/85632/85632_320.jpg
