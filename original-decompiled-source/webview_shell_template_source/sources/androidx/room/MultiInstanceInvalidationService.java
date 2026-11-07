package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.HashMap;
import v1.d;
import v1.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap<Integer, String> f1726t = new HashMap<>();

    /* renamed from: u, reason: collision with root package name */
    public final a f1727u = new a();

    /* renamed from: v, reason: collision with root package name */
    public final b f1728v = new b();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends RemoteCallbackList<d> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            HashMap<Integer, String> map = MultiInstanceInvalidationService.this.f1726t;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends e {
        public b() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1728v;
    }
}
