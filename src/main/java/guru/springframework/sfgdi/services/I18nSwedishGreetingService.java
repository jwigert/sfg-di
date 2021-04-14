package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SV", "default"})
@Service("i18nService")
public class I18nSwedishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hej världen!";
    }
}
