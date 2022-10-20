package org.springframework.samples.petclinic.statistics;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AchievementService {
    

    private AchievementRepository achievementRepository;

    @Autowired
    public AchievementService(AchievementRepository achievementRepository){
        this.achievementRepository = achievementRepository;
    }

    @Transactional(readOnly = true)
	public List<Achievement> getAchievements() throws DataAccessException {
		return achievementRepository.findAll();
	}
}
