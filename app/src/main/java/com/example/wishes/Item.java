package com.example.wishes;

public class Item {
        private int itemID;
        private String item;
        private String description;
        private double unitPrice;
        private int inStock;

        public Item() {
        }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public int getInStock() {
            return inStock;
        }

        public void setInStock(int inStock) {
            this.inStock = inStock;
        }

}
