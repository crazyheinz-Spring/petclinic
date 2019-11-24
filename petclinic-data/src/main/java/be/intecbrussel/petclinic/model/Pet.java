package be.intecbrussel.petclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwnner() {
        return owner;
    }

    public void setOwnner(Owner ownner) {
        this.owner = ownner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
