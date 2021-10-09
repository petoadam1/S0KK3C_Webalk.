package hu.me.iit.webalk.first;

import javax.validation.constraints.NotNull;

public class Movie {
    @NotNull
    private String id;

    @NotNull
    private String director;

    @NotNull
    private Integer publicationYear;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer age) {
        this.publicationYear = publicationYear;
    }
}
