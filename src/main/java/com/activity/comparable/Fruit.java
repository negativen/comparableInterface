package com.activity.comparable;

public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDescription;
    private int fruitQuantity;


    public Fruit(String fruitName, int fruitQuantity) {
        this.fruitName = fruitName;
        this.fruitDescription = " ";
        this.fruitQuantity = fruitQuantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public Fruit setFruitName(String fruitName) {
        this.fruitName = fruitName;
        return this;
    }

    public String getFruitDescription() {
        return fruitDescription;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    public Fruit setFruitQuantity(int fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
        return this;
    }

    public void setFruitDescription(String fruitDescription) {
        this.fruitDescription = fruitDescription;
    }

    public int compareTo(Fruit that) {

        if(this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        } else {

            if (this.fruitQuantity > that.fruitQuantity) {
                return -1;
            } else if (this.fruitQuantity < that.fruitQuantity) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDescription='").append(fruitDescription).append('\'');
        sb.append(", fruitQuantity=").append(fruitQuantity);
        sb.append('}');
        return sb.toString();


    }
}
