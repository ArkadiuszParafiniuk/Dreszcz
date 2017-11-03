package giantscastle.dreszcz.game.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "character")

public class Character  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 12)
    @Column(name = "name", length = 12)
    private String name;
}
