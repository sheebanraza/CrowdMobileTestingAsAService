package model;

import javax.lang.model.type.IntersectionType;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Sheeban on 11/6/2015.
 */


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ApplicationProvider extends User {

    @Id
    @GeneratedValue
    private Integer applicationProviderId;

    @Column
    private Integer numberOfApplication;

    @OneToMany
    private List<Application> applicationList;




    public ApplicationProvider() {
        super();
    }
}
