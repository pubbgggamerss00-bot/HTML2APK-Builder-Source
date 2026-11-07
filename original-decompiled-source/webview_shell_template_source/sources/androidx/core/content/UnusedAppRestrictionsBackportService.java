package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import j0.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public final a s = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends c.a {
        public a() {
            attachInterface(this, c.f13442r);
        }
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.s;
    }
}
