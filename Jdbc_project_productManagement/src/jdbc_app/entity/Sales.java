package jdbc_app.entity;

import java.util.Date;

public class Sales {

    private long id;
    private long customer_id;
    private long vendor_id;
    private long shop_id;
    private double total;
    private Date saleDate;
    private String createBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public Sales() {
    }

    public Sales(long id, long customer_id, long vendor_id, long shop_id, double total, Date saleDate, String createBy, Date createdDate, String updatedBy, Date updatedDate) {
        this.id = id;
        this.customer_id = customer_id;
        this.vendor_id = vendor_id;
        this.shop_id = shop_id;
        this.total = total;
        this.saleDate = saleDate;
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

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public long getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public long getShop_id() {
        return shop_id;
    }

    public void setShop_id(long shop_id) {
        this.shop_id = shop_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
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
        return "Sales{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", vendor_id=" + vendor_id +
                ", shop_id=" + shop_id +
                ", total=" + total +
                ", saleDate=" + saleDate +
                ", createBy='" + createBy + '\'' +
                ", createdDate=" + createdDate +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
