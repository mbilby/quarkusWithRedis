package Services;

import io.quarkus.redis.client.RedisClient;
import io.quarkus.redis.client.RedisClientName;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;

@ApplicationScoped
public class RedisService {

    @Inject
    @RedisClientName("meu-cache")
    RedisClient redisClient;

    public void setValue(String key, String value) {
        redisClient.setnx(key, value);
    }

    public Optional<String> getValue(String key) {
        return Optional.ofNullable(redisClient.get(key).toString());
    }
}
