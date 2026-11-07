package c3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2161a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f2162b = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.google.android.gms.common.internal.l.e("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f2161a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f2161a = true;
        IBinder iBinder = (IBinder) this.f2162b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2162b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
