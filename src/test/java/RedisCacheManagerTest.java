import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class RedisCacheManagerTest {

    @Inject
    RedisCacheManager redisCacheManager;

    private final String chave = "total_de_cursos";
    private final String valor = "105";

    @Test
    void setValue() {
        //String chave = "total_de_cursos";
        //String valor = "105";
        redisCacheManager.setValue(this.chave, this.valor);

        Optional<String> actual = redisCacheManager.getValue(this.chave);

        assertEquals(Optional.of(this.valor), actual);
    }
    @Test
    void getValue() {
        String expected = "105";
        Optional<String> actual = redisCacheManager.getValue(chave);
        assertEquals(Optional.of(expected), actual);
    }
}