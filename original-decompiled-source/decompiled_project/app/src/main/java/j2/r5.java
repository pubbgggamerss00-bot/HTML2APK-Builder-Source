package j2;

import android.os.Looper;
import android.view.View;
import j1.i;
import java.util.LinkedHashMap;
import x0.d1;

/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements s5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, j2.l3] */
    @Override // j2.s5
    public final x0.k2 a(View view) {
        tg.h hVar;
        x0.y1 y1Var;
        LinkedHashMap linkedHashMap = a6.f14646a;
        tg.i iVar = tg.i.f28768a;
        pg.s sVar = h1.f14729n;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hVar = (tg.h) h1.f14729n.getValue();
        } else {
            hVar = h1.f14730p.get();
            if (hVar == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        tg.h hVarPlus = hVar.plus(iVar);
        x0.d1 d1Var = (x0.d1) hVarPlus.get(d1.a.f31629a);
        if (d1Var != null) {
            x0.y1 y1Var2 = new x0.y1(d1Var);
            x0.z0 z0Var = y1Var2.f31971b;
            synchronized (z0Var.f31980a) {
                z0Var.f31983d = false;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            y1Var = y1Var2;
        } else {
            y1Var = 0;
        }
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        j1.i iVar2 = (j1.i) hVarPlus.get(i.a.f14624a);
        j1.i iVar3 = iVar2;
        if (iVar2 == null) {
            ?? l3Var = new l3();
            g0Var.f16327a = l3Var;
            iVar3 = l3Var;
        }
        if (y1Var != 0) {
            iVar = y1Var;
        }
        tg.h hVarPlus2 = hVarPlus.plus(iVar).plus(iVar3);
        x0.k2 k2Var = new x0.k2(hVarPlus2);
        synchronized (k2Var.f31765b) {
            k2Var.f31782s = true;
            pg.f0 f0Var2 = pg.f0.f21461a;
        }
        uh.c cVarA = ph.j0.a(hVarPlus2);
        androidx.lifecycle.t tVarC = androidx.lifecycle.c1.c(view);
        androidx.lifecycle.l lifecycle = tVarC != null ? tVarC.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new w5(view, k2Var));
            lifecycle.a(new x5(cVarA, y1Var, k2Var, g0Var, view));
            return k2Var;
        }
        f2.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new pg.g();
    }
}
