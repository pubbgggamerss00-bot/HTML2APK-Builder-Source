package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nf2 extends ja2 {

    /* renamed from: i, reason: collision with root package name */
    public long f7436i;

    /* renamed from: j, reason: collision with root package name */
    public int f7437j;

    /* renamed from: k, reason: collision with root package name */
    public int f7438k;

    @Override // com.google.android.gms.internal.ads.ja2
    public final void c() {
        super.c();
        this.f7437j = 0;
    }

    public final int h() {
        return this.f7437j;
    }

    public final boolean i(ja2 ja2Var) {
        ByteBuffer byteBuffer;
        y5.n(!ja2Var.a(1073741824));
        y5.n(!ja2Var.a(268435456));
        y5.n(!ja2Var.a(4));
        if (j()) {
            if (this.f7437j >= this.f7438k) {
                return false;
            }
            ByteBuffer byteBuffer2 = ja2Var.f6003d;
            if (byteBuffer2 != null && (byteBuffer = this.f6003d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i6 = this.f7437j;
        this.f7437j = i6 + 1;
        if (i6 == 0) {
            this.f6005f = ja2Var.f6005f;
            if (ja2Var.a(1)) {
                this.f2614a = 1;
            }
        }
        ByteBuffer byteBuffer3 = ja2Var.f6003d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.f6003d.put(byteBuffer3);
        }
        this.f7436i = ja2Var.f6005f;
        return true;
    }

    public final boolean j() {
        return this.f7437j > 0;
    }
}
