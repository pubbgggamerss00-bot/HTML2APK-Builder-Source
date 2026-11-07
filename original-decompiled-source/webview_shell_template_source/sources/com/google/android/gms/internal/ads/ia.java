package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ia implements ja {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5620m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5621n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final z0 f5622a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f5623b;

    /* renamed from: c, reason: collision with root package name */
    public final ma f5624c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5625d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5626e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0 f5627f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5628g;
    public final w h;

    /* renamed from: i, reason: collision with root package name */
    public int f5629i;

    /* renamed from: j, reason: collision with root package name */
    public long f5630j;

    /* renamed from: k, reason: collision with root package name */
    public int f5631k;

    /* renamed from: l, reason: collision with root package name */
    public long f5632l;

    public ia(z0 z0Var, s1 s1Var, ma maVar) throws rn {
        this.f5622a = z0Var;
        this.f5623b = s1Var;
        this.f5624c = maVar;
        int i6 = maVar.f7012b;
        int iMax = Math.max(1, i6 / 10);
        this.f5628g = iMax;
        ex0 ex0Var = new ex0(maVar.f7015e);
        ex0Var.t();
        int iT = ex0Var.t();
        this.f5625d = iT;
        int i7 = maVar.f7011a;
        int i8 = maVar.f7013c;
        int i9 = (((i8 - (i7 * 4)) * 8) / (maVar.f7014d * i7)) + 1;
        if (iT != i9) {
            throw rn.a(null, "Expected frames per block: " + i9 + "; got: " + iT);
        }
        int i10 = j31.f5914a;
        int i11 = ((iMax + iT) - 1) / iT;
        this.f5626e = new byte[i11 * i8];
        this.f5627f = new ex0((iT + iT) * i7 * i11);
        int i12 = ((i8 * i6) * 8) / iT;
        tk2 tk2Var = new tk2();
        tk2Var.c("audio/raw");
        tk2Var.f9326g = i12;
        tk2Var.h = i12;
        tk2Var.f9331m = (iMax + iMax) * i7;
        tk2Var.A = i7;
        tk2Var.B = i6;
        tk2Var.C = 2;
        this.h = new w(tk2Var);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void a(long j6) {
        this.f5629i = 0;
        this.f5630j = j6;
        this.f5631k = 0;
        this.f5632l = 0L;
    }

    public final void b(int i6) {
        ma maVar = this.f5624c;
        long jU = this.f5630j + j31.u(this.f5632l, 1000000L, maVar.f7012b, RoundingMode.DOWN);
        int i7 = (i6 + i6) * maVar.f7011a;
        this.f5623b.a(jU, 1, i7, this.f5631k - i7, null);
        this.f5632l += i6;
        this.f5631k -= i7;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void c(int i6, long j6) {
        this.f5622a.f(new pa(this.f5624c, this.f5625d, i6, j6));
        this.f5623b.b(this.h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0024->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(com.google.android.gms.internal.ads.y0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ia.d(com.google.android.gms.internal.ads.y0, long):boolean");
    }
}
