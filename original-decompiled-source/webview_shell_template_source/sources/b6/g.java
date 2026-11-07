package b6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y5.b0;
import y5.h0;
import y5.l0;
import y5.l1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g<T> extends h0<T> implements i5.d, g5.d<T> {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2019z = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: v, reason: collision with root package name */
    public final y5.u f2020v;

    /* renamed from: w, reason: collision with root package name */
    public final i5.c f2021w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2022x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2023y;

    public g(y5.u uVar, i5.c cVar) {
        super(-1);
        this.f2020v = uVar;
        this.f2021w = cVar;
        this.f2022x = h.f2024a;
        g5.f fVar = cVar.f13373t;
        kotlin.jvm.internal.j.b(fVar);
        this.f2023y = x.b(fVar);
    }

    @Override // y5.h0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof y5.m) {
            throw null;
        }
    }

    @Override // i5.d
    public final i5.d c() {
        i5.c cVar = this.f2021w;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // g5.d
    public final void g(Object obj) {
        i5.c cVar = this.f2021w;
        g5.f fVar = cVar.f13373t;
        kotlin.jvm.internal.j.b(fVar);
        Throwable thA = d5.d.a(obj);
        Object lVar = thA == null ? obj : new y5.l(thA, false);
        y5.u uVar = this.f2020v;
        if (uVar.y()) {
            this.f2022x = lVar;
            this.f15348u = 0;
            uVar.x(fVar, this);
            return;
        }
        l0 l0VarA = l1.a();
        if (l0VarA.f15359u >= 4294967296L) {
            this.f2022x = lVar;
            this.f15348u = 0;
            e5.h<h0<?>> hVar = l0VarA.f15361w;
            if (hVar == null) {
                hVar = new e5.h<>();
                l0VarA.f15361w = hVar;
            }
            hVar.addLast(this);
            return;
        }
        l0VarA.A(true);
        try {
            g5.f fVar2 = cVar.f13373t;
            kotlin.jvm.internal.j.b(fVar2);
            Object objC = x.c(fVar2, this.f2023y);
            try {
                cVar.g(obj);
                while (l0VarA.B()) {
                }
            } finally {
                x.a(fVar2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // g5.d
    public final g5.f getContext() {
        g5.f fVar = this.f2021w.f13373t;
        kotlin.jvm.internal.j.b(fVar);
        return fVar;
    }

    @Override // y5.h0
    public final Object h() {
        Object obj = this.f2022x;
        this.f2022x = h.f2024a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2020v + ", " + b0.h(this.f2021w) + ']';
    }

    @Override // y5.h0
    public final g5.d<T> b() {
        return this;
    }
}
