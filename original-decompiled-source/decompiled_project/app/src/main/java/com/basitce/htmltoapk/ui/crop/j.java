package com.basitce.htmltoapk.ui.crop;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.n0;
import c2.s0;
import c9.u1;
import com.basitce.htmltoapk.ui.crop.h;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import eh.l;
import eh.q;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import kotlin.jvm.internal.r;
import pg.f0;
import ph.v1;
import q1.b1;
import q1.y1;
import t0.z9;
import x0.a2;
import x0.j;
import x0.n1;
import z.f1;

/* loaded from: classes.dex */
public final class j implements q<f1, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f5777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f5778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<GestureCropImageView> f5781f;

    public j(long j10, Uri uri, Uri uri2, CropActivity cropActivity, n1 n1Var, n1 n1Var2) {
        this.f5776a = cropActivity;
        this.f5777b = uri;
        this.f5778c = uri2;
        this.f5779d = j10;
        this.f5780e = n1Var;
        this.f5781f = n1Var2;
    }

    @Override // eh.q
    public final f0 b(f1 f1Var, x0.j jVar, Integer num) {
        final long j10;
        final n1<Boolean> n1Var;
        f1 innerPadding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        r.e(innerPadding, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(innerPadding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(fillElement, innerPadding);
            long j11 = b1.f21648b;
            y1.a aVar = y1.f21750a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarG, j11, aVar);
            l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, l0VarD, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            jVar2.L(1826678134);
            final CropActivity cropActivity = this.f5776a;
            boolean zL = jVar2.l(cropActivity);
            final Uri uri = this.f5777b;
            boolean zL2 = zL | jVar2.l(uri);
            final Uri uri2 = this.f5778c;
            boolean zL3 = zL2 | jVar2.l(uri2);
            long j12 = this.f5779d;
            boolean zJ = zL3 | jVar2.j(j12);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            n1<Boolean> n1Var2 = this.f5780e;
            if (zJ || objG == c0321a) {
                final n1<GestureCropImageView> n1Var3 = this.f5781f;
                j10 = j12;
                n1Var = n1Var2;
                l lVar = new l() { // from class: r8.b
                    @Override // eh.l
                    public final Object invoke(Object obj) throws Exception {
                        Context ctx = (Context) obj;
                        r.e(ctx, "ctx");
                        UCropView uCropView = new UCropView(ctx, null);
                        GestureCropImageView cropImageView = uCropView.getCropImageView();
                        cropImageView.setTargetAspectRatio(1.0f);
                        cropImageView.setMaxResultImageSizeX(512);
                        cropImageView.setMaxResultImageSizeY(512);
                        cropImageView.setTransformImageListener(new h(cropActivity, n1Var));
                        cropImageView.setImageUri(uri, uri2);
                        OverlayView overlayView = uCropView.getOverlayView();
                        overlayView.setTargetAspectRatio(1.0f);
                        overlayView.setShowCropGrid(true);
                        overlayView.setShowCropFrame(true);
                        long j13 = j10;
                        overlayView.setCropFrameColor(n0.j(j13));
                        overlayView.setCropGridColor(n0.j(b1.c(0.5f, j13)));
                        overlayView.setDimmedColor(-1442840576);
                        n1Var3.setValue(uCropView.getCropImageView());
                        return uCropView;
                    }
                };
                jVar2.C(lVar);
                objG = lVar;
            } else {
                j10 = j12;
                n1Var = n1Var2;
            }
            jVar2.B();
            androidx.compose.ui.viewinterop.a.b((l) objG, fillElement, null, jVar2, 48);
            jVar2.L(1826747624);
            if (!n1Var.getValue().booleanValue()) {
                f0 f0Var = f0.f21461a;
                jVar2.L(1826753746);
                Object objG2 = jVar2.g();
                if (objG2 == c0321a) {
                    objG2 = i.f5773a;
                    jVar2.C(objG2);
                }
                jVar2.B();
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(s0.a(fillElement, f0Var, (PointerInputEventHandler) objG2), b1.c(0.7f, j11), aVar);
                l0 l0VarD2 = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, l0VarD2, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                z9.a(3, 0, 390, 24, j10, 0L, androidx.compose.foundation.layout.g.n(d.a.f1143b, 36), jVar2);
                jVar2.H();
            }
            jVar2.B();
            jVar2.H();
        }
        return f0.f21461a;
    }
}
