package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10442a;

    /* renamed from: b, reason: collision with root package name */
    public final s1[] f10443b;

    /* renamed from: c, reason: collision with root package name */
    public final ba f10444c = new ba(new dh0(4, this));

    public x9(List list) {
        this.f10442a = list;
        this.f10443b = new s1[list.size()];
    }

    public final void a(z0 z0Var, ea eaVar) {
        int i6 = 0;
        while (true) {
            s1[] s1VarArr = this.f10443b;
            if (i6 >= s1VarArr.length) {
                return;
            }
            eaVar.a();
            eaVar.b();
            s1 s1VarG = z0Var.g(eaVar.f4181d, 3);
            w wVar = (w) this.f10442a.get(i6);
            String str = wVar.f9978m;
            boolean z6 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z6 = false;
            }
            y5.p("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z6);
            String str2 = wVar.f9967a;
            if (str2 == null) {
                eaVar.b();
                str2 = eaVar.f4182e;
            }
            tk2 tk2Var = new tk2();
            tk2Var.f9320a = str2;
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
