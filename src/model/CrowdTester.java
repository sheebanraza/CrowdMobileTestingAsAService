package model;

import javax.persistence.*;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CrowdTester {

    @Id
    @GeneratedValue
    private Integer testerId;



}
