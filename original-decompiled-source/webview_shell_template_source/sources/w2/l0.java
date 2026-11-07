package w2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.htmltoapk.template.R;
import java.io.File;
import java.util.Iterator;
import java.util.WeakHashMap;
import u0.f0;
import w2.l0;
import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l0 extends FrameLayout {
    public static final /* synthetic */ int S = 0;
    public final int A;
    public final a B;
    public boolean C;
    public boolean D;
    public q0 E;
    public a0 F;
    public final FrameLayout G;
    public final TextView H;
    public final b I;
    public final ImageButton J;
    public final ImageButton K;
    public final LinearLayout L;
    public final TextView M;
    public final ImageButton N;
    public final ImageButton O;
    public final ImageButton P;
    public final ImageButton Q;
    public LinearLayout R;
    public final n0 s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f14919t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14920u;

    /* renamed from: v, reason: collision with root package name */
    public final t f14921v;

    /* renamed from: w, reason: collision with root package name */
    public p5.a<d5.j> f14922w;

    /* renamed from: x, reason: collision with root package name */
    public p5.a<d5.j> f14923x;

    /* renamed from: y, reason: collision with root package name */
    public p5.a<d5.j> f14924y;

    /* renamed from: z, reason: collision with root package name */
    public final float f14925z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14926a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14927b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14928c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14929d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14930e;

        /* renamed from: f, reason: collision with root package name */
        public final int f14931f;

        public a(boolean z6) {
            this.f14926a = z6 ? -14803165 : -1;
            this.f14927b = z6 ? -1512723 : -14737372;
            this.f14928c = z6 ? -4933441 : -10525848;
            this.f14929d = z6 ? -13947598 : -920587;
            this.f14930e = z6 ? -13223616 : -1841429;
            this.f14931f = z6 ? -12236721 : -2894116;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends View {
        public final int s;

        /* renamed from: t, reason: collision with root package name */
        public final Paint f14932t;

        /* renamed from: u, reason: collision with root package name */
        public float f14933u;

        /* renamed from: v, reason: collision with root package name */
        public ValueAnimator f14934v;

        /* renamed from: w, reason: collision with root package name */
        public float f14935w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f14936x;

        public b(Context context, int i6, int i7) {
            super(context);
            this.s = i7;
            Paint paint = new Paint(1);
            paint.setColor(i6);
            this.f14932t = paint;
        }

        public final void a(boolean z6) {
            if (this.f14936x == z6) {
                return;
            }
            this.f14936x = z6;
            if (z6) {
                b();
            } else {
                ValueAnimator valueAnimator = this.f14934v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f14934v = null;
            }
            invalidate();
        }

        public final void b() {
            if (isAttachedToWindow() && this.f14934v == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(1200L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new androidx.camera.view.n(1, this));
                valueAnimatorOfFloat.start();
                this.f14934v = valueAnimatorOfFloat;
            }
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f14936x) {
                b();
            }
        }

        @Override // android.view.View
        public final void onDetachedFromWindow() {
            ValueAnimator valueAnimator = this.f14934v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f14934v = null;
            super.onDetachedFromWindow();
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            kotlin.jvm.internal.j.e("canvas", canvas);
            float width = getWidth();
            float height = getHeight();
            boolean z6 = this.f14936x;
            Paint paint = this.f14932t;
            if (!z6) {
                if (this.f14935w <= 0.0f) {
                    return;
                }
                canvas.drawColor(this.s);
                canvas.drawRect(0.0f, 0.0f, width * this.f14935w, height, paint);
                return;
            }
            float f6 = 0.3f * width;
            float f7 = ((width + f6) * this.f14933u) + (-f6);
            float f8 = f7 < 0.0f ? 0.0f : f7;
            float f9 = f7 + f6;
            canvas.drawRect(f8, 0.0f, f9 > width ? width : f9, height, paint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ComponentActivity componentActivity, n0 n0Var, boolean z6, int i6) {
        boolean z7;
        n0 n0Var2;
        float f6;
        ViewGroup viewGroup;
        boolean z8;
        boolean z9;
        boolean z10;
        t tVar;
        int i7;
        LinearLayout linearLayout;
        super(componentActivity);
        String str = (i6 & 4) != 0 ? null : "embedded_document";
        boolean z11 = (i6 & 8) == 0;
        boolean z12 = (i6 & 16) == 0;
        boolean z13 = (i6 & 32) != 0 ? true : z6;
        this.s = n0Var;
        boolean z14 = n0Var.f14957e;
        this.f14919t = z14;
        boolean z15 = z14 && z13;
        this.f14920u = z15;
        if (z14) {
            String str2 = n0Var.f14953a;
            String str3 = n0Var.f14954b;
            String str4 = (8143 & 4) != 0 ? n0Var.f14955c : null;
            boolean z16 = n0Var.f14956d;
            boolean z17 = (8143 & 16) != 0 ? n0Var.f14957e : false;
            boolean z18 = (8143 & 32) != 0 ? n0Var.f14958f : false;
            boolean z19 = n0Var.f14959g;
            boolean z20 = n0Var.h;
            boolean z21 = n0Var.f14960i;
            z7 = z11;
            boolean z22 = n0Var.f14961j;
            int i8 = n0Var.f14962k;
            int i9 = (8143 & 2048) != 0 ? n0Var.f14963l : 0;
            String str5 = (8143 & 4096) != 0 ? n0Var.f14964m : null;
            kotlin.jvm.internal.j.e("scrollMode", str2);
            kotlin.jvm.internal.j.e("nightMode", str3);
            kotlin.jvm.internal.j.e("colorMode", str4);
            kotlin.jvm.internal.j.e("title", str5);
            n0Var2 = new n0(str2, str3, str4, z16, z17, z18, z19, z20, z21, z22, i8, i9, str5);
        } else {
            z7 = z11;
            n0Var2 = n0Var;
        }
        t tVar2 = new t(componentActivity, n0Var2, str);
        this.f14921v = tVar2;
        float f7 = getResources().getDisplayMetrics().density;
        this.f14925z = f7;
        int i10 = n0Var.f14963l;
        this.A = i10;
        a aVar = new a(tVar2.getDarkChrome$pdfviewer_release());
        this.B = aVar;
        this.D = true;
        FrameLayout frameLayout = new FrameLayout(componentActivity);
        this.G = frameLayout;
        k();
        LinearLayout linearLayout2 = new LinearLayout(componentActivity);
        linearLayout2.setOrientation(1);
        int i11 = aVar.f14927b;
        int i12 = aVar.f14931f;
        if (z15) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.setBackgroundColor(aVar.f14926a);
            linearLayout3.setElevation(3.0f * f7);
            linearLayout3.setClickable(true);
            f6 = f7;
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            linearLayout4.setMinimumHeight(b(64));
            z8 = z12;
            z9 = z15;
            linearLayout4.setPadding(b(4), 0, b(4), 0);
            if (z7) {
                linearLayout4.addView(c(R.drawable.pdf_ic_arrow_back, R.string.pdf_document_back, i11, new com.htmltoapk.template.a0(2, this)));
                z10 = z14;
            } else {
                z10 = z14;
                linearLayout4.addView(new View(getContext()), new LinearLayout.LayoutParams(b(12), 1));
            }
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setBackground(f(10.0f * f6, m0.a.e(i10, 36)));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.pdf_ic_document);
            imageView.setImageTintList(ColorStateList.valueOf(i10));
            viewGroup = frameLayout;
            tVar = tVar2;
            frameLayout2.addView(imageView, new FrameLayout.LayoutParams(b(20), b(20), 17));
            linearLayout4.addView(frameLayout2, new LinearLayout.LayoutParams(b(36), b(36)));
            LinearLayout linearLayout5 = new LinearLayout(getContext());
            linearLayout5.setOrientation(1);
            linearLayout5.setPadding(b(12), 0, b(4), 0);
            TextView textView = new TextView(getContext());
            textView.setText(n0Var.f14964m);
            textView.setTextColor(i11);
            textView.setTextSize(2, 16.0f);
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout5.addView(textView);
            TextView textView2 = new TextView(getContext());
            textView2.setText(R.string.pdf_document_loading);
            int i13 = aVar.f14928c;
            textView2.setTextColor(i13);
            textView2.setTextSize(2, 12.0f);
            textView2.setMaxLines(1);
            this.H = textView2;
            linearLayout5.addView(textView2);
            linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(0, -2, 1.0f));
            final int i14 = 1;
            ImageButton imageButtonC = c(R.drawable.pdf_ic_grid, R.string.pdf_document_pages, i13, new p5.a(this) { // from class: w2.e0

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0 f14896t;

                {
                    this.f14896t = this;
                }

                @Override // p5.a
                public final Object a() {
                    switch (i14) {
                        case 0:
                            l0 l0Var = this.f14896t;
                            t tVar3 = l0Var.f14921v;
                            int currentPage = tVar3.getCurrentPage() + 1;
                            if (l0Var.C) {
                                tVar3.l(currentPage);
                            }
                            break;
                        default:
                            this.f14896t.j();
                            break;
                    }
                    return d5.j.f12745a;
                }
            });
            imageButtonC.setVisibility(8);
            this.J = imageButtonC;
            linearLayout4.addView(imageButtonC);
            ImageButton imageButtonC2 = c(R.drawable.pdf_ic_more, R.string.pdf_document_more, i13, new k0());
            imageButtonC2.setVisibility(8);
            imageButtonC2.setOnClickListener(new com.htmltoapk.template.s0(this, imageButtonC2, 1));
            this.K = imageButtonC2;
            linearLayout4.addView(imageButtonC2);
            linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
            Context context = getContext();
            kotlin.jvm.internal.j.d("getContext(...)", context);
            b bVar = new b(context, i10, m0.a.e(i12, 102));
            bVar.a(true);
            this.I = bVar;
            i7 = -1;
            linearLayout3.addView(bVar, new LinearLayout.LayoutParams(-1, b(2)));
            linearLayout = linearLayout3;
        } else {
            f6 = f7;
            viewGroup = frameLayout;
            z8 = z12;
            z9 = z15;
            z10 = z14;
            tVar = tVar2;
            i7 = -1;
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout2.addView(linearLayout, new LinearLayout.LayoutParams(i7, -2));
        }
        ViewGroup viewGroup2 = viewGroup;
        t tVar3 = tVar;
        viewGroup2.addView(tVar3, new FrameLayout.LayoutParams(i7, i7));
        if (z10) {
            LinearLayout linearLayout6 = new LinearLayout(getContext());
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(16);
            linearLayout6.setPadding(b(4), b(4), b(4), b(4));
            GradientDrawable gradientDrawableF = f(28.0f * f6, aVar.f14929d);
            gradientDrawableF.setStroke(b(1), m0.a.e(i12, 128));
            linearLayout6.setBackground(gradientDrawableF);
            linearLayout6.setElevation(10.0f * f6);
            linearLayout6.setVisibility(4);
            linearLayout6.setClickable(true);
            boolean zA = kotlin.jvm.internal.j.a(n0Var.f14953a, "horizontal");
            final int i15 = 0;
            ImageButton imageButtonC3 = c(zA ? R.drawable.pdf_ic_chevron_left : R.drawable.pdf_ic_arrow_up, R.string.pdf_document_previous, i11, new p5.a(this) { // from class: w2.d0

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0 f14894t;

                {
                    this.f14894t = this;
                }

                @Override // p5.a
                public final Object a() {
                    switch (i15) {
                        case 0:
                            l0 l0Var = this.f14894t;
                            t tVar4 = l0Var.f14921v;
                            int currentPage = tVar4.getCurrentPage() - 1;
                            if (l0Var.C) {
                                tVar4.l(currentPage);
                            }
                            break;
                        default:
                            l0.a(this.f14894t);
                            break;
                    }
                    return d5.j.f12745a;
                }
            });
            this.N = imageButtonC3;
            linearLayout6.addView(imageButtonC3);
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(i11);
            textView3.setTextSize(2, 14.0f);
            textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView3.setGravity(17);
            textView3.setMinWidth(b(84));
            textView3.setPadding(b(14), b(10), b(14), b(10));
            textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(m0.a.e(i11, 31)), f(20.0f * f6, aVar.f14930e), null));
            textView3.setContentDescription(textView3.getContext().getString(R.string.pdf_document_go_to_page));
            textView3.setOnClickListener(new c4.d(2, this));
            this.M = textView3;
            linearLayout6.addView(textView3);
            int i16 = zA ? R.drawable.pdf_ic_chevron_right : R.drawable.pdf_ic_arrow_down;
            final int i17 = 0;
            ImageButton imageButtonC4 = c(i16, R.string.pdf_document_next, i11, new p5.a(this) { // from class: w2.e0

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l0 f14896t;

                {
                    this.f14896t = this;
                }

                @Override // p5.a
                public final Object a() {
                    switch (i17) {
                        case 0:
                            l0 l0Var = this.f14896t;
                            t tVar32 = l0Var.f14921v;
                            int currentPage = tVar32.getCurrentPage() + 1;
                            if (l0Var.C) {
                                tVar32.l(currentPage);
                            }
                            break;
                        default:
                            this.f14896t.j();
                            break;
                    }
                    return d5.j.f12745a;
                }
            });
            this.O = imageButtonC4;
            linearLayout6.addView(imageButtonC4);
            View view = new View(getContext());
            view.setBackgroundColor(i12);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b(1), b(24));
            layoutParams.setMarginStart(b(4));
            layoutParams.setMarginEnd(b(4));
            linearLayout6.addView(view, layoutParams);
            if (n0Var.f14960i) {
                ImageButton imageButtonC5 = c(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add, i11, new p5.a() { // from class: w2.f0
                    @Override // p5.a
                    public final Object a() {
                        l0 l0Var = this.s;
                        l0Var.f14921v.q();
                        l0Var.m();
                        return d5.j.f12745a;
                    }
                });
                this.P = imageButtonC5;
                linearLayout6.addView(imageButtonC5);
            }
            if (z9) {
                final int i18 = 0;
                ImageButton imageButtonC6 = c(R.drawable.pdf_ic_dark_mode, R.string.pdf_document_night_mode, i11, new p5.a(this) { // from class: w2.g0

                    /* renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ l0 f14903t;

                    {
                        this.f14903t = this;
                    }

                    @Override // p5.a
                    public final Object a() {
                        switch (i18) {
                            case 0:
                                l0 l0Var = this.f14903t;
                                l0Var.f14921v.setNight(!r1.f15017j0);
                                l0Var.k();
                                l0Var.l();
                                break;
                            default:
                                l0 l0Var2 = this.f14903t;
                                l0Var2.C = true;
                                l0Var2.k();
                                l0Var2.l();
                                l0Var2.m();
                                l0.b bVar2 = l0Var2.I;
                                if (bVar2 != null) {
                                    bVar2.a(false);
                                }
                                LinearLayout linearLayout7 = l0Var2.L;
                                if (linearLayout7 != null) {
                                    linearLayout7.setVisibility(l0Var2.D ? 0 : 4);
                                }
                                ImageButton imageButton = l0Var2.J;
                                if (imageButton != null) {
                                    imageButton.setVisibility(0);
                                }
                                ImageButton imageButton2 = l0Var2.K;
                                if (imageButton2 != null) {
                                    imageButton2.setVisibility(0);
                                }
                                p5.a<d5.j> aVar2 = l0Var2.f14923x;
                                if (aVar2 != null) {
                                    aVar2.a();
                                }
                                break;
                        }
                        return d5.j.f12745a;
                    }
                });
                this.Q = imageButtonC6;
                linearLayout6.addView(imageButtonC6);
                l();
            } else {
                linearLayout6.addView(c(R.drawable.pdf_ic_grid, R.string.pdf_document_pages, i11, new h0(this, 0)));
                final ImageButton imageButtonC7 = c(R.drawable.pdf_ic_more, R.string.pdf_document_more, i11, new k0());
                imageButtonC7.setOnClickListener(new View.OnClickListener() { // from class: w2.i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.s.i(imageButtonC7);
                    }
                });
                linearLayout6.addView(imageButtonC7);
            }
            this.L = linearLayout6;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
            layoutParams2.bottomMargin = b(20);
            viewGroup2.addView(linearLayout6, layoutParams2);
        }
        linearLayout2.addView(viewGroup2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        if (z8) {
            androidx.camera.camera2.interop.h hVar = new androidx.camera.camera2.interop.h(linearLayout, this);
            WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
            f0.d.k(this, hVar);
        }
        final int i19 = 1;
        tVar3.setOnReady(new p5.a(this) { // from class: w2.g0

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l0 f14903t;

            {
                this.f14903t = this;
            }

            @Override // p5.a
            public final Object a() {
                switch (i19) {
                    case 0:
                        l0 l0Var = this.f14903t;
                        l0Var.f14921v.setNight(!r1.f15017j0);
                        l0Var.k();
                        l0Var.l();
                        break;
                    default:
                        l0 l0Var2 = this.f14903t;
                        l0Var2.C = true;
                        l0Var2.k();
                        l0Var2.l();
                        l0Var2.m();
                        l0.b bVar2 = l0Var2.I;
                        if (bVar2 != null) {
                            bVar2.a(false);
                        }
                        LinearLayout linearLayout7 = l0Var2.L;
                        if (linearLayout7 != null) {
                            linearLayout7.setVisibility(l0Var2.D ? 0 : 4);
                        }
                        ImageButton imageButton = l0Var2.J;
                        if (imageButton != null) {
                            imageButton.setVisibility(0);
                        }
                        ImageButton imageButton2 = l0Var2.K;
                        if (imageButton2 != null) {
                            imageButton2.setVisibility(0);
                        }
                        p5.a<d5.j> aVar2 = l0Var2.f14923x;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        break;
                }
                return d5.j.f12745a;
            }
        });
        tVar3.setOnError(new h0(this, 1));
        tVar3.setOnPageChanged(new androidx.camera.camera2.interop.f(7, this));
        tVar3.setOnSingleTap(new p5.a(this) { // from class: w2.d0

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l0 f14894t;

            {
                this.f14894t = this;
            }

            @Override // p5.a
            public final Object a() {
                switch (i19) {
                    case 0:
                        l0 l0Var = this.f14894t;
                        t tVar4 = l0Var.f14921v;
                        int currentPage = tVar4.getCurrentPage() - 1;
                        if (l0Var.C) {
                            tVar4.l(currentPage);
                        }
                        break;
                    default:
                        l0.a(this.f14894t);
                        break;
                }
                return d5.j.f12745a;
            }
        });
    }

    public static void a(l0 l0Var) {
        if (l0Var.f14919t && l0Var.C) {
            l0Var.setChromeVisible(!l0Var.D);
        }
    }

    public static GradientDrawable f(float f6, int i6) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f6);
        gradientDrawable.setColor(i6);
        return gradientDrawable;
    }

    private final void setChromeVisible(boolean z6) {
        LinearLayout linearLayout = this.L;
        if (linearLayout == null) {
            return;
        }
        this.D = z6;
        linearLayout.animate().cancel();
        if (z6) {
            linearLayout.setVisibility(0);
            linearLayout.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
            return;
        }
        int height = linearLayout.getHeight();
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams", linearLayout.getLayoutParams());
        linearLayout.animate().translationY(height + ((ViewGroup.MarginLayoutParams) r4).bottomMargin).alpha(0.0f).setDuration(200L).withEndAction(new androidx.camera.core.j(4, this, linearLayout)).start();
    }

    public final int b(int i6) {
        return e5.i.h(i6 * this.f14925z);
    }

    public final ImageButton c(int i6, int i7, int i8, p5.a<d5.j> aVar) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i6);
        imageButton.setImageTintList(ColorStateList.valueOf(i8));
        imageButton.setBackground(h());
        imageButton.setContentDescription(imageButton.getContext().getString(i7));
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(b(48), b(48)));
        imageButton.setOnClickListener(new com.google.android.material.datepicker.t(2, aVar));
        return imageButton;
    }

    public final void d() {
        a0 a0Var = this.F;
        if (a0Var != null) {
            a0Var.dismiss();
        }
        this.F = null;
        q0 q0Var = this.E;
        if (q0Var != null && !q0Var.f14977f) {
            q0Var.f14977f = true;
            q0Var.f14973b.removeCallbacksAndMessages(null);
            q0Var.f14974c.execute(new androidx.camera.lifecycle.a(7, q0Var));
            q0Var.f14974c.shutdown();
        }
        this.E = null;
        b bVar = this.I;
        if (bVar != null) {
            bVar.a(false);
        }
        t tVar = this.f14921v;
        if (tVar.K) {
            return;
        }
        tVar.i();
        tVar.K = true;
        tVar.f15024t.removeCallbacks(tVar.f15014g0);
        tVar.f15024t.removeCallbacks(tVar.f15013f0);
        Iterator it = tVar.G.iterator();
        while (it.hasNext()) {
            ((t.a) it.next()).q();
        }
        tVar.G.clear();
        tVar.B.setAdapter(null);
        tVar.f15025u.getQueue().clear();
        tVar.f15025u.execute(new androidx.camera.lifecycle.a(6, tVar));
        tVar.f15025u.shutdown();
    }

    public final void e(Bundle bundle) {
        t tVar = this.f14921v;
        tVar.getClass();
        if (bundle != null && bundle.containsKey("pdf_document_page")) {
            tVar.M = bundle.getInt("pdf_document_page");
            tVar.N = bundle.getFloat("pdf_document_fraction");
            if (bundle.containsKey("pdf_document_night")) {
                tVar.O = Boolean.valueOf(bundle.getBoolean("pdf_document_night"));
            }
        }
        if (bundle == null || bundle.getBoolean("pdf_reader_layout_chrome", true)) {
            return;
        }
        this.D = false;
    }

    public final void g(Bundle bundle) {
        t tVar = this.f14921v;
        tVar.getClass();
        if (tVar.f15016i0 == 0) {
            int i6 = tVar.M;
            if (i6 >= 0) {
                bundle.putInt("pdf_document_page", i6);
            }
        } else {
            d5.c<Integer, Float> cVarB = tVar.b();
            int iIntValue = cVarB.s.intValue();
            float fFloatValue = cVarB.f12739t.floatValue();
            bundle.putInt("pdf_document_page", iIntValue);
            bundle.putFloat("pdf_document_fraction", fFloatValue);
            bundle.putBoolean("pdf_document_night", tVar.f15017j0);
        }
        bundle.putBoolean("pdf_reader_layout_chrome", this.D);
    }

    public final t getDocument() {
        return this.f14921v;
    }

    public final p5.a<d5.j> getOnBack() {
        return this.f14922w;
    }

    public final p5.a<d5.j> getOnError() {
        return this.f14924y;
    }

    public final p5.a<d5.j> getOnReady() {
        return this.f14923x;
    }

    public final n0 getOptions() {
        return this.s;
    }

    public final Drawable h() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        if (typedValue.resourceId != 0) {
            return getContext().getDrawable(typedValue.resourceId);
        }
        return null;
    }

    public final void i(ImageButton imageButton) {
        if (this.C) {
            Context context = getContext();
            t tVar = this.f14921v;
            PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, tVar.getDarkChrome$pdfviewer_release() ? android.R.style.Theme.Material : android.R.style.Theme.Material.Light), imageButton);
            popupMenu.getMenu().add(0, 1, 0, R.string.pdf_document_go_to_page);
            if (!this.f14920u) {
                popupMenu.getMenu().add(0, 2, 1, R.string.pdf_document_night_mode).setCheckable(true).setChecked(tVar.f15017j0);
            }
            if (tVar.getZoom() > 1.01f) {
                popupMenu.getMenu().add(0, 3, 2, R.string.pdf_document_reset_zoom);
            }
            if (this.s.f14961j && tVar.getDocumentFile() != null) {
                if (tVar.getOnShare() != null) {
                    popupMenu.getMenu().add(1, 4, 3, R.string.pdf_document_share);
                }
                if (tVar.getOnSave() != null) {
                    popupMenu.getMenu().add(1, 5, 4, R.string.pdf_document_save);
                }
                if (tVar.getOnPrint() != null) {
                    popupMenu.getMenu().add(1, 6, 5, R.string.pdf_document_print);
                }
            }
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: w2.j0
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    p5.l<File, d5.j> onShare;
                    p5.l<File, d5.j> onSave;
                    p5.l<File, d5.j> onPrint;
                    l0 l0Var = this.f14914a;
                    t tVar2 = l0Var.f14921v;
                    switch (menuItem.getItemId()) {
                        case 1:
                            tVar2.o();
                            return true;
                        case 2:
                            tVar2.setNight(!tVar2.f15017j0);
                            l0Var.k();
                            l0Var.l();
                            return true;
                        case 3:
                            tVar2.e();
                            return true;
                        case 4:
                            File documentFile = tVar2.getDocumentFile();
                            if (documentFile != null && (onShare = tVar2.getOnShare()) != null) {
                                onShare.invoke(documentFile);
                            }
                            return true;
                        case 5:
                            File documentFile2 = tVar2.getDocumentFile();
                            if (documentFile2 != null && (onSave = tVar2.getOnSave()) != null) {
                                onSave.invoke(documentFile2);
                            }
                            return true;
                        case 6:
                            File documentFile3 = tVar2.getDocumentFile();
                            if (documentFile3 != null && (onPrint = tVar2.getOnPrint()) != null) {
                                onPrint.invoke(documentFile3);
                            }
                            return true;
                        default:
                            return true;
                    }
                }
            });
            popupMenu.show();
        }
    }

    public final void j() {
        t tVar;
        File documentFile;
        if (this.C) {
            a0 a0Var = this.F;
            if ((a0Var == null || !a0Var.isShowing()) && (documentFile = (tVar = this.f14921v).getDocumentFile()) != null) {
                q0 q0Var = this.E;
                if (q0Var == null) {
                    q0Var = new q0(documentFile);
                    this.E = q0Var;
                }
                q0 q0Var2 = q0Var;
                Context context = getContext();
                kotlin.jvm.internal.j.d("getContext(...)", context);
                a0 a0Var2 = new a0(context, this.B, this.A, tVar.getPageCount(), tVar.getCurrentPage(), this.s.f14960i ? tVar.getBookmarkedPages() : null, tVar.f15017j0, documentFile.length(), q0Var2, new androidx.camera.core.streamsharing.c(3, this));
                a0Var2.show();
                this.F = a0Var2;
            }
        }
    }

    public final void k() {
        int i6;
        int i7;
        int i8;
        t tVar = this.f14921v;
        if (tVar.getDarkChrome$pdfviewer_release() || tVar.f15017j0) {
            i6 = 32;
            i7 = 36;
            i8 = 31;
        } else {
            i6 = 237;
            i7 = 241;
            i8 = 235;
        }
        setBackgroundColor(Color.rgb(i8, i6, i7));
    }

    public final void l() {
        Drawable drawableH;
        ImageButton imageButton = this.Q;
        if (imageButton == null) {
            return;
        }
        boolean z6 = this.f14921v.f15017j0;
        imageButton.setImageResource(z6 ? R.drawable.pdf_ic_light_mode : R.drawable.pdf_ic_dark_mode);
        int i6 = this.A;
        imageButton.setImageTintList(ColorStateList.valueOf(z6 ? i6 : this.B.f14927b));
        if (z6) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(m0.a.e(i6, 41));
            drawableH = gradientDrawable;
        } else {
            drawableH = h();
        }
        imageButton.setBackground(drawableH);
    }

    public final void m() {
        if (this.C) {
            t tVar = this.f14921v;
            int currentPage = tVar.getCurrentPage();
            int pageCount = tVar.getPageCount();
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(getContext().getString(R.string.pdf_document_page, Integer.valueOf(currentPage + 1), Integer.valueOf(pageCount)));
            }
            b bVar = this.I;
            if (bVar != null) {
                bVar.f14935w = u5.d.o(pageCount > 0 ? (currentPage + 1.0f) / pageCount : 0.0f, 0.0f, 1.0f);
                bVar.invalidate();
            }
            TextView textView2 = this.M;
            if (textView2 != null) {
                textView2.setText(getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(currentPage + 1), Integer.valueOf(pageCount)));
            }
            ImageButton imageButton = this.N;
            if (imageButton != null) {
                imageButton.setEnabled(currentPage > 0);
                imageButton.setAlpha(currentPage > 0 ? 1.0f : 0.38f);
            }
            ImageButton imageButton2 = this.O;
            if (imageButton2 != null) {
                int i6 = currentPage + 1;
                imageButton2.setEnabled(i6 < pageCount);
                imageButton2.setAlpha(i6 >= pageCount ? 0.38f : 1.0f);
            }
            ImageButton imageButton3 = this.P;
            if (imageButton3 != null) {
                boolean zContains = tVar.getBookmarkedPages().contains(Integer.valueOf(currentPage));
                imageButton3.setImageResource(zContains ? R.drawable.pdf_ic_bookmark : R.drawable.pdf_ic_bookmark_border);
                imageButton3.setImageTintList(ColorStateList.valueOf(zContains ? this.A : this.B.f14927b));
                imageButton3.setContentDescription(getContext().getString(zContains ? R.string.pdf_document_bookmark_remove : R.string.pdf_document_bookmark_add));
            }
        }
    }

    public final void setOnBack(p5.a<d5.j> aVar) {
        this.f14922w = aVar;
    }

    public final void setOnError(p5.a<d5.j> aVar) {
        this.f14924y = aVar;
    }

    public final void setOnReady(p5.a<d5.j> aVar) {
        this.f14923x = aVar;
    }
}
