package ig;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e implements eg.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f14533a = new HashSet();

    public final void a() {
        if (gg.b.f12075a == null) {
            gg.b.f12075a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != gg.b.f12075a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f14533a.iterator();
        while (it.hasNext()) {
            ((lg.a) it.next()).a();
        }
    }
}
