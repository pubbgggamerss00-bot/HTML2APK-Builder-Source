package df;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f7969b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7970a;

    public l() {
        HashMap map = new HashMap();
        this.f7970a = map;
        m mVar = new m();
        i iVar = new i();
        g gVar = new g();
        p pVar = new p();
        d dVar = new d();
        a aVar = new a();
        s sVar = new s();
        h hVar = new h();
        o oVar = new o();
        map.put(cf.l.E0, mVar);
        map.put(cf.l.F0, mVar);
        map.put(cf.l.f5461e0, iVar);
        map.put(cf.l.f5465f0, iVar);
        map.put(cf.l.G, gVar);
        map.put(cf.l.H, gVar);
        map.put(cf.l.f5500o1, pVar);
        map.put(cf.l.f5504p1, pVar);
        map.put(cf.l.f5502p, dVar);
        map.put(cf.l.f5506q, dVar);
        map.put(cf.l.f5510r, aVar);
        map.put(cf.l.f5514s, aVar);
        map.put(cf.l.f5452b2, sVar);
        map.put(cf.l.f5455c2, sVar);
        map.put(cf.l.f5450b0, hVar);
        map.put(cf.l.f5466f1, oVar);
    }

    public final k a(cf.l lVar) throws IOException {
        k kVar = (k) this.f7970a.get(lVar);
        if (kVar != null) {
            return kVar;
        }
        throw new IOException("Invalid filter: " + lVar);
    }
}
