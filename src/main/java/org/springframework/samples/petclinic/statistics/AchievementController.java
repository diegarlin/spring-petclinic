package org.springframework.samples.petclinic.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/statistics/achievements")
public class AchievementController {
    private final String ACHIEVEMENTS_LISTING_VIEW = "achievements/AchievementsListing";
    private AchievementService achievementService;

    @Autowired
    public AchievementController(AchievementService achievementService){
        this.achievementService = achievementService;
    }

    @GetMapping("/")
    public ModelAndView showAchievements(){
        ModelAndView result = new ModelAndView(ACHIEVEMENTS_LISTING_VIEW);
        result.addObject("achievements", achievementService.getAchievements());
        return result;
    }
}
