package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y5 implements q1, zr1, z, j0, q0, r70, zzq, om0 {

    /* renamed from: t, reason: collision with root package name */
    public static final y5 f10852t;

    /* renamed from: u, reason: collision with root package name */
    public static final y5 f10853u;
    public final /* synthetic */ int s;

    /* renamed from: v, reason: collision with root package name */
    public static final ep f10854v = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:afs:csa:experiment_id");

    /* renamed from: w, reason: collision with root package name */
    public static final ep f10855w = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:app_index:experiment_id");

    /* renamed from: x, reason: collision with root package name */
    public static final ep f10856x = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:block_autoclicks_experiment_id");

    /* renamed from: y, reason: collision with root package name */
    public static final ep f10857y = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:sdk_core_experiment_id");

    /* renamed from: z, reason: collision with root package name */
    public static final ep f10858z = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:spam_app_context:experiment_id");
    public static final ep A = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:1");
    public static final ep B = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:10");
    public static final ep C = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:11");
    public static final ep D = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:12");
    public static final ep E = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:13");
    public static final ep F = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:14");
    public static final ep G = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:15");
    public static final ep H = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:2");
    public static final ep I = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:3");
    public static final ep J = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:4");
    public static final ep K = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:5");
    public static final ep L = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:6");
    public static final ep M = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:7");
    public static final ep N = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:8");
    public static final ep O = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:temporary_experiment_id:9");
    public static final ep P = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:corewebview:experiment_id");
    public static final zh0 Q = new zh0();
    public static final oe0 R = new oe0(1);
    public static final oe0 S = new oe0(3);
    public static final oe0 T = new oe0(4);
    public static final oe0 U = new oe0(5);
    public static final oe0 V = new oe0(6);
    public static final oe0 W = new oe0(8);
    public static final oe0 X = new oe0(9);
    public static final y5 Y = new y5(11);

    static {
        int i6 = 0;
        f10852t = new y5(i6);
        f10853u = new y5(i6);
    }

    public /* synthetic */ y5(int i6) {
        this.s = i6;
    }

    public static double b(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static int d(int i6, ex0 ex0Var) {
        switch (i6) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i6 - 2);
            case 6:
                return ex0Var.v() + 1;
            case 7:
                return ex0Var.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i6 - 8);
            default:
                return -1;
        }
    }

    public static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            if (xmlPullParser.getAttributeName(i6).equals(str)) {
                return xmlPullParser.getAttributeValue(i6);
            }
        }
        return null;
    }

    public static void f(int i6, int i7) {
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(c5.a aVar, String str) {
        dt1 dt1Var = new dt1(str, 2);
        aVar.addListener(new as1(0, aVar, dt1Var), i70.f5592g);
    }

    public static double h(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static boolean l(ex0 ex0Var, d1 d1Var, int i6, b1 b1Var) {
        long jD = ex0Var.D();
        long j6 = jD >>> 16;
        if (j6 != i6) {
            return false;
        }
        boolean z6 = (j6 & 1) == 1;
        long j7 = jD >> 12;
        long j8 = jD >> 8;
        long j9 = jD >> 4;
        long j10 = jD >> 1;
        long j11 = jD & 1;
        int i7 = (int) (j9 & 15);
        if (i7 <= 7) {
            if (i7 != d1Var.f3715g - 1) {
                return false;
            }
        } else if (i7 > 10 || d1Var.f3715g != 2) {
            return false;
        }
        int i8 = (int) (j10 & 7);
        if (!(i8 == 0 || i8 == d1Var.f3716i) || j11 == 1) {
            return false;
        }
        try {
            long jF = ex0Var.F();
            if (!z6) {
                jF *= d1Var.f3710b;
            }
            b1Var.f2886a = jF;
            int iD = d((int) (j7 & 15), ex0Var);
            if (iD == -1 || iD > d1Var.f3710b) {
                return false;
            }
            int i9 = d1Var.f3713e;
            int i10 = (int) (j8 & 15);
            if (i10 != 0) {
                if (i10 <= 11) {
                    if (i10 != d1Var.f3714f) {
                        return false;
                    }
                } else if (i10 != 12) {
                    if (i10 > 14) {
                        return false;
                    }
                    int iZ = ex0Var.z();
                    if (i10 == 14) {
                        iZ *= 10;
                    }
                    if (iZ != i9) {
                        return false;
                    }
                } else if (ex0Var.v() * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL != i9) {
                    return false;
                }
            }
            int iV = ex0Var.v();
            int i11 = ex0Var.f4417b;
            byte[] bArr = ex0Var.f4416a;
            int i12 = i11 - 1;
            int i13 = 0;
            for (int i14 = ex0Var.f4417b; i14 < i12; i14++) {
                i13 = j31.f5925m[i13 ^ (bArr[i14] & 255)];
            }
            int i15 = j31.f5914a;
            return iV == i13;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void n(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static long o(ByteBuffer byteBuffer) {
        long j6 = byteBuffer.getInt();
        return j6 < 0 ? j6 + 4294967296L : j6;
    }

    public static void p(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static long q(ByteBuffer byteBuffer) {
        long jO = o(byteBuffer) << 32;
        if (jO >= 0) {
            return o(byteBuffer) + jO;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void r(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* synthetic */ void mo2a(@NullableDecl Object obj) {
        zze.zza("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.z
    /* renamed from: zza */
    public void mo8zza() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof v40 ? (v40) iInterfaceQueryLocalInterface : new v40(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.q0
    public Constructor zza() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(x0.class).getConstructor(null);
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 18:
                zze.zza("Ending javascript session.");
                ex exVar = (ex) ((dx) obj);
                HashSet hashSet = exVar.f4412t;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((yt) simpleEntry.getValue()).toString())));
                    exVar.s.Q((String) simpleEntry.getKey(), (yt) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 19:
            case 20:
            case dn.zzm /* 21 */:
            default:
                qn0 qn0Var = (qn0) obj;
                if (!qn0Var.f8423d) {
                    qn0Var.f8421b.b(qn0Var.f8420a, qn0Var.f8422c);
                    qn0Var.f8423d = true;
                    break;
                }
                break;
            case 22:
                ((pk0) obj).zza();
                break;
            case 23:
                ((jl0) obj).t();
                break;
            case 24:
                ((dm0) obj).zza();
                break;
            case 25:
                ((bn0) obj).zza("MalformedJson");
                break;
            case 26:
                ((dn0) obj).zzl();
                break;
            case 27:
                ((jn0) obj).zzt();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.z
    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.j0
    public long c(long j6) {
        return j6;
    }
}
