package com.basitce.htmltoapk.data.local.dao;

import android.content.Context;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.yalantis.ucrop.view.CropImageView;
import m9.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5723c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f5721a = i10;
        this.f5722b = obj;
        this.f5723c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5721a;
        Object obj2 = this.f5723c;
        Object obj3 = this.f5722b;
        switch (i10) {
            case 0:
                return ((KeystoreDao_Impl) obj3).lambda$update$2((KeystoreEntity) obj2, (h6.b) obj);
            default:
                Context context = (Context) obj3;
                g0 g0Var = (g0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                int i11 = g0Var.R;
                int iM = 0;
                if (i11 > 1) {
                    int i12 = i11 - 1;
                    iM = jh.j.m((int) ((jh.j.l(fFloatValue, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * i12) + 0.5f), 0, i12);
                }
                return context.getString(R.string.pdf_document_page_short, Integer.valueOf(iM + 1), Integer.valueOf(g0Var.R));
        }
    }
}
