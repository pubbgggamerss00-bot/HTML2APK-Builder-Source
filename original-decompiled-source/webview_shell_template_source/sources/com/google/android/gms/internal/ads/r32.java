package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r32 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8536a;

    public r32(int i6, byte[] bArr) {
        byte[] bArr2 = new byte[i6];
        this.f8536a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i6);
    }

    public static r32 a(byte[] bArr) {
        if (bArr != null) {
            return new r32(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] b() {
        byte[] bArr = this.f8536a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r32) {
            return Arrays.equals(((r32) obj).f8536a, this.f8536a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8536a);
    }

    public final String toString() {
        byte[] bArr = this.f8536a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b7 : bArr) {
            sb.append("0123456789abcdef".charAt((b7 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b7 & 15));
        }
        return androidx.camera.camera2.internal.v0.b("Bytes(", sb.toString(), ")");
    }
}
