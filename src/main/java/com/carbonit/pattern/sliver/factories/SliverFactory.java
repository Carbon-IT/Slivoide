package com.carbonit.pattern.sliver.factories;

import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import org.springframework.stereotype.Component;

@Component
public class SliverFactory {


    //A implémenter
    public SkillStrategy getSliverSkill(SliverPower power) {
        return null;
    }

}
