package utilities;
import listeners.ResultListener;
import listeners.TestListeners;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

public class BaseTest {


    @ExtendWith({ResultListener.class, TestListeners.class})
    @BeforeEach ()
    public void masterSetUp(){
        Logs.info("Setup del padre");
    }

    @AfterEach()
    public void masterTearDown(){
        Logs.info("Teardown del padre");
    }
}
