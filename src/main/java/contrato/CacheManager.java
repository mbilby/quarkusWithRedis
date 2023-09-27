package contrato;

import java.util.Optional;
public interface CacheManager {
    void setValue(String key, String value);
    Optional<String> getValue(String key);
}
