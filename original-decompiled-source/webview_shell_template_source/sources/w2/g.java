package w2;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14902t;

    public /* synthetic */ g(int i6, Object obj) {
        this.s = i6;
        this.f14902t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.s) {
            case 0:
                ((t) this.f14902t).o();
                break;
            case 1:
                y4.c cVar = (y4.c) this.f14902t;
                EditText editText = cVar.f15246i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        cVar.f15246i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    cVar.p();
                    break;
                }
                break;
            default:
                y4.r rVar = (y4.r) this.f14902t;
                EditText editText2 = rVar.f15310f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = rVar.f15310f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        rVar.f15310f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        rVar.f15310f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        rVar.f15310f.setSelection(selectionEnd);
                    }
                    rVar.p();
                    break;
                }
                break;
        }
    }
}
