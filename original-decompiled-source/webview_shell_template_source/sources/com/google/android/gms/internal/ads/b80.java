package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b80 extends TextureView implements s80 {
    public final k80 s;

    /* renamed from: t, reason: collision with root package name */
    public final t80 f2979t;

    public b80(Context context) {
        super(context);
        this.s = new k80();
        this.f2979t = new t80(context, this);
    }

    public void h(String str, String[] strArr, Integer num) {
        v(str);
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract String q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i6);

    public abstract void u(f80 f80Var);

    public abstract void v(String str);

    public abstract void w();

    public abstract void x(float f6, float f7);

    public Integer y() {
        return null;
    }

    public void A(int i6) {
    }

    public void B(int i6) {
    }

    public void d(int i6) {
    }

    public void f(int i6) {
    }

    public void z(int i6) {
    }
}
