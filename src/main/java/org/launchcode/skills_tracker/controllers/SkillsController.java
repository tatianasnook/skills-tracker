package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String addingForm() {
        return "<html>" +
                    "<body>" +
                        "<form method='post'>" +
                            "<label for='name'>Name:</label>" +
                            "<input type='text' name='name' id='name'/>" +
                            "<br>" +
                            "<label for='language1'>My favorite language:</label>" +
                            "<select name='language1' id='language1'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for='language2'>My second favorite language:</label>" +
                            "<select name='language2' id='language2'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<label for='language3'>My third favorite language:</label>" +
                            "<select name='language3' id='language3'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<br>" +
                            "<input type='submit' value='Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String handleForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }
}

