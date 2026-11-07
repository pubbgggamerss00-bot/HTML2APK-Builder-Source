package m9;

import android.app.AlertDialog;
import android.widget.EditText;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f17889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f17890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f17891c;

    public /* synthetic */ r(EditText editText, g0 g0Var, AlertDialog alertDialog) {
        this.f17889a = editText;
        this.f17890b = g0Var;
        this.f17891c = alertDialog;
    }

    @Override // eh.a
    public final Object invoke() {
        EditText editText = this.f17889a;
        String input = editText.getText().toString();
        g0 g0Var = this.f17890b;
        int i10 = g0Var.R;
        kotlin.jvm.internal.r.e(input, "input");
        Integer numG = mh.s.g(mh.x.W(input).toString());
        Integer numValueOf = null;
        if (numG != null) {
            int iIntValue = numG.intValue();
            if (1 > iIntValue || iIntValue > i10) {
                numG = null;
            }
            if (numG != null) {
                numValueOf = Integer.valueOf(numG.intValue() - 1);
            }
        }
        if (numValueOf == null) {
            editText.setError(g0Var.getContext().getString(R.string.pdf_document_invalid_page, Integer.valueOf(g0Var.R)));
        } else {
            g0Var.n(numValueOf.intValue());
            this.f17891c.dismiss();
        }
        return pg.f0.f21461a;
    }
}
