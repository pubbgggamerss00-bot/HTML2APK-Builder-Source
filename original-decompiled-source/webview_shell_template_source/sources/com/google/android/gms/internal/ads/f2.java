package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f4442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4446e;

    /* renamed from: f, reason: collision with root package name */
    public int f4447f;

    /* renamed from: g, reason: collision with root package name */
    public int f4448g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4449i;

    /* renamed from: j, reason: collision with root package name */
    public int f4450j;

    /* renamed from: k, reason: collision with root package name */
    public long f4451k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f4452l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4453m;

    public f2(int i6, int i7, long j6, int i8, s1 s1Var) {
        i7 = i7 != 1 ? 2 : i7;
        this.f4445d = j6;
        this.f4446e = i8;
        this.f4442a = s1Var;
        int i9 = (((i6 % 10) + 48) << 8) | ((i6 / 10) + 48);
        this.f4443b = (i7 == 2 ? 1667497984 : 1651965952) | i9;
        this.f4444c = i7 == 2 ? i9 | 1650720768 : -1;
        this.f4451k = -1L;
        this.f4452l = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.f4453m = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public final k1 a(long j6) {
        if (this.f4450j == 0) {
            n1 n1Var = new n1(0L, this.f4451k);
            return new k1(n1Var, n1Var);
        }
        int i6 = (int) (j6 / ((this.f4445d * 1) / this.f4446e));
        int i7 = j31.i(this.f4453m, i6, true, true);
        if (this.f4453m[i7] == i6) {
            n1 n1VarB = b(i7);
            return new k1(n1VarB, n1VarB);
        }
        n1 n1VarB2 = b(i7);
        int i8 = i7 + 1;
        return i8 < this.f4452l.length ? new k1(n1VarB2, b(i8)) : new k1(n1VarB2, n1VarB2);
    }

    public final n1 b(int i6) {
        return new n1(((this.f4445d * 1) / this.f4446e) * this.f4453m[i6], this.f4452l[i6]);
    }
}
