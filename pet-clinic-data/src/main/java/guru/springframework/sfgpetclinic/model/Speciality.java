package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;

@Entity
@Table(name = "speciality")
public class Speciality extends BaseEntity {
    @Column(name = "descriptiont")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
