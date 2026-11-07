package com.basitce.htmltoapk.ui.crop;

import android.net.Uri;
import com.yalantis.ucrop.view.GestureCropImageView;
import eh.p;
import pg.f0;
import q1.b1;
import t0.e2;
import t0.f2;
import t0.ra;
import x0.n1;
import x0.s3;

/* loaded from: classes.dex */
public final class k implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<GestureCropImageView> f5784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f5786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Uri f5787f;

    public k(CropActivity cropActivity, n1<Boolean> n1Var, n1<GestureCropImageView> n1Var2, n1<Boolean> n1Var3, Uri uri, Uri uri2) {
        this.f5782a = cropActivity;
        this.f5783b = n1Var;
        this.f5784c = n1Var2;
        this.f5785d = n1Var3;
        this.f5786e = uri;
        this.f5787f = uri2;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            s3 s3Var = f2.f25858a;
            long j10 = ((e2) jVar2.f(s3Var)).f25751a;
            long j11 = ((e2) jVar2.f(s3Var)).f25770p;
            long j12 = ((e2) jVar2.f(s3Var)).f25771q;
            n1<GestureCropImageView> n1Var = this.f5784c;
            n1<Boolean> n1Var2 = this.f5785d;
            CropActivity cropActivity = this.f5782a;
            ra.a(null, f1.c.b(1151386316, new g(j11, j12, cropActivity, this.f5783b, n1Var, n1Var2, j10), jVar2), null, null, null, 0, b1.f21648b, 0L, null, f1.c.b(-1633343519, new j(j10, this.f5786e, this.f5787f, cropActivity, this.f5785d, this.f5784c), jVar2), jVar2, 806879280, 445);
        }
        return f0.f21461a;
    }
}
