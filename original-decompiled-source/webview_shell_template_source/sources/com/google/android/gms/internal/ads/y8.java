package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y8 implements z8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10884a;

    /* renamed from: b, reason: collision with root package name */
    public final s1[] f10885b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10886c;

    /* renamed from: d, reason: collision with root package name */
    public int f10887d;

    /* renamed from: e, reason: collision with root package name */
    public int f10888e;

    /* renamed from: f, reason: collision with root package name */
    public long f10889f = -9223372036854775807L;

    public y8(List list) {
        this.f10884a = list;
        this.f10885b = new s1[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void a(boolean z6) {
        if (!this.f10886c) {
            return;
        }
        y5.r(this.f10889f != -9223372036854775807L);
        int i6 = 0;
        while (true) {
            s1[] s1VarArr = this.f10885b;
            if (i6 >= s1VarArr.length) {
                this.f10886c = false;
                return;
            } else {
                s1VarArr[i6].a(this.f10889f, 1, this.f10888e, 0, null);
                i6++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void c(ex0 ex0Var) {
        boolean z6;
        boolean z7;
        if (!this.f10886c) {
            return;
        }
        int i6 = 0;
        if (this.f10887d == 2) {
            if (ex0Var.o() == 0) {
                z7 = false;
            } else {
                if (ex0Var.v() != 32) {
                    this.f10886c = false;
                }
                this.f10887d--;
                z7 = this.f10886c;
            }
            if (!z7) {
                return;
            }
        }
        if (this.f10887d == 1) {
            if (ex0Var.o() == 0) {
                z6 = false;
            } else {
                if (ex0Var.v() != 0) {
                    this.f10886c = false;
                }
                this.f10887d--;
                z6 = this.f10886c;
            }
            if (!z6) {
                return;
            }
        }
        int i7 = ex0Var.f4417b;
        int iO = ex0Var.o();
        while (true) {
            s1[] s1VarArr = this.f10885b;
            if (i6 >= s1VarArr.length) {
                this.f10888e += iO;
                return;
            }
            s1 s1Var = s1VarArr[i6];
            ex0Var.j(i7);
            s1Var.e(iO, ex0Var);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void d(z0 z0Var, ea eaVar) {
        int i6 = 0;
        while (true) {
            s1[] s1VarArr = this.f10885b;
            if (i6 >= s1VarArr.length) {
                return;
            }
            da daVar = (da) this.f10884a.get(i6);
            eaVar.a();
            eaVar.b();
            s1 s1VarG = z0Var.g(eaVar.f4181d, 3);
            tk2 tk2Var = new tk2();
            eaVar.b();
            tk2Var.f9320a = eaVar.f4182e;
            tk2Var.c("application/dvbsubs");
            tk2Var.f9333o = Collections.singletonList(daVar.f3805b);
            tk2Var.f9323d = daVar.f3804a;
            s1VarG.b(new w(tk2Var));
            s1VarArr[i6] = s1VarG;
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void e(int i6, long j6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f10886c = true;
        this.f10889f = j6;
        this.f10888e = 0;
        this.f10887d = 2;
    }

    @Override // com.google.android.gms.internal.ads.z8
    public final void zze() {
        this.f10886c = false;
        this.f10889f = -9223372036854775807L;
    }
}
