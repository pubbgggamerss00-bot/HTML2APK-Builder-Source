package y4;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final int f15243e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15244f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15245g;
    public final TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f15246i;

    /* renamed from: j, reason: collision with root package name */
    public final w2.g f15247j;

    /* renamed from: k, reason: collision with root package name */
    public final a f15248k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f15249l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f15250m;

    /* JADX WARN: Type inference failed for: r0v1, types: [y4.a] */
    public c(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f15247j = new w2.g(1, this);
        this.f15248k = new View.OnFocusChangeListener() { // from class: y4.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                c cVar = this.f15241a;
                cVar.s(cVar.t());
            }
        };
        this.f15243e = o4.b.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f15244f = o4.b.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f15245g = o4.b.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, x3.a.f15144a);
        this.h = o4.b.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15147d);
    }

    @Override // y4.l
    public final void a() {
        if (this.f15271b.H != null) {
            return;
        }
        s(t());
    }

    @Override // y4.l
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // y4.l
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // y4.l
    public final View.OnFocusChangeListener e() {
        return this.f15248k;
    }

    @Override // y4.l
    public final View.OnClickListener f() {
        return this.f15247j;
    }

    @Override // y4.l
    public final View.OnFocusChangeListener g() {
        return this.f15248k;
    }

    @Override // y4.l
    public final void l(EditText editText) {
        this.f15246i = editText;
        this.f15270a.setEndIconVisible(t());
    }

    @Override // y4.l
    public final void o(boolean z6) {
        if (this.f15271b.H == null) {
            return;
        }
        s(z6);
    }

    @Override // y4.l
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f15244f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y4.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c cVar = this.f15242a;
                cVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = cVar.f15273d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15245g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i6 = this.f15243e;
        valueAnimatorOfFloat2.setDuration(i6);
        valueAnimatorOfFloat2.addUpdateListener(new androidx.camera.view.n(2, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15249l = animatorSet;
        int i7 = 1;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f15249l.addListener(new a4.c(i7, this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i6);
        valueAnimatorOfFloat3.addUpdateListener(new androidx.camera.view.n(2, this));
        this.f15250m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new com.google.android.gms.ads.internal.overlay.h(i7, this));
    }

    @Override // y4.l
    public final void r() {
        EditText editText = this.f15246i;
        if (editText != null) {
            editText.post(new androidx.camera.core.processing.p(11, this));
        }
    }

    public final void s(boolean z6) {
        boolean z7 = this.f15271b.d() == z6;
        if (z6 && !this.f15249l.isRunning()) {
            this.f15250m.cancel();
            this.f15249l.start();
            if (z7) {
                this.f15249l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f15249l.cancel();
        this.f15250m.start();
        if (z7) {
            this.f15250m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f15246i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f15273d.hasFocus()) && ((this.f15246i.getText().length() > 0) || (this.f15271b.H != null));
    }
}
