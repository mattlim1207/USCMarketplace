package com.usc.market.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "listing")
public class ListingEntity {
    private int id;
    private String itemName;
    private String itemDescription;
    private int quantity;
    private int quality;
    private String image;
    private int pickupLoc;
    private byte sold;
    private byte held;
    private UserEntity userByOwnerId;

    /**
     * get id
     *
     * @return id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get itemName
     *
     * @return itemName
     */
    @Basic
    @Column(name = "item_name")
    public String getItemName() {
        return itemName;
    }

    /**
     * set itemName
     *
     * @param itemName itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * get itemDescription
     *
     * @return itemDescription
     */
    @Basic
    @Column(name = "item_description")
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * set itemDescription
     *
     * @param itemDescription itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * get quantity
     *
     * @return quantity
     */
    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * set quantity
     *
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * get quality
     *
     * @return quality
     */
    @Basic
    @Column(name = "quality")
    public int getQuality() {
        return quality;
    }

    /**
     * set quality
     *
     * @param quality quality
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * get image
     *
     * @return image
     */
    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    /**
     * set image
     *
     * @param image image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * get pickupLoc
     *
     * @return pickupLoc
     */
    @Basic
    @Column(name = "pickup_loc")
    public int getPickupLoc() {
        return pickupLoc;
    }

    /**
     * set pickupLoc
     *
     * @param pickupLoc pickupLoc
     */
    public void setPickupLoc(int pickupLoc) {
        this.pickupLoc = pickupLoc;
    }

    /**
     * get sold
     *
     * @return sold
     */
    @Basic
    @Column(name = "sold")
    public byte getSold() {
        return sold;
    }

    /**
     * set sold
     *
     * @param sold sold
     */
    public void setSold(byte sold) {
        this.sold = sold;
    }

    /**
     * get held
     *
     * @return held
     */
    @Basic
    @Column(name = "held")
    public byte getHeld() {
        return held;
    }

    /**
     * set held
     *
     * @param held held
     */
    public void setHeld(byte held) {
        this.held = held;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListingEntity that = (ListingEntity) o;

        if (id != that.id) return false;
        if (quantity != that.quantity) return false;
        if (quality != that.quality) return false;
        if (pickupLoc != that.pickupLoc) return false;
        if (sold != that.sold) return false;
        if (held != that.held) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (itemDescription != null ? !itemDescription.equals(that.itemDescription) : that.itemDescription != null)
            return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemDescription != null ? itemDescription.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + quality;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + pickupLoc;
        result = 31 * result + (int) sold;
        result = 31 * result + (int) held;
        return result;
    }


    /**
     * get userByOwnerId
     *
     * @return userByOwnerId
     */
    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByOwnerId() {
        return userByOwnerId;
    }

    /**
     * set userByOwnerId
     *
     * @param userByOwnerId userByOwnerId
     */
    public void setUserByOwnerId(UserEntity userByOwnerId) {
        this.userByOwnerId = userByOwnerId;
    }
}
