import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public class Logging {
    public static void main(@NotNull String[] args) {
        final Injector injector = Guice.createInjector();
        injector.getInstance(Application.class).waitForInput();
    }
}