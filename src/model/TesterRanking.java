package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sheeban on 11/3/2015.
 */

@Entity
public class TesterRanking {

    @Id
    @GeneratedValue
    private Integer rankingId;


    @Column
    private String rank;

    private TesterRanking() {
    }

    public Integer getRankingId() {
        return rankingId;
    }

    public void setRankingId(Integer rankingId) {
        this.rankingId = rankingId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "TesterRanking{" +
                "rankingId=" + rankingId +
                ", rank='" + rank + '\'' +
                '}';
    }
}
