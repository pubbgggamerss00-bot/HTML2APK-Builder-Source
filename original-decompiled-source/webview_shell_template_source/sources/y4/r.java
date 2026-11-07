package y4;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r extends l {

    /* renamed from: e, reason: collision with root package name */
    public final int f15309e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f15310f;

    /* renamed from: g, reason: collision with root package name */
    public final w2.g f15311g;

    public r(com.google.android.material.textfield.a aVar, int i6) {
        super(aVar);
        this.f15309e = R.drawable.design_password_eye;
        this.f15311g = new w2.g(2, this);
        if (i6 != 0) {
            this.f15309e = i6;
        }
    }

    @Override // y4.l
    public final void b() {
        p();
    }

    @Override // y4.l
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // y4.l
    public final int d() {
        return this.f15309e;
    }

    @Override // y4.l
    public final View.OnClickListener f() {
        return this.f15311g;
    }

    @Override // y4.l
    public final boolean j() {
        return true;
    }

    @Override // y4.l
    public final boolean k() {
        EditText editText = this.f15310f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // y4.l
    public final void l(EditText editText) {
        this.f15310f = editText;
        p();
    }

    @Override // y4.l
    public final void q() {
        EditText editText = this.f15310f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15310f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // y4.l
    public final void r() {
        EditText editText = this.f15310f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
