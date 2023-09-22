package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

	@GetMapping()
	public String homescreen() {
		return "<html>" +
				"<body>" +
				"<h1> Skills Tracker </h1>" +
				"<h2> Skills to learn: </h2>" +
				"<ol> " +
				"<li> JavaScript </li>" +
				"<li> Java </li>" +
				"<li> Python </li>" +
				"</ol>" +
				"</body>" +
				"</html>";
	}

	@GetMapping("/form")
	public String formscreen() {
		return "<html>" +
				"<body>" +
				"<form action='/form' method='POST'>" +
				"<label for = 'user'> Enter User Name: </label>" +
				"<input type='text' name='user'>" +
				"<br>" +
				"<label for = 'user'> My favorite language </label>" +
				"<select name = 'lang1'>" +
				"<option value='JavaScript'> Javascript</option>" +
				"<option value='Java'> Java</option>" +
				"<option value='Python'> Python</option>" +
				"</select>" +
				"<br>" +
				"<label for = 'user'> My second favorite language </label>" +
				"<select name='lang2'>" +
				"<option value='JavaScript'> Javascript</option>" +
				"<option value='Java'> Java</option>" +
				"<option value='Python'> Python</option>" +
				"</select>" +
				"<br>" +
				"<label for = 'user'> My third favorite language </label>" +
				"<select name = 'lang3'>" +
				"<option value='JavaScript'> Javascript</option>" +
				"<option value='Java'> Java</option>" +
				"<option value='Python'> Python</option>" +
				"</select>" +
				"<br>" +
				"<input type=submit name='Submit'/>" +
				"</form>" +
				"</body>" +
				"</html>";
	}

	@PostMapping("/form")
	public String postform(@RequestParam String user, String lang1, String lang2, String lang3) {
		return "<html>" +
				"<body>" +
				"<h1>" + user + "</h1>" +
				"<ol> " +
				"<li>" + lang1 + "</li>" +
				"<li>" + lang2 + "</li>" +
				"<li>" + lang3 + "</li>" +
				"</ol>" +
				"</body>" +
				"</html>";
	}
}