package d0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7190a = 2500;

    /* renamed from: b, reason: collision with root package name */
    public static final float f7191b = 1500;

    /* renamed from: c, reason: collision with root package name */
    public static final float f7192c = 50;

    public static final boolean a(boolean z10, h1 h1Var, int i10, int i11) {
        if (z10) {
            if (h1Var.f() > i10) {
                return true;
            }
            return h1Var.f() == i10 && h1Var.c() > i11;
        }
        if (h1Var.f() < i10) {
            return true;
        }
        return h1Var.f() == i10 && h1Var.c() < i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[Catch: i -> 0x01b2, TryCatch #5 {i -> 0x01b2, blocks: (B:34:0x00c6, B:36:0x00ca, B:38:0x00d0, B:51:0x00fa, B:55:0x0129), top: B:105:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021c  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, s.n] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, s.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0182 -> B:18:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h1 h1Var, int i10, int i11, int i12, f3.d dVar, vg.c cVar) {
        i1 i1Var;
        h1 h1Var2;
        int i13;
        int i14;
        float fN0;
        float fN02;
        float fN03;
        kotlin.jvm.internal.b0 b0Var;
        kotlin.jvm.internal.g0 g0Var;
        int i15;
        int i16;
        float f10;
        kotlin.jvm.internal.e0 e0Var;
        float f11;
        i1 i1Var2;
        float f12;
        int i17;
        int i18;
        h1 h1Var3;
        i1 i1Var3;
        s.n nVarC;
        Float f13;
        boolean z10;
        k1 k1Var;
        h1 h1Var4;
        int i19;
        int i20;
        i1 i1Var4;
        float fMax;
        h1 h1Var5;
        int i21;
        int i22;
        float f14;
        int i23;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i24 = i1Var.f7152n;
            if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                i1Var.f7152n = i24 - PKIFailureInfo.systemUnavail;
            } else {
                i1Var = new i1(cVar);
            }
        }
        Object obj = i1Var.f7151m;
        ug.a aVar = ug.a.f29706a;
        int i25 = i1Var.f7152n;
        float f15 = CropImageView.DEFAULT_ASPECT_RATIO;
        boolean z11 = true;
        if (i25 == 0) {
            pg.q.b(obj);
            if (i10 < CropImageView.DEFAULT_ASPECT_RATIO) {
                y.c.a("Index should be non-negative");
            }
            try {
                fN0 = dVar.N0(f7190a);
                fN02 = dVar.N0(f7191b);
                fN03 = dVar.N0(f7192c);
                b0Var = new kotlin.jvm.internal.b0();
                b0Var.f16318a = true;
                g0Var = new kotlin.jvm.internal.g0();
                g0Var.f16327a = o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
            } catch (i e10) {
                e = e10;
                h1Var2 = h1Var;
                i13 = i11;
                i14 = i10;
            }
            if (c(h1Var, i10)) {
                throw new i(h1Var.d(i10), (s.n) g0Var.f16327a);
            }
            int i26 = i10 > h1Var.f() ? 1 : 0;
            kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
            e0Var2.f16324a = 1;
            i15 = i11;
            i16 = i12;
            f10 = fN02;
            e0Var = e0Var2;
            f11 = fN0;
            i1Var2 = i1Var;
            f12 = fN03;
            i17 = i10;
            i18 = i26;
            h1Var3 = h1Var;
            if (b0Var.f16318a) {
            }
            return pg.f0.f21461a;
        }
        if (i25 != 1) {
            if (i25 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i20 = i1Var.f7145f;
            i19 = i1Var.f7144e;
            h1Var4 = i1Var.f7140a;
            pg.q.b(obj);
            h1Var4.b(i19, i20);
            return pg.f0.f21461a;
        }
        i18 = i1Var.f7147h;
        float f16 = i1Var.f7150l;
        float f17 = i1Var.f7149k;
        f11 = i1Var.f7148j;
        int i27 = i1Var.f7146g;
        int i28 = i1Var.f7145f;
        int i29 = i1Var.f7144e;
        kotlin.jvm.internal.e0 e0Var3 = i1Var.f7143d;
        kotlin.jvm.internal.g0 g0Var2 = i1Var.f7142c;
        kotlin.jvm.internal.b0 b0Var2 = i1Var.f7141b;
        h1 h1Var6 = i1Var.f7140a;
        try {
            pg.q.b(obj);
            f14 = f17;
            h1Var2 = h1Var6;
            i15 = i28;
            i1Var2 = i1Var;
            f12 = f16;
            i23 = 1;
            i22 = i27;
            try {
                b0Var = b0Var2;
                g0Var = g0Var2;
                try {
                    e0Var3.f16324a += i23;
                } catch (i e11) {
                    e = e11;
                    i1Var3 = i1Var2;
                    i14 = i29;
                    i13 = i15;
                }
            } catch (i e12) {
                e = e12;
                i14 = i17;
                i1Var4 = i1Var2;
                i13 = i15;
                h1Var2 = h1Var3;
            }
            h1Var3 = h1Var2;
            i17 = i29;
            e0Var = e0Var3;
            f10 = f14;
            f15 = CropImageView.DEFAULT_ASPECT_RATIO;
            i16 = i22;
            z11 = true;
        } catch (i e13) {
            e = e13;
            h1Var2 = h1Var6;
            i13 = i28;
            i14 = i29;
        }
        if (b0Var.f16318a && h1Var3.getItemCount() > 0) {
            try {
                try {
                    try {
                        int iD = h1Var3.d(i17) + i15;
                        if (Math.abs(iD) >= f11) {
                            fMax = i18 != 0 ? f11 : -f11;
                        } else {
                            try {
                                fMax = Math.max(Math.abs(iD), f12);
                                if (i18 == 0) {
                                    fMax = -fMax;
                                }
                            } catch (i e14) {
                                e = e14;
                                i14 = i17;
                                i1Var3 = i1Var2;
                                i13 = i15;
                                h1Var2 = h1Var3;
                            }
                        }
                        g0Var.f16327a = o1.j.c((s.n) g0Var.f16327a, f15, f15, 30);
                        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0();
                        s.n nVar = (s.n) g0Var.f16327a;
                        Float f18 = new Float(fMax);
                        boolean z12 = (((Number) ((s.n) g0Var.f16327a).c()).floatValue() != f15 ? z11 : false) ^ z11;
                        j1 j1Var = new j1(h1Var5, i21, fMax, d0Var, b0Var, i18 == 0 ? z11 : false, f10, e0Var, i16, i15, g0Var);
                        i1Var2.f7140a = h1Var2;
                        i1Var2.f7141b = b0Var2;
                        i1Var2.f7142c = g0Var2;
                        i1Var2.f7143d = e0Var3;
                        i1Var2.f7144e = i14;
                        i1Var2.f7145f = i13;
                        i1Var2.f7146g = i22;
                        i1Var2.f7148j = f11;
                        i1Var2.f7149k = f;
                        i1Var2.f7150l = f12;
                        i1Var2.f7147h = i18;
                        f14 = f;
                        i23 = 1;
                        i1Var2.f7152n = 1;
                        if (s.w1.f(nVar, f18, null, z12, j1Var, i1Var4, 2) != aVar) {
                            i29 = i14;
                            i15 = i13;
                            i1Var2 = i1Var4;
                            b0Var = b0Var2;
                            g0Var = g0Var2;
                            e0Var3.f16324a += i23;
                            h1Var3 = h1Var2;
                            i17 = i29;
                            e0Var = e0Var3;
                            f10 = f14;
                            f15 = CropImageView.DEFAULT_ASPECT_RATIO;
                            i16 = i22;
                            z11 = true;
                            if (b0Var.f16318a) {
                                int iD2 = h1Var3.d(i17) + i15;
                                if (Math.abs(iD2) >= f11) {
                                }
                                g0Var.f16327a = o1.j.c((s.n) g0Var.f16327a, f15, f15, 30);
                                kotlin.jvm.internal.d0 d0Var2 = new kotlin.jvm.internal.d0();
                                s.n nVar2 = (s.n) g0Var.f16327a;
                                Float f182 = new Float(fMax);
                                boolean z122 = (((Number) ((s.n) g0Var.f16327a).c()).floatValue() != f15 ? z11 : false) ^ z11;
                                h1Var5 = h1Var3;
                                i21 = i17;
                                kotlin.jvm.internal.b0 b0Var3 = b0Var;
                                kotlin.jvm.internal.g0 g0Var3 = g0Var;
                                j1 j1Var2 = new j1(h1Var5, i21, fMax, d0Var2, b0Var3, i18 == 0 ? z11 : false, f10, e0Var, i16, i15, g0Var3);
                                h1Var2 = h1Var5;
                                i14 = i21;
                                b0Var2 = b0Var3;
                                float f19 = f10;
                                e0Var3 = e0Var;
                                i22 = i16;
                                i13 = i15;
                                g0Var2 = g0Var3;
                                i1Var2.f7140a = h1Var2;
                                i1Var2.f7141b = b0Var2;
                                i1Var2.f7142c = g0Var2;
                                i1Var2.f7143d = e0Var3;
                                i1Var2.f7144e = i14;
                                i1Var2.f7145f = i13;
                                i1Var2.f7146g = i22;
                                i1Var2.f7148j = f11;
                                i1Var2.f7149k = f19;
                                i1Var2.f7150l = f12;
                                i1Var2.f7147h = i18;
                                f14 = f19;
                                i23 = 1;
                                i1Var2.f7152n = 1;
                                i1Var4 = i1Var2;
                                if (s.w1.f(nVar2, f182, null, z122, j1Var2, i1Var4, 2) != aVar) {
                                }
                            }
                        }
                    } catch (i e15) {
                        e = e15;
                        i1Var4 = i1Var2;
                        h1Var2 = h1Var5;
                        i14 = i21;
                        i13 = i15;
                    }
                    h1Var5 = h1Var3;
                    i21 = i17;
                    kotlin.jvm.internal.b0 b0Var32 = b0Var;
                    kotlin.jvm.internal.g0 g0Var32 = g0Var;
                } catch (i e16) {
                    e = e16;
                    i1Var4 = i1Var2;
                }
                h1Var2 = h1Var5;
                i14 = i21;
                b0Var2 = b0Var32;
                float f192 = f10;
                e0Var3 = e0Var;
                i22 = i16;
                i13 = i15;
                g0Var2 = g0Var32;
            } catch (i e17) {
                e = e17;
                i1Var3 = i1Var4;
                nVarC = o1.j.c(e.f7137b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
                float f20 = e.f7136a + i13;
                kotlin.jvm.internal.d0 d0Var3 = new kotlin.jvm.internal.d0();
                f13 = new Float(f20);
                if (((Number) nVarC.c()).floatValue() != CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                k1Var = new k1(f20, d0Var3, h1Var2);
                i1Var3.f7140a = h1Var2;
                i1Var3.f7141b = null;
                i1Var3.f7142c = null;
                i1Var3.f7143d = null;
                i1Var3.f7144e = i14;
                i1Var3.f7145f = i13;
                i1Var3.f7152n = 2;
                if (s.w1.f(nVarC, f13, null, !z10, k1Var, i1Var3, 2) != aVar) {
                }
                return aVar;
            }
            i1Var4 = i1Var2;
            return aVar;
        }
        return pg.f0.f21461a;
        i1Var3 = i1Var;
        nVarC = o1.j.c(e.f7137b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30);
        float f202 = e.f7136a + i13;
        kotlin.jvm.internal.d0 d0Var32 = new kotlin.jvm.internal.d0();
        f13 = new Float(f202);
        z10 = ((Number) nVarC.c()).floatValue() != CropImageView.DEFAULT_ASPECT_RATIO;
        k1Var = new k1(f202, d0Var32, h1Var2);
        i1Var3.f7140a = h1Var2;
        i1Var3.f7141b = null;
        i1Var3.f7142c = null;
        i1Var3.f7143d = null;
        i1Var3.f7144e = i14;
        i1Var3.f7145f = i13;
        i1Var3.f7152n = 2;
        if (s.w1.f(nVarC, f13, null, !z10, k1Var, i1Var3, 2) != aVar) {
            h1Var4 = h1Var2;
            i19 = i14;
            i20 = i13;
            h1Var4.b(i19, i20);
            return pg.f0.f21461a;
        }
        return aVar;
    }

    public static final boolean c(h1 h1Var, int i10) {
        return i10 <= h1Var.a() && h1Var.f() <= i10;
    }
}
