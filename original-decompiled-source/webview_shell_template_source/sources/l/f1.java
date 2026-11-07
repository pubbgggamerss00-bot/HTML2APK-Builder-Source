package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.htmltoapk.template.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import u0.g0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static f1 C;
    public static f1 D;
    public boolean A;
    public boolean B;
    public final View s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f13624t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13625u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.activity.d f13626v = new androidx.activity.d(4, this);

    /* renamed from: w, reason: collision with root package name */
    public final androidx.camera.core.processing.p f13627w = new androidx.camera.core.processing.p(8, this);

    /* renamed from: x, reason: collision with root package name */
    public int f13628x;

    /* renamed from: y, reason: collision with root package name */
    public int f13629y;

    /* renamed from: z, reason: collision with root package name */
    public g1 f13630z;

    public f1(View view, CharSequence charSequence) {
        this.s = view;
        this.f13624t = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = u0.g0.f14497a;
        this.f13625u = Build.VERSION.SDK_INT >= 28 ? g0.b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.B = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(f1 f1Var) {
        f1 f1Var2 = C;
        if (f1Var2 != null) {
            f1Var2.s.removeCallbacks(f1Var2.f13626v);
        }
        C = f1Var;
        if (f1Var != null) {
            f1Var.s.postDelayed(f1Var.f13626v, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        f1 f1Var = D;
        View view = this.s;
        if (f1Var == this) {
            D = null;
            g1 g1Var = this.f13630z;
            if (g1Var != null) {
                View view2 = g1Var.f13635b;
                if (view2.getParent() != null) {
                    ((WindowManager) g1Var.f13634a.getSystemService("window")).removeView(view2);
                }
                this.f13630z = null;
                this.B = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (C == this) {
            b(null);
        }
        view.removeCallbacks(this.f13627w);
    }

    public final void c(boolean z6) {
        int height;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long longPressTimeout;
        long j6;
        long j7;
        View view = this.s;
        if (view.isAttachedToWindow()) {
            b(null);
            f1 f1Var = D;
            if (f1Var != null) {
                f1Var.a();
            }
            D = this;
            this.A = z6;
            g1 g1Var = new g1(view.getContext());
            this.f13630z = g1Var;
            int width = this.f13628x;
            int i11 = this.f13629y;
            boolean z7 = this.A;
            View view2 = g1Var.f13635b;
            ViewParent parent = view2.getParent();
            Context context = g1Var.f13634a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            g1Var.f13636c.setText(this.f13624t);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = g1Var.f13637d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i11 + dimensionPixelOffset2;
                i6 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i6 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z7 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i10 = 1;
            } else {
                Rect rect = g1Var.f13638e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i7 = width;
                    i8 = i6;
                    i9 = 0;
                    i10 = 1;
                } else {
                    Resources resources = context.getResources();
                    i10 = 1;
                    i7 = width;
                    i8 = i6;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i9 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = g1Var.f13640g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = g1Var.f13639f;
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i9] - iArr[i9];
                iArr2[i9] = i12;
                iArr2[i10] = iArr2[i10] - iArr[i10];
                layoutParams.x = (i12 + i7) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i10];
                int i14 = ((i13 + i8) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z7) {
                    if (i14 >= 0) {
                        layoutParams.y = i14;
                    } else {
                        layoutParams.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i14;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.A) {
                j7 = 2500;
            } else {
                WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
                if ((view.getWindowSystemUiVisibility() & 1) == i10) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j7 = j6 - longPressTimeout;
            }
            androidx.camera.core.processing.p pVar = this.f13627w;
            view.removeCallbacks(pVar);
            view.postDelayed(pVar, j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f13630z == null || !this.A) {
            View view2 = this.s;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.B = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f13630z == null) {
                    int x6 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (!this.B) {
                        int iAbs = Math.abs(x6 - this.f13628x);
                        int i6 = this.f13625u;
                        if (iAbs > i6 || Math.abs(y2 - this.f13629y) > i6) {
                            this.f13628x = x6;
                            this.f13629y = y2;
                            this.B = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f13628x = view.getWidth() / 2;
        this.f13629y = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
