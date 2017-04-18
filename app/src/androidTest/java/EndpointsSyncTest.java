import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertFalse;

/**
 * Created by kondeelai on 2017-04-18.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsSyncTest  {
    @Test
    public void runEndpointsTest(){
        new EndpointsAsyncTask(new EndpointsAsyncTask.AsyncResponse(){
            @Override
            public void processFinish(String output) {
                assertFalse(output.isEmpty());
            }
        }).execute();
    }
}
