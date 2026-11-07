package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4849c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4853g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4854i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4855j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4856k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4857l;

    public g0(ArrayList arrayList, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f6, String str) {
        this.f4847a = arrayList;
        this.f4848b = i6;
        this.f4849c = i7;
        this.f4850d = i8;
        this.f4851e = i9;
        this.f4852f = i10;
        this.f4853g = i11;
        this.h = i12;
        this.f4854i = i13;
        this.f4855j = i14;
        this.f4856k = f6;
        this.f4857l = str;
    }

    public static g0 a(ex0 ex0Var) throws rn {
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f6;
        int i12;
        int i13;
        try {
            ex0Var.k(4);
            int iV = ex0Var.v() & 3;
            int i14 = iV + 1;
            if (i14 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iV2 = ex0Var.v() & 31;
            for (int i15 = 0; i15 < iV2; i15++) {
                int iZ = ex0Var.z();
                int i16 = ex0Var.f4417b;
                ex0Var.k(iZ);
                byte[] bArr = ex0Var.f4416a;
                byte[] bArr2 = sl0.f8977a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(sl0.f8977a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i16, bArr3, 4, iZ);
                arrayList.add(bArr3);
            }
            int iV3 = ex0Var.v();
            for (int i17 = 0; i17 < iV3; i17++) {
                int iZ2 = ex0Var.z();
                int i18 = ex0Var.f4417b;
                ex0Var.k(iZ2);
                byte[] bArr4 = ex0Var.f4416a;
                byte[] bArr5 = sl0.f8977a;
                byte[] bArr6 = new byte[iZ2 + 4];
                System.arraycopy(sl0.f8977a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i18, bArr6, 4, iZ2);
                arrayList.add(bArr6);
            }
            if (iV2 > 0) {
                int i19 = iV + 2;
                bf1 bf1VarE = uf1.e(i19, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i20 = bf1VarE.f3159e;
                int i21 = bf1VarE.f3160f;
                int i22 = bf1VarE.h + 8;
                int i23 = bf1VarE.f3162i + 8;
                int i24 = bf1VarE.f3163j;
                int i25 = bf1VarE.f3164k;
                int i26 = bf1VarE.f3165l;
                int i27 = bf1VarE.f3166m;
                float f7 = bf1VarE.f3161g;
                int i28 = bf1VarE.f3155a;
                int i29 = bf1VarE.f3156b;
                int i30 = bf1VarE.f3157c;
                byte[] bArr7 = sl0.f8977a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30));
                i9 = i25;
                i10 = i26;
                i11 = i27;
                f6 = f7;
                i7 = i21;
                i8 = i22;
                i12 = i23;
                i13 = i24;
                i6 = i20;
            } else {
                str = null;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = 16;
                f6 = 1.0f;
                i12 = -1;
                i13 = -1;
            }
            return new g0(arrayList, i14, i6, i7, i8, i12, i13, i9, i10, i11, f6, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw rn.a(e6, "Error parsing AVC config");
        }
    }
}
