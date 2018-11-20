package cn.bywind.bootwebflux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.print.attribute.standard.Media;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class WebFluxController {

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> getUserList(){
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            users.add(new User("bywind"+i,28));
        }
        return Flux.fromIterable(users).delayElements(Duration.ofSeconds(1));
    }

    @GetMapping("/user")
    public Mono<User> getUser(){
        return Mono.just(new User("bywind",28));
    }


}
