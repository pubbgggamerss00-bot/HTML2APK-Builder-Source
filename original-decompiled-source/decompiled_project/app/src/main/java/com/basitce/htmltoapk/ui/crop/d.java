package com.basitce.htmltoapk.ui.crop;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.r;
import x0.n1;

/* loaded from: classes.dex */
public final class d implements yf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropActivity f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f5756b;

    public d(CropActivity cropActivity, n1<Boolean> n1Var) {
        this.f5755a = cropActivity;
        this.f5756b = n1Var;
    }

    @Override // yf.a
    public final void a(Throwable t3) {
        r.e(t3, "t");
        this.f5756b.setValue(Boolean.FALSE);
        Intent intentPutExtra = new Intent().putExtra("com.yalantis.ucrop.Error", t3);
        r.d(intentPutExtra, "putExtra(...)");
        CropActivity cropActivity = this.f5755a;
        cropActivity.setResult(96, intentPutExtra);
        cropActivity.finish();
    }

    @Override // yf.a
    public final void b(Uri resultUri) {
        r.e(resultUri, "resultUri");
        Intent intentPutExtra = new Intent().putExtra("com.yalantis.ucrop.OutputUri", resultUri);
        r.d(intentPutExtra, "putExtra(...)");
        CropActivity cropActivity = this.f5755a;
        cropActivity.setResult(-1, intentPutExtra);
        cropActivity.finish();
    }
}
