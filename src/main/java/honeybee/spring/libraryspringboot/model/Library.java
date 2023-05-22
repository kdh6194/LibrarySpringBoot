package honeybee.spring.libraryspringboot.model;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "library")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lbno;
    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    @Column(insertable = false,updatable = false)
    private Double lat;
    @Column(insertable = false,updatable = false)
    private Double lon;
    @CreatedDate
    @Column(insertable = false,updatable = false)
    private LocalDateTime regdate;
}
