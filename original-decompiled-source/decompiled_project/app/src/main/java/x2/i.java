package x2;

import com.google.protobuf.DescriptorProtos;
import pg.f0;
import ph.j0;
import ph.n2;
import tg.h;
import x2.f;
import x2.m;

/* loaded from: classes.dex */
public final class i implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f32020a;

    /* renamed from: b, reason: collision with root package name */
    public final b f32021b;

    /* renamed from: c, reason: collision with root package name */
    public final z f32022c;

    /* renamed from: d, reason: collision with root package name */
    public final m f32023d;

    /* renamed from: e, reason: collision with root package name */
    public final t f32024e;

    public i(a aVar, b bVar) {
        z zVar = j.f32025a;
        z zVar2 = j.f32025a;
        m mVar = new m();
        m.a aVar2 = m.f32026a;
        qh.g gVar = b3.h.f3564a;
        aVar2.getClass();
        j0.a(h.a.C0291a.c(aVar2, gVar).plus(tg.i.f28768a).plus(new n2(null)));
        t tVar = new t();
        this.f32020a = aVar;
        this.f32021b = bVar;
        this.f32022c = zVar;
        this.f32023d = mVar;
        this.f32024e = tVar;
        new g(this);
    }

    @Override // x2.f.a
    public final a0 a(f fVar, p pVar, int i10, int i11) {
        b bVar = this.f32021b;
        bVar.getClass();
        int i12 = bVar.f32013a;
        p pVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? pVar : new p(jh.j.m(pVar.f32037a + i12, 1, DescriptorProtos.Edition.EDITION_2023_VALUE));
        this.f32020a.getClass();
        return b(new x(fVar, pVar2, i10, i11, null));
    }

    public final a0 b(x xVar) {
        z zVar = this.f32022c;
        h hVar = new h(this, xVar);
        synchronized (zVar.f32050a) {
            a0 a0Var = zVar.f32051b.get(xVar);
            if (a0Var != null) {
                if (a0Var.d()) {
                    return a0Var;
                }
                zVar.f32051b.remove(xVar);
            }
            try {
                a0 a0Var2 = (a0) hVar.invoke(new y(zVar, xVar));
                synchronized (zVar.f32050a) {
                    try {
                        if (zVar.f32051b.get(xVar) == null && a0Var2.d()) {
                            zVar.f32051b.put(xVar, a0Var2);
                        }
                        f0 f0Var = f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return a0Var2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
