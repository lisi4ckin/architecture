package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class NewsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id")
    private NewsUserRole role;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_news",
            joinColumns = @JoinColumn(name = "newsuser_id"),
            inverseJoinColumns = @JoinColumn(name = "news_id"))
    private Set<News> userNews;

}
