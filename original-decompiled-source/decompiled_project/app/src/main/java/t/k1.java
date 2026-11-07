package t;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j2.j2;
import x0.j;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d0 f25287a = new x0.d0(a.f25288a);

    public static final class a extends kotlin.jvm.internal.s implements eh.l<x0.x, j1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25288a = new a(1);

        @Override // eh.l
        public final j1 invoke(x0.x xVar) {
            x0.x xVar2 = xVar;
            int i10 = i.f25252a;
            Context context = (Context) xVar2.a(AndroidCompositionLocals_androidKt.f1281b);
            f3.d dVar = (f3.d) xVar2.a(j2.f14779h);
            g1 g1Var = (g1) xVar2.a(h1.f25250a);
            if (g1Var == null) {
                return null;
            }
            return new h(context, dVar, g1Var.f25241a, g1Var.f25242b);
        }
    }

    public static final i1 a(x0.j jVar) {
        jVar.L(282942128);
        j1 j1Var = (j1) jVar.f(f25287a);
        if (j1Var == null) {
            jVar.B();
            return null;
        }
        boolean zK = jVar.K(j1Var);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = j1Var.a();
            jVar.C(objG);
        }
        i1 i1Var = (i1) objG;
        jVar.B();
        return i1Var;
    }
}
