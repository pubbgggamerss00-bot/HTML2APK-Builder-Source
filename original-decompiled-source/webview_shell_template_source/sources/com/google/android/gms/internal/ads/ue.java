package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ue {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9539a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f9540b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9541c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f9542d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f9543e = new CountDownLatch(1);

    public static ke a(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i6 = length + 254;
            vector = new Vector();
            for (int i7 = 0; i7 < i6 / 255; i7++) {
                int i8 = i7 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i8 > 255) {
                        length2 = i8 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i8, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        ke keVarB = le.B();
        int size = vector.size();
        for (int i9 = 0; i9 < size; i9++) {
            e42 e42VarS = g42.s(0, 256, d((byte[]) vector.get(i9), str, false));
            keVarB.i();
            le.C((le) keVarB.f4126t, e42VarS);
        }
        byte[] bArrC = c(bArr);
        e42 e42Var = g42.f4896t;
        e42 e42VarS2 = g42.s(0, bArrC.length, bArrC);
        keVarB.i();
        le.D((le) keVarB.f4126t, e42VarS2);
        return keVarB;
    }

    public static void b() {
        synchronized (f9542d) {
            try {
                if (!f9539a) {
                    f9539a = true;
                    new Thread(new te()).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f9541c) {
            try {
                b();
                MessageDigest messageDigest2 = null;
                try {
                    if (f9543e.await(2L, TimeUnit.SECONDS) && (messageDigest = f9540b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f9540b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z6) {
        byte[] bArrArray;
        int length = bArr.length;
        int i6 = true != z6 ? 255 : 239;
        if (length > i6) {
            kd kdVarB0 = yd.b0();
            kdVarB0.i();
            yd.M((yd) kdVarB0.f4126t, 4096L);
            bArr = ((yd) kdVarB0.g()).i();
        }
        int i7 = i6 + 1;
        int length2 = bArr.length;
        byte b7 = (byte) length2;
        if (length2 < i6) {
            byte[] bArr2 = new byte[i6 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i7).put(b7).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i7).put(b7).put(bArr).array();
        }
        if (z6) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        bf bfVar = new bf();
        for (int i8 = 0; i8 < 12; i8++) {
            bfVar.G2[i8].e(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            l2 l2Var = new l2(str.getBytes("UTF-8"));
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 256; i11++) {
                byte[] bArr4 = (byte[]) l2Var.f6565t;
                i9 = (i9 + 1) & 255;
                byte b8 = bArr4[i9];
                i10 = (i10 + b8) & 255;
                bArr4[i9] = bArr4[i10];
                bArr4[i10] = b8;
                bArr3[i11] = (byte) (bArr4[(bArr4[i9] + b8) & 255] ^ bArr3[i11]);
            }
        }
        return bArr3;
    }
}
