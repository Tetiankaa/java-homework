package homework2.jsonTask;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Romaguera-Crona");
        company.setCatchPhrase("Multi-layered client-server neural-net");
        company.setBs("harness real-time e-markets");

        Address address = new Address();
        address.setStreet("Kulas Light");
        address.setSuite("Apt. 556");
        address.setCity("Gwenborough");
        address.setZipcode("92998-3874");
        Geo geo = new Geo();
        geo.setLat("-37.3159");
        geo.setLng("81.1496");
        address.setGeo(geo);

        User user = new User();
        user.setId(1);
        user.setName("Leanne Graham");
        user.setUsername("Bret");
        user.setEmail("Sincere@april.biz");
        user.setPhone("1-770-736-8031 x56442");
        user.setWebsite("hildegard.org");

        user.addCompany(company);
        user.addAddress(address);

        System.out.println(user);
    }
}
