package com.basitce.htmltoapk.ui.crop;

import com.yalantis.ucrop.view.CropImageView;
import com.yalantis.ucrop.view.GestureCropImageView;
import eh.p;
import pg.f0;
import t0.g0;
import t0.mf;
import x0.n1;

/* loaded from: classes.dex */
public final class g implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<GestureCropImageView> f5768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5770g;

    public g(long j10, long j11, CropActivity cropActivity, n1<Boolean> n1Var, n1<GestureCropImageView> n1Var2, n1<Boolean> n1Var3, long j12) {
        this.f5764a = j10;
        this.f5765b = j11;
        this.f5766c = cropActivity;
        this.f5767d = n1Var;
        this.f5768e = n1Var2;
        this.f5769f = n1Var3;
        this.f5770g = j12;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            long j10 = this.f5765b;
            f1.b bVarB = f1.c.b(2113678992, new a(j10), jVar2);
            n1<Boolean> n1Var = this.f5767d;
            CropActivity cropActivity = this.f5766c;
            f1.b bVarB2 = f1.c.b(1886458002, new c(cropActivity, n1Var, j10), jVar2);
            f1.b bVarB3 = f1.c.b(472966459, new f(cropActivity, this.f5768e, this.f5767d, this.f5769f, this.f5770g), jVar2);
            float f10 = mf.f26477a;
            long j11 = this.f5765b;
            g0.b(bVarB, null, bVarB2, bVarB3, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(this.f5764a, j11, j11, jVar2, 18), jVar2, 3462, 178);
        }
        return f0.f21461a;
    }
}
