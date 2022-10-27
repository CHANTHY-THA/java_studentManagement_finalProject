package jdbc_app.entity;

import java.util.Date;

public class Vendors {
    private long id;
    private String name;
    private String createBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public Vendors() {
    }

    public Vendors(long id, String name, String createBy, Date createdDate, String updatedBy, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }


    @Override
    public String toString() {
        return "Vendors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createdDate=" + createdDate +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
