package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gc extends FilterInputStream {
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public long f4993t;

    public gc(BufferedInputStream bufferedInputStream, long j6) {
        super(bufferedInputStream);
        this.s = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i6 = super.read();
        if (i6 != -1) {
            this.f4993t++;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = super.read(bArr, i6, i7);
        if (i8 != -1) {
            this.f4993t += i8;
        }
        return i8;
    }
}
