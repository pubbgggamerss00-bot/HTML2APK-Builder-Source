package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class iu1 implements fy1, zx1, dx1, ax1, l32, k62, vq0, eq0 {
    public final /* synthetic */ int s;

    public /* synthetic */ iu1(int i6) {
        this.s = i6;
    }

    public static String f(g42 g42Var) {
        StringBuilder sb = new StringBuilder(g42Var.g());
        for (int i6 = 0; i6 < g42Var.g(); i6++) {
            byte bD = g42Var.d(i6);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bD);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.k62
    public i62 a(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 0:
                hu1 hu1Var = (hu1) ih1Var;
                qy1 qy1Var = e32.f4101f;
                if (aa1.j(1)) {
                    return new e32(hu1Var.f5492u.f7223b, ((r32) hu1Var.f5493v.f10619t).b(), hu1Var.f5494w.b());
                }
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            case 1:
                av1 av1Var = (av1) ih1Var;
                r32 r32Var = av1Var.f2859w;
                xj1 xj1Var = av1Var.f2858v;
                ey1 ey1Var = bv1.f3305a;
                return gw1.f5175f.get() != null ? new gw1(((r32) xj1Var.f10619t).b(), r32Var.b()) : new g32(0, ((r32) xj1Var.f10619t).b(), r32Var.b());
            case 2:
                mv1 mv1Var = (mv1) ih1Var;
                fx1 fx1Var = hv1.f5501a;
                nv1 nv1Var = mv1Var.f7225u;
                String str = nv1Var.f7524b;
                tt1 tt1Var = nv1Var.f7526d;
                ys1 ys1VarZzb = jt1.a(str).zzb();
                byte[] bArr = fv1.f4803c;
                try {
                    byte[] bArrN = rj1.n(tt1Var);
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    return new pw1(new fv1(x12.E(bArrN, u42.f9459c), ys1VarZzb), mv1Var.f7226v.b());
                } catch (u52 e6) {
                    throw new GeneralSecurityException(e6);
                }
            case 3:
                rv1 rv1Var = (rv1) ih1Var;
                return new qw1(((r32) rv1Var.f8716v.f10619t).b(), rv1Var.f8717w, rv1Var.f8715u.f9390b);
            default:
                bz1 bz1Var = (bz1) ih1Var;
                if (bz1Var.f3332u.f5191a == 32) {
                    return new p32(bz1Var);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.k62
    public boolean c(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.vq0
    public void e(Object obj, dj2 dj2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            g42 g42Var = oy1Var.f7887c;
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            a32 a32VarD = a32.D(g42Var, u42.f9459c);
            if (a32VarD.B() == 0) {
                return uv1.m(tw1.a(oy1Var.f7889e), xj1.h(a32VarD.E().c()), oy1Var.f7890f);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (u52 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 4:
                x12 x12Var = py1Var.f8181b;
                if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
                }
                try {
                    g42 g42VarG = x12Var.G();
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    o02 o02VarC = o02.C(g42VarG, u42.f9459c);
                    if (o02VarC.E().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    cu1 cu1Var = new cu1();
                    cu1Var.a(o02VarC.D().B());
                    cu1Var.b(o02VarC.E().B());
                    cu1Var.c(o02VarC.D().E().B());
                    cu1Var.d(o02VarC.E().G().B());
                    cu1Var.f3668e = yv1.a(o02VarC.E().G().C());
                    cu1Var.f3669f = yv1.b(x12Var.F());
                    return cu1Var.e();
                } catch (u52 e6) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e6);
                }
            default:
                x12 x12Var2 = py1Var.f8181b;
                if (!x12Var2.H().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var2.H())));
                }
                try {
                    g42 g42VarG2 = x12Var2.G();
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    v22 v22VarD = v22.D(g42VarG2, u42.f9459c);
                    if (v22VarD.B() == 0) {
                        return tv1.b(rw1.a(x12Var2.F()), v22VarD.E().B());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (u52 e7) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        switch (this.s) {
            case 5:
                wu1 wu1Var = (wu1) ih1Var;
                g12 g12VarC = h12.C();
                byte[] bArrB = ((r32) wu1Var.f10275v.f10619t).b();
                e42 e42VarS = g42.s(0, bArrB.length, bArrB);
                g12VarC.i();
                ((h12) g12VarC.f4126t).zzd = e42VarS;
                return oy1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((h12) g12VarC.g()).g(), 2, ew1.b(wu1Var.f10274u.f11584b), wu1Var.f10277x);
            case 9:
                bz1 bz1Var = (bz1) ih1Var;
                f02 f02VarC = g02.C();
                gz1 gz1Var = bz1Var.f3332u;
                j02 j02VarC = k02.C();
                int i6 = gz1Var.f5192b;
                j02VarC.i();
                ((k02) j02VarC.f4126t).zzc = i6;
                k02 k02Var = (k02) j02VarC.g();
                f02VarC.i();
                g02.I((g02) f02VarC.f4126t, k02Var);
                byte[] bArrB2 = ((r32) bz1Var.f3333v.f10619t).b();
                e42 e42VarS2 = g42.s(0, bArrB2.length, bArrB2);
                f02VarC.i();
                ((g02) f02VarC.f4126t).zze = e42VarS2;
                return oy1.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((g02) f02VarC.g()).g(), 2, zz1.b(bz1Var.f3332u.f5193c), bz1Var.f3335x);
            default:
                lz1 lz1Var = (lz1) ih1Var;
                o12 o12VarC = p12.C();
                qz1 qz1Var = lz1Var.f6885u;
                s12 s12VarD = t12.D();
                int i7 = qz1Var.f8489b;
                s12VarD.i();
                ((t12) s12VarD.f4126t).zzd = i7;
                n12 n12Var = (n12) c02.f3353b.a(qz1Var.f8491d);
                s12VarD.i();
                ((t12) s12VarD.f4126t).zzc = n12Var.zza();
                t12 t12Var = (t12) s12VarD.g();
                o12VarC.i();
                p12.J((p12) o12VarC.f4126t, t12Var);
                byte[] bArrB3 = ((r32) lz1Var.f6886v.f10619t).b();
                e42 e42VarS3 = g42.s(0, bArrB3.length, bArrB3);
                o12VarC.i();
                ((p12) o12VarC.f4126t).zzf = e42VarS3;
                return oy1.a("type.googleapis.com/google.crypto.tink.HmacKey", ((p12) o12VarC.g()).g(), 2, (q22) c02.f3352a.a(lz1Var.f6885u.f8490c), lz1Var.f6888x);
        }
    }
}
