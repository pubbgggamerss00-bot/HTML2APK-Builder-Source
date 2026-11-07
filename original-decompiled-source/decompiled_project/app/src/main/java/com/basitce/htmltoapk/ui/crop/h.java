package com.basitce.htmltoapk.ui.crop;

import android.content.Intent;
import com.yalantis.ucrop.view.TransformImageView;
import kotlin.jvm.internal.r;
import x0.n1;

/* loaded from: classes.dex */
public final class h implements TransformImageView.TransformImageListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5772b;

    public h(CropActivity cropActivity, n1 n1Var) {
        this.f5771a = n1Var;
        this.f5772b = cropActivity;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadComplete() {
        this.f5771a.setValue(Boolean.TRUE);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadFailure(Exception e10) {
        r.e(e10, "e");
        this.f5771a.setValue(Boolean.FALSE);
        Intent intentPutExtra = new Intent().putExtra("com.yalantis.ucrop.Error", e10);
        r.d(intentPutExtra, "putExtra(...)");
        CropActivity cropActivity = this.f5772b;
        cropActivity.setResult(96, intentPutExtra);
        cropActivity.finish();
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onRotate(float f10) {
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onScale(float f10) {
    }
}
