package za.ac.cput.Projects;

public class placeInterfaceImpl implements placeInterface {
    @Override
    public String residence(String place) {
        return "Current residence: "+place;
    }
}
