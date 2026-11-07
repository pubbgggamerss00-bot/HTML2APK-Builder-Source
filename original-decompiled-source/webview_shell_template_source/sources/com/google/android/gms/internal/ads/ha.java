package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final List f5307a;

    /* renamed from: b, reason: collision with root package name */
    public final s1[] f5308b;

    public ha(List list) {
        this.f5307a = list;
        this.f5308b = new s1[list.size()];
    }

    public final void a(long j6, ex0 ex0Var) {
        if (ex0Var.o() < 9) {
            return;
        }
        int iQ = ex0Var.q();
        int iQ2 = ex0Var.q();
        int iV = ex0Var.v();
        if (iQ == 434 && iQ2 == 1195456820 && iV == 3) {
            f0.k(j6, ex0Var, this.f5308b);
        }
    }

    public final void b(z0 z0Var, ea eaVar) {
        int i6 = 0;
        while (true) {
            s1[] s1VarArr = this.f5308b;
            if (i6 >= s1VarArr.length) {
                return;
            }
            eaVar.a();
            eaVar.b();
            s1 s1VarG = z0Var.g(eaVar.f4181d, 3);
            w wVar = (w) this.f5307a.get(i6);
            String str = wVar.f9978m;
            boolean z6 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z6 = false;
            }
            y5.p("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z6);
            tk2 tk2Var = new tk2();
            eaVar.b();
            tk2Var.f9320a = eaVar.f4182e;
            tk2Var.c(str);
            tk2Var.f9324e = wVar.f9971e;
            tk2Var.f9323d = wVar.f9970d;
            tk2Var.F = wVar.G;
            tk2Var.f9333o = wVar.f9981p;
            s1VarG.b(new w(tk2Var));
            s1VarArr[i6] = s1VarG;
            i6++;
        }
    }
}
