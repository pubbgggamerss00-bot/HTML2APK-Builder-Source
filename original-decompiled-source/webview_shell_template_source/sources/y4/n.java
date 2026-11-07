package y4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import l.c0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f15274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15276c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15277d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15278e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15279f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f15280g;
    public final TextInputLayout h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f15281i;

    /* renamed from: j, reason: collision with root package name */
    public int f15282j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f15283k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f15284l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15285m;

    /* renamed from: n, reason: collision with root package name */
    public int f15286n;

    /* renamed from: o, reason: collision with root package name */
    public int f15287o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f15288p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15289q;

    /* renamed from: r, reason: collision with root package name */
    public c0 f15290r;
    public CharSequence s;

    /* renamed from: t, reason: collision with root package name */
    public int f15291t;

    /* renamed from: u, reason: collision with root package name */
    public int f15292u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f15293v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f15294w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15295x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f15296y;

    /* renamed from: z, reason: collision with root package name */
    public int f15297z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f15299b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f15300c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f15301d;

        public a(int i6, TextView textView, int i7, TextView textView2) {
            this.f15298a = i6;
            this.f15299b = textView;
            this.f15300c = i7;
            this.f15301d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c0 c0Var;
            int i6 = this.f15298a;
            n nVar = n.this;
            nVar.f15286n = i6;
            nVar.f15284l = null;
            TextView textView = this.f15299b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f15300c == 1 && (c0Var = nVar.f15290r) != null) {
                    c0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f15301d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f15301d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15280g = context;
        this.h = textInputLayout;
        this.f15285m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f15274a = o4.b.c(context, R.attr.motionDurationShort4, 217);
        this.f15275b = o4.b.c(context, R.attr.motionDurationMedium4, 167);
        this.f15276c = o4.b.c(context, R.attr.motionDurationShort4, 167);
        this.f15277d = o4.b.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, x3.a.f15147d);
        LinearInterpolator linearInterpolator = x3.a.f15144a;
        this.f15278e = o4.b.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f15279f = o4.b.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(c0 c0Var, int i6) {
        if (this.f15281i == null && this.f15283k == null) {
            Context context = this.f15280g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15281i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15281i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15283k = new FrameLayout(context);
            this.f15281i.addView(this.f15283k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i6 == 0 || i6 == 1) {
            this.f15283k.setVisibility(0);
            this.f15283k.addView(c0Var);
        } else {
            this.f15281i.addView(c0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15281i.setVisibility(0);
        this.f15282j++;
    }

    public final void b() {
        if (this.f15281i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15280g;
                boolean zD = q4.c.d(context);
                LinearLayout linearLayout = this.f15281i;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f15284l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z6, c0 c0Var, int i6, int i7, int i8) {
        if (c0Var == null || !z6) {
            return;
        }
        if (i6 == i8 || i6 == i7) {
            boolean z7 = i8 == i6;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0Var, (Property<c0, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
            int i9 = this.f15276c;
            objectAnimatorOfFloat.setDuration(z7 ? this.f15275b : i9);
            objectAnimatorOfFloat.setInterpolator(z7 ? this.f15278e : this.f15279f);
            if (i6 == i8 && i7 != 0) {
                objectAnimatorOfFloat.setStartDelay(i9);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i8 != i6 || i7 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0Var, (Property<c0, Float>) View.TRANSLATION_Y, -this.f15285m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f15274a);
            objectAnimatorOfFloat2.setInterpolator(this.f15277d);
            objectAnimatorOfFloat2.setStartDelay(i9);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i6) {
        if (i6 == 1) {
            return this.f15290r;
        }
        if (i6 != 2) {
            return null;
        }
        return this.f15296y;
    }

    public final void f() {
        this.f15288p = null;
        c();
        if (this.f15286n == 1) {
            if (!this.f15295x || TextUtils.isEmpty(this.f15294w)) {
                this.f15287o = 0;
            } else {
                this.f15287o = 2;
            }
        }
        i(this.f15286n, this.f15287o, h(this.f15290r, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public final void g(c0 c0Var, int i6) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15281i;
        if (linearLayout == null) {
            return;
        }
        if ((i6 == 0 || i6 == 1) && (frameLayout = this.f15283k) != null) {
            frameLayout.removeView(c0Var);
        } else {
            linearLayout.removeView(c0Var);
        }
        int i7 = this.f15282j - 1;
        this.f15282j = i7;
        LinearLayout linearLayout2 = this.f15281i;
        if (i7 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(c0 c0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f15287o == this.f15286n && c0Var != null && TextUtils.equals(c0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i6, int i7, boolean z6) {
        TextView textViewE;
        TextView textViewE2;
        n nVar = this;
        if (i6 == i7) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f15284l = animatorSet;
            ArrayList arrayList = new ArrayList();
            nVar.d(arrayList, nVar.f15295x, nVar.f15296y, 2, i6, i7);
            nVar.d(arrayList, nVar.f15289q, nVar.f15290r, 1, i6, i7);
            int size = arrayList.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Animator animator = (Animator) arrayList.get(i8);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            a aVar = new a(i7, e(i6), i6, nVar.e(i7));
            nVar = this;
            animatorSet.addListener(aVar);
            animatorSet.start();
        } else if (i6 != i7) {
            if (i7 != 0 && (textViewE2 = nVar.e(i7)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i6 != 0 && (textViewE = e(i6)) != null) {
                textViewE.setVisibility(4);
                if (i6 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            nVar.f15286n = i7;
        }
        TextInputLayout textInputLayout = nVar.h;
        textInputLayout.t();
        textInputLayout.w(z6, false);
        textInputLayout.z();
    }
}
