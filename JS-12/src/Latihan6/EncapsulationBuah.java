package Latihan6;

//Created by 21343045_Farraz Hadyan

public class EncapsulationBuah {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    //declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah)
    {
        this.namaBuah=namaBuah;
        this.hargaBuah=hargaBuah;
        this.warnaBuah=warnaBuah;
    }
    //declaration Setter for all fields
    public void setName(String namaBuah){
        this.namaBuah=namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah=hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah=warnaBuah;
    }
    //declaration Getter for all fields
    public String getName()
    {
        return namaBuah;
    }
    public String getPrice()
    {
        return hargaBuah;
    }
    public String getColor()
    {
        return warnaBuah;
    }
}
