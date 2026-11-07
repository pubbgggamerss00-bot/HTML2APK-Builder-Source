package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public int f7949a;

    /* renamed from: b, reason: collision with root package name */
    public long f7950b;

    /* renamed from: c, reason: collision with root package name */
    public int f7951c;

    /* renamed from: d, reason: collision with root package name */
    public int f7952d;

    /* renamed from: e, reason: collision with root package name */
    public int f7953e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f7954f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final ex0 f7955g = new ex0(255);

    public final boolean a(y0 y0Var, boolean z6) throws rn, EOFException {
        boolean zG;
        boolean zG2;
        this.f7949a = 0;
        this.f7950b = 0L;
        this.f7951c = 0;
        this.f7952d = 0;
        this.f7953e = 0;
        ex0 ex0Var = this.f7955g;
        ex0Var.g(27);
        try {
            zG = y0Var.g(ex0Var.f4416a, 0, 27, z6);
        } catch (EOFException e6) {
            if (!z6) {
                throw e6;
            }
            zG = false;
        }
        if (zG && ex0Var.D() == 1332176723) {
            if (ex0Var.v() == 0) {
                this.f7949a = ex0Var.v();
                this.f7950b = ex0Var.A();
                ex0Var.B();
                ex0Var.B();
                ex0Var.B();
                int iV = ex0Var.v();
                this.f7951c = iV;
                this.f7952d = iV + 27;
                ex0Var.g(iV);
                try {
                    zG2 = y0Var.g(ex0Var.f4416a, 0, this.f7951c, z6);
                } catch (EOFException e7) {
                    if (!z6) {
                        throw e7;
                    }
                    zG2 = false;
                }
                if (zG2) {
                    for (int i6 = 0; i6 < this.f7951c; i6++) {
                        int iV2 = ex0Var.v();
                        this.f7954f[i6] = iV2;
                        this.f7953e += iV2;
                    }
                    return true;
                }
            } else if (!z6) {
                throw rn.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r11 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r10.zzf() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10.zzc() != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(y0 y0Var, long j6) {
        boolean zG;
        y5.n(y0Var.zzf() == y0Var.zze());
        ex0 ex0Var = this.f7955g;
        ex0Var.g(4);
        while (true) {
            if (j6 != -1 && y0Var.zzf() + 4 >= j6) {
                break;
            }
            try {
                zG = y0Var.g(ex0Var.f4416a, 0, 4, true);
            } catch (EOFException unused) {
                zG = false;
            }
            if (!zG) {
                break;
            }
            ex0Var.j(0);
            if (ex0Var.D() == 1332176723) {
                y0Var.zzj();
                return true;
            }
            y0Var.b(1);
        }
    }
}
