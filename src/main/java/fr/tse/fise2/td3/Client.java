package fr.tse.fise2.td3;

import java.util.Date;
import java.util.Objects;

public class Client {
    private String identifier;
    private String name;
    private String surname;
    private String postalCode;
    private String adress;
    private String city;
    private String country;
    private Date dateOfBirth;

    public Client(String identifier, String name,
                  String surname, String postalcode,
                  String adress, String city,
                  String country, Date dateOfBirth) {
        this.identifier = identifier;
        this.name = name;
        this.surname = surname;
        this.postalCode = postalcode;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return identifier.equals(client.identifier) &&
                name.equals(client.name) &&
                surname.equals(client.surname) &&
                postalCode.equals(client.postalCode) &&
                adress.equals(client.adress) &&
                city.equals(client.city) &&
                country.equals(client.country) &&
                dateOfBirth.equals(client.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name, surname, postalCode, adress, city, country, dateOfBirth);
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostalCode(String postalcode) {
        this.postalCode = postalcode;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostalcode() {
        return postalCode;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

}