package k2;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.camera2.internal.k0;
import androidx.work.k;
import androidx.work.p;
import com.google.android.gms.internal.ads.bb;
import j2.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.c;
import n2.d;
import r2.l;
import s2.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements e, c, j2.b {
    public static final String A = k.e("GreedyScheduler");
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final j2.k f13542t;

    /* renamed from: u, reason: collision with root package name */
    public final d f13543u;

    /* renamed from: w, reason: collision with root package name */
    public final a f13545w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13546x;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f13548z;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f13544v = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final Object f13547y = new Object();

    public b(Context context, androidx.work.c cVar, u2.b bVar, j2.k kVar) {
        this.s = context;
        this.f13542t = kVar;
        this.f13543u = new d(context, bVar, this);
        this.f13545w = new a(this, cVar.f1760e);
    }

    @Override // j2.e
    public final void a(l... lVarArr) {
        if (this.f13548z == null) {
            this.f13548z = Boolean.valueOf(j.a(this.s, this.f13542t.f13475b));
        }
        if (!this.f13548z.booleanValue()) {
            k.c().d(A, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f13546x) {
            this.f13542t.f13479f.a(this);
            this.f13546x = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (l lVar : lVarArr) {
            long jA = lVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (lVar.f14281b == p.s) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f13545w;
                    if (aVar != null) {
                        j2.a aVar2 = aVar.f13540b;
                        HashMap map = aVar.f13541c;
                        Runnable runnable = (Runnable) map.remove(lVar.f14280a);
                        if (runnable != null) {
                            aVar2.f13448a.removeCallbacks(runnable);
                        }
                        bb bbVar = new bb(11, aVar, lVar);
                        map.put(lVar.f14280a, bbVar);
                        aVar2.f13448a.postDelayed(bbVar, lVar.a() - System.currentTimeMillis());
                    }
                } else if (lVar.b()) {
                    androidx.work.d dVar = lVar.f14288j;
                    if (dVar.f1766c) {
                        k.c().a(A, "Ignoring WorkSpec " + lVar + ", Requires device idle.", new Throwable[0]);
                    } else if (dVar.h.f1771a.size() > 0) {
                        k.c().a(A, "Ignoring WorkSpec " + lVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(lVar);
                        hashSet2.add(lVar.f14280a);
                    }
                } else {
                    k.c().a(A, k0.a("Starting work for ", lVar.f14280a), new Throwable[0]);
                    this.f13542t.f(lVar.f14280a, null);
                }
            }
        }
        synchronized (this.f13547y) {
            try {
                if (!hashSet.isEmpty()) {
                    k.c().a(A, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f13544v.addAll(hashSet);
                    this.f13543u.b(this.f13544v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j2.e
    public final boolean b() {
        return false;
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        synchronized (this.f13547y) {
            try {
                Iterator it = this.f13544v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    l lVar = (l) it.next();
                    if (lVar.f14280a.equals(str)) {
                        k.c().a(A, "Stopping tracking for " + str, new Throwable[0]);
                        this.f13544v.remove(lVar);
                        this.f13543u.b(this.f13544v);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j2.e
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f13548z;
        j2.k kVar = this.f13542t;
        if (bool == null) {
            this.f13548z = Boolean.valueOf(j.a(this.s, kVar.f13475b));
        }
        boolean zBooleanValue = this.f13548z.booleanValue();
        String str2 = A;
        if (!zBooleanValue) {
            k.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f13546x) {
            kVar.f13479f.a(this);
            this.f13546x = true;
        }
        k.c().a(str2, k0.a("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f13545w;
        if (aVar != null && (runnable = (Runnable) aVar.f13541c.remove(str)) != null) {
            aVar.f13540b.f13448a.removeCallbacks(runnable);
        }
        kVar.g(str);
    }

    @Override // n2.c
    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            k.c().a(A, k0.a("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f13542t.g(str);
        }
    }

    @Override // n2.c
    public final void f(List<String> list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            k.c().a(A, k0.a("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f13542t.f(str, null);
        }
    }
}
