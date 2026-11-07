package r2;

import android.os.Handler;
import c9.g;
import f3.m;
import g2.w;
import i2.d1;
import i2.e0;
import i2.g1;
import i2.k;
import i2.u1;
import i2.x0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p.h0;
import p.y;
import pg.f0;
import ph.m0;
import q1.r1;
import r2.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f23146a;

    /* renamed from: b, reason: collision with root package name */
    public final d f23147b;

    /* renamed from: c, reason: collision with root package name */
    public final h0<eh.a<f0>> f23148c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23149d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23150e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23151f;

    /* renamed from: g, reason: collision with root package name */
    public j1.b f23152g;

    /* renamed from: h, reason: collision with root package name */
    public long f23153h;

    /* renamed from: i, reason: collision with root package name */
    public final b f23154i;

    /* renamed from: j, reason: collision with root package name */
    public final p1.b f23155j;

    public c() {
        a aVar = new a();
        aVar.f23142a = new long[192];
        aVar.f23143b = new long[192];
        this.f23146a = aVar;
        this.f23147b = new d();
        this.f23148c = new h0<>((Object) null);
        this.f23153h = -1L;
        this.f23154i = new b(this);
        this.f23155j = new p1.b();
    }

    public static long g(e0 e0Var) {
        float[] fArrMo1getUnderlyingMatrixsQKQjiQ;
        int iA;
        d1 d1Var = e0Var.I;
        g1 g1Var = d1Var.f13791c;
        g1 g1Var2 = d1Var.f13790b;
        long jB = 0;
        while (g1Var2 != null && g1Var2 != g1Var) {
            u1 u1Var = g1Var2.M;
            jB = m0.b(jB, g1Var2.C);
            g1Var2 = g1Var2.f13878s;
            if (u1Var != null && (iA = g.a((fArrMo1getUnderlyingMatrixsQKQjiQ = u1Var.mo1getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iA & 2) == 0) {
                    return 9223372034707292159L;
                }
                jB = r1.b(fArrMo1getUnderlyingMatrixsQKQjiQ, jB);
            }
        }
        return m0.d(jB);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j10;
        d.a aVar;
        char c10;
        long j11;
        long j12;
        int i10;
        Handler handler = j1.c.f14601a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f23149d;
        boolean z11 = z10 || this.f23150e;
        a aVar2 = this.f23146a;
        d dVar = this.f23147b;
        d.a aVar3 = null;
        if (z10) {
            this.f23149d = false;
            h0<eh.a<f0>> h0Var = this.f23148c;
            Object[] objArr = h0Var.f20706a;
            int i11 = h0Var.f20707b;
            for (int i12 = 0; i12 < i11; i12++) {
                ((eh.a) objArr[i12]).invoke();
            }
            long[] jArr = aVar2.f23142a;
            int i13 = aVar2.f23144c;
            for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
                long j13 = jArr[i14 + 2];
                if ((((int) (j13 >> 61)) & 1) != 0) {
                    long j14 = jArr[i14];
                    long j15 = jArr[i14 + 1];
                    for (d.a aVarB = dVar.f23156a.b(((int) j13) & 67108863); aVarB != null; aVarB = null) {
                        if (jCurrentTimeMillis - aVarB.f23160a >= 0) {
                            aVarB.f23160a = jCurrentTimeMillis;
                            k.d(null, 2);
                            throw null;
                        }
                    }
                }
            }
            j10 = 0;
            long[] jArr2 = aVar2.f23142a;
            int i15 = aVar2.f23144c;
            for (int i16 = 0; i16 < jArr2.length - 2 && i16 < i15; i16 += 3) {
                int i17 = i16 + 2;
                jArr2[i17] = jArr2[i17] & (-2305843009213693953L);
            }
        } else {
            j10 = 0;
        }
        if (this.f23150e) {
            this.f23150e = false;
            j11 = 128;
            long j16 = dVar.f23158c;
            y<d.a> yVar = dVar.f23156a;
            Object[] objArr2 = yVar.f20645c;
            long[] jArr3 = yVar.f20643a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j12 = 255;
                while (true) {
                    long j17 = jArr3[i18];
                    c10 = 7;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        long j18 = j17;
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j18 & 255) < 128) {
                                d.a aVar4 = (d.a) objArr2[(i18 << 3) + i20];
                                while (aVar4 != null) {
                                    if (jCurrentTimeMillis - aVar4.f23160a > j10) {
                                        aVar4.f23160a = jCurrentTimeMillis;
                                        k.d(null, 2);
                                        throw null;
                                    }
                                    aVar4 = null;
                                    aVar3 = null;
                                }
                            }
                            j18 >>= 8;
                            i20++;
                            aVar3 = aVar3;
                        }
                        aVar = aVar3;
                        if (i19 != 8) {
                            break;
                        }
                    } else {
                        aVar = aVar3;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    aVar3 = aVar;
                }
                if (z11) {
                    dVar.getClass();
                }
                if (this.f23151f) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    this.f23151f = false;
                    long[] jArr4 = aVar2.f23142a;
                    int i21 = aVar2.f23144c;
                    long[] jArr5 = aVar2.f23143b;
                    int i22 = 0;
                    for (int i23 = 0; i23 < jArr4.length - 2 && i22 < jArr5.length - 2 && i23 < i21; i23 += 3) {
                        int i24 = i23 + 2;
                        if (jArr4[i24] != 2305843009213693951L) {
                            jArr5[i22] = jArr4[i23];
                            jArr5[i22 + 1] = jArr4[i23 + 1];
                            jArr5[i22 + 2] = jArr4[i24];
                            i22 += 3;
                        }
                    }
                    aVar2.f23144c = i22;
                    aVar2.f23142a = jArr5;
                    aVar2.f23143b = jArr4;
                }
                if (dVar.f23157b <= jCurrentTimeMillis) {
                    return;
                }
                y<d.a> yVar2 = dVar.f23156a;
                Object[] objArr3 = yVar2.f20645c;
                long[] jArr6 = yVar2.f20643a;
                int length2 = jArr6.length - 2;
                if (length2 >= 0) {
                    int i25 = i10;
                    while (true) {
                        long j19 = jArr6[i25];
                        if ((((~j19) << c10) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8 - ((~(i25 - length2)) >>> 31);
                            long j20 = j19;
                            for (int i27 = i10; i27 < i26; i27++) {
                                if ((j20 & j12) < j11) {
                                    for (d.a aVar5 = (d.a) objArr3[(i25 << 3) + i27]; aVar5 != null; aVar5 = aVar) {
                                    }
                                }
                                j20 >>= 8;
                            }
                            if (i26 != 8) {
                                break;
                            }
                        }
                        if (i25 == length2) {
                            break;
                        } else {
                            i25++;
                        }
                    }
                }
                dVar.f23157b = -1L;
                return;
            }
            aVar = null;
            c10 = 7;
        } else {
            aVar = null;
            c10 = 7;
            j11 = 128;
        }
        j12 = 255;
        if (z11) {
        }
        if (this.f23151f) {
        }
        if (dVar.f23157b <= jCurrentTimeMillis) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e0 e0Var, long j10, boolean z10) {
        boolean z11;
        g1 g1Var = e0Var.I.f13791c;
        x0 x0Var = e0Var.K.f13929p;
        int iG0 = x0Var.g0();
        int iE0 = x0Var.e0();
        int i10 = (int) (j10 >> 32);
        float f10 = i10;
        long j11 = BodyPartID.bodyIdMax;
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        float f11 = i10 + iG0;
        p1.b bVar = this.f23155j;
        bVar.f21125a = f10;
        bVar.f21126b = i11;
        bVar.f21127c = f11;
        bVar.f21128d = i11 + iE0;
        while (g1Var != null) {
            u1 u1Var = g1Var.M;
            long j12 = g1Var.C;
            long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (j12 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j12 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
            bVar.f21125a += fIntBitsToFloat;
            bVar.f21126b += fIntBitsToFloat2;
            bVar.f21127c += fIntBitsToFloat;
            bVar.f21128d += fIntBitsToFloat2;
            g1Var = g1Var.f13878s;
            if (u1Var != null) {
                float[] fArrMo1getUnderlyingMatrixsQKQjiQ = u1Var.mo1getUnderlyingMatrixsQKQjiQ();
                if (!w.d(fArrMo1getUnderlyingMatrixsQKQjiQ)) {
                    r1.c(fArrMo1getUnderlyingMatrixsQKQjiQ, bVar);
                }
            }
        }
        int i12 = (int) bVar.f21125a;
        int i13 = (int) bVar.f21126b;
        int i14 = (int) bVar.f21127c;
        int i15 = (int) bVar.f21128d;
        int i16 = e0Var.f13810b;
        a aVar = this.f23146a;
        if (z10) {
            z11 = true;
            e0 e0VarG = e0Var.G();
            a.a(aVar, i16, i12, i13, i14, i15, e0VarG == null ? e0VarG.f13810b : -1);
        } else {
            int i17 = i16 & 67108863;
            long[] jArr = aVar.f23142a;
            int i18 = aVar.f23144c;
            int i19 = 0;
            while (i19 < jArr.length - 2 && i19 < i18) {
                int i20 = i19 + 2;
                long j13 = j11;
                long j14 = jArr[i20];
                z11 = true;
                if ((((int) j14) & 67108863) == i17) {
                    jArr[i19] = (i12 << 32) | (i13 & j13);
                    jArr[i19 + 1] = (i14 << 32) | (i15 & j13);
                    jArr[i20] = 2305843009213693952L | j14;
                    break;
                }
                i19 += 3;
                j11 = j13;
            }
            z11 = true;
            e0 e0VarG2 = e0Var.G();
            a.a(aVar, i16, i12, i13, i14, i15, e0VarG2 == null ? e0VarG2.f13810b : -1);
        }
        this.f23149d = z11;
    }

    public final void c(e0 e0Var) {
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            b(e0Var2, e0Var2.I.f13791c.C, false);
            c(e0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [j1.b, java.lang.Runnable] */
    public final void d(e0 e0Var) {
        this.f23149d = true;
        int i10 = e0Var.f13810b & 67108863;
        a aVar = this.f23146a;
        long[] jArr = aVar.f23142a;
        int i11 = aVar.f23144c;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            long j10 = jArr[i13];
            if ((((int) j10) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j10;
                break;
            }
            i12 += 3;
        }
        j1.b bVar = this.f23152g;
        boolean z10 = bVar != null;
        long j11 = this.f23147b.f23157b;
        if (j11 >= 0 || !z10) {
            if (this.f23153h == j11 && z10) {
                return;
            }
            if (bVar != null) {
                Handler handler = j1.c.f14601a;
                j1.c.f14601a.removeCallbacks(bVar);
            }
            Handler handler2 = j1.c.f14601a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j11, 16 + jCurrentTimeMillis);
            this.f23153h = jMax;
            final b bVar2 = this.f23154i;
            ?? r11 = new Runnable() { // from class: j1.b
                @Override // java.lang.Runnable
                public final void run() {
                    bVar2.invoke();
                }
            };
            j1.c.f14601a.postDelayed(r11, jMax - jCurrentTimeMillis);
            this.f23152g = r11;
        }
    }

    public final void e(e0 e0Var) {
        long jG = g(e0Var);
        if (m.b(jG, 9223372034707292159L)) {
            c(e0Var);
            return;
        }
        e0Var.f13813e = jG;
        e0Var.f13814f = false;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            f(e0Var2, e0Var2.I.f13791c.C, false);
        }
        d(e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e0 e0Var, long j10, boolean z10) {
        char c10;
        long j11;
        boolean z11;
        long jD;
        boolean zB;
        ?? r20;
        char c11;
        long j12;
        char c12;
        int i10;
        float[] fArrMo1getUnderlyingMatrixsQKQjiQ;
        int iA;
        x0 x0Var = e0Var.K.f13929p;
        int iG0 = x0Var.g0();
        int iE0 = x0Var.e0();
        e0 e0VarG = e0Var.G();
        long j13 = e0Var.f13811c;
        long j14 = e0Var.f13812d;
        int i11 = (int) (j14 >> 32);
        int i12 = (int) (j14 & BodyPartID.bodyIdMax);
        boolean z12 = false;
        if (e0VarG != null) {
            char c13 = ' ';
            boolean z13 = e0VarG.f13814f;
            j11 = 4294967295L;
            long j15 = e0VarG.f13811c;
            long jG = e0VarG.f13813e;
            if (!m.b(j15, 9223372034707292159L)) {
                if (z13) {
                    jG = g(e0VarG);
                    e0VarG.f13813e = jG;
                    e0VarG.f13814f = false;
                }
                zB = m.b(jG, 9223372034707292159L);
                jD = m.d(m.d(j15, jG), j10);
                r20 = 0;
                c11 = c13;
                if (!zB || m.b(jD, 9223372034707292159L)) {
                    b(e0Var, j10, z10);
                }
                e0Var.f13811c = jD;
                e0Var.f13812d = (iG0 << c11) | (iE0 & j11);
                int i13 = (int) (jD >> c11);
                int i14 = (int) (jD & j11);
                int i15 = i13 + iG0;
                int i16 = i14 + iE0;
                if (!z10 && m.b(jD, j13) && i11 == iG0 && i12 == iE0) {
                    return;
                }
                int i17 = e0Var.f13810b;
                a aVar = this.f23146a;
                if (z10) {
                    e0 e0VarG2 = e0Var.G();
                    a.a(aVar, i17, i13, i14, i15, i16, e0VarG2 == null ? e0VarG2.f13810b : -1);
                } else {
                    int i18 = 67108863;
                    int i19 = i17 & 67108863;
                    long[] jArr = aVar.f23142a;
                    int i20 = aVar.f23144c;
                    int i21 = r20;
                    while (i21 < jArr.length - 2 && i21 < i20) {
                        int i22 = i21 + 2;
                        int i23 = i18;
                        long j16 = jArr[i22];
                        if ((((int) j16) & i23) == i19) {
                            long j17 = jArr[i21];
                            jArr[i21] = (i13 << c11) | (i14 & j11);
                            jArr[i21 + 1] = (i15 << c11) | (i16 & j11);
                            long j18 = 2305843009213693952L;
                            jArr[i22] = j16 | 2305843009213693952L;
                            if ((i13 - ((int) (j17 >> c11)) != 0 ? true : r20) | (i14 - ((int) j17) != 0 ? true : r20)) {
                                long j19 = -4503599560261633L;
                                char c14 = 26;
                                long j20 = (j16 & (-4503599560261633L)) | (((i21 + 3) & i23) << 26);
                                long[] jArr2 = aVar.f23142a;
                                long[] jArr3 = aVar.f23143b;
                                int i24 = aVar.f23144c / 3;
                                jArr3[r20] = j20;
                                int i25 = 1;
                                while (i25 > 0) {
                                    i25--;
                                    long j21 = jArr3[i25];
                                    int i26 = ((int) j21) & i23;
                                    long j22 = j19;
                                    int i27 = ((int) (j21 >> c14)) & i23;
                                    char c15 = '4';
                                    int i28 = ((int) (j21 >> 52)) & 511;
                                    int i29 = i28 == 511 ? i24 : i28 + i27;
                                    if (i27 < 0) {
                                        break;
                                    }
                                    while (i27 < jArr2.length - 2 && i27 < i29) {
                                        int i30 = i27 + 2;
                                        long j23 = jArr2[i30];
                                        char c16 = c15;
                                        int i31 = i24;
                                        if ((((int) (j23 >> c14)) & i23) == i26) {
                                            long j24 = jArr2[i27];
                                            int i32 = i27 + 1;
                                            j12 = j18;
                                            long j25 = jArr2[i32];
                                            c12 = c14;
                                            i10 = i29;
                                            jArr2[i27] = ((((int) j24) + r11) & j11) | ((((int) (j24 >> c11)) + r6) << c11);
                                            jArr2[i32] = ((((int) j25) + r11) & j11) | ((((int) (j25 >> c11)) + r6) << c11);
                                            jArr2[i30] = j23 | j12;
                                            if ((((int) (j23 >> c16)) & 511) > 0) {
                                                jArr3[i25] = (j23 & j22) | (((i27 + 3) & i23) << c12);
                                                i25++;
                                            }
                                        } else {
                                            j12 = j18;
                                            c12 = c14;
                                            i10 = i29;
                                        }
                                        i27 += 3;
                                        i24 = i31;
                                        c15 = c16;
                                        j18 = j12;
                                        c14 = c12;
                                        i29 = i10;
                                    }
                                    i24 = i24;
                                    j19 = j22;
                                    j18 = j18;
                                    c14 = c14;
                                }
                            }
                        } else {
                            i21 += 3;
                            i18 = i23;
                        }
                    }
                    e0 e0VarG22 = e0Var.G();
                    a.a(aVar, i17, i13, i14, i15, i16, e0VarG22 == null ? e0VarG22.f13810b : -1);
                }
                this.f23149d = true;
                return;
            }
            g1 g1Var = e0Var.I.f13791c;
            long jB = 0;
            while (true) {
                if (g1Var == null) {
                    z11 = z12;
                    jD = m0.d(jB);
                    c10 = c13;
                    break;
                }
                boolean z14 = z12;
                u1 u1Var = g1Var.M;
                jB = m0.b(jB, g1Var.C);
                g1Var = g1Var.f13878s;
                if (u1Var != null && (iA = g.a((fArrMo1getUnderlyingMatrixsQKQjiQ = u1Var.mo1getUnderlyingMatrixsQKQjiQ()))) != 3) {
                    if ((iA & 2) == 0) {
                        jD = 9223372034707292159L;
                        c10 = c13;
                        z11 = z14;
                        break;
                    }
                    jB = r1.b(fArrMo1getUnderlyingMatrixsQKQjiQ, jB);
                }
                z12 = z14 ? 1 : 0;
            }
        } else {
            c10 = ' ';
            j11 = 4294967295L;
            z11 = false;
            jD = j10;
        }
        zB = z11 ? 1 : 0;
        c11 = c10;
        r20 = z11;
        if (zB) {
        }
        b(e0Var, j10, z10);
    }

    public final void h(e0 e0Var) {
        int i10 = e0Var.f13810b & 67108863;
        a aVar = this.f23146a;
        long[] jArr = aVar.f23142a;
        int i11 = aVar.f23144c;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
            i12 += 3;
        }
        this.f23149d = true;
        this.f23151f = true;
    }
}
