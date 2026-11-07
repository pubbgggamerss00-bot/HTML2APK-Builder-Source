package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f13598a;

    /* renamed from: d, reason: collision with root package name */
    public z0 f13601d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f13602e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f13603f;

    /* renamed from: c, reason: collision with root package name */
    public int f13600c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final j f13599b = j.a();

    public d(View view) {
        this.f13598a = view;
    }

    public final void a() {
        View view = this.f13598a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f13601d != null) {
                if (this.f13603f == null) {
                    this.f13603f = new z0();
                }
                z0 z0Var = this.f13603f;
                z0Var.f13765a = null;
                z0Var.f13768d = false;
                z0Var.f13766b = null;
                z0Var.f13767c = false;
                WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
                ColorStateList colorStateListC = f0.d.c(view);
                if (colorStateListC != null) {
                    z0Var.f13768d = true;
                    z0Var.f13765a = colorStateListC;
                }
                PorterDuff.Mode modeD = f0.d.d(view);
                if (modeD != null) {
                    z0Var.f13767c = true;
                    z0Var.f13766b = modeD;
                }
                if (z0Var.f13768d || z0Var.f13767c) {
                    j.e(background, z0Var, view.getDrawableState());
                    return;
                }
            }
            z0 z0Var2 = this.f13602e;
            if (z0Var2 != null) {
                j.e(background, z0Var2, view.getDrawableState());
                return;
            }
            z0 z0Var3 = this.f13601d;
            if (z0Var3 != null) {
                j.e(background, z0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        z0 z0Var = this.f13602e;
        if (z0Var != null) {
            return z0Var.f13765a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        z0 z0Var = this.f13602e;
        if (z0Var != null) {
            return z0Var.f13766b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i6) {
        ColorStateList colorStateListF;
        View view = this.f13598a;
        Context context = view.getContext();
        int[] iArr = f.a.f12956y;
        b1 b1VarE = b1.e(i6, 0, context, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        View view2 = this.f13598a;
        u0.f0.l(view2, view2.getContext(), iArr, attributeSet, b1VarE.f13583b, i6, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f13600c = typedArray.getResourceId(0, -1);
                j jVar = this.f13599b;
                Context context2 = view.getContext();
                int i7 = this.f13600c;
                synchronized (jVar) {
                    colorStateListF = jVar.f13674a.f(context2, i7);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                f0.d.h(view, b1VarE.a(1));
            }
            if (typedArray.hasValue(2)) {
                f0.d.i(view, h0.b(typedArray.getInt(2, -1), null));
            }
            b1VarE.f();
        } catch (Throwable th) {
            b1VarE.f();
            throw th;
        }
    }

    public final void e() {
        this.f13600c = -1;
        g(null);
        a();
    }

    public final void f(int i6) {
        ColorStateList colorStateListF;
        this.f13600c = i6;
        j jVar = this.f13599b;
        if (jVar != null) {
            Context context = this.f13598a.getContext();
            synchronized (jVar) {
                colorStateListF = jVar.f13674a.f(context, i6);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f13601d == null) {
                this.f13601d = new z0();
            }
            z0 z0Var = this.f13601d;
            z0Var.f13765a = colorStateList;
            z0Var.f13768d = true;
        } else {
            this.f13601d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f13602e == null) {
            this.f13602e = new z0();
        }
        z0 z0Var = this.f13602e;
        z0Var.f13765a = colorStateList;
        z0Var.f13768d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f13602e == null) {
            this.f13602e = new z0();
        }
        z0 z0Var = this.f13602e;
        z0Var.f13766b = mode;
        z0Var.f13767c = true;
        a();
    }
}
