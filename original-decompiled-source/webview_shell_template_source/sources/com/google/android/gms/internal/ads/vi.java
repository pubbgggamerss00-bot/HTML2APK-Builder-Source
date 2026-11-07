package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vi extends q72 {

    /* renamed from: u, reason: collision with root package name */
    public MessageDigest f9877u;

    public final byte[] A(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i6 = 4;
        if (length == 1) {
            int iA = ui.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                    int iA2 = ui.a(strArrSplit[i7]);
                    int i8 = (iA2 >> 16) ^ ((char) iA2);
                    byte b7 = (byte) i8;
                    byte b8 = (byte) (i8 >> 8);
                    int i9 = i7 + i7;
                    bArr[i9] = new byte[]{b7, b8}[0];
                    bArr[i9 + 1] = b8;
                }
            } else {
                bArr = new byte[length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iA3 = ui.a(strArrSplit[i10]);
                    bArr[i10] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f9877u = b();
        synchronized (this.s) {
            try {
                MessageDigest messageDigest = this.f9877u;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f9877u.update(bArrArray);
                byte[] bArrDigest = this.f9877u.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i6 = length2;
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i6);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
