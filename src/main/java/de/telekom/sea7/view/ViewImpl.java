package de.telekom.sea7.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewImpl {
	
	@GetMapping("/index.html")
	@ResponseBody
	public String getHTML() {
		
		String html = 
				"<!DOCTYPE html>"
				+"<html>"
				+	"<head>"
				+		"<meta charset='UTF-8'>"
				+		"<title>WebBanging</title>"
				+		"<link href='/index.css' rel='stylesheet'>"
				+	"</head>"
				+	"<body>"
				+		"<header id=\"header\">"
				+			"<h1>Willkommen beim WebBanking</h1>"
				+		"</header>"
				+	"</body>"
				+"</html>"		
				;
				
		return html;
	}
	
	@GetMapping("/index.css")
	@ResponseBody
	public String getCSS() {
		
		String css = 
				"@charset 'UTF-8';"
				+"#header{"
				+	"margin-left: 400px;"
				+	"padding: 5px;"
				+ "	width: 800px;"
				+ "	height: 30px;"
				+	"}"	
				+"body {"
				+"background-image: url('/bilder/pexels-johannes-plenio-2850287.jpg');"
				+"background-position: center;"
				+"background-repeat: no-repeat;"
				+"background-size: cover;"
				+"position: relative;"
				+"}"
				;
				
		return css;
	}
}
