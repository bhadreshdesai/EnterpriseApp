package bdd.demo.enterpriseapp.home;

@lombok.AllArgsConstructor
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
public class AboutResponse {
    private String name;
    private String shortname;
    private String version;
}
