package model;

public enum Genre {

    SCIENCE_FICTION("Science Fiction"),
    FANTASY("Fantasy"),
    YOUNG_ADULT("Young Adult"),
    NON_FICTION("NonFiction"),
    STEAMPUNK("Steampunk"),
    BIOGRAPHY("Biography");

    private String name;

    private Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
