package listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import utilities.Logs;

import java.util.Locale;
import java.util.Optional;

public class ResultListener implements TestWatcher {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        Logs.info("Test disabled: %s", context.getDisplayName());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
       Logs.info("Test successful: %s", context.getDisplayName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
       Logs.info("Test aborted: %s", context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Logs.info("Test failed: %s", context.getDisplayName());
    }
}
