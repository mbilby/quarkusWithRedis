import Services.RedisService;
import contrato.CacheManager;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;

@ApplicationScoped
public class RedisCacheManager implements CacheManager {

    @Inject
    RedisService redisService;

    @Override
    public  void setValue(String key, String value) {
        redisService.setValue(key, value);
    }

    @Override
    public Optional<String> getValue(String key) {
        return redisService.getValue(key);
    }
}
