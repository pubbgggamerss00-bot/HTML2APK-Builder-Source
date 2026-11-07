package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ih1 implements cy1, ax1, zx1, dx1, fy1, l32, eq0, vq0, ng2 {

    /* renamed from: t, reason: collision with root package name */
    public static int f5768t = 2;
    public final /* synthetic */ int s;

    public /* synthetic */ ih1(int i6) {
        this.s = i6;
    }

    public static final r52 a(long j6, Object obj) {
        r52 r52Var = (r52) r72.j(j6, obj);
        if (r52Var.zzc()) {
            return r52Var;
        }
        int size = r52Var.size();
        r52 r52VarB = r52Var.b(size == 0 ? 10 : size + size);
        r72.o(obj, j6, r52VarB);
        return r52VarB;
    }

    public static void c(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int i(int i6) {
        if (i6 == 20) {
            return 63750;
        }
        if (i6 == 30) {
            return 2250000;
        }
        switch (i6) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i6) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void k(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static final void l(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) throws GeneralSecurityException {
        if (((bz1) ih1Var).f3332u.f5191a != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        a02 a02Var = new a02();
        if (aa1.j(1)) {
            return a02Var;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.vq0
    public void e(Object obj, dj2 dj2Var) {
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        switch (this.s) {
            case 3:
                fu1 fu1Var = (fu1) lt1Var;
                w12 w12VarB = x12.B();
                w12VarB.k("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                n02 n02VarB = o02.B();
                r02 r02VarC = s02.C();
                t02 t02VarC = u02.C();
                int i6 = fu1Var.f4783c;
                t02VarC.i();
                ((u02) t02VarC.f4126t).zzc = i6;
                u02 u02Var = (u02) t02VarC.g();
                r02VarC.i();
                s02.G((s02) r02VarC.f4126t, u02Var);
                int i7 = fu1Var.f4781a;
                r02VarC.i();
                ((s02) r02VarC.f4126t).zze = i7;
                s02 s02Var = (s02) r02VarC.g();
                n02VarB.i();
                o02.F((o02) n02VarB.f4126t, s02Var);
                q12 q12VarD = r12.D();
                t12 t12VarC = yv1.c(fu1Var);
                q12VarD.i();
                r12.I((r12) q12VarD.f4126t, t12VarC);
                int i8 = fu1Var.f4782b;
                q12VarD.i();
                ((r12) q12VarD.f4126t).zze = i8;
                r12 r12Var = (r12) q12VarD.g();
                n02VarB.i();
                o02.G((o02) n02VarB.f4126t, r12Var);
                w12VarB.l(((o02) n02VarB.g()).g());
                w12VarB.j(yv1.d(fu1Var.f4785e));
                return py1.a((x12) w12VarB.g());
            default:
                tv1 tv1Var = (tv1) lt1Var;
                w12 w12VarB2 = x12.B();
                w12VarB2.k("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                u22 u22VarC = v22.C();
                w22 w22VarC = y22.C();
                int i9 = tv1Var.f9390b;
                w22VarC.i();
                ((y22) w22VarC.f4126t).zzc = i9;
                y22 y22Var = (y22) w22VarC.g();
                u22VarC.i();
                v22.F((v22) u22VarC.f4126t, y22Var);
                w12VarB2.l(((v22) u22VarC.g()).g());
                w12VarB2.j(rw1.b(tv1Var.f9389a));
                return py1.a((x12) w12VarB2.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 4:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var = oy1Var.f7887c;
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    w02 w02VarD = w02.D(g42Var, u42.f9459c);
                    if (w02VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eu euVar = new eu();
                    euVar.d(w02VarD.F().g());
                    euVar.b(w02VarD.E().B());
                    euVar.f();
                    euVar.f4397v = aw1.a(oy1Var.f7889e);
                    mu1 mu1VarG = euVar.g();
                    gu1 gu1Var = new gu1();
                    gu1Var.f5166a = mu1VarG;
                    gu1Var.f5167b = xj1.h(w02VarD.F().c());
                    gu1Var.f5168c = oy1Var.f7890f;
                    return gu1Var.a();
                } catch (u52 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            default:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var2 = oy1Var.f7887c;
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    l12 l12VarD = l12.D(g42Var2, u42.f9459c);
                    if (l12VarD.B() == 0) {
                        return av1.m(hw1.a(oy1Var.f7889e), xj1.h(l12VarD.E().c()), oy1Var.f7890f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (u52 unused2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 5:
                x12 x12Var = py1Var.f8181b;
                if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
                }
                try {
                    g42 g42VarG = x12Var.G();
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    j12 j12VarE = j12.E(g42VarG, u42.f9459c);
                    if (j12VarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iB = j12VarE.B();
                    if (iB == 16 || iB == 32) {
                        return new zu1(iB, ew1.a(x12Var.F()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iB)));
                } catch (u52 e6) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                }
            case 11:
                x12 x12Var2 = py1Var.f8181b;
                if (!x12Var2.H().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var2.H())));
                }
                try {
                    g42 g42VarG2 = x12Var2.G();
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    i02 i02VarD = i02.D(g42VarG2, u42.f9459c);
                    fz1 fz1Var = new fz1();
                    fz1Var.a(i02VarD.B());
                    fz1Var.b(i02VarD.E().B());
                    fz1Var.f4832c = zz1.a(x12Var2.F());
                    return fz1Var.c();
                } catch (u52 e7) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
                }
            default:
                x12 x12Var3 = py1Var.f8181b;
                if (!x12Var3.H().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var3.H())));
                }
                try {
                    g42 g42VarG3 = x12Var3.G();
                    u42 u42Var3 = u42.f9458b;
                    u62 u62Var3 = u62.f9474c;
                    r12 r12VarF = r12.F(g42VarG3, u42.f9459c);
                    if (r12VarF.C() != 0) {
                        throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(r12VarF.C(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    mx mxVar = new mx(3);
                    mxVar.c(r12VarF.B());
                    mxVar.e(r12VarF.G().B());
                    mxVar.f7234v = (oz1) c02.f3353b.b(r12VarF.G().C());
                    mxVar.f7235w = (pz1) c02.f3352a.b(x12Var3.F());
                    return mxVar.g();
                } catch (u52 e8) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza, reason: collision with other method in class */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 16:
                int i6 = gb2.f4973n0;
                ((bs) obj).zze();
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
            default:
                break;
            case dn.zzm /* 21 */:
                break;
        }
    }

    public /* synthetic */ ih1(lf lfVar) {
        this.s = 16;
    }

    @Override // com.google.android.gms.internal.ads.dx1, com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        uv1 uv1Var = (uv1) ih1Var;
        z22 z22VarC = a32.C();
        byte[] bArrB = ((r32) uv1Var.f9639v.f10619t).b();
        e42 e42VarS = g42.s(0, bArrB.length, bArrB);
        z22VarC.i();
        ((a32) z22VarC.f4126t).zzd = e42VarS;
        return oy1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((a32) z22VarC.g()).g(), 2, tw1.b(uv1Var.f9638u.f10720a), uv1Var.f9641x);
    }

    @Override // com.google.android.gms.internal.ads.ng2
    public int zza(Object obj) {
        HashMap map = pg2.f8070a;
        String str = ((zf2) obj).f11282a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (j31.f5914a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
