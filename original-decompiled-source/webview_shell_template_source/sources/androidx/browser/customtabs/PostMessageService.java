package androidx.browser.customtabs;

import a.d;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class PostMessageService extends Service {
    public final a s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends d.a {
    }

    public PostMessageService() {
        a aVar = new a();
        aVar.attachInterface(aVar, d.f3d);
        this.s = aVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.s;
    }
}
