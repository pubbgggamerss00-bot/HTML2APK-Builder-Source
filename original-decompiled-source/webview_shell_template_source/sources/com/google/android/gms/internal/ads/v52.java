package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v52 extends InputStream {
    public long A;
    public Iterator s;

    /* renamed from: t, reason: collision with root package name */
    public ByteBuffer f9712t;

    /* renamed from: u, reason: collision with root package name */
    public int f9713u;

    /* renamed from: v, reason: collision with root package name */
    public int f9714v;

    /* renamed from: w, reason: collision with root package name */
    public int f9715w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9716x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f9717y;

    /* renamed from: z, reason: collision with root package name */
    public int f9718z;

    public final void a(int i6) {
        int i7 = this.f9715w + i6;
        this.f9715w = i7;
        if (i7 == this.f9712t.limit()) {
            b();
        }
    }

    public final boolean b() {
        this.f9714v++;
        Iterator it = this.s;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f9712t = byteBuffer;
        this.f9715w = byteBuffer.position();
        if (this.f9712t.hasArray()) {
            this.f9716x = true;
            this.f9717y = this.f9712t.array();
            this.f9718z = this.f9712t.arrayOffset();
        } else {
            this.f9716x = false;
            this.A = r72.g(this.f9712t);
            this.f9717y = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9714v == this.f9713u) {
            return -1;
        }
        if (this.f9716x) {
            int i6 = this.f9717y[this.f9715w + this.f9718z] & 255;
            a(1);
            return i6;
        }
        int iA = r72.f8574c.a(this.f9715w + this.A) & 255;
        a(1);
        return iA;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        if (this.f9714v == this.f9713u) {
            return -1;
        }
        int iLimit = this.f9712t.limit();
        int i8 = this.f9715w;
        int i9 = iLimit - i8;
        if (i7 > i9) {
            i7 = i9;
        }
        if (this.f9716x) {
            System.arraycopy(this.f9717y, i8 + this.f9718z, bArr, i6, i7);
            a(i7);
            return i7;
        }
        int iPosition = this.f9712t.position();
        this.f9712t.position(this.f9715w);
        this.f9712t.get(bArr, i6, i7);
        this.f9712t.position(iPosition);
        a(i7);
        return i7;
    }
}
