package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.htmltoapk.template.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int F = 0;
    public float A;
    public boolean B;
    public double C;
    public int D;
    public int E;
    public final ValueAnimator s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12508t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f12509u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12510v;

    /* renamed from: w, reason: collision with root package name */
    public final float f12511w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f12512x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f12513y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12514z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void a(float f6);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.s = valueAnimator;
        this.f12509u = new ArrayList();
        Paint paint = new Paint();
        this.f12512x = paint;
        this.f12513y = new RectF();
        this.E = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15066f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        o4.b.c(context, R.attr.motionDurationLong2, 200);
        o4.b.d(context, R.attr.motionEasingEmphasizedInterpolator, x3.a.f15145b);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12510v = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12514z = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f12511w = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i6 = ClockHandView.F;
                ClockHandView clockHandView = this.f12517a;
                clockHandView.getClass();
                clockHandView.c(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i6) {
        return i6 == 2 ? Math.round(this.D * 0.66f) : this.D;
    }

    public final void b(float f6) {
        this.s.cancel();
        c(f6, false);
    }

    public final void c(float f6, boolean z6) {
        float f7 = f6 % 360.0f;
        this.A = f7;
        this.C = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.E);
        float fCos = (((float) Math.cos(this.C)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.C))) + height;
        float f8 = this.f12510v;
        this.f12513y.set(fCos - f8, fSin - f8, fCos + f8, fSin + f8);
        ArrayList arrayList = this.f12509u;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((a) obj).a(f7);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float fA = a(this.E);
        float fCos = (((float) Math.cos(this.C)) * fA) + f6;
        float f7 = height;
        float fSin = (fA * ((float) Math.sin(this.C))) + f7;
        Paint paint = this.f12512x;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f12510v, paint);
        double dSin = Math.sin(this.C);
        paint.setStrokeWidth(this.f12514z);
        canvas.drawLine(f6, f7, width + ((int) (Math.cos(this.C) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f6, f7, this.f12511w, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (this.s.isRunning()) {
            return;
        }
        b(this.A);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z8 = false;
        if (actionMasked == 0) {
            this.B = false;
            z6 = true;
            z7 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z7 = this.B;
            if (this.f12508t) {
                this.E = ((float) Math.hypot((double) (x6 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z6 = false;
        } else {
            z7 = false;
            z6 = false;
        }
        boolean z9 = this.B;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x6 - (getWidth() / 2)));
        int i6 = degrees + 90;
        if (i6 < 0) {
            i6 = degrees + 450;
        }
        float f6 = i6;
        boolean z10 = this.A != f6;
        if (z6 && z10) {
            z8 = true;
        } else if (z10 || z7) {
            b(f6);
            z8 = true;
        }
        this.B = z9 | z8;
        return true;
    }
}
