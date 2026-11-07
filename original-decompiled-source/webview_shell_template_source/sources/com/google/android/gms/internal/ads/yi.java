package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yi extends q72 {

    /* renamed from: u, reason: collision with root package name */
    public MessageDigest f10993u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10994v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10995w;

    public yi(int i6) {
        super(2);
        int i7 = i6 >> 3;
        this.f10994v = (i6 & 7) > 0 ? i7 + 1 : i7;
        this.f10995w = i6;
    }

    public final byte[] A(String str) {
        synchronized (this.s) {
            try {
                MessageDigest messageDigestB = b();
                this.f10993u = messageDigestB;
                if (messageDigestB == null) {
                    return new byte[0];
                }
                messageDigestB.reset();
                this.f10993u.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f10993u.digest();
                int length = bArrDigest.length;
                int i6 = this.f10994v;
                if (length > i6) {
                    length = i6;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f10995w & 7) > 0) {
                    long j6 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        if (i7 > 0) {
                            j6 <<= 8;
                        }
                        j6 += bArr[i7] & 255;
                    }
                    long j7 = j6 >>> (8 - (this.f10995w & 7));
                    int i8 = this.f10994v;
                    while (true) {
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                        bArr[i8] = (byte) (255 & j7);
                        j7 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
