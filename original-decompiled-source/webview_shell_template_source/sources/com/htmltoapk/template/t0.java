package com.htmltoapk.template;

import android.app.AlertDialog;
import android.net.Uri;
import android.view.KeyEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f12603t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12604u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12605v;

    public /* synthetic */ t0(KeyEvent.Callback callback, Object obj, Object obj2, int i6) {
        this.s = i6;
        this.f12603t = callback;
        this.f12604u = obj;
        this.f12605v = obj2;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return PdfActivity.onCreate$lambda$6((PdfActivity) this.f12603t, (Uri) this.f12604u, (String) this.f12605v);
            default:
                EditText editText = (EditText) this.f12603t;
                w2.t tVar = (w2.t) this.f12604u;
                AlertDialog alertDialog = (AlertDialog) this.f12605v;
                String string = editText.getText().toString();
                int i6 = tVar.f15016i0;
                kotlin.jvm.internal.j.e("input", string);
                Integer numI = x5.k.i(x5.o.G(string).toString());
                Integer numValueOf = null;
                if (numI != null) {
                    int iIntValue = numI.intValue();
                    if (1 > iIntValue || iIntValue > i6) {
                        numI = null;
                    }
                    if (numI != null) {
                        numValueOf = Integer.valueOf(numI.intValue() - 1);
                    }
                }
                if (numValueOf == null) {
                    editText.setError(tVar.getContext().getString(R.string.pdf_document_invalid_page, Integer.valueOf(tVar.f15016i0)));
                } else {
                    tVar.l(numValueOf.intValue());
                    alertDialog.dismiss();
                }
                return d5.j.f12745a;
        }
    }
}
