package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f42 extends OutputStream {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f4469x = new byte[0];

    /* renamed from: u, reason: collision with root package name */
    public int f4471u;

    /* renamed from: w, reason: collision with root package name */
    public int f4473w;
    public final int s = 128;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f4470t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public byte[] f4472v = new byte[128];

    public final synchronized g42 a() {
        try {
            int i6 = this.f4473w;
            byte[] bArr = this.f4472v;
            if (i6 >= bArr.length) {
                this.f4470t.add(new e42(this.f4472v));
                this.f4472v = f4469x;
            } else if (i6 > 0) {
                this.f4470t.add(new e42(Arrays.copyOf(bArr, i6)));
            }
            this.f4471u += this.f4473w;
            this.f4473w = 0;
        } catch (Throwable th) {
            throw th;
        }
        return g42.r(this.f4470t);
    }

    public final void b(int i6) {
        this.f4470t.add(new e42(this.f4472v));
        int length = this.f4471u + this.f4472v.length;
        this.f4471u = length;
        this.f4472v = new byte[Math.max(this.s, Math.max(i6, length >>> 1))];
        this.f4473w = 0;
    }

    public final String toString() {
        int i6;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i6 = this.f4471u + this.f4473w;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i6));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i6) {
        try {
            if (this.f4473w == this.f4472v.length) {
                b(1);
            }
            byte[] bArr = this.f4472v;
            int i7 = this.f4473w;
            this.f4473w = i7 + 1;
            bArr[i7] = (byte) i6;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i6, int i7) {
        byte[] bArr2 = this.f4472v;
        int length = bArr2.length;
        int i8 = this.f4473w;
        int i9 = length - i8;
        if (i7 <= i9) {
            System.arraycopy(bArr, i6, bArr2, i8, i7);
            this.f4473w += i7;
            return;
        }
        System.arraycopy(bArr, i6, bArr2, i8, i9);
        int i10 = i7 - i9;
        b(i10);
        System.arraycopy(bArr, i6 + i9, this.f4472v, 0, i10);
        this.f4473w = i10;
    }
}
