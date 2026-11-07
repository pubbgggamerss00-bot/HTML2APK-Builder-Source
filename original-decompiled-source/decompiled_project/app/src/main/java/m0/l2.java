package m0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import m0.r1;

/* loaded from: classes.dex */
public final class l2 implements j2 {

    /* renamed from: l, reason: collision with root package name */
    public static final g1.n f17395l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17396a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17397b;

    /* renamed from: c, reason: collision with root package name */
    public final p.c0<x> f17398c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f17399d;

    /* renamed from: e, reason: collision with root package name */
    public r1.a f17400e;

    /* renamed from: f, reason: collision with root package name */
    public r1.b f17401f;

    /* renamed from: g, reason: collision with root package name */
    public r1.d f17402g;

    /* renamed from: h, reason: collision with root package name */
    public r1.e f17403h;

    /* renamed from: i, reason: collision with root package name */
    public r1.f f17404i;

    /* renamed from: j, reason: collision with root package name */
    public r1.g f17405j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f17406k;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, l2, Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17407a = new a(2);

        @Override // eh.p
        public final Long invoke(g1.o oVar, l2 l2Var) {
            return Long.valueOf(l2Var.f17399d.get());
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Long, l2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17408a = new b(1);

        @Override // eh.l
        public final l2 invoke(Long l10) {
            return new l2(l10.longValue());
        }
    }

    static {
        g1.n nVar = g1.m.f11307a;
        f17395l = new g1.n(a.f17407a, b.f17408a);
    }

    public l2(long j10) {
        this.f17397b = new ArrayList();
        p.c0 c0Var = p.o.f20698a;
        this.f17398c = new p.c0<>();
        this.f17399d = new AtomicLong(j10);
        p.c0 c0Var2 = p.o.f20698a;
        kotlin.jvm.internal.r.c(c0Var2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f17406k = bg.b.h(c0Var2);
    }

    @Override // m0.j2
    public final void a(long j10) {
        r1.f fVar = this.f17404i;
        if (fVar != null) {
            fVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // m0.j2
    public final long b() {
        AtomicLong atomicLong = this.f17399d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // m0.j2
    public final boolean c(g2.v vVar, long j10, long j11, e0 e0Var, boolean z10) {
        r1.d dVar = this.f17402g;
        if (dVar == null) {
            return true;
        }
        r1 r1Var = r1.this;
        long jA = r1.a(r1Var, vVar, j10);
        long jA2 = r1.a(r1Var, vVar, j11);
        r1Var.l(z10);
        return r1Var.p(jA, jA2, false, e0Var);
    }

    @Override // m0.j2
    public final void d(g2.v vVar, long j10, e0 e0Var, boolean z10) {
        r1.b bVar = this.f17401f;
        if (bVar != null) {
            bVar.f(Boolean.valueOf(z10), vVar, new p1.c(j10), e0Var);
        }
    }

    @Override // m0.j2
    public final void e() {
        r1.e eVar = this.f17403h;
        if (eVar != null) {
            eVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.j2
    public final p.n<z> f() {
        return (p.n) this.f17406k.getValue();
    }

    @Override // m0.j2
    public final void g(long j10) {
        this.f17396a = false;
        r1.a aVar = this.f17400e;
        if (aVar != null) {
            aVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // m0.j2
    public final void h(x xVar) {
        long jE = xVar.e();
        p.c0<x> c0Var = this.f17398c;
        if (c0Var.a(jE)) {
            this.f17397b.remove(xVar);
            c0Var.g(xVar.e());
            r1.g gVar = this.f17405j;
            if (gVar != null) {
                gVar.invoke(Long.valueOf(xVar.e()));
            }
        }
    }

    @Override // m0.j2
    public final x i(u uVar) {
        long j10 = uVar.f17522a;
        if (j10 == 0) {
            y.c.a("The selectable contains an invalid id: " + j10);
        }
        p.c0<x> c0Var = this.f17398c;
        if (c0Var.a(j10)) {
            y.c.a("Another selectable with the id: " + uVar + ".selectableId has already subscribed.");
        }
        c0Var.h(uVar, j10);
        this.f17397b.add(uVar);
        this.f17396a = false;
        return uVar;
    }

    public final ArrayList j(g2.v vVar) {
        boolean z10 = this.f17396a;
        ArrayList arrayList = this.f17397b;
        if (!z10) {
            final m2 m2Var = new m2(vVar);
            qg.t.v(arrayList, new Comparator() { // from class: m0.k2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) m2Var.invoke(obj, obj2)).intValue();
                }
            });
            this.f17396a = true;
        }
        return arrayList;
    }

    public l2() {
        this(1L);
    }
}
