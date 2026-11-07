package com.basitce.htmltoapk.ui.crop;

import android.content.Intent;
import android.graphics.Bitmap;
import com.basitce.htmltoapk.ui.crop.CropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import eh.q;
import kotlin.jvm.internal.r;
import pg.f0;
import t0.s4;
import x0.j;
import z.n1;

/* loaded from: classes.dex */
public final class f implements q<n1, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<GestureCropImageView> f5760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f5761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f5762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5763e;

    public f(CropActivity cropActivity, x0.n1<GestureCropImageView> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, long j10) {
        this.f5759a = cropActivity;
        this.f5760b = n1Var;
        this.f5761c = n1Var2;
        this.f5762d = n1Var3;
        this.f5763e = j10;
    }

    @Override // eh.q
    public final f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 TopAppBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        r.e(TopAppBar, "$this$TopAppBar");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1826548669);
            final CropActivity cropActivity = this.f5759a;
            boolean zL = jVar2.l(cropActivity);
            Object objG = jVar2.g();
            final x0.n1<GestureCropImageView> n1Var2 = this.f5760b;
            final x0.n1<Boolean> n1Var3 = this.f5761c;
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: r8.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        CropActivity cropActivity2 = cropActivity;
                        GestureCropImageView gestureCropImageView = (GestureCropImageView) n1Var2.getValue();
                        if (gestureCropImageView == null) {
                            return f0.f21461a;
                        }
                        Boolean bool = Boolean.TRUE;
                        x0.n1 n1Var4 = n1Var3;
                        n1Var4.setValue(bool);
                        try {
                            gestureCropImageView.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, new com.basitce.htmltoapk.ui.crop.d(cropActivity2, n1Var4));
                        } catch (Exception e10) {
                            n1Var4.setValue(Boolean.FALSE);
                            Intent intentPutExtra = new Intent().putExtra("com.yalantis.ucrop.Error", e10);
                            r.d(intentPutExtra, "putExtra(...)");
                            cropActivity2.setResult(96, intentPutExtra);
                            cropActivity2.finish();
                        }
                        return f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            eh.a aVar = (eh.a) objG;
            jVar2.B();
            s4.c(aVar, null, (n1Var3.getValue().booleanValue() || !this.f5762d.getValue().booleanValue() || n1Var2.getValue() == null) ? false : true, null, f1.c.b(-595854658, new e(this.f5763e, n1Var3), jVar2), jVar2, 196608, 26);
        }
        return f0.f21461a;
    }
}
