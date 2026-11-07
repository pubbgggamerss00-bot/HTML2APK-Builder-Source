package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class gd0 implements jc0 {

    /* renamed from: b, reason: collision with root package name */
    public za0 f4994b;

    /* renamed from: c, reason: collision with root package name */
    public za0 f4995c;

    /* renamed from: d, reason: collision with root package name */
    public za0 f4996d;

    /* renamed from: e, reason: collision with root package name */
    public za0 f4997e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f4998f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f4999g;
    public boolean h;

    public gd0() {
        ByteBuffer byteBuffer = jc0.f6021a;
        this.f4998f = byteBuffer;
        this.f4999g = byteBuffer;
        za0 za0Var = za0.f11240e;
        this.f4996d = za0Var;
        this.f4997e = za0Var;
        this.f4994b = za0Var;
        this.f4995c = za0Var;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final za0 b(za0 za0Var) {
        this.f4996d = za0Var;
        this.f4997e = c(za0Var);
        return zzg() ? this.f4997e : za0.f11240e;
    }

    public abstract za0 c(za0 za0Var);

    public final ByteBuffer d(int i6) {
        if (this.f4998f.capacity() < i6) {
            this.f4998f = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        } else {
            this.f4998f.clear();
        }
        ByteBuffer byteBuffer = this.f4998f;
        this.f4999g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f4999g;
        this.f4999g = jc0.f6021a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzc() {
        this.f4999g = jc0.f6021a;
        this.h = false;
        this.f4994b = this.f4996d;
        this.f4995c = this.f4997e;
        e();
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzd() {
        this.h = true;
        f();
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void zzf() {
        zzc();
        this.f4998f = jc0.f6021a;
        za0 za0Var = za0.f11240e;
        this.f4996d = za0Var;
        this.f4997e = za0Var;
        this.f4994b = za0Var;
        this.f4995c = za0Var;
        g();
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public boolean zzg() {
        return this.f4997e != za0.f11240e;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public boolean zzh() {
        return this.h && this.f4999g == jc0.f6021a;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}
