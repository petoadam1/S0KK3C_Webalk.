package hu.me.iit.webalk.first;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieDto {

    @NotNull
    private Long id;

    @NotNull
    @NotBlank
    private String director;
    @NotBlank
    private String title;
    @Min(10)
    private Integer length;

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MovieDto{" +
                "id=" + id +
                ", director='" + director + '\'' +
                ", title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
