package com.example.barksapi.models;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "BARKS")
public class Bark {

    public Bark(String userName, String barkText, int loudness) {
        this.userName = userName;
        this.barkText = barkText;
        this.loudness = loudness;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIMESTAMP")
    private Date timestamp;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "BARK_TEXT")
    private String barkText;

    @Column(name = "LOUDNESS")
    private int loudness;
}
