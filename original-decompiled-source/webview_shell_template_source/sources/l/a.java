package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public final C0075a s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f13554t;

    /* renamed from: u, reason: collision with root package name */
    public ActionMenuView f13555u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.appcompat.widget.a f13556v;

    /* renamed from: w, reason: collision with root package name */
    public int f13557w;

    /* renamed from: x, reason: collision with root package name */
    public u0.n0 f13558x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13559y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13560z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: l.a$a, reason: collision with other inner class name */
    public class C0075a implements u0.o0 {
        public boolean s = false;

        /* renamed from: t, reason: collision with root package name */
        public int f13561t;

        public C0075a() {
        }

        @Override // u0.o0
        public final void a() {
            if (this.s) {
                return;
            }
            a aVar = a.this;
            aVar.f13558x = null;
            a.super.setVisibility(this.f13561t);
        }

        @Override // u0.o0
        public final void b() {
            a.super.setVisibility(0);
            this.s = false;
        }

        @Override // u0.o0
        public final void c() {
            this.s = true;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i6, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i7);
        return Math.max(0, i6 - view.getMeasuredWidth());
    }

    public static int d(View view, int i6, boolean z6, int i7, int i8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i8 - measuredHeight) / 2) + i7;
        if (z6) {
            view.layout(i6 - measuredWidth, i9, i6, measuredHeight + i9);
        } else {
            view.layout(i6, i9, i6 + measuredWidth, measuredHeight + i9);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final u0.n0 e(int i6, long j6) {
        u0.n0 n0Var = this.f13558x;
        if (n0Var != null) {
            n0Var.b();
        }
        C0075a c0075a = this.s;
        if (i6 != 0) {
            u0.n0 n0VarA = u0.f0.a(this);
            n0VarA.a(0.0f);
            n0VarA.c(j6);
            a.this.f13558x = n0VarA;
            c0075a.f13561t = i6;
            n0VarA.d(c0075a);
            return n0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        u0.n0 n0VarA2 = u0.f0.a(this);
        n0VarA2.a(1.0f);
        n0VarA2.c(j6);
        a.this.f13558x = n0VarA2;
        c0075a.f13561t = i6;
        n0VarA2.d(c0075a);
        return n0VarA2;
    }

    public int getAnimatedVisibility() {
        return this.f13558x != null ? this.s.f13561t : getVisibility();
    }

    public int getContentHeight() {
        return this.f13557w;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f12934a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f13556v;
        if (aVar != null) {
            Configuration configuration2 = aVar.f138t.getResources().getConfiguration();
            int i6 = configuration2.screenWidthDp;
            int i7 = configuration2.screenHeightDp;
            aVar.H = (configuration2.smallestScreenWidthDp > 600 || i6 > 600 || (i6 > 960 && i7 > 720) || (i6 > 720 && i7 > 960)) ? 5 : (i6 >= 500 || (i6 > 640 && i7 > 480) || (i6 > 480 && i7 > 640)) ? 4 : i6 >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.f fVar = aVar.f139u;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13560z = false;
        }
        if (!this.f13560z) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f13560z = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f13560z = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13559y = false;
        }
        if (!this.f13559y) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f13559y = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f13559y = false;
        return true;
    }

    public void setContentHeight(int i6) {
        this.f13557w = i6;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            u0.n0 n0Var = this.f13558x;
            if (n0Var != null) {
                n0Var.b();
            }
            super.setVisibility(i6);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.s = new C0075a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f13554t = context;
        } else {
            this.f13554t = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
