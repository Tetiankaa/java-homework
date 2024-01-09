package homework2.jsonTask;

import lombok.Data;

import java.util.ArrayList;

@Data
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private ArrayList<Company> companies;
    private ArrayList<Address> addresses;

    //aggregation
    public void addCompany(Company company){
        if (companies == null){
            companies = new ArrayList<>();
        }
        companies.add(company);
    }

    public void addAddress(Address address){
        if (addresses == null){
            addresses = new ArrayList<>();
        }
        addresses.add(address);
    }

}
