package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r6 extends s6 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f8552o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f8553p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f8554n;

    public static boolean e(ex0 ex0Var, byte[] bArr) {
        if (ex0Var.o() < 8) {
            return false;
        }
        int i6 = ex0Var.f4417b;
        byte[] bArr2 = new byte[8];
        ex0Var.f(0, 8, bArr2);
        ex0Var.j(i6);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final long a(ex0 ex0Var) {
        byte[] bArr = ex0Var.f4416a;
        return (this.f8811i * me0.r(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f8554n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final boolean c(ex0 ex0Var, long j6, com.google.android.gms.ads.mediation.customevent.a aVar) {
        if (e(ex0Var, f8552o)) {
            byte[] bArrCopyOf = Arrays.copyOf(ex0Var.f4416a, ex0Var.f4418c);
            int i6 = bArrCopyOf[9] & 255;
            ArrayList arrayListQ = me0.q(bArrCopyOf);
            if (((w) aVar.f2372t) == null) {
                tk2 tk2Var = new tk2();
                tk2Var.c("audio/opus");
                tk2Var.A = i6;
                tk2Var.B = 48000;
                tk2Var.f9333o = arrayListQ;
                aVar.f2372t = new w(tk2Var);
                return true;
            }
        } else {
            if (!e(ex0Var, f8553p)) {
                y5.k((w) aVar.f2372t);
                return false;
            }
            y5.k((w) aVar.f2372t);
            if (!this.f8554n) {
                this.f8554n = true;
                ex0Var.k(8);
                qh qhVarA = x1.a(bo1.m((String[]) x1.b(ex0Var, false, false).f10619t));
                if (qhVarA != null) {
                    w wVar = (w) aVar.f2372t;
                    wVar.getClass();
                    tk2 tk2Var2 = new tk2(wVar);
                    tk2Var2.f9328j = qhVarA.m(((w) aVar.f2372t).f9976k);
                    aVar.f2372t = new w(tk2Var2);
                }
            }
        }
        return true;
    }
}
