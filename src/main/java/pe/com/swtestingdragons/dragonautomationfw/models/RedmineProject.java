package pe.com.swtestingdragons.dragonautomationfw.models;

public class RedmineProject {

    private Integer id;
    private String name;
    private String identifier;
    private String description;
    private String homepage;
    private Boolean status;
    private Boolean is_public;
    private String created_on;
    private String updated_on;

    private String homePage;

    public RedmineProject(){

    }

    public RedmineProject(Integer id, String name, String identifier, String description, String homepage, Boolean status, Boolean is_public, String created_on, String updated_on) {
        this.id = id;
        this.name = name;
        this.identifier = identifier;
        this.description = description;
        this.homepage = homepage;
        this.status = status;
        this.is_public = is_public;
        this.created_on = created_on;
        this.updated_on = updated_on;
    }

    public RedmineProject(String name, String identifier, String description, Boolean is_public) {
        this.name = name;
        this.identifier = identifier;
        this.description = description;
        this.is_public = is_public;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIs_public() {
        return is_public;
    }

    public void setIs_public(Boolean is_public) {
        this.is_public = is_public;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "com.company.projectrestassuredcucumber.cucumber.entities.Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", description='" + description + '\'' +
                ", homepage='" + homepage + '\'' +
                ", status=" + status +
                ", is_public=" + is_public +
                ", created_on='" + created_on + '\'' +
                ", updated_on='" + updated_on + '\'' +
                '}';
    }
}