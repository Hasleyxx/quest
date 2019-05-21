package com.quest.tables;

import javax.persistence.*;

@Entity @Table(name="qpd_items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ItemID")
    private int itemId;

	@Column(name="ItemName")
    private String itemName;
    @Column(name="itemPrice")
    private double itemPrice;
	@Column(name="ItemDescription")
    private String itemDescription;
    @Column(name="ItemType")
    private String itemType;
    @Column(name="DeletedItem")
    private int deletedItem;
    @Column(name="NeededTest")
    private int neededTest;
    @Column(name="CreationDate")
    private String creationDate;
    @Column(name="DateUpdate")
    private String dateUpdate;
    
    public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getDeletedItem() {
		return deletedItem;
	}
	public void setDeletedItem(int deletedItem) {
		this.deletedItem = deletedItem;
	}
	public int getNeededTest() {
		return neededTest;
	}
	public void setNeededTest(int neededTest) {
		this.neededTest = neededTest;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
    
    public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
}
