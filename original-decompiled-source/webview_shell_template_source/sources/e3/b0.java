package e3;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import d3.e;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 extends u3.d implements e.a, e.b {

    /* renamed from: z, reason: collision with root package name */
    public static final t3.b f12858z = t3.e.f14432a;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f12859t;

    /* renamed from: u, reason: collision with root package name */
    public final t3.b f12860u;

    /* renamed from: v, reason: collision with root package name */
    public final Set<Scope> f12861v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.gms.common.internal.c f12862w;

    /* renamed from: x, reason: collision with root package name */
    public t3.f f12863x;

    /* renamed from: y, reason: collision with root package name */
    public u f12864y;

    public b0(Context context, o3.f fVar, com.google.android.gms.common.internal.c cVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.s = context;
        this.f12859t = fVar;
        this.f12862w = cVar;
        this.f12861v = cVar.f2415b;
        this.f12860u = f12858z;
    }

    @Override // e3.c
    public final void i1() {
        this.f12863x.a(this);
    }

    @Override // e3.c
    public final void n(int i6) {
        this.f12863x.disconnect();
    }

    @Override // e3.g
    public final void r(c3.b bVar) {
        this.f12864y.b(bVar);
    }
}
