package org.springframework.samples.petclinic.statistics;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "achievement")
public class Achievement extends NamedEntity {
    @Column(name = "description")
    private String description;
    @Column(name = "threshold")
    private double threshold;
    @Column(name = "badgeImage")
    private String badgeImage;    

}
