package y4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.datepicker.t;
import com.google.android.material.textfield.TextInputLayout;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: e, reason: collision with root package name */
    public final int f15257e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15258f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15259g;
    public AutoCompleteTextView h;

    /* renamed from: i, reason: collision with root package name */
    public final t f15260i;

    /* renamed from: j, reason: collision with root package name */
    public final i f15261j;

    /* renamed from: k, reason: collision with root package name */
    public final j f15262k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15263l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15264m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15265n;

    /* renamed from: o, reason: collision with root package name */
    public long f15266o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f15267p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f15268q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f15269r;

    /* JADX WARN: Type inference failed for: r0v1, types: [y4.i] */
    /* JADX WARN: Type inference failed for: r0v2, types: [y4.j] */
    public k(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f15260i = new t(3, this);
        this.f15261j = new View.OnFocusChangeListener() { // from class: y4.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                k kVar = this.f15255a;
                kVar.f15263l = z6;
                kVar.p();
                if (z6) {
                    return;
                }
                kVar.s(false);
                kVar.f15264m = false;
            }
        };
        this.f15262k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: y4.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                k kVar = this.f15256a;
                AutoCompleteTextView autoCompleteTextView = kVar.h;
                if (autoCompleteTextView == null || e5.i.g(autoCompleteTextView)) {
                    return;
                }
                kVar.f15273d.setImportantForAccessibility(z6 ? 2 : 1);
            }
        };
        this.f15266o = Long.MAX_VALUE;
        this.f15258f = o4.b.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f15257e = o4.b.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f15259g = o4.b.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, x3.a.f15144a);
    }

    @Override // y4.l
    public final void a() {
        if (this.f15267p.isTouchExplorationEnabled() && e5.i.g(this.h) && !this.f15273d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new androidx.camera.camera2.interop.c(5, this));
    }

    @Override // y4.l
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // y4.l
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // y4.l
    public final View.OnFocusChangeListener e() {
        return this.f15261j;
    }

    @Override // y4.l
    public final View.OnClickListener f() {
        return this.f15260i;
    }

    @Override // y4.l
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f15262k;
    }

    @Override // y4.l
    public final boolean i(int i6) {
        return i6 != 0;
    }

    @Override // y4.l
    public final boolean k() {
        return this.f15265n;
    }

    @Override // y4.l
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: y4.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k kVar = this.s;
                    long j6 = jUptimeMillis - kVar.f15266o;
                    if (j6 < 0 || j6 > 300) {
                        kVar.f15264m = false;
                    }
                    kVar.t();
                    kVar.f15264m = true;
                    kVar.f15266o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: y4.h
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f15254a;
                kVar.f15264m = true;
                kVar.f15266o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f15270a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f15267p.isTouchExplorationEnabled()) {
            this.f15273d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // y4.l
    public final void m(v0.b bVar) {
        if (!e5.i.g(this.h)) {
            bVar.h(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? bVar.f14729a.isShowingHintText() : bVar.e(4)) {
            bVar.i(null);
        }
    }

    @Override // y4.l
    @SuppressLint({"WrongConstant"})
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.f15267p.isEnabled() || e5.i.g(this.h)) {
            return;
        }
        boolean z6 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15265n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            t();
            this.f15264m = true;
            this.f15266o = SystemClock.uptimeMillis();
        }
    }

    @Override // y4.l
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15259g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f15258f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y4.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                k kVar = this.f15253a;
                kVar.getClass();
                kVar.f15273d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f15269r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f15257e);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y4.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                k kVar = this.f15253a;
                kVar.getClass();
                kVar.f15273d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f15268q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new f2.e(1, this));
        this.f15267p = (AccessibilityManager) this.f15272c.getSystemService("accessibility");
    }

    @Override // y4.l
    @SuppressLint({"ClickableViewAccessibility"})
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z6) {
        if (this.f15265n != z6) {
            this.f15265n = z6;
            this.f15269r.cancel();
            this.f15268q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f15266o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f15264m = false;
        }
        if (this.f15264m) {
            this.f15264m = false;
            return;
        }
        s(!this.f15265n);
        if (!this.f15265n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
