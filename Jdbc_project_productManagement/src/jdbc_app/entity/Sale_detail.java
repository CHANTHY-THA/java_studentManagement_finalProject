package jdbc_app.entity;

import java.util.Date;

public class Sale_detail {
    private long id;
    private long product_id;
    private long shop_id;
    private String createBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public Sale_detail() {
    }

    public Sale_detail(long id, long product_id, long shop_id, String createBy, Date createdDate, String updatedBy, Date updatedDate) {
        this.id = id;
        this.product_id = product_id;
        this.shop_id = shop_id;
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

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getShop_id() {
        return shop_id;
    }

    public void setShop_id(long shop_id) {
        this.shop_id = shop_id;
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
        return "Sale_detail{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", shop_id=" + shop_id +
                ", createBy='" + createBy + '\'' +
                ", createdDate=" + createdDate +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
