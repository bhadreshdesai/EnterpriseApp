package bdd.demo.enterpriseapp.home;

import java.time.LocalDateTime;

@lombok.AllArgsConstructor
@lombok.Builder
@lombok.Data
@lombok.NoArgsConstructor
public class GreetingsResponse {
    private Long id;
    private String greetings;
    private String mood;
    private LocalDateTime serverTime;
}
