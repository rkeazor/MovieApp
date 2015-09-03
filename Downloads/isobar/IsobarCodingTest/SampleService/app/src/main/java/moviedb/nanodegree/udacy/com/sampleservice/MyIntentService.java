package moviedb.nanodegree.udacy.com.sampleservice;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by rob2cool on 8/27/15.
 */
public class MyIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    public MyIntentService(){
        super ("MyIntentService");
    }
    public MyIntentService(String name) {
        super(name);
    }




    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(MyIntentService.this, "Intent Service in", Toast.LENGTH_SHORT).show();
    }
}
