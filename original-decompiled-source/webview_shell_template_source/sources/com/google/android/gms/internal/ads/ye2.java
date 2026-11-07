package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ye2 extends gd0 {

    /* renamed from: i, reason: collision with root package name */
    public int f10940i;

    /* renamed from: j, reason: collision with root package name */
    public int f10941j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10942k;

    /* renamed from: l, reason: collision with root package name */
    public int f10943l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f10944m;

    /* renamed from: n, reason: collision with root package name */
    public int f10945n;

    /* renamed from: o, reason: collision with root package name */
    public long f10946o;

    @Override // com.google.android.gms.internal.ads.jc0
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        if (i6 == 0) {
            return;
        }
        int iMin = Math.min(i6, this.f10943l);
        this.f10946o += iMin / this.f4994b.f11244d;
        this.f10943l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f10943l <= 0) {
            int i7 = i6 - iMin;
            int length = (this.f10945n + i7) - this.f10944m.length;
            ByteBuffer byteBufferD = d(length);
            int iMax = Math.max(0, Math.min(length, this.f10945n));
            byteBufferD.put(this.f10944m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i7));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferD.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i8 = i7 - iMax2;
            int i9 = this.f10945n - iMax;
            this.f10945n = i9;
            byte[] bArr = this.f10944m;
            System.arraycopy(bArr, iMax, bArr, 0, i9);
            byteBuffer.get(this.f10944m, this.f10945n, i8);
            this.f10945n += i8;
            byteBufferD.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final za0 c(za0 za0Var) throws pb0 {
        if (za0Var.f11243c != 2) {
            throw new pb0(za0Var);
        }
        this.f10942k = true;
        return (this.f10940i == 0 && this.f10941j == 0) ? za0.f11240e : za0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e() {
        if (this.f10942k) {
            this.f10942k = false;
            int i6 = this.f10941j;
            int i7 = this.f4994b.f11244d;
            this.f10944m = new byte[i6 * i7];
            this.f10943l = this.f10940i * i7;
        }
        this.f10945n = 0;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void f() {
        if (this.f10942k) {
            if (this.f10945n > 0) {
                this.f10946o += r0 / this.f4994b.f11244d;
            }
            this.f10945n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void g() {
        this.f10944m = j31.f5919f;
    }

    @Override // com.google.android.gms.internal.ads.gd0, com.google.android.gms.internal.ads.jc0
    public final ByteBuffer zzb() {
        int i6;
        if (super.zzh() && (i6 = this.f10945n) > 0) {
            d(i6).put(this.f10944m, 0, this.f10945n).flip();
            this.f10945n = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.gd0, com.google.android.gms.internal.ads.jc0
    public final boolean zzh() {
        return super.zzh() && this.f10945n == 0;
    }
}
