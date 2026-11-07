package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public final p6 f7616a = new p6();

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f7617b = new ex0(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    public int f7618c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7620e;

    public final boolean a(y0 y0Var) {
        int i6;
        boolean z6 = this.f7620e;
        ex0 ex0Var = this.f7617b;
        if (z6) {
            this.f7620e = false;
            ex0Var.g(0);
        }
        while (true) {
            if (this.f7620e) {
                return true;
            }
            int i7 = this.f7618c;
            p6 p6Var = this.f7616a;
            if (i7 < 0) {
                if (!p6Var.b(y0Var, -1L) || !p6Var.a(y0Var, true)) {
                    break;
                }
                int iB = p6Var.f7952d;
                if ((p6Var.f7949a & 1) == 1 && ex0Var.f4418c == 0) {
                    iB += b(0);
                    i6 = this.f7619d;
                } else {
                    i6 = 0;
                }
                try {
                    y0Var.b(iB);
                    this.f7618c = i6;
                    i7 = i6;
                } catch (EOFException unused) {
                }
            }
            int iB2 = b(i7);
            int i8 = this.f7618c + this.f7619d;
            if (iB2 > 0) {
                ex0Var.e(ex0Var.f4418c + iB2);
                try {
                    y0Var.i(ex0Var.f4418c, iB2, ex0Var.f4416a);
                    ex0Var.i(ex0Var.f4418c + iB2);
                    this.f7620e = p6Var.f7954f[i8 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i8 == p6Var.f7951c) {
                i8 = -1;
            }
            this.f7618c = i8;
        }
        return false;
    }

    public final int b(int i6) {
        int i7;
        int i8 = 0;
        this.f7619d = 0;
        do {
            int i9 = this.f7619d;
            int i10 = i6 + i9;
            p6 p6Var = this.f7616a;
            if (i10 >= p6Var.f7951c) {
                break;
            }
            this.f7619d = i9 + 1;
            i7 = p6Var.f7954f[i10];
            i8 += i7;
        } while (i7 == 255);
        return i8;
    }
}
