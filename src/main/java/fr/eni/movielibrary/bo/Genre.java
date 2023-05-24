package fr.eni.movielibrary.bo;

public class Genre {
    private long id;
    private String label;

    //#region Getters/Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //#endregion

    public Genre(long id, String label) {
        this.id = id;
        this.label = label;
    }
}
