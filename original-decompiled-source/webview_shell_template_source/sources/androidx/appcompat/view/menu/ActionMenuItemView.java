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
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import l.c0;
import l.e1;
import l.k0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends c0 implements k.a, View.OnClickListener, ActionMenuView.a {
    public CharSequence A;
    public Drawable B;
    public f.b C;
    public a D;
    public b E;
    public boolean F;
    public boolean G;
    public final int H;
    public int I;
    public final int J;

    /* renamed from: z, reason: collision with root package name */
    public h f129z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends k0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // l.k0
        public final k.f b() {
            a.C0007a c0007a;
            b bVar = ActionMenuItemView.this.E;
            if (bVar == null || (c0007a = androidx.appcompat.widget.a.this.L) == null) {
                return null;
            }
            return c0007a.a();
        }

        @Override // l.k0
        public final boolean c() {
            k.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.C;
            return bVar != null && bVar.a(actionMenuItemView.f129z) && (fVarB = b()) != null && fVarB.a();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.F = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12936c, 0, 0);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.J = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.I = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f129z.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.f129z = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f194a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.D == null) {
            this.D = new a();
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (i6 < 480) {
            return (i6 >= 640 && i7 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f129z;
    }

    public final void h() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.A);
        if (this.B != null && ((this.f129z.f216y & 4) != 4 || (!this.F && !this.G))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.A : null);
        CharSequence charSequence = this.f129z.f209q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z8 ? null : this.f129z.f198e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f129z.f210r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z8 ? null : this.f129z.f198e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.C;
        if (bVar != null) {
            bVar.a(this.f129z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F = g();
        h();
    }

    @Override // l.c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i8 = this.I) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.H;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i7);
        }
        if (!zIsEmpty || this.B == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.B.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f129z.hasSubMenu() && (aVar = this.D) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z6) {
        if (this.G != z6) {
            this.G = z6;
            h hVar = this.f129z;
            if (hVar != null) {
                f fVar = hVar.f206n;
                fVar.f179k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.B = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.J;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(f.b bVar) {
        this.C = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
        this.I = i6;
        super.setPadding(i6, i7, i8, i9);
    }

    public void setPopupCallback(b bVar) {
        this.E = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        h();
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }
}
