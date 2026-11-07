package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ov1 implements cy1, dx1, ax1, l32, em1, eq0, jm0 {
    public final /* synthetic */ int s;

    public /* synthetic */ ov1(int i6) {
        this.s = i6;
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    public static LinkedHashMap c(int i6) {
        return new LinkedHashMap(i6 < 3 ? i6 + 1 : i6 < 1073741824 ? (int) ((i6 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.dx1, com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        switch (this.s) {
            case 1:
                yt1 yt1Var = (yt1) ih1Var;
                l02 l02VarC = m02.C();
                p02 p02VarC = q02.C();
                t02 t02VarC = u02.C();
                int i6 = yt1Var.f11074u.f4783c;
                t02VarC.i();
                ((u02) t02VarC.f4126t).zzc = i6;
                u02 u02Var = (u02) t02VarC.g();
                p02VarC.i();
                q02.H((q02) p02VarC.f4126t, u02Var);
                byte[] bArrB = ((r32) yt1Var.f11075v.f10619t).b();
                e42 e42VarS = g42.s(0, bArrB.length, bArrB);
                p02VarC.i();
                ((q02) p02VarC.f4126t).zzf = e42VarS;
                q02 q02Var = (q02) p02VarC.g();
                l02VarC.i();
                m02.H((m02) l02VarC.f4126t, q02Var);
                o12 o12VarC = p12.C();
                fu1 fu1Var = yt1Var.f11074u;
                t12 t12VarC = yv1.c(fu1Var);
                o12VarC.i();
                p12.J((p12) o12VarC.f4126t, t12VarC);
                byte[] bArrB2 = ((r32) yt1Var.f11076w.f10619t).b();
                e42 e42VarS2 = g42.s(0, bArrB2.length, bArrB2);
                o12VarC.i();
                ((p12) o12VarC.f4126t).zzf = e42VarS2;
                p12 p12Var = (p12) o12VarC.g();
                l02VarC.i();
                m02.I((m02) l02VarC.f4126t, p12Var);
                return oy1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((m02) l02VarC.g()).g(), 2, yv1.d(fu1Var.f4785e), yt1Var.f11078y);
            default:
                rv1 rv1Var = (rv1) ih1Var;
                s22 s22VarC = t22.C();
                byte[] bArrB3 = ((r32) rv1Var.f8716v.f10619t).b();
                e42 e42VarS3 = g42.s(0, bArrB3.length, bArrB3);
                s22VarC.i();
                ((t22) s22VarC.f4126t).zzf = e42VarS3;
                w22 w22VarC = y22.C();
                tv1 tv1Var = rv1Var.f8715u;
                int i7 = tv1Var.f9390b;
                w22VarC.i();
                ((y22) w22VarC.f4126t).zzc = i7;
                y22 y22Var = (y22) w22VarC.g();
                s22VarC.i();
                t22.H((t22) s22VarC.f4126t, y22Var);
                return oy1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((t22) s22VarC.g()).g(), 2, rw1.b(tv1Var.f9389a), rv1Var.f8718x);
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        switch (this.s) {
            case 0:
                nv1 nv1Var = (nv1) lt1Var;
                w12 w12VarB = x12.B();
                w12VarB.k("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                w12VarB.l(pv1.b(nv1Var).g());
                w12VarB.j(pv1.c(nv1Var.f7523a));
                return py1.a((x12) w12VarB.g());
            default:
                uu1 uu1Var = (uu1) lt1Var;
                w12 w12VarB2 = x12.B();
                w12VarB2.k("type.googleapis.com/google.crypto.tink.AesGcmKey");
                e12 e12VarD = f12.D();
                int i6 = uu1Var.f9634a;
                e12VarD.i();
                ((f12) e12VarD.f4126t).zzc = i6;
                w12VarB2.l(((f12) e12VarD.g()).g());
                w12VarB2.j(dw1.b(uu1Var.f9635b));
                return py1.a((x12) w12VarB2.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 3:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var = oy1Var.f7887c;
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    h12 h12VarD = h12.D(g42Var, u42.f9459c);
                    if (h12VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iG = h12VarD.E().g();
                    if (iG != 16 && iG != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iG)));
                    }
                    zu1 zu1Var = new zu1(iG, ew1.a(oy1Var.f7889e));
                    vu1 vu1Var = new vu1();
                    vu1Var.f9941a = zu1Var;
                    vu1Var.f9942b = xj1.h(h12VarD.E().c());
                    vu1Var.f9943c = oy1Var.f7890f;
                    return vu1Var.a();
                } catch (u52 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 4:
            default:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var2 = oy1Var.f7887c;
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    p12 p12VarE = p12.E(g42Var2, u42.f9459c);
                    if (p12VarE.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    mx mxVar = new mx(3);
                    mxVar.c(p12VarE.G().g());
                    mxVar.e(p12VarE.F().B());
                    mxVar.f7234v = (oz1) c02.f3353b.b(p12VarE.F().C());
                    mxVar.f7235w = (pz1) c02.f3352a.b(oy1Var.f7889e);
                    qz1 qz1VarG = mxVar.g();
                    kz1 kz1Var = new kz1();
                    kz1Var.f6536a = qz1VarG;
                    kz1Var.f6537b = xj1.h(p12VarE.G().c());
                    kz1Var.f6538c = oy1Var.f7890f;
                    return kz1Var.a();
                } catch (u52 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 5:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var3 = oy1Var.f7887c;
                    u42 u42Var3 = u42.f9458b;
                    u62 u62Var3 = u62.f9474c;
                    g02 g02VarD = g02.D(g42Var3, u42.f9459c);
                    if (g02VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    fz1 fz1Var = new fz1();
                    fz1Var.a(g02VarD.F().g());
                    fz1Var.b(g02VarD.E().B());
                    fz1Var.f4832c = zz1.a(oy1Var.f7889e);
                    gz1 gz1VarC = fz1Var.c();
                    az1 az1Var = new az1();
                    az1Var.f2876a = gz1VarC;
                    az1Var.f2877b = xj1.h(g02VarD.F().c());
                    az1Var.f2878c = oy1Var.f7890f;
                    return az1Var.a();
                } catch (u52 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return new ua2();
    }

    public /* synthetic */ ov1(tc tcVar, int i6) {
        this.s = 10;
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 10:
                int i6 = gb2.f4973n0;
                ((bs) obj).zzd();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }
}
