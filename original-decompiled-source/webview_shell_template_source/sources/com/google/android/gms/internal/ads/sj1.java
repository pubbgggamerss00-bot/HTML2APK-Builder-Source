package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.KeyAgreement;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj1 implements em1, fy1, dx1, ax1, zx1, cy1, l32, eq0, gg2 {
    public final /* synthetic */ int s;

    public /* synthetic */ sj1(int i6) {
        this.s = i6;
    }

    public static em1 c(em1 em1Var) {
        return ((em1Var instanceof gm1) || (em1Var instanceof fm1)) ? em1Var : em1Var instanceof Serializable ? new fm1(em1Var) : new gm1(em1Var);
    }

    public static ht1 e(ck1 ck1Var) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) ck1Var.f3613t;
        try {
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            c22 c22VarF = c22.F(byteArrayInputStream, u42.f9459c);
            byteArrayInputStream.close();
            if (c22VarF.B() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ArrayList arrayList = new ArrayList(c22VarF.B());
            for (b22 b22Var : c22VarF.G()) {
                b22Var.getClass();
                try {
                    oy1 oy1VarA = oy1.a(b22Var.C().F(), b22Var.C().E(), b22Var.C().C(), b22Var.E(), b22Var.E() == q22.RAW ? null : Integer.valueOf(b22Var.B()));
                    wx1 wx1Var = wx1.f10304b;
                    xy1 xy1Var = (xy1) wx1Var.f10305a.get();
                    xy1Var.getClass();
                    ih1 hx1Var = !xy1Var.f10749b.containsKey(new vy1(oy1.class, oy1VarA.f7886b)) ? new hx1(oy1VarA) : wx1Var.a(oy1VarA);
                    int iJ = b22Var.J() - 2;
                    if (iJ != 1 && iJ != 2 && iJ != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new gt1(hx1Var));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            }
            return new ht1(c22VarF, Collections.unmodifiableList(arrayList));
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static /* synthetic */ boolean i(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, cr1 cr1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cr1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(cr1Var) != obj && atomicReferenceFieldUpdater.get(cr1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        long jK = k(0, bArr) & 67108863;
        int i6 = 3;
        long jK2 = (k(3, bArr) >> 2) & 67108611;
        long jK3 = (k(6, bArr) >> 4) & 67092735;
        long jK4 = (k(9, bArr) >> 6) & 66076671;
        long jK5 = (k(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i7 = 0;
        while (true) {
            int length = bArr2.length;
            if (i7 >= length) {
                long j11 = j6 + (j7 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = ((j15 >> 26) * 5) + j10;
                long j18 = j17 >> 26;
                long j19 = j17 & 67108863;
                long j20 = j19 + 5;
                long j21 = (j7 & 67108863) + j18;
                long j22 = j21 + (j20 >> 26);
                long j23 = j12 + (j22 >> 26);
                long j24 = j14 + (j23 >> 26);
                long j25 = (j16 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j21 & j26) | (j22 & 67108863 & j27);
                long j29 = (j12 & j26) | (j23 & 67108863 & j27);
                long j30 = (j14 & j26) | (j24 & 67108863 & j27);
                long jK6 = k(16, bArr) + (((j20 & 67108863 & j27) | (j19 & j26) | (j28 << 26)) & 4294967295L);
                long jK7 = k(20, bArr);
                long jK8 = k(24, bArr);
                long jK9 = k(28, bArr) + (((j30 >> 18) | (((j16 & j26) | (j25 & j27)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                m(bArr4, jK6 & 4294967295L, 0);
                long j31 = jK7 + (((j28 >> 6) | (j29 << 20)) & 4294967295L) + (jK6 >> 32);
                m(bArr4, j31 & 4294967295L, 4);
                long j32 = jK8 + (((j30 << 14) | (j29 >> 12)) & 4294967295L) + (j31 >> 32);
                m(bArr4, j32 & 4294967295L, 8);
                m(bArr4, (jK9 + (j32 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i7);
            System.arraycopy(bArr2, i7, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j33 = jK5 * 5;
            long j34 = jK4 * 5;
            long j35 = jK3 * 5;
            long jK10 = j10 + (k(0, bArr3) & 67108863);
            long jK11 = j7 + ((k(i6, bArr3) >> 2) & 67108863);
            long jK12 = j6 + ((k(6, bArr3) >> 4) & 67108863);
            long jK13 = j8 + ((k(9, bArr3) >> 6) & 67108863);
            long j36 = jK2;
            long jK14 = j9 + (((k(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j37 = jK11 * jK;
            long j38 = jK11 * j36;
            long j39 = jK12 * jK;
            long j40 = jK11 * jK3;
            long j41 = jK12 * j36;
            long j42 = jK13 * jK;
            long j43 = jK11 * jK4;
            long j44 = jK12 * jK3;
            long j45 = jK13 * j36;
            long j46 = jK14 * jK;
            long j47 = (jK2 * 5 * jK14) + (jK13 * j35) + (jK12 * j34) + (jK11 * j33) + (jK10 * jK);
            long j48 = j47 & 67108863;
            long j49 = jK13 * j34;
            long j50 = j35 * jK14;
            long j51 = j50 + j49 + (jK12 * j33) + (jK10 * j36) + j37 + (j47 >> 26);
            long j52 = j34 * jK14;
            long j53 = j52 + (jK13 * j33) + (jK10 * jK3) + j38 + j39 + (j51 >> 26);
            long j54 = (jK14 * j33) + (jK10 * jK4) + j40 + j41 + j42 + (j53 >> 26);
            long j55 = (jK10 * jK5) + j43 + j44 + j45 + j46 + (j54 >> 26);
            long j56 = ((j55 >> 26) * 5) + j48;
            j7 = (j51 & 67108863) + (j56 >> 26);
            i7 += 16;
            j6 = j53 & 67108863;
            j8 = j54 & 67108863;
            j9 = j55 & 67108863;
            j10 = j56 & 67108863;
            jK2 = j36;
            i6 = 3;
        }
    }

    public static long k(int i6, byte[] bArr) {
        int i7 = bArr[i6] & 255;
        int i8 = bArr[i6 + 1] & 255;
        int i9 = bArr[i6 + 2] & 255;
        return (((bArr[i6 + 3] & 255) << 24) | (i8 << 8) | i7 | (i9 << 16)) & 4294967295L;
    }

    public static Executor l(Executor executor, wr1 wr1Var) {
        executor.getClass();
        return executor == ur1.s ? executor : new js1(executor, wr1Var);
    }

    public static void m(byte[] bArr, long j6, int i6) {
        for (int i7 = 0; i7 < 4; i7++) {
            bArr[i6 + i7] = (byte) (255 & j6);
            j6 >>= 8;
        }
    }

    @Override // com.google.android.gms.internal.ads.gg2
    public List a(boolean z6, boolean z7, String str) {
        return pg2.b(z6, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        iv1 iv1Var = (iv1) ih1Var;
        i22 i22VarC = j22.C();
        k22 k22VarB = l22.B();
        String str = iv1Var.f5871u.f6503a;
        k22VarB.i();
        l22.F((l22) k22VarB.f4126t, str);
        l22 l22Var = (l22) k22VarB.g();
        i22VarC.i();
        j22.G((j22) i22VarC.f4126t, l22Var);
        return oy1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((j22) i22VarC.g()).g(), 5, lv1.b(iv1Var.f5871u.f6504b), iv1Var.f5873w);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        w12 w12VarB = x12.B();
        w12VarB.k("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        w12VarB.l(b32.C().g());
        w12VarB.j(tw1.b(((xv1) lt1Var).f10720a));
        return py1.a((x12) w12VarB.g());
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 7:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var = oy1Var.f7887c;
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    n22 n22VarD = n22.D(g42Var, u42.f9459c);
                    if (n22VarD.B() == 0) {
                        return mv1.m(pv1.a(n22VarD.E(), oy1Var.f7889e), oy1Var.f7890f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(n22VarD)));
                } catch (u52 e6) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e6);
                }
            default:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var2 = oy1Var.f7887c;
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    d12 d12VarD = d12.D(g42Var2, u42.f9459c);
                    if (d12VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    mx mxVar = new mx(2);
                    mxVar.c(d12VarD.E().g());
                    mxVar.b();
                    mxVar.d();
                    mxVar.f7235w = dw1.a(oy1Var.f7889e);
                    uu1 uu1VarF = mxVar.f();
                    nu1 nu1Var = new nu1();
                    nu1Var.f7511a = uu1VarF;
                    nu1Var.f7512b = xj1.h(d12VarD.E().c());
                    nu1Var.f7513c = oy1Var.f7890f;
                    return nu1Var.a();
                } catch (u52 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 8:
                x12 x12Var = py1Var.f8181b;
                if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
                }
                try {
                    g42 g42VarG = x12Var.G();
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    z02 z02VarD = z02.D(g42VarG, u42.f9459c);
                    eu euVar = new eu();
                    euVar.d(z02VarD.B());
                    euVar.b(z02VarD.E().B());
                    euVar.f();
                    euVar.f4397v = aw1.a(x12Var.F());
                    return euVar.g();
                } catch (u52 e6) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e6);
                }
            default:
                x12 x12Var2 = py1Var.f8181b;
                if (!x12Var2.H().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var2.H())));
                }
                try {
                    g42 g42VarG2 = x12Var2.G();
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    m12.C(g42VarG2, u42.f9459c);
                    return new cv1(hw1.a(x12Var2.F()));
                } catch (u52 e7) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 15:
                int i6 = gb2.f4973n0;
                ((bs) obj).zzo();
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case dn.zzm /* 21 */:
                break;
            default:
                break;
        }
    }

    public /* synthetic */ sj1(int i6, int i7) {
        this.s = 15;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return 265;
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 5:
                ou1 ou1Var = (ou1) ih1Var;
                return new f32(((r32) ou1Var.f7864v.f10619t).b(), ou1Var.f7865w);
            default:
                b02 b02Var = new b02();
                if (aa1.j(2)) {
                    return b02Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
