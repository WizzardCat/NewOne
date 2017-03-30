/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Formation
 */
public class User {

    private long id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String country;
    private String tel;
    private String mail;
    private int function;
    private boolean isBlocked;
        private boolean isAdmin;
    private String nickname_site;
    private String nickname_back;
    private String definitions ;
    private String password;
    private boolean hasChanged;
    
    
    
    
    public User() {
        this.id = 0;
        this.firstname = "";
        this.lastname = "";
        this.password = "";
        this.address = "";
        this.city = "";
        this.country = "";
        this.tel = "";
        this.mail = "";
        this.function = 0;
        this.isBlocked = false;
        this.isAdmin = false;
        this.nickname_site ="";
        this.nickname_back=""; 
        this.hasChanged = true;
        
    }

    public User(long id, String firstname, String lastname, String password, String address, String city, String country, String tel, String mail, int function, boolean isBlocked,  boolean isAdmin,String nickname_site, String nickname_back,String definitions, boolean hasChanged) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.mail = mail;
        this.function = function;
        this.isBlocked = isBlocked;
        this.isAdmin = isAdmin;
        this.nickname_site = nickname_site;
        this.nickname_back = nickname_back;
        this.definitions =definitions;
        this.hasChanged = hasChanged;
        
    }

    
    public User(long aLong, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, int aInt, boolean aBoolean, boolean aBoolean0, boolean aBoolean1, String string7, String string8, String string9) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHasChanged() {
        return hasChanged;
    }

    public void setHasChanged(boolean hasChanged) {
        this.hasChanged = hasChanged;
    }

    
    
    public String getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getFunction() {
        return function;
    }

    public void setFunction(int function) {
        this.function = function;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getNickname_site() {
        return nickname_site;
    }

    public void setNickname_site(String nickname_site) {
        this.nickname_site = nickname_site;
    }

    public String getNickname_back() {
        return nickname_back;
    }

    public void setNickname_back(String nickname_back) {
        this.nickname_back = nickname_back;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 41 * hash + Objects.hashCode(this.firstname);
        hash = 41 * hash + Objects.hashCode(this.lastname);
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.city);
        hash = 41 * hash + Objects.hashCode(this.country);
        hash = 41 * hash + Objects.hashCode(this.tel);
        hash = 41 * hash + Objects.hashCode(this.mail);
        hash = 41 * hash + this.function;
        hash = 41 * hash + (this.isBlocked ? 1 : 0);
        hash = 41 * hash + (this.isAdmin ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.nickname_site);
        hash = 41 * hash + Objects.hashCode(this.nickname_back);
        hash = 41 * hash + Objects.hashCode(this.definitions);
        hash = 41 * hash + Objects.hashCode(this.password);
        hash = 41 * hash + (this.hasChanged ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.function != other.function) {
            return false;
        }
        if (this.isBlocked != other.isBlocked) {
            return false;
        }
        if (this.isAdmin != other.isAdmin) {
            return false;
        }
        if (this.hasChanged != other.hasChanged) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.nickname_site, other.nickname_site)) {
            return false;
        }
        if (!Objects.equals(this.nickname_back, other.nickname_back)) {
            return false;
        }
        if (!Objects.equals(this.definitions, other.definitions)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password="+ password + ", address=" + address + ", city=" + city + ", country=" + country + ", tel=" + tel + ", mail=" + mail + ", function=" + function + ", isBlocked=" + isBlocked + ", isAdmin=" + isAdmin + ", nickname_site=" + nickname_site + ", nickname_back=" + nickname_back + ", hasChanged=" + hasChanged + '}';
    }
    
    
}
