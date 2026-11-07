package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: d, reason: collision with root package name */
    public final v f13738d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f13739e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f13740f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f13741g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13742i;

    public w(v vVar) {
        super(vVar);
        this.f13740f = null;
        this.f13741g = null;
        this.h = false;
        this.f13742i = false;
        this.f13738d = vVar;
    }

    @Override // l.r
    public final void a(AttributeSet attributeSet, int i6) {
        super.a(attributeSet, R.attr.seekBarStyle);
        v vVar = this.f13738d;
        Context context = vVar.getContext();
        int[] iArr = f.a.f12940g;
        b1 b1VarE = b1.e(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        u0.f0.l(vVar, vVar.getContext(), iArr, attributeSet, b1VarE.f13583b, R.attr.seekBarStyle, 0);
        Drawable drawableC = b1VarE.c(0);
        if (drawableC != null) {
            vVar.setThumb(drawableC);
        }
        Drawable drawableB = b1VarE.b(1);
        Drawable drawable = this.f13739e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13739e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(vVar);
            drawableB.setLayoutDirection(vVar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(vVar.getDrawableState());
            }
            c();
        }
        vVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.f13741g = h0.b(typedArray.getInt(3, -1), this.f13741g);
            this.f13742i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13740f = b1VarE.a(2);
            this.h = true;
        }
        b1VarE.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.f13739e;
        if (drawable != null) {
            if (this.h || this.f13742i) {
                Drawable drawableMutate = drawable.mutate();
                this.f13739e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f13740f);
                }
                if (this.f13742i) {
                    this.f13739e.setTintMode(this.f13741g);
                }
                if (this.f13739e.isStateful()) {
                    this.f13739e.setState(this.f13738d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f13739e != null) {
            int max = this.f13738d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f13739e.getIntrinsicWidth();
                int intrinsicHeight = this.f13739e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i7 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f13739e.setBounds(-i6, -i7, i6, i7);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f13739e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
