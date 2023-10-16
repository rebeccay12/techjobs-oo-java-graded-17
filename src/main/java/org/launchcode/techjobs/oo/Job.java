package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = generateUniqueID();
    }

    private int generateUniqueID() {
        return nextId++;
    }
    //private Integer id;

//        public void setId(Integer id) {
//            this.id = Integer.parseInt(UUID.randomUUID().toString());
//
//        }



    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("ID: ").append(id).append(System.lineSeparator());
        System.out.println(employer);
//        System.out.println(employer.equals(""));
        sb.append("Name: ").append(name.isEmpty() ? "Data not available" : name).append(System.lineSeparator());
        sb.append("Employer: ").append(employer.getValue().equals("")  ? "Data not available": employer).append(System.lineSeparator());
        sb.append("Location: ").append(location.getValue().equals("") ?  "Data not available" : location).append(System.lineSeparator());
        sb.append("Position Type: ").append(positionType.getValue().equals("") ? "Data not available" : positionType).append(System.lineSeparator());
        sb.append("Core Competency: ").append(coreCompetency.getValue().equals("") ? "Data not available" : coreCompetency).append(System.lineSeparator());

        return sb.toString();
    }
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("ID: ").append(id).append(System.lineSeparator());
//        sb.append("Name: ").append(name.isEmpty() ? name : "Data not available").append(System.lineSeparator());
//        sb.append("Employer: ").append(employer == null ? "Data not available" : employer.toString()).append(System.lineSeparator());
//        sb.append("Location: ").append(location == null ? "Data not available" : location.toString()).append(System.lineSeparator());
//        sb.append("Position Type: ").append(positionType == null ? "Data not available" : positionType.toString()).append(System.lineSeparator());
//        sb.append("Core Competency: ").append(coreCompetency == null ? "Data not available" : coreCompetency.toString()).append(System.lineSeparator());
////        sb.append("Employer: ").append(employer == null ? "Data not available").append(System.lineSeparator());
////        sb.append("Location: ").append(location == null ? location : "Data not available").append(System.lineSeparator());
////        sb.append("Position Type: ").append(positionType == null ? positionType : "Data not available").append(System.lineSeparator());
////        sb.append("Core Competency: ").append(coreCompetency == null ? coreCompetency : "Data not available").append(System.lineSeparator());
//        return sb.toString();
//    }

//
//        System.lineSeparator() + "Name: " + name +
//                System.lineSeparator() + "Employer: " + employer +
//                System.lineSeparator() + "Location: " + location +
//                System.lineSeparator() + "Position Type: " + positionType +
//                System.lineSeparator() + "Core Competency: " + coreCompetency +
//                System.lineSeparator();
//    }
//         return System.lineSeparator() +"ID: " + id +
//        if (name.isEmpty()) {
//            System.out.println(System.lineSeparator() + "Name: Data not available")
//        } else { System.lineSeparator() + "Name: " + name}
//
//        }
//
//                 System.lineSeparator() + "Name: " + name +
//                 System.lineSeparator() + "Employer: " + employer +
//                 System.lineSeparator() + "Location: " + location +
//                 System.lineSeparator() + "Position Type: " + positionType +
//                 System.lineSeparator() + "Core Competency: " + coreCompetency +
//                 System.lineSeparator();
//    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
