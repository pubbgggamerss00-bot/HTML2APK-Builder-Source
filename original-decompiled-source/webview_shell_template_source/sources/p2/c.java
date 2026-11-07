package p2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {
    public static final String h = k.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final a f14065g;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(intent);
            }
        }
    }

    public c(Context context, u2.a aVar) {
        super(context, aVar);
        this.f14065g = new a();
    }

    @Override // p2.d
    public final void d() {
        k.c().a(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f14069b.registerReceiver(this.f14065g, f());
    }

    @Override // p2.d
    public final void e() {
        k.c().a(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f14069b.unregisterReceiver(this.f14065g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
