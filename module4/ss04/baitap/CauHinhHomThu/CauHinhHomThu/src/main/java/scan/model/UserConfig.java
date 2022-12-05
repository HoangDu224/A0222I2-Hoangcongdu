
package scan.model;

public class UserConfig {
    private int id;
    private String name;
    private String language;
    private String pageSize;
    private Boolean spamFilter;
    private String Signature;

    public UserConfig() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserConfig(int id, String name, String language, String pageSize, Boolean spamFilter, String signature) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        Signature = signature;
    }

    public UserConfig(int id, String name, String language, String pageSize, Boolean spamFilter) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
