package b12app.vyom.com.aidlremotepractice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import b12app.vyom.com.aidlremotepractice.IRemote;

public class ArithmeticService extends Service {

    private static final String TAG = "ArithmeticService";

    private final IRemote.Stub remoteBInder = new IRemote.Stub() {

        @Override
        public int add(int a, int b) throws RemoteException {
            Log.i(TAG, "add: ");
            return a+b;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind: ");
        return remoteBInder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG, "onUnbind: ");
        return super.onUnbind(intent);
    }
}
