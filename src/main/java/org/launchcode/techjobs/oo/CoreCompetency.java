package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

     public CoreCompetency(String value) {
         super(value);
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof CoreCompetency that)) return false;
         return id == that.id;
     }

     @Override
     public int hashCode() {
         return Objects.hash(id);
     }
}