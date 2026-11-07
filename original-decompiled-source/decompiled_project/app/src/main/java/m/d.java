package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import y3.q0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f17109a;

    /* renamed from: b, reason: collision with root package name */
    public final e f17110b;

    /* renamed from: c, reason: collision with root package name */
    public int f17111c = -1;

    /* renamed from: d, reason: collision with root package name */
    public h0 f17112d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f17113e;

    /* renamed from: f, reason: collision with root package name */
    public h0 f17114f;

    public d(View view) {
        e eVar;
        this.f17109a = view;
        PorterDuff.Mode mode = e.f17118b;
        synchronized (e.class) {
            try {
                if (e.f17119c == null) {
                    e.b();
                }
                eVar = e.f17119c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17110b = eVar;
    }

    public final void a() {
        View view = this.f17109a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f17112d != null) {
                if (this.f17114f == null) {
                    this.f17114f = new h0();
                }
                h0 h0Var = this.f17114f;
                h0Var.f17138a = null;
                h0Var.f17141d = false;
                h0Var.f17139b = null;
                h0Var.f17140c = false;
                Field field = q0.f33885a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    h0Var.f17141d = true;
                    h0Var.f17138a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    h0Var.f17140c = true;
                    h0Var.f17139b = backgroundTintMode;
                }
                if (h0Var.f17141d || h0Var.f17140c) {
                    e.c(background, h0Var, view.getDrawableState());
                    return;
                }
            }
            h0 h0Var2 = this.f17113e;
            if (h0Var2 != null) {
                e.c(background, h0Var2, view.getDrawableState());
                return;
            }
            h0 h0Var3 = this.f17112d;
            if (h0Var3 != null) {
                e.c(background, h0Var3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = this.f17109a;
        Context context = view.getContext();
        int[] iArr = g.a.f11257p;
        j0 j0VarD = j0.d(context, attributeSet, iArr, i10);
        TypedArray typedArray = j0VarD.f17144b;
        View view2 = this.f17109a;
        q0.g(view2, view2.getContext(), iArr, attributeSet, j0VarD.f17144b, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f17111c = typedArray.getResourceId(0, -1);
                e eVar = this.f17110b;
                Context context2 = view.getContext();
                int i11 = this.f17111c;
                synchronized (eVar) {
                    colorStateListF = eVar.f17120a.f(context2, i11);
                }
                if (colorStateListF != null) {
                    d(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(j0VarD.a(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(u.b(typedArray.getInt(2, -1), null));
            }
            j0VarD.e();
        } catch (Throwable th2) {
            j0VarD.e();
            throw th2;
        }
    }

    public final void c(int i10) {
        ColorStateList colorStateListF;
        this.f17111c = i10;
        e eVar = this.f17110b;
        if (eVar != null) {
            Context context = this.f17109a.getContext();
            synchronized (eVar) {
                colorStateListF = eVar.f17120a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        d(colorStateListF);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f17112d == null) {
                this.f17112d = new h0();
            }
            h0 h0Var = this.f17112d;
            h0Var.f17138a = colorStateList;
            h0Var.f17141d = true;
        } else {
            this.f17112d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f17113e == null) {
            this.f17113e = new h0();
        }
        h0 h0Var = this.f17113e;
        h0Var.f17138a = colorStateList;
        h0Var.f17141d = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f17113e == null) {
            this.f17113e = new h0();
        }
        h0 h0Var = this.f17113e;
        h0Var.f17139b = mode;
        h0Var.f17140c = true;
        a();
    }
}
