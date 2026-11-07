package androidx.work;

import androidx.work.m;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public UUID f1849a;

    /* renamed from: b, reason: collision with root package name */
    public r2.l f1850b;

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f1851c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a<B extends a<?, ?>, W extends r> {

        /* renamed from: a, reason: collision with root package name */
        public UUID f1852a;

        /* renamed from: b, reason: collision with root package name */
        public r2.l f1853b;

        /* renamed from: c, reason: collision with root package name */
        public HashSet f1854c;

        public final m a() {
            m.a aVar = (m.a) this;
            UUID uuid = aVar.f1852a;
            r2.l lVar = aVar.f1853b;
            HashSet hashSet = aVar.f1854c;
            m mVar = new m();
            mVar.f1849a = uuid;
            mVar.f1850b = lVar;
            mVar.f1851c = hashSet;
            d dVar = this.f1853b.f14288j;
            boolean z6 = dVar.h.f1771a.size() > 0 || dVar.f1767d || dVar.f1765b || dVar.f1766c;
            if (this.f1853b.f14295q && z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f1852a = UUID.randomUUID();
            r2.l lVar2 = this.f1853b;
            r2.l lVar3 = new r2.l();
            lVar3.f14281b = p.s;
            f fVar = f.f1775c;
            lVar3.f14284e = fVar;
            lVar3.f14285f = fVar;
            lVar3.f14288j = d.f1763i;
            lVar3.f14290l = androidx.work.a.s;
            lVar3.f14291m = 30000L;
            lVar3.f14294p = -1L;
            lVar3.f14296r = o.s;
            lVar3.f14280a = lVar2.f14280a;
            lVar3.f14282c = lVar2.f14282c;
            lVar3.f14281b = lVar2.f14281b;
            lVar3.f14283d = lVar2.f14283d;
            lVar3.f14284e = new f(lVar2.f14284e);
            lVar3.f14285f = new f(lVar2.f14285f);
            lVar3.f14286g = lVar2.f14286g;
            lVar3.h = lVar2.h;
            lVar3.f14287i = lVar2.f14287i;
            d dVar2 = lVar2.f14288j;
            d dVar3 = new d();
            dVar3.f1764a = l.s;
            dVar3.f1769f = -1L;
            dVar3.f1770g = -1L;
            dVar3.h = new e();
            dVar3.f1765b = dVar2.f1765b;
            dVar3.f1766c = dVar2.f1766c;
            dVar3.f1764a = dVar2.f1764a;
            dVar3.f1767d = dVar2.f1767d;
            dVar3.f1768e = dVar2.f1768e;
            dVar3.h = dVar2.h;
            lVar3.f14288j = dVar3;
            lVar3.f14289k = lVar2.f14289k;
            lVar3.f14290l = lVar2.f14290l;
            lVar3.f14291m = lVar2.f14291m;
            lVar3.f14292n = lVar2.f14292n;
            lVar3.f14293o = lVar2.f14293o;
            lVar3.f14294p = lVar2.f14294p;
            lVar3.f14295q = lVar2.f14295q;
            lVar3.f14296r = lVar2.f14296r;
            this.f1853b = lVar3;
            lVar3.f14280a = this.f1852a.toString();
            return mVar;
        }
    }

    public r() {
        throw null;
    }
}
