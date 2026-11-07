package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s9 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f8847c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8848d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8849e;

    /* renamed from: a, reason: collision with root package name */
    public final m11 f8845a = new m11();

    /* renamed from: f, reason: collision with root package name */
    public long f8850f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f8851g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final ex0 f8846b = new ex0();

    public static long a(ex0 ex0Var) {
        int i6 = ex0Var.f4417b;
        if (ex0Var.o() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ex0Var.f(0, 9, bArr);
        ex0Var.j(i6);
        byte b7 = bArr[0];
        if ((b7 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b8 = bArr[2];
        if ((b8 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b9 = bArr[4];
        if ((b9 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j6 = b7;
        long j7 = b8;
        long j8 = (248 & j7) >> 3;
        long j9 = (j7 & 3) << 13;
        return j9 | ((bArr[1] & 255) << 20) | ((j6 & 3) << 28) | (((j6 & 56) >> 3) << 30) | (j8 << 15) | ((bArr[3] & 255) << 5) | ((b9 & 248) >> 3);
    }

    public static final int b(int i6, byte[] bArr) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }
}
