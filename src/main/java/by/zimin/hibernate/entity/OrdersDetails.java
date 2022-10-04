package by.zimin.hibernate.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "orders_details", schema = "shop")
public class OrdersDetails {
    private Long id;
    private BigDecimal amount;
    private BigDecimal price;
    private Long orderId;
    private Long productId;
    private Long detailsId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "details_id", nullable = false)
    public Long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersDetails that = (OrdersDetails) o;
        return Objects.equals(id, that.id) && Objects.equals(amount, that.amount) && Objects.equals(price, that.price) && Objects.equals(orderId, that.orderId) && Objects.equals(productId, that.productId) && Objects.equals(detailsId, that.detailsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, price, orderId, productId, detailsId);
    }
}
