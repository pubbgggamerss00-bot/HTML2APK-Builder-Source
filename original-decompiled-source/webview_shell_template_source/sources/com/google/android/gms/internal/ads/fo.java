package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.security.GeneralSecurityException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public class fo implements hx, ix, zzq, om0, OnUserEarnedRewardListener, sa1, em1, fy1, ax1, dx1, cy1, zx1 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f4734t = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4735u = {44100, 48000, 32000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f4736v = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f4737w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f4738x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4739y = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4740z = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final ei A = new ei(0);
    public static final ei B = new ei(2);
    public static final ei C = new ei(3);
    public static final ei D = new ei(5);
    public static final ei E = new ei(6);
    public static final byte[] F = new byte[0];

    public /* synthetic */ fo(int i6) {
        this.s = i6;
    }

    public static void d(oo ooVar, ko koVar, String... strArr) {
        if (koVar == null) {
            return;
        }
        ooVar.c(koVar, zzv.zzC().b(), strArr);
    }

    public static int e(int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i6 & (-2097152)) != -2097152 || (i7 = (i6 >>> 19) & 3) == 1 || (i8 = (i6 >>> 17) & 3) == 0 || (i9 = (i6 >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i6 >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = i9 - 1;
        int i12 = f4735u[i10];
        if (i7 == 2) {
            i12 /= 2;
        } else if (i7 == 0) {
            i12 /= 4;
        }
        int i13 = (i6 >>> 9) & 1;
        if (i8 == 3) {
            return ((((i7 == 3 ? f4736v[i11] : f4737w[i11]) * 12) / i12) + i13) * 4;
        }
        int i14 = i7 == 3 ? i8 == 2 ? f4738x[i11] : f4739y[i11] : f4740z[i11];
        if (i7 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i8 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static void i(mw mwVar, String str, JSONObject jSONObject) {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzo.zze("Dispatching AFMA event: ".concat(sbA.toString()));
        mwVar.zza(sbA.toString());
    }

    @Override // com.google.android.gms.internal.ads.ix
    public /* bridge */ /* synthetic */ JSONObject a(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public oy1 b(ih1 ih1Var) {
        switch (this.s) {
            case 25:
                hu1 hu1Var = (hu1) ih1Var;
                v02 v02VarC = w02.C();
                mu1 mu1Var = hu1Var.f5492u;
                a12 a12VarC = b12.C();
                int i6 = mu1Var.f7223b;
                a12VarC.i();
                ((b12) a12VarC.f4126t).zzc = i6;
                b12 b12Var = (b12) a12VarC.g();
                v02VarC.i();
                w02.I((w02) v02VarC.f4126t, b12Var);
                byte[] bArrB = ((r32) hu1Var.f5493v.f10619t).b();
                e42 e42VarS = g42.s(0, bArrB.length, bArrB);
                v02VarC.i();
                ((w02) v02VarC.f4126t).zzf = e42VarS;
                return oy1.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((w02) v02VarC.g()).g(), 2, aw1.b(hu1Var.f5492u.f7224c), hu1Var.f5495x);
            default:
                av1 av1Var = (av1) ih1Var;
                k12 k12VarC = l12.C();
                byte[] bArrB2 = ((r32) av1Var.f2858v.f10619t).b();
                e42 e42VarS2 = g42.s(0, bArrB2.length, bArrB2);
                k12VarC.i();
                ((l12) k12VarC.f4126t).zzd = e42VarS2;
                return oy1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((l12) k12VarC.g()).g(), 2, hw1.b(av1Var.f2857u.f3674a), av1Var.f2860x);
        }
    }

    @Override // com.google.android.gms.internal.ads.hx
    public Object c(JSONObject jSONObject) {
        switch (this.s) {
            case 10:
                return jSONObject;
            default:
                return new t30(jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        zu1 zu1Var = (zu1) lt1Var;
        w12 w12VarB = x12.B();
        w12VarB.k("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        i12 i12VarD = j12.D();
        int i6 = zu1Var.f11583a;
        i12VarD.i();
        ((j12) i12VarD.f4126t).zzc = i6;
        w12VarB.l(((j12) i12VarD.g()).g());
        w12VarB.j(ew1.b(zu1Var.f11584b));
        return py1.a((x12) w12VarB.g());
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            g42 g42Var = oy1Var.f7887c;
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            j22 j22VarD = j22.D(g42Var, u42.f9459c);
            if (j22VarD.B() == 0) {
                return iv1.m(new kv1(j22VarD.E().E(), lv1.a(oy1Var.f7889e)), oy1Var.f7890f);
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(j22VarD)));
        } catch (u52 e6) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        x12 x12Var = py1Var.f8181b;
        if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
        }
        try {
            g42 g42VarG = x12Var.G();
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            if (b32.D(g42VarG, u42.f9459c).B() == 0) {
                return new xv1(tw1.a(x12Var.F()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (u52 e6) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 13:
                ((pk0) obj).zzf();
                break;
            case 14:
                ((vl0) obj).zza();
                break;
            case 15:
                ((fm0) obj).zzj();
                break;
            case 16:
                ((mu) obj).zzc();
                break;
            case 17:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
            default:
                ((oj) obj).zzf();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return -1;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i6 = fc0.s;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (iInterfaceQueryLocalInterface instanceof gc0) {
            return (gc0) iInterfaceQueryLocalInterface;
        }
        return new ec0(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.s) {
            case 23:
                oy1 oy1Var = ((hx1) ih1Var).f5513u;
                int[] iArr = gx1.f5186b;
                int i6 = oy1Var.f7888d;
                Integer num = oy1Var.f7890f;
                int i7 = iArr[s1.b.a(i6)];
                u12 u12VarB = v12.B();
                String str = oy1Var.f7885a;
                u12VarB.i();
                v12.H((v12) u12VarB.f4126t, str);
                g42 g42Var = oy1Var.f7887c;
                u12VarB.i();
                v12.I((v12) u12VarB.f4126t, g42Var);
                int i8 = oy1Var.f7888d;
                u12VarB.i();
                v12.G((v12) u12VarB.f4126t, i8);
                ys1 ys1Var = (ys1) ot1.a((v12) u12VarB.g(), ys1.class);
                q22 q22Var = oy1Var.f7889e;
                int iOrdinal = q22Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = xx1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = xx1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    bArrB = xx1.f10742a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(q22Var)));
                    }
                    bArrB = xx1.a(num.intValue()).b();
                }
                return new pw1(ys1Var, bArrB);
            default:
                return new p32((lz1) ih1Var);
        }
    }
}
