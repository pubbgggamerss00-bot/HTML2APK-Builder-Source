package q3;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends g {
    public final AtomicReference s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14124t;

    public c() {
        attachInterface(this, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.s = new AtomicReference();
    }

    public static final Object i1(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e6) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e6);
            throw e6;
        }
    }

    public final Bundle n(long j6) {
        Bundle bundle;
        synchronized (this.s) {
            if (!this.f14124t) {
                try {
                    this.s.wait(j6);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.s.get();
        }
        return bundle;
    }

    public final void r(Bundle bundle) {
        synchronized (this.s) {
            try {
                try {
                    this.s.set(bundle);
                    this.f14124t = true;
                } finally {
                    this.s.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
