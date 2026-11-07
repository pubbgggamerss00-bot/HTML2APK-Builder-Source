package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3713e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3714f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3715g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3716i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3717j;

    /* renamed from: k, reason: collision with root package name */
    public final ni0 f3718k;

    /* renamed from: l, reason: collision with root package name */
    public final qh f3719l;

    public d1(int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j6, ni0 ni0Var, qh qhVar) {
        this.f3709a = i6;
        this.f3710b = i7;
        this.f3711c = i8;
        this.f3712d = i9;
        this.f3713e = i10;
        this.f3714f = d(i10);
        this.f3715g = i11;
        this.h = i12;
        this.f3716i = c(i12);
        this.f3717j = j6;
        this.f3718k = ni0Var;
        this.f3719l = qhVar;
    }

    public static int c(int i6) {
        if (i6 == 8) {
            return 1;
        }
        if (i6 == 12) {
            return 2;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 != 20) {
            return i6 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i6) {
        switch (i6) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j6 = this.f3717j;
        if (j6 == 0) {
            return -9223372036854775807L;
        }
        return (j6 * 1000000) / this.f3713e;
    }

    public final w b(byte[] bArr, qh qhVar) {
        bArr[4] = Byte.MIN_VALUE;
        qh qhVar2 = this.f3719l;
        if (qhVar2 != null) {
            qhVar = qhVar2.m(qhVar);
        }
        tk2 tk2Var = new tk2();
        tk2Var.c("audio/flac");
        int i6 = this.f3712d;
        if (i6 <= 0) {
            i6 = -1;
        }
        tk2Var.f9331m = i6;
        tk2Var.A = this.f3715g;
        tk2Var.B = this.f3713e;
        tk2Var.C = j31.q(this.h);
        tk2Var.f9333o = Collections.singletonList(bArr);
        tk2Var.f9328j = qhVar;
        return new w(tk2Var);
    }

    public d1(int i6, byte[] bArr) {
        l42 l42Var = new l42(bArr.length, bArr);
        l42Var.B(i6 * 8);
        this.f3709a = l42Var.w(16);
        this.f3710b = l42Var.w(16);
        this.f3711c = l42Var.w(24);
        this.f3712d = l42Var.w(24);
        int iW = l42Var.w(20);
        this.f3713e = iW;
        this.f3714f = d(iW);
        this.f3715g = l42Var.w(3) + 1;
        int iW2 = l42Var.w(5) + 1;
        this.h = iW2;
        this.f3716i = c(iW2);
        this.f3717j = l42Var.x(36);
        this.f3718k = null;
        this.f3719l = null;
    }
}
