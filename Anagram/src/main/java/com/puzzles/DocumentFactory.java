package com.puzzles;

import java.net.URL;

public class DocumentFactory {
	URL url;
	
	DocumentFactory(URL url) {
		this.url = url;
	}

	Document build(URL url) {
		return new Document(url.getFile());
	}
}
