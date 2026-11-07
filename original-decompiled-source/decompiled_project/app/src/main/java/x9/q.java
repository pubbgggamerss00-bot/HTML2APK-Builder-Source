package x9;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import r9.h;
import s9.f;
import u9.c;
import z9.b;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33506a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.e f33507b;

    /* renamed from: c, reason: collision with root package name */
    public final y9.d f33508c;

    /* renamed from: d, reason: collision with root package name */
    public final w f33509d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f33510e;

    /* renamed from: f, reason: collision with root package name */
    public final z9.b f33511f;

    /* renamed from: g, reason: collision with root package name */
    public final aa.a f33512g;

    /* renamed from: h, reason: collision with root package name */
    public final aa.a f33513h;

    /* renamed from: i, reason: collision with root package name */
    public final y9.c f33514i;

    public q(Context context, s9.e eVar, y9.d dVar, w wVar, Executor executor, z9.b bVar, aa.a aVar, aa.a aVar2, y9.c cVar) {
        this.f33506a = context;
        this.f33507b = eVar;
        this.f33508c = dVar;
        this.f33509d = wVar;
        this.f33510e = executor;
        this.f33511f = bVar;
        this.f33512g = aVar;
        this.f33513h = aVar2;
        this.f33514i = cVar;
    }

    public final void a(final r9.j jVar, int i10) {
        s9.b bVarA;
        s9.l lVar = this.f33507b.get(jVar.f23291a);
        f.a aVar = f.a.f24776a;
        new s9.b(aVar, 0L);
        final long j10 = 0;
        while (true) {
            b.a aVar2 = new b.a() { // from class: x9.j
                @Override // z9.b.a
                public final Object f() {
                    return Boolean.valueOf(this.f33490a.f33508c.R(jVar));
                }
            };
            z9.b bVar = this.f33511f;
            if (!((Boolean) bVar.p(aVar2)).booleanValue()) {
                final r9.j jVar2 = jVar;
                bVar.p(new b.a() { // from class: x9.p
                    @Override // z9.b.a
                    public final Object f() {
                        q qVar = this.f33503a;
                        qVar.f33508c.J(qVar.f33512g.a() + j10, jVar2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) bVar.p(new b.a() { // from class: x9.k
                @Override // z9.b.a
                public final Object f() {
                    return this.f33492a.f33508c.v(jVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (lVar == null) {
                v9.a.a(jVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                bVarA = new s9.b(f.a.f24778c, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y9.f) it.next()).a());
                }
                if (jVar.b() != null) {
                    final y9.c cVar = this.f33514i;
                    Objects.requireNonNull(cVar);
                    u9.a aVar3 = (u9.a) bVar.p(new b.a() { // from class: x9.g
                        @Override // z9.b.a
                        public final Object f() {
                            return cVar.z();
                        }
                    });
                    h.a aVar4 = new h.a();
                    aVar4.f23285f = new HashMap();
                    aVar4.f23283d = Long.valueOf(this.f33512g.a());
                    aVar4.f23284e = Long.valueOf(this.f33513h.a());
                    aVar4.f23280a = "GDT_CLIENT_METRICS";
                    o9.b bVar2 = new o9.b("proto");
                    aVar3.getClass();
                    yd.h hVar = r9.p.f23305a;
                    hVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.a(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar4.f23282c = new r9.m(bVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(lVar.b(aVar4.b()));
                }
                bVarA = lVar.a(new s9.a(arrayList, jVar.f23292b));
            }
            f.a aVar5 = bVarA.f24770a;
            if (aVar5 == f.a.f24777b) {
                final r9.j jVar3 = jVar;
                bVar.p(new b.a() { // from class: x9.l
                    @Override // z9.b.a
                    public final Object f() {
                        q qVar = this.f33494a;
                        y9.d dVar = qVar.f33508c;
                        dVar.r0(iterable);
                        dVar.J(qVar.f33512g.a() + j10, jVar3);
                        return null;
                    }
                });
                this.f33509d.a(jVar3, i10 + 1, true);
                return;
            }
            r9.j jVar4 = jVar;
            bVar.p(new b.a() { // from class: x9.m
                @Override // z9.b.a
                public final Object f() {
                    this.f33498a.f33508c.k(iterable);
                    return null;
                }
            });
            if (aVar5 == aVar) {
                long jMax = Math.max(j10, bVarA.f24771b);
                if (jVar4.b() != null) {
                    bVar.p(new b.a() { // from class: x9.n
                        @Override // z9.b.a
                        public final Object f() {
                            this.f33500a.f33514i.l();
                            return null;
                        }
                    });
                }
                j10 = jMax;
            } else if (aVar5 == f.a.f24779d) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strG = ((y9.f) it2.next()).a().g();
                    if (map.containsKey(strG)) {
                        map.put(strG, Integer.valueOf(((Integer) map.get(strG)).intValue() + 1));
                    } else {
                        map.put(strG, 1);
                    }
                }
                bVar.p(new b.a() { // from class: x9.o
                    @Override // z9.b.a
                    public final Object f() {
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            this.f33501a.f33514i.h(((Integer) r1.getValue()).intValue(), (String) ((Map.Entry) it3.next()).getKey(), c.a.INVALID_PAYLOD);
                        }
                        return null;
                    }
                });
            }
            jVar = jVar4;
        }
    }
}
