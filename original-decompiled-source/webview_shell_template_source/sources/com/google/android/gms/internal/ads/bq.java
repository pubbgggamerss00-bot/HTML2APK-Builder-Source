package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bq implements q6, q70, a1, om0, jo0, sa1 {
    public static UiModeManager H;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final ep f3244t = new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gads:pan:experiment_id");

    /* renamed from: u, reason: collision with root package name */
    public static final zg0 f3245u = new zg0();

    /* renamed from: v, reason: collision with root package name */
    public static final zc0 f3246v = new zc0(1);

    /* renamed from: w, reason: collision with root package name */
    public static final zc0 f3247w = new zc0(3);

    /* renamed from: x, reason: collision with root package name */
    public static final zc0 f3248x = new zc0(4);

    /* renamed from: y, reason: collision with root package name */
    public static final zc0 f3249y = new zc0(5);

    /* renamed from: z, reason: collision with root package name */
    public static final zc0 f3250z = new zc0(6);
    public static final zc0 A = new zc0(8);
    public static final zc0 B = new zc0(9);
    public static final zc0 C = new zc0(10);
    public static final bg1 D = new bg1();
    public static final byte[] E = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] F = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    public static final String[] G = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public bq(int i6) {
        this.s = 28;
    }

    public static int e(int i6) {
        switch (i6) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static void f(AtomicReference atomicReference, sa1 sa1Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            sa1Var.mo6zza(obj);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public static boolean g(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrA = wa.a(file.getAbsolutePath());
            if (x509CertificateArrA.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
            return Arrays.equals(E, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(F, bArrDigest));
        } catch (ua e6) {
            throw new GeneralSecurityException("Package is not signed", e6);
        } catch (IOException | RuntimeException e7) {
            throw new GeneralSecurityException("Failed to verify signatures", e7);
        }
    }

    public static ni0 h(ex0 ex0Var) {
        ex0Var.k(1);
        int iX = ex0Var.x();
        long j6 = ex0Var.f4417b;
        long j7 = iX;
        int i6 = iX / 18;
        long[] jArrCopyOf = new long[i6];
        long[] jArrCopyOf2 = new long[i6];
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            long jC = ex0Var.C();
            if (jC == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                break;
            }
            jArrCopyOf[i7] = jC;
            jArrCopyOf2[i7] = ex0Var.C();
            ex0Var.k(2);
            i7++;
        }
        ex0Var.k((int) ((j6 + j7) - ex0Var.f4417b));
        return new ni0(1, jArrCopyOf, jArrCopyOf2);
    }

    public static final Set i(ku0 ku0Var, Executor executor) {
        return ((Boolean) tp.f9357a.c()).booleanValue() ? Collections.singleton(new kn0(ku0Var, executor)) : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public long a(y0 y0Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.a1
    public x0[] d(Uri uri, Map map) {
        int i6 = ja0.O;
        return new x0[]{new c6(), new z4(), new x5(z6.f11190i, 32, cp1.f3636w)};
    }

    @Override // com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
    }

    @Override // com.google.android.gms.internal.ads.q6
    public m1 zze() {
        return new l1(-9223372036854775807L, 0L);
    }

    public /* synthetic */ bq(int i6, byte b7) {
        this.s = i6;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 19:
                ((al0) obj).zzr();
                break;
            case 20:
                ((pk0) obj).zzb();
                break;
            case dn.zzm /* 21 */:
                ((zzr) obj).zzdp();
                break;
            case 22:
                ((bn0) obj).zzf();
                break;
            case 23:
                ((dn0) obj).zzk();
                break;
            default:
                ((zzbl) obj).zzd();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.q6
    public void b(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public void c(boolean z6, Context context, vk0 vk0Var) {
    }
}
