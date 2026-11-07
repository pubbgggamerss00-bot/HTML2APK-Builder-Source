package n2;

import android.content.Context;
import androidx.work.k;
import java.util.ArrayList;
import java.util.Collection;
import o2.c;
import o2.h;
import p2.e;
import p2.f;
import p2.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13917d = k.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final c f13918a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.c<?>[] f13919b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13920c;

    public d(Context context, u2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13918a = cVar;
        this.f13919b = new o2.c[]{new o2.a((p2.a) g.a(applicationContext, aVar).s), new o2.b((p2.b) g.a(applicationContext, aVar).f14079t), new h((f) g.a(applicationContext, aVar).f14081v), new o2.d((e) g.a(applicationContext, aVar).f14080u), new o2.g((e) g.a(applicationContext, aVar).f14080u), new o2.f((e) g.a(applicationContext, aVar).f14080u), new o2.e((e) g.a(applicationContext, aVar).f14080u)};
        this.f13920c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f13920c) {
            try {
                for (o2.c<?> cVar : this.f13919b) {
                    Object obj = cVar.f14008b;
                    if (obj != null && cVar.c(obj) && cVar.f14007a.contains(str)) {
                        k.c().a(f13917d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f13920c) {
            try {
                for (o2.c<?> cVar : this.f13919b) {
                    if (cVar.f14010d != null) {
                        cVar.f14010d = null;
                        cVar.e(null, cVar.f14008b);
                    }
                }
                for (o2.c<?> cVar2 : this.f13919b) {
                    cVar2.d(collection);
                }
                for (o2.c<?> cVar3 : this.f13919b) {
                    if (cVar3.f14010d != this) {
                        cVar3.f14010d = this;
                        cVar3.e(this, cVar3.f14008b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f13920c) {
            try {
                for (o2.c<?> cVar : this.f13919b) {
                    ArrayList arrayList = cVar.f14007a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f14009c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
