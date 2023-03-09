/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

public class Pais {
    private String name;
    private String continent;
    private int poblation;
    private int indpyear;
    private String code;
    private String region;



    public Pais(String code, String name, String continent, String region) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
    }
    
    public Pais(){
      
    }

    public String getCode(){
      return code;
    }

    public void setCode(String code){
      this.code=code;
    }

    public String getRegion(){
      return region;
    }

    public void setRegion(String region){
      this.region = region;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPoblation() {
        return poblation;
    }

    public void setPoblation(int poblation) {
        this.poblation = poblation;
    }
    
    public int getIndpyear() {
        return indpyear;
    }

    public void setIndpyear(int indpyear) {
        this.indpyear = indpyear;
    }



    
}
