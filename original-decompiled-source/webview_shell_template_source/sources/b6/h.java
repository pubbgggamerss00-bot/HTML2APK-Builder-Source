package b6;

import java.util.concurrent.CancellationException;
import y5.h0;
import y5.l0;
import y5.l1;
import y5.n1;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2024a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f2025b;

    static {
        int i6 = 0;
        f2024a = new v(i6, "UNDEFINED");
        f2025b = new v(i6, "REUSABLE_CLAIMED");
    }

    public static final void a(g5.d dVar, Object obj) {
        if (!(dVar instanceof g)) {
            dVar.g(obj);
            return;
        }
        g gVar = (g) dVar;
        y5.u uVar = gVar.f2020v;
        i5.c cVar = gVar.f2021w;
        Throwable thA = d5.d.a(obj);
        Object lVar = thA == null ? obj : new y5.l(thA, false);
        cVar.getContext();
        g5.f fVar = cVar.f13373t;
        if (uVar.y()) {
            gVar.f2022x = lVar;
            gVar.f15348u = 1;
            kotlin.jvm.internal.j.b(fVar);
            uVar.x(fVar, gVar);
            return;
        }
        l0 l0VarA = l1.a();
        if (l0VarA.f15359u >= 4294967296L) {
            gVar.f2022x = lVar;
            gVar.f15348u = 1;
            e5.h<h0<?>> hVar = l0VarA.f15361w;
            if (hVar == null) {
                hVar = new e5.h<>();
                l0VarA.f15361w = hVar;
            }
            hVar.addLast(gVar);
            return;
        }
        l0VarA.A(true);
        try {
            kotlin.jvm.internal.j.b(fVar);
            x0 x0Var = (x0) fVar.t(x0.b.s);
            if (x0Var == null || x0Var.a()) {
                Object obj2 = gVar.f2023y;
                kotlin.jvm.internal.j.b(fVar);
                Object objC = x.c(fVar, obj2);
                n1 n1VarA = objC != x.f2051a ? y5.s.a(cVar, fVar) : null;
                try {
                    cVar.g(obj);
                    if (n1VarA != null) {
                        n1VarA.P();
                        throw null;
                    }
                    x.a(fVar, objC);
                } catch (Throwable th) {
                    if (n1VarA != null) {
                        n1VarA.P();
                        throw null;
                    }
                    x.a(fVar, objC);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionH = x0Var.h();
                gVar.a(lVar, cancellationExceptionH);
                gVar.g(d5.e.a(cancellationExceptionH));
            }
            while (l0VarA.B()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
