package colsanitas.foonkiemonkey.com.co.des.util;

public class ListConceptsInput {


	private String title;
    private String description;
    private Boolean visibleDescription;

 

	public ListConceptsInput(String tit, String desc, boolean vD) {

	    this.setTitle(tit);
        this.setDescription(desc);
        this.setVisibleDescription(vD);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVisibleDescription() {
        return visibleDescription;
    }

    public void setVisibleDescription(Boolean visibleDescription) {
        this.visibleDescription = visibleDescription;
    }
}
