package s8;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import f9.fg;
import f9.lb;
import j5.a;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class s0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24731a;

    public s0(p5.s0 s0Var) {
        this.f24731a = s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    @Override // eh.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        long j10;
        r.n page = nVar;
        p5.s backStackEntry = sVar;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(page, "$this$page");
        kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
        jVar2.L(140930835);
        boolean zK = jVar2.K(backStackEntry);
        Object objG = jVar2.g();
        eh.a aVar = null;
        j.a.C0321a c0321a = j.a.f31715a;
        p5.s0 s0Var = this.f24731a;
        if (zK || objG == c0321a) {
            p5.s sVarA = s0Var.a();
            if (sVarA == null) {
                objG = backStackEntry;
                jVar2.C(objG);
            } else {
                if (!kotlin.jvm.internal.r.a(sVarA.f21269b.f21235b.f24512e, e2.v.f24652c.f24627a)) {
                    sVarA = null;
                }
                if (sVarA != null) {
                    objG = sVarA;
                }
                jVar2.C(objG);
            }
        }
        p5.s sVar2 = (p5.s) objG;
        jVar2.B();
        jVar2.e(1890788296);
        ig.b bVarA = f5.a.a(sVar2, jVar2);
        jVar2.e(1729797275);
        androidx.lifecycle.w0 w0VarB = k5.c.b(fg.class, sVar2, bVarA, sVar2 != null ? sVar2.getDefaultViewModelCreationExtras() : a.C0143a.f15159b, jVar2);
        jVar2.G();
        jVar2.G();
        fg fgVar = (fg) w0VarB;
        boolean z10 = sVar2 == backStackEntry;
        Bundle bundleA = backStackEntry.f21275h.a();
        long j11 = bundleA != null ? bundleA.getLong("projectId") : 0L;
        jVar2.L(140947119);
        if (z10) {
            Long lValueOf = Long.valueOf(j11);
            jVar2.L(140949205);
            boolean zJ = jVar2.j(j11) | jVar2.l(fgVar);
            j10 = 0;
            Object objG2 = jVar2.g();
            if (zJ || objG2 == c0321a) {
                objG2 = new r0(j11, fgVar, null);
                jVar2.C(objG2);
            }
            jVar2.B();
            x0.o0.d((eh.p) objG2, lValueOf, jVar2);
        } else {
            j10 = 0;
        }
        jVar2.B();
        jVar2.e(1890788296);
        ig.b bVarA2 = f5.a.a(backStackEntry, jVar2);
        jVar2.e(1729797275);
        androidx.lifecycle.w0 w0VarB2 = k5.c.b(f9.g.class, backStackEntry, bVarA2, backStackEntry.getDefaultViewModelCreationExtras(), jVar2);
        jVar2.G();
        jVar2.G();
        final f9.g gVar = (f9.g) w0VarB2;
        x0.n1 n1VarB = bg.b.b(gVar.f9647f, jVar2);
        final Context context = (Context) jVar2.f(AndroidCompositionLocals_androidKt.f1281b);
        jVar2.L(140972354);
        if (z10 && j11 != j10) {
            jVar2.L(140974333);
            boolean zL = jVar2.l(gVar) | jVar2.j(j11) | jVar2.l(s0Var) | jVar2.l(context);
            Object objG3 = jVar2.g();
            if (zL || objG3 == c0321a) {
                final p5.s0 s0Var2 = this.f24731a;
                final long j12 = j11;
                objG3 = new eh.a() { // from class: s8.m0
                    @Override // eh.a
                    public final Object invoke() {
                        lb lbVar = new lb(s0Var2, 1);
                        p0 p0Var = new p0(context);
                        f9.g gVar2 = gVar;
                        if (!gVar2.f9648g) {
                            gVar2.f9648g = true;
                            ph.h.c(androidx.lifecycle.x0.a(gVar2), null, null, new f9.f(gVar2, j12, lbVar, p0Var, null), 3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            aVar = (eh.a) objG3;
            jVar2.B();
        }
        eh.a aVar2 = aVar;
        jVar2.B();
        jVar2.L(140966144);
        boolean zL2 = jVar2.l(s0Var);
        Object objG4 = jVar2.g();
        if (zL2 || objG4 == c0321a) {
            objG4 = new n0(s0Var, 0);
            jVar2.C(objG4);
        }
        eh.a aVar3 = (eh.a) objG4;
        jVar2.B();
        jVar2.L(140968524);
        boolean zL3 = jVar2.l(s0Var);
        Object objG5 = jVar2.g();
        if (zL3 || objG5 == c0321a) {
            objG5 = new o0(s0Var, 0);
            jVar2.C(objG5);
        }
        jVar2.B();
        f9.d1.i(fgVar, aVar3, (eh.a) objG5, aVar2, z10, jVar2, 0);
        if (((Boolean) n1VarB.getValue()).booleanValue()) {
            jVar2.L(141011336);
            boolean zL4 = jVar2.l(gVar) | jVar2.l(s0Var);
            Object objG6 = jVar2.g();
            if (zL4 || objG6 == c0321a) {
                objG6 = new b9.m(1, gVar, s0Var);
                jVar2.C(objG6);
            }
            eh.a aVar4 = (eh.a) objG6;
            jVar2.B();
            jVar2.L(141018047);
            boolean zL5 = jVar2.l(gVar);
            Object objG7 = jVar2.g();
            if (zL5 || objG7 == c0321a) {
                objG7 = new b9.n(gVar, 1);
                jVar2.C(objG7);
            }
            jVar2.B();
            q8.o1.a(ProjectKind.APK, aVar4, (eh.a) objG7, jVar2, 6);
        }
        return pg.f0.f21461a;
    }
}
