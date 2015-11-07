package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Entity
public class Ranking {

    @Id
    @GeneratedValue
    private Integer rankingId;

    @Column
    private String rankName;

    private Ranking() {
    }

    public Integer getRankingId() {
        return rankingId;
    }

    public void setRankingId(Integer rankingId) {
        this.rankingId = rankingId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "rankingId=" + rankingId +
                ", rankName='" + rankName + '\'' +
                '}';
    }
}
