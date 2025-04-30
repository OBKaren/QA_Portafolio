package listeners;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import utilities.Logs;

public class TestListeners implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        Logs.info("Test finished: %s", context.getDisplayName());
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        Logs.info("Test started: %s", context.getDisplayName());
    }
}
