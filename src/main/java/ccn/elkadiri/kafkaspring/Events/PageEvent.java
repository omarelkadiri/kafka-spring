package ccn.elkadiri.kafkaspring.Events;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration) {

}
