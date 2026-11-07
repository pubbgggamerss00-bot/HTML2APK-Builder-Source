package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f0 implements em1, z0, q1, zzbd, q70, om0, OnUserEarnedRewardListener, sa1 {

    /* renamed from: v, reason: collision with root package name */
    public static Cipher f4434v;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f4432t = {2002, 2000, 1920, 1601, 1600, 1001, CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4433u = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: w, reason: collision with root package name */
    public static final Object f4435w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f4436x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final mc0 f4437y = new mc0(2);

    /* renamed from: z, reason: collision with root package name */
    public static final mc0 f4438z = new mc0(6);

    public /* synthetic */ f0(int i6) {
        this.s = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e0 c(l42 l42Var) {
        int i6;
        int i7;
        int iW = l42Var.w(16);
        int iW2 = l42Var.w(16);
        if (iW2 == 65535) {
            iW2 = l42Var.w(24);
            i6 = 7;
        } else {
            i6 = 4;
        }
        int i8 = iW2 + i6;
        if (iW == 44097) {
            i8 += 2;
        }
        if (l42Var.w(2) == 3) {
            do {
                l42Var.w(2);
            } while (l42Var.G());
        }
        int iW3 = l42Var.w(10);
        if (l42Var.G() && l42Var.w(3) > 0) {
            l42Var.D(2);
        }
        int i9 = true != l42Var.G() ? 44100 : 48000;
        int iW4 = l42Var.w(4);
        int[] iArr = f4432t;
        if (i9 == 44100 && iW4 == 13) {
            i7 = iArr[13];
        } else if (i9 != 48000 || iW4 >= 14) {
            i7 = 0;
        } else {
            int i10 = iArr[iW4];
            int i11 = iW3 % 5;
            if (i11 == 1) {
                i7 = (iW4 == 3 || iW4 == 8) ? i10 + 1 : i10;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && (iW4 == 3 || iW4 == 8 || iW4 == 11)) {
                    }
                }
            } else if (iW4 == 8 || iW4 == 11) {
            }
        }
        return new e0(i9, i8, i7);
    }

    public static b8 e(b8 b8Var, String[] strArr, Map map) {
        int length;
        int i6 = 0;
        if (b8Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (b8) map.get(strArr[0]);
            }
            if (length2 > 1) {
                b8 b8Var2 = new b8();
                while (i6 < length2) {
                    b8Var2.b((b8) map.get(strArr[i6]));
                    i6++;
                }
                return b8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                b8Var.b((b8) map.get(strArr[0]));
                return b8Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i6 < length) {
                    b8Var.b((b8) map.get(strArr[i6]));
                    i6++;
                }
            }
        }
        return b8Var;
    }

    public static String h(byte[] bArr, byte[] bArr2) throws tf {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4435w) {
                n().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = n().doFinal(bArr2);
                iv = n().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e6) {
            throw new tf(e6);
        } catch (NoSuchAlgorithmException e7) {
            throw new tf(e7);
        } catch (BadPaddingException e8) {
            throw new tf(e8);
        } catch (IllegalBlockSizeException e9) {
            throw new tf(e9);
        } catch (NoSuchPaddingException e10) {
            throw new tf(e10);
        }
    }

    public static void i(long j6, ex0 ex0Var, s1[] s1VarArr) {
        int i6;
        int iQ;
        while (true) {
            if (ex0Var.o() <= 1) {
                return;
            }
            int i7 = 0;
            while (true) {
                if (ex0Var.o() == 0) {
                    i6 = -1;
                    break;
                }
                int iV = ex0Var.v();
                i7 += iV;
                if (iV != 255) {
                    i6 = i7;
                    break;
                }
            }
            int i8 = 0;
            while (true) {
                if (ex0Var.o() == 0) {
                    i8 = -1;
                    break;
                }
                int iV2 = ex0Var.v();
                i8 += iV2;
                if (iV2 != 255) {
                    break;
                }
            }
            int i9 = ex0Var.f4417b + i8;
            if (i8 == -1 || i8 > ex0Var.o()) {
                qs0.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i9 = ex0Var.f4418c;
            } else if (i6 == 4 && i8 >= 8) {
                int iV3 = ex0Var.v();
                int iZ = ex0Var.z();
                if (iZ == 49) {
                    iQ = ex0Var.q();
                    iZ = 49;
                } else {
                    iQ = 0;
                }
                int iV4 = ex0Var.v();
                if (iZ == 47) {
                    ex0Var.k(1);
                    iZ = 47;
                }
                boolean z6 = iV3 == 181 && (iZ == 49 || iZ == 47) && iV4 == 3;
                if (iZ == 49) {
                    z6 &= iQ == 1195456820;
                }
                if (z6) {
                    k(j6, ex0Var, s1VarArr);
                }
            }
            ex0Var.j(i9);
        }
    }

    public static void j(int i6, ex0 ex0Var) {
        ex0Var.g(7);
        byte[] bArr = ex0Var.f4416a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i6 >> 16) & 255);
        bArr[5] = (byte) ((i6 >> 8) & 255);
        bArr[6] = (byte) (i6 & 255);
    }

    public static void k(long j6, ex0 ex0Var, s1[] s1VarArr) {
        int iV = ex0Var.v();
        if ((iV & 64) != 0) {
            int i6 = iV & 31;
            ex0Var.k(1);
            int i7 = ex0Var.f4417b;
            for (s1 s1Var : s1VarArr) {
                int i8 = i6 * 3;
                ex0Var.j(i7);
                s1Var.e(i8, ex0Var);
                y5.r(j6 != -9223372036854775807L);
                s1Var.a(j6, 1, i8, 0, null);
            }
        }
    }

    public static byte[] l(String str, byte[] bArr) throws tf {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new tf();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4435w) {
                n().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = n().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e6) {
            throw new tf(e6);
        } catch (InvalidAlgorithmParameterException e7) {
            throw new tf(e7);
        } catch (InvalidKeyException e8) {
            throw new tf(e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new tf(e9);
        } catch (BadPaddingException e10) {
            throw new tf(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new tf(e11);
        } catch (NoSuchPaddingException e12) {
            throw new tf(e12);
        }
    }

    public static q1 m(y0 y0Var, boolean z6, boolean z7) {
        q1 q1Var;
        long j6;
        ex0 ex0Var;
        int i6;
        int i7;
        int[] iArr;
        long jZzd = y0Var.zzd();
        long j7 = -1;
        long j8 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j8 = jZzd;
        }
        ex0 ex0Var2 = new ex0(64);
        int i8 = (int) j8;
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        while (i10 < i8) {
            ex0Var2.g(8);
            boolean z9 = true;
            if (!y0Var.g(ex0Var2.f4416a, i9, 8, true)) {
                break;
            }
            long jD = ex0Var2.D();
            int iQ = ex0Var2.q();
            if (jD == 1) {
                j6 = j7;
                y0Var.h(8, 8, ex0Var2.f4416a);
                i6 = 16;
                ex0Var2.i(16);
                jD = ex0Var2.C();
                ex0Var = ex0Var2;
            } else {
                j6 = j7;
                if (jD == 0) {
                    long jZzd2 = y0Var.zzd();
                    if (jZzd2 != j6) {
                        jD = (jZzd2 - y0Var.zze()) + 8;
                    }
                }
                ex0Var = ex0Var2;
                i6 = 8;
            }
            long j9 = jD;
            q1Var = null;
            long j10 = i6;
            if (j9 < j10) {
                return new f0(9);
            }
            i10 += i6;
            if (iQ == 1836019574) {
                i8 += (int) j9;
                if (jZzd != -1 && i8 > jZzd) {
                    i8 = (int) jZzd;
                }
                ex0Var2 = ex0Var;
                j7 = j6;
                i9 = 0;
            } else {
                if (iQ == 1836019558 || iQ == 1836475768) {
                    i9 = 1;
                    break;
                }
                z8 |= !(iQ != 1835295092);
                long j11 = jZzd;
                if ((i10 + j9) - j10 >= i8) {
                    i9 = 0;
                    break;
                }
                int i11 = (int) (j9 - j10);
                i10 += i11;
                if (iQ != 1718909296) {
                    i7 = 0;
                    if (i11 != 0) {
                        y0Var.a(i11);
                    }
                } else {
                    if (i11 < 8) {
                        return new f0(9);
                    }
                    ex0Var.g(i11);
                    i7 = 0;
                    y0Var.h(0, i11, ex0Var.f4416a);
                    boolean zO = o(ex0Var.q(), z7) | z8;
                    ex0Var.k(4);
                    int iO = ex0Var.o() / 4;
                    if (!zO && iO > 0) {
                        iArr = new int[iO];
                        int i12 = 0;
                        while (true) {
                            if (i12 >= iO) {
                                z9 = zO;
                                break;
                            }
                            int iQ2 = ex0Var.q();
                            iArr[i12] = iQ2;
                            if (o(iQ2, z7)) {
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z9 = zO;
                        iArr = null;
                    }
                    if (!z9) {
                        ed0 ed0Var = new ed0(11);
                        if (iArr != null) {
                            int length = Arrays.copyOf(iArr, iArr.length).length;
                        }
                        return ed0Var;
                    }
                    z8 = z9;
                }
                i9 = i7;
                ex0Var2 = ex0Var;
                j7 = j6;
                jZzd = j11;
            }
        }
        q1Var = null;
        return !z8 ? d0.f3707z : z6 != i9 ? i9 != 0 ? y5.f10852t : y5.f10853u : q1Var;
    }

    public static final Cipher n() {
        Cipher cipher;
        synchronized (f4436x) {
            try {
                if (f4434v == null) {
                    f4434v = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f4434v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public static boolean o(int i6, boolean z6) {
        if ((i6 >>> 8) == 3368816) {
            return true;
        }
        if (i6 == 1751476579) {
            if (z6) {
                return true;
            }
            i6 = 1751476579;
        }
        for (int i7 = 0; i7 < 29; i7++) {
            if (f4433u[i7] == i6) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z0
    public void d() {
        switch (this.s) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.z0
    public void f(m1 m1Var) {
        switch (this.s) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.z0
    public s1 g(int i6, int i7) {
        switch (this.s) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return new t0();
        }
    }

    @Override // com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
    }

    public f0(bq bqVar) {
        this.s = 11;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 16:
                ((xk0) obj).e(tc1.d(11, null, null));
                break;
            case 17:
                ((pk0) obj).zze();
                break;
            case 18:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            case 19:
                ((zzr) obj).zzdo();
                break;
            case 20:
                ((vl0) obj).zzb();
                break;
            case dn.zzm /* 21 */:
                ((gn0) obj).zza();
                break;
            case 22:
                ((on0) obj).zzu();
                break;
            case 23:
                ((mu) obj).zzb();
                break;
            case 24:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                break;
            case 25:
            case 26:
            case 27:
            default:
                ((u40) obj).zzf();
                break;
            case 28:
                ((zzr) obj).zzdo();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        int i6 = e.f4063a;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
            if (objInvoke != null) {
                return (m70) objInvoke;
            }
            throw null;
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    private final void a() {
    }

    private final void b(m1 m1Var) {
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
    }
}
