package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class he0 implements jc0 {

    /* renamed from: b, reason: collision with root package name */
    public int f5352b;

    /* renamed from: c, reason: collision with root package name */
    public float f5353c;

    /* renamed from: d, reason: collision with root package name */
    public float f5354d;

    /* renamed from: e, reason: collision with root package name */
    public za0 f5355e;

    /* renamed from: f, reason: collision with root package name */
    public za0 f5356f;

    /* renamed from: g, reason: collision with root package name */
    public za0 f5357g;
    public za0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5358i;

    /* renamed from: j, reason: collision with root package name */
    public vd0 f5359j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f5360k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f5361l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f5362m;

    /* renamed from: n, reason: collision with root package name */
    public long f5363n;

    /* renamed from: o, reason: collision with root package name */
    public long f5364o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5365p;

    @Override // com.google.android.gms.internal.ads.jc0
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            vd0 vd0Var = this.f5359j;
            vd0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f5363n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i6 = vd0Var.f9813b;
            int i7 = iRemaining2 / i6;
            int i8 = i7 * i6;
            short[] sArrF = vd0Var.f(vd0Var.f9820j, vd0Var.f9821k, i7);
            vd0Var.f9820j = sArrF;
            shortBufferAsShortBuffer.get(sArrF, vd0Var.f9821k * i6, (i8 + i8) / 2);
            vd0Var.f9821k += i7;
            vd0Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final za0 b(za0 za0Var) throws pb0 {
        if (za0Var.f11243c != 2) {
            throw new pb0(za0Var);
        }
        int i6 = this.f5352b;
        if (i6 == -1) {
            i6 = za0Var.f11241a;
        }
        this.f5355e = za0Var;
        za0 za0Var2 = new za0(i6, za0Var.f11242b, 2);
        this.f5356f = za0Var2;
        this.f5358i = true;
        return za0Var2;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final ByteBuffer zzb() {
        int i6;
        int i7;
        int i8;
        vd0 vd0Var = this.f5359j;
        if (vd0Var != null && (i8 = (i7 = vd0Var.f9823m * (i6 = vd0Var.f9813b)) + i7) > 0) {
            if (this.f5360k.capacity() < i8) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
                this.f5360k = byteBufferOrder;
                this.f5361l = byteBufferOrder.asShortBuffer();
            } else {
                this.f5360k.clear();
                this.f5361l.clear();
            }
            ShortBuffer shortBuffer = this.f5361l;
            int iMin = Math.min(shortBuffer.remaining() / i6, vd0Var.f9823m);
            int i9 = iMin * i6;
            shortBuffer.put(vd0Var.f9822l, 0, i9);
            int i10 = vd0Var.f9823m - iMin;
            vd0Var.f9823m = i10;
            short[] sArr = vd0Var.f9822l;
            System.arraycopy(sArr, i9, sArr, 0, i10 * i6);
            this.f5364o += i8;
            this.f5360k.limit(i8);
            this.f5362m = this.f5360k;
        }
        ByteBuffer byteBuffer = this.f5362m;
        this.f5362m = jc0.f6021a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzc() {
        if (zzg()) {
            za0 za0Var = this.f5355e;
            this.f5357g = za0Var;
            za0 za0Var2 = this.f5356f;
            this.h = za0Var2;
            if (this.f5358i) {
                this.f5359j = new vd0(za0Var.f11241a, za0Var.f11242b, this.f5353c, this.f5354d, za0Var2.f11241a);
            } else {
                vd0 vd0Var = this.f5359j;
                if (vd0Var != null) {
                    vd0Var.f9821k = 0;
                    vd0Var.f9823m = 0;
                    vd0Var.f9825o = 0;
                    vd0Var.f9826p = 0;
                    vd0Var.f9827q = 0;
                    vd0Var.f9828r = 0;
                    vd0Var.s = 0;
                    vd0Var.f9829t = 0;
                    vd0Var.f9830u = 0;
                    vd0Var.f9831v = 0;
                    vd0Var.f9832w = 0.0d;
                }
            }
        }
        this.f5362m = jc0.f6021a;
        this.f5363n = 0L;
        this.f5364o = 0L;
        this.f5365p = false;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzd() {
        vd0 vd0Var = this.f5359j;
        if (vd0Var != null) {
            int i6 = vd0Var.f9821k;
            int i7 = vd0Var.f9828r;
            int i8 = vd0Var.f9823m;
            float f6 = vd0Var.f9814c;
            float f7 = vd0Var.f9815d;
            int i9 = i8 + ((int) (((((((i6 - i7) / (f6 / f7)) + i7) + vd0Var.f9832w) + vd0Var.f9825o) / (vd0Var.f9816e * f7)) + 0.5d));
            vd0Var.f9832w = 0.0d;
            int i10 = vd0Var.h;
            int i11 = i10 + i10;
            vd0Var.f9820j = vd0Var.f(vd0Var.f9820j, i6, i11 + i6);
            int i12 = 0;
            while (true) {
                int i13 = vd0Var.f9813b;
                if (i12 >= i11 * i13) {
                    break;
                }
                vd0Var.f9820j[(i13 * i6) + i12] = 0;
                i12++;
            }
            vd0Var.f9821k += i11;
            vd0Var.e();
            if (vd0Var.f9823m > i9) {
                vd0Var.f9823m = i9;
            }
            vd0Var.f9821k = 0;
            vd0Var.f9828r = 0;
            vd0Var.f9825o = 0;
        }
        this.f5365p = true;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzf() {
        this.f5353c = 1.0f;
        this.f5354d = 1.0f;
        za0 za0Var = za0.f11240e;
        this.f5355e = za0Var;
        this.f5356f = za0Var;
        this.f5357g = za0Var;
        this.h = za0Var;
        ByteBuffer byteBuffer = jc0.f6021a;
        this.f5360k = byteBuffer;
        this.f5361l = byteBuffer.asShortBuffer();
        this.f5362m = byteBuffer;
        this.f5352b = -1;
        this.f5358i = false;
        this.f5359j = null;
        this.f5363n = 0L;
        this.f5364o = 0L;
        this.f5365p = false;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final boolean zzg() {
        if (this.f5356f.f11241a != -1) {
            return Math.abs(this.f5353c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f5354d + (-1.0f)) >= 1.0E-4f || this.f5356f.f11241a != this.f5355e.f11241a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final boolean zzh() {
        if (!this.f5365p) {
            return false;
        }
        vd0 vd0Var = this.f5359j;
        if (vd0Var == null) {
            return true;
        }
        int i6 = vd0Var.f9823m * vd0Var.f9813b;
        return i6 + i6 == 0;
    }
}
