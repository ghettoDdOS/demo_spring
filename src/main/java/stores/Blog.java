package stores;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;


@Data
@Table("blogs")
public class Blog {
    @Id
    private Long id;
    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="Заноловок должен содержать не менее 5 символов")
    @Column("title")
    private String title;

    @NotNull
    @Column("content")
    private String content;


    @Column("author_id")
    private Author author;
}
