package o2;

import androidx.work.k;
import java.util.ArrayList;
import r2.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<T> implements n2.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14007a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public T f14008b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.d<T> f14009c;

    /* renamed from: d, reason: collision with root package name */
    public a f14010d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
    }

    public c(p2.d<T> dVar) {
        this.f14009c = dVar;
    }

    @Override // n2.a
    public final void a(T t6) {
        this.f14008b = t6;
        e(this.f14010d, t6);
    }

    public abstract boolean b(l lVar);

    public abstract boolean c(T t6);

    public final void d(Iterable<l> iterable) {
        this.f14007a.clear();
        for (l lVar : iterable) {
            if (b(lVar)) {
                this.f14007a.add(lVar.f14280a);
            }
        }
        if (this.f14007a.isEmpty()) {
            this.f14009c.b(this);
        } else {
            p2.d<T> dVar = this.f14009c;
            synchronized (dVar.f14070c) {
                try {
                    if (dVar.f14071d.add(this)) {
                        if (dVar.f14071d.size() == 1) {
                            dVar.f14072e = dVar.a();
                            k.c().a(p2.d.f14067f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f14072e), new Throwable[0]);
                            dVar.d();
                        }
                        a(dVar.f14072e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.f14010d, this.f14008b);
    }

    public final void e(a aVar, T t6) {
        if (this.f14007a.isEmpty() || aVar == null) {
            return;
        }
        if (t6 == null || c(t6)) {
            ArrayList arrayList = this.f14007a;
            n2.d dVar = (n2.d) aVar;
            synchronized (dVar.f13920c) {
                try {
                    n2.c cVar = dVar.f13918a;
                    if (cVar != null) {
                        cVar.e(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f14007a;
        n2.d dVar2 = (n2.d) aVar;
        synchronized (dVar2.f13920c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    String str = (String) obj;
                    if (dVar2.a(str)) {
                        k.c().a(n2.d.f13917d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                n2.c cVar2 = dVar2.f13918a;
                if (cVar2 != null) {
                    cVar2.f(arrayList3);
                }
            } finally {
            }
        }
    }
}
