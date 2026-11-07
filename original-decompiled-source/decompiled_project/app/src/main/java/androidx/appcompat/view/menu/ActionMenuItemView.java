package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.b;
import java.util.concurrent.ExecutionException;
import l.f;
import l.h;
import l.k;
import m.m0;
import m.r;
import m.w;

/* loaded from: classes.dex */
public class ActionMenuItemView extends r implements k, View.OnClickListener, b.a {

    /* renamed from: a, reason: collision with root package name */
    public f f590a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f591b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f592c;

    /* renamed from: d, reason: collision with root package name */
    public a.InterfaceC0007a f593d;

    /* renamed from: e, reason: collision with root package name */
    public a f594e;

    /* renamed from: f, reason: collision with root package name */
    public b f595f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f596g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f597h;

    /* renamed from: j, reason: collision with root package name */
    public final int f598j;

    /* renamed from: k, reason: collision with root package name */
    public int f599k;

    /* renamed from: l, reason: collision with root package name */
    public final int f600l;

    public class a extends w {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // m.w
        public final h b() {
            a.C0008a c0008a;
            b bVar = ActionMenuItemView.this.f595f;
            if (bVar == null || (c0008a = androidx.appcompat.widget.a.this.f667v) == null) {
                return null;
            }
            return c0008a.a();
        }

        @Override // m.w
        public final boolean c() {
            h hVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            a.InterfaceC0007a interfaceC0007a = actionMenuItemView.f593d;
            if (interfaceC0007a != null) {
                if (((androidx.appcompat.widget.b) interfaceC0007a).f679r.p(actionMenuItemView.f590a, null, 0) && (hVarB = b()) != null && hVarB.e()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.b.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.k
    public final void b(f fVar) {
        this.f590a = fVar;
        setIcon(fVar.getIcon());
        setTitle(fVar.getTitleCondensed());
        setId(fVar.f16504a);
        setVisibility(fVar.isVisible() ? 0 : 8);
        setEnabled(fVar.isEnabled());
        if (fVar.hasSubMenu() && this.f594e == null) {
            this.f594e = new a();
        }
    }

    @Override // androidx.appcompat.widget.b.a
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f590a.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f591b);
        if (this.f592c != null && ((this.f590a.B & 4) != 4 || (!this.f596g && !this.f597h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f591b : null);
        CharSequence charSequence = this.f590a.f16520s;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f590a.f16508e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f590a.f16521t;
        if (TextUtils.isEmpty(charSequence2)) {
            m0.a(this, z12 ? null : this.f590a.f16508e);
        } else {
            m0.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.k
    public f getItemData() {
        return this.f590a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a.InterfaceC0007a interfaceC0007a = this.f593d;
        if (interfaceC0007a != null) {
            ((androidx.appcompat.widget.b) interfaceC0007a).f679r.p(this.f590a, null, 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f596g = d();
        e();
    }

    @Override // m.r, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) throws ExecutionException, InterruptedException {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f599k) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f598j;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f592c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f592c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f590a.hasSubMenu() && (aVar = this.f594e) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f597h != z10) {
            this.f597h = z10;
            f fVar = this.f590a;
            if (fVar != null) {
                androidx.appcompat.view.menu.a aVar = fVar.f16517p;
                aVar.f630k = true;
                aVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f592c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f600l;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(a.InterfaceC0007a interfaceC0007a) {
        this.f593d = interfaceC0007a;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f599k = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f595f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f591b = charSequence;
        e();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f596g = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f11243b, i10, 0);
        this.f598j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f600l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f599k = -1;
        setSaveEnabled(false);
    }
}
