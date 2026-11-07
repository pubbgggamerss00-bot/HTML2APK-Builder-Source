package m9;

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
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.yalantis.ucrop.view.CropImageView;
import h9.r3;
import h9.u2;
import h9.y2;
import java.io.File;
import m9.s1;
import y3.q0;

/* loaded from: classes.dex */
public final class s1 extends FrameLayout {
    public final ImageButton A;
    public final ImageButton B;
    public LinearLayout C;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f17898a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17899b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17900c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f17901d;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<pg.f0> f17902e;

    /* renamed from: f, reason: collision with root package name */
    public eh.a<pg.f0> f17903f;

    /* renamed from: g, reason: collision with root package name */
    public eh.a<pg.f0> f17904g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17905h;

    /* renamed from: j, reason: collision with root package name */
    public final int f17906j;

    /* renamed from: k, reason: collision with root package name */
    public final a f17907k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17908l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17909m;

    /* renamed from: n, reason: collision with root package name */
    public a2 f17910n;

    /* renamed from: p, reason: collision with root package name */
    public x0 f17911p;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f17912q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f17913r;

    /* renamed from: s, reason: collision with root package name */
    public final b f17914s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageButton f17915t;

    /* renamed from: v, reason: collision with root package name */
    public final ImageButton f17916v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f17917w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f17918x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageButton f17919y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageButton f17920z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17921a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17922b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17923c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17924d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17925e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17926f;

        public a(boolean z10) {
            this.f17921a = z10 ? -14803165 : -1;
            this.f17922b = z10 ? -1512723 : -14737372;
            this.f17923c = z10 ? -4933441 : -10525848;
            this.f17924d = z10 ? -13947598 : -920587;
            this.f17925e = z10 ? -13223616 : -1841429;
            this.f17926f = z10 ? -12236721 : -2894116;
        }
    }

    public static final class b extends View {

        /* renamed from: a, reason: collision with root package name */
        public final int f17927a;

        /* renamed from: b, reason: collision with root package name */
        public final Paint f17928b;

        /* renamed from: c, reason: collision with root package name */
        public float f17929c;

        /* renamed from: d, reason: collision with root package name */
        public ValueAnimator f17930d;

        /* renamed from: e, reason: collision with root package name */
        public float f17931e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17932f;

        public b(Context context, int i10, int i11) {
            super(context);
            this.f17927a = i11;
            Paint paint = new Paint(1);
            paint.setColor(i10);
            this.f17928b = paint;
        }

        public final void a(boolean z10) {
            if (this.f17932f == z10) {
                return;
            }
            this.f17932f = z10;
            if (z10) {
                b();
            } else {
                ValueAnimator valueAnimator = this.f17930d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f17930d = null;
            }
            invalidate();
        }

        public final void b() {
            if (isAttachedToWindow() && this.f17930d == null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                valueAnimatorOfFloat.setDuration(1200L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m9.t1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        kotlin.jvm.internal.r.e(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        kotlin.jvm.internal.r.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        s1.b bVar = this.f17938a;
                        bVar.f17929c = fFloatValue;
                        bVar.invalidate();
                    }
                });
                valueAnimatorOfFloat.start();
                this.f17930d = valueAnimatorOfFloat;
            }
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f17932f) {
                b();
            }
        }

        @Override // android.view.View
        public final void onDetachedFromWindow() {
            ValueAnimator valueAnimator = this.f17930d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f17930d = null;
            super.onDetachedFromWindow();
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            kotlin.jvm.internal.r.e(canvas, "canvas");
            float width = getWidth();
            float height = getHeight();
            boolean z10 = this.f17932f;
            Paint paint = this.f17928b;
            if (!z10) {
                if (this.f17931e <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    return;
                }
                canvas.drawColor(this.f17927a);
                canvas.drawRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width * this.f17931e, height, paint);
                return;
            }
            float f10 = 0.3f * width;
            float f11 = ((width + f10) * this.f17929c) + (-f10);
            float f12 = f11 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f11;
            float f13 = f11 + f10;
            canvas.drawRect(f12, CropImageView.DEFAULT_ASPECT_RATIO, f13 > width ? width : f13, height, paint);
        }
    }

    public s1(PdfPreviewActivity pdfPreviewActivity, v1 v1Var) {
        boolean z10;
        g0 g0Var;
        float f10;
        ViewGroup viewGroup;
        int i10;
        final LinearLayout linearLayout;
        super(pdfPreviewActivity);
        this.f17898a = v1Var;
        boolean z11 = v1Var.f17969e;
        this.f17899b = z11;
        this.f17900c = z11;
        g0 g0Var2 = new g0(pdfPreviewActivity, z11 ? v1.a(v1Var, null, 0, null, 8143) : v1Var, null);
        this.f17901d = g0Var2;
        float f11 = getResources().getDisplayMetrics().density;
        this.f17905h = f11;
        int i11 = v1Var.f17976l;
        this.f17906j = i11;
        a aVar = new a(g0Var2.getDarkChrome$pdfviewer_release());
        this.f17907k = aVar;
        this.f17909m = true;
        FrameLayout frameLayout = new FrameLayout(pdfPreviewActivity);
        this.f17912q = frameLayout;
        h();
        LinearLayout linearLayout2 = new LinearLayout(pdfPreviewActivity);
        linearLayout2.setOrientation(1);
        int i12 = aVar.f17922b;
        int i13 = aVar.f17926f;
        if (z11) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.setBackgroundColor(aVar.f17921a);
            linearLayout3.setElevation(3.0f * f11);
            linearLayout3.setClickable(true);
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            linearLayout4.setMinimumHeight(b(64));
            z10 = z11;
            f10 = f11;
            linearLayout4.setPadding(b(4), 0, b(4), 0);
            linearLayout4.addView(c(R.drawable.pdf_ic_arrow_back, R.string.pdf_document_back, i12, new eh.a() { // from class: m9.q1
                @Override // eh.a
                public final Object invoke() {
                    eh.a<pg.f0> aVar2 = this.f17888a.f17902e;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return pg.f0.f21461a;
                }
            }));
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setBackground(d(10.0f * f10, r3.a.d(i11, 36)));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.pdf_ic_document);
            imageView.setImageTintList(ColorStateList.valueOf(i11));
            g0Var = g0Var2;
            viewGroup = frameLayout;
            frameLayout2.addView(imageView, new FrameLayout.LayoutParams(b(20), b(20), 17));
            linearLayout4.addView(frameLayout2, new LinearLayout.LayoutParams(b(36), b(36)));
            LinearLayout linearLayout5 = new LinearLayout(getContext());
            linearLayout5.setOrientation(1);
            linearLayout5.setPadding(b(12), 0, b(4), 0);
            TextView textView = new TextView(getContext());
            textView.setText(v1Var.f17977m);
            textView.setTextColor(i12);
            textView.setTextSize(2, 16.0f);
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout5.addView(textView);
            TextView textView2 = new TextView(getContext());
            textView2.setText(R.string.pdf_document_loading);
            int i14 = aVar.f17923c;
            textView2.setTextColor(i14);
            textView2.setTextSize(2, 12.0f);
            textView2.setMaxLines(1);
            this.f17913r = textView2;
            linearLayout5.addView(textView2);
            linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(0, -2, 1.0f));
            ImageButton imageButtonC = c(R.drawable.pdf_ic_grid, R.string.pdf_document_pages, i14, new r3(this, 1));
            imageButtonC.setVisibility(8);
            this.f17915t = imageButtonC;
            linearLayout4.addView(imageButtonC);
            final ImageButton imageButtonC2 = c(R.drawable.pdf_ic_more, R.string.pdf_document_more, i14, new g6.a(1));
            imageButtonC2.setVisibility(8);
            imageButtonC2.setOnClickListener(new View.OnClickListener() { // from class: m9.r1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17895a.f(imageButtonC2);
                }
            });
            this.f17916v = imageButtonC2;
            linearLayout4.addView(imageButtonC2);
            linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
            Context context = getContext();
            kotlin.jvm.internal.r.d(context, "getContext(...)");
            b bVar = new b(context, i11, r3.a.d(i13, 102));
            bVar.a(true);
            this.f17914s = bVar;
            i10 = -1;
            linearLayout3.addView(bVar, new LinearLayout.LayoutParams(-1, b(2)));
            linearLayout = linearLayout3;
        } else {
            z10 = z11;
            g0Var = g0Var2;
            f10 = f11;
            viewGroup = frameLayout;
            i10 = -1;
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout2.addView(linearLayout, new LinearLayout.LayoutParams(i10, -2));
        }
        g0 g0Var3 = g0Var;
        ViewGroup viewGroup2 = viewGroup;
        viewGroup2.addView(g0Var3, new FrameLayout.LayoutParams(i10, i10));
        if (z10) {
            LinearLayout linearLayout6 = new LinearLayout(getContext());
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(16);
            linearLayout6.setPadding(b(4), b(4), b(4), b(4));
            GradientDrawable gradientDrawableD = d(28.0f * f10, aVar.f17924d);
            gradientDrawableD.setStroke(b(1), r3.a.d(i13, 128));
            linearLayout6.setBackground(gradientDrawableD);
            linearLayout6.setElevation(10.0f * f10);
            linearLayout6.setVisibility(4);
            linearLayout6.setClickable(true);
            boolean zA = kotlin.jvm.internal.r.a(v1Var.f17965a, "horizontal");
            ImageButton imageButtonC3 = c(zA ? R.drawable.pdf_ic_chevron_left : R.drawable.pdf_ic_arrow_up, R.string.pdf_document_previous, i12, new u2(this, 1));
            this.f17919y = imageButtonC3;
            linearLayout6.addView(imageButtonC3);
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(i12);
            textView3.setTextSize(2, 14.0f);
            textView3.setTypeface(Typeface.create("sans-serif-medium", 0));
            textView3.setGravity(17);
            textView3.setMinWidth(b(84));
            textView3.setPadding(b(14), b(10), b(14), b(10));
            textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(r3.a.d(i12, 31)), d(20.0f * f10, aVar.f17925e), null));
            textView3.setContentDescription(textView3.getContext().getString(R.string.pdf_document_go_to_page));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: m9.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17745a.f17901d.q();
                }
            });
            this.f17918x = textView3;
            linearLayout6.addView(textView3);
            ImageButton imageButtonC4 = c(zA ? R.drawable.pdf_ic_chevron_right : R.drawable.pdf_ic_arrow_down, R.string.pdf_document_next, i12, new eh.a() { // from class: m9.d1
                @Override // eh.a
                public final Object invoke() {
                    s1 s1Var = this.f17762a;
                    g0 g0Var4 = s1Var.f17901d;
                    int currentPage = g0Var4.getCurrentPage() + 1;
                    if (s1Var.f17908l) {
                        g0Var4.n(currentPage);
                    }
                    return pg.f0.f21461a;
                }
            });
            this.f17920z = imageButtonC4;
            linearLayout6.addView(imageButtonC4);
            View view = new View(getContext());
            view.setBackgroundColor(i13);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b(1), b(24));
            layoutParams.setMarginStart(b(4));
            layoutParams.setMarginEnd(b(4));
            pg.f0 f0Var = pg.f0.f21461a;
            linearLayout6.addView(view, layoutParams);
            if (v1Var.f17973i) {
                ImageButton imageButtonC5 = c(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add, i12, new eh.a() { // from class: m9.e1
                    @Override // eh.a
                    public final Object invoke() {
                        s1 s1Var = this.f17765a;
                        s1Var.f17901d.s();
                        s1Var.j();
                        return pg.f0.f21461a;
                    }
                });
                this.A = imageButtonC5;
                linearLayout6.addView(imageButtonC5);
            }
            if (z10) {
                ImageButton imageButtonC6 = c(R.drawable.pdf_ic_dark_mode, R.string.pdf_document_night_mode, i12, new y2(this, 1));
                this.B = imageButtonC6;
                linearLayout6.addView(imageButtonC6);
                i();
            } else {
                linearLayout6.addView(c(R.drawable.pdf_ic_grid, R.string.pdf_document_pages, i12, new f1(this, 0)));
                final ImageButton imageButtonC7 = c(R.drawable.pdf_ic_more, R.string.pdf_document_more, i12, new g1(0));
                imageButtonC7.setOnClickListener(new View.OnClickListener() { // from class: m9.h1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f17818a.f(imageButtonC7);
                    }
                });
                linearLayout6.addView(imageButtonC7);
            }
            this.f17917w = linearLayout6;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
            layoutParams2.bottomMargin = b(20);
            viewGroup2.addView(linearLayout6, layoutParams2);
        }
        linearLayout2.addView(viewGroup2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        q0.c.b(this, new y3.u() { // from class: m9.j1
            @Override // y3.u
            public final y3.i1 c(View view2, y3.i1 i1Var) {
                View childAt;
                s1 s1Var = this;
                FrameLayout frameLayout3 = s1Var.f17912q;
                kotlin.jvm.internal.r.e(view2, "<unused var>");
                r3.f fVarI = i1Var.f33825a.i(647);
                kotlin.jvm.internal.r.d(fVarI, "getInsets(...)");
                int i15 = fVarI.f23166d;
                int i16 = fVarI.f23164b;
                int i17 = fVarI.f23165c;
                int i18 = fVarI.f23163a;
                LinearLayout linearLayout7 = linearLayout;
                if (linearLayout7 != null) {
                    linearLayout7.setPadding(0, i16, 0, 0);
                    frameLayout3.setPadding(i18, 0, i17, i15);
                } else {
                    frameLayout3.setPadding(i18, i16, i17, i15);
                }
                if (linearLayout7 != null && (childAt = linearLayout7.getChildAt(0)) != null) {
                    childAt.setPadding(s1Var.b(4) + i18, 0, s1Var.b(4) + i17, 0);
                }
                return y3.i1.f33824b;
            }
        });
        g0Var3.setOnReady(new m1(this, 0));
        g0Var3.setOnError(new n1(this, 0));
        g0Var3.setOnPageChanged(new eh.l() { // from class: m9.o1
            @Override // eh.l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                this.f17878a.j();
                return pg.f0.f21461a;
            }
        });
        g0Var3.setOnSingleTap(new p1(this, 0));
    }

    public static pg.f0 a(s1 s1Var) {
        if (s1Var.f17899b && s1Var.f17908l) {
            s1Var.setChromeVisible(!s1Var.f17909m);
        }
        return pg.f0.f21461a;
    }

    public static GradientDrawable d(float f10, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f10);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    private final void setChromeVisible(boolean z10) {
        LinearLayout linearLayout = this.f17917w;
        if (linearLayout == null) {
            return;
        }
        this.f17909m = z10;
        linearLayout.animate().cancel();
        if (z10) {
            linearLayout.setVisibility(0);
            linearLayout.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO).alpha(1.0f).setDuration(200L).start();
            return;
        }
        int height = linearLayout.getHeight();
        kotlin.jvm.internal.r.c(linearLayout.getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        linearLayout.animate().translationY(height + ((ViewGroup.MarginLayoutParams) r4).bottomMargin).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(200L).withEndAction(new l4.i(1, this, linearLayout)).start();
    }

    public final int b(int i10) {
        return gh.a.b(i10 * this.f17905h);
    }

    public final ImageButton c(int i10, int i11, int i12, final eh.a<pg.f0> aVar) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i10);
        imageButton.setImageTintList(ColorStateList.valueOf(i12));
        imageButton.setBackground(e());
        imageButton.setContentDescription(imageButton.getContext().getString(i11));
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(b(48), b(48)));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: m9.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.invoke();
            }
        });
        return imageButton;
    }

    public final Drawable e() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        if (typedValue.resourceId != 0) {
            return getContext().getDrawable(typedValue.resourceId);
        }
        return null;
    }

    public final void f(ImageButton imageButton) {
        if (this.f17908l) {
            Context context = getContext();
            g0 g0Var = this.f17901d;
            PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(context, g0Var.getDarkChrome$pdfviewer_release() ? android.R.style.Theme.Material : android.R.style.Theme.Material.Light), imageButton);
            popupMenu.getMenu().add(0, 1, 0, R.string.pdf_document_go_to_page);
            if (!this.f17900c) {
                popupMenu.getMenu().add(0, 2, 1, R.string.pdf_document_night_mode).setCheckable(true).setChecked(g0Var.S);
            }
            if (g0Var.getZoom() > 1.01f) {
                popupMenu.getMenu().add(0, 3, 2, R.string.pdf_document_reset_zoom);
            }
            if (this.f17898a.f17974j && g0Var.getDocumentFile() != null) {
                if (g0Var.getOnShare() != null) {
                    popupMenu.getMenu().add(1, 4, 3, R.string.pdf_document_share);
                }
                if (g0Var.getOnSave() != null) {
                    popupMenu.getMenu().add(1, 5, 4, R.string.pdf_document_save);
                }
                if (g0Var.getOnPrint() != null) {
                    popupMenu.getMenu().add(1, 6, 5, R.string.pdf_document_print);
                }
            }
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: m9.k1
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // android.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    eh.l<File, pg.f0> onShare;
                    eh.l<File, pg.f0> onSave;
                    eh.l<File, pg.f0> onPrint;
                    s1 s1Var = this.f17836a;
                    g0 g0Var2 = s1Var.f17901d;
                    switch (menuItem.getItemId()) {
                        case 1:
                            g0Var2.q();
                            return true;
                        case 2:
                            g0Var2.setNight(!g0Var2.S);
                            s1Var.h();
                            s1Var.i();
                            return true;
                        case 3:
                            g0Var2.d();
                            return true;
                        case 4:
                            File documentFile = g0Var2.getDocumentFile();
                            if (documentFile != null && (onShare = g0Var2.getOnShare()) != null) {
                                onShare.invoke(documentFile);
                            }
                            return true;
                        case 5:
                            File documentFile2 = g0Var2.getDocumentFile();
                            if (documentFile2 != null && (onSave = g0Var2.getOnSave()) != null) {
                                onSave.invoke(documentFile2);
                            }
                            return true;
                        case 6:
                            File documentFile3 = g0Var2.getDocumentFile();
                            if (documentFile3 != null && (onPrint = g0Var2.getOnPrint()) != null) {
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

    public final void g() {
        g0 g0Var;
        File documentFile;
        if (this.f17908l) {
            x0 x0Var = this.f17911p;
            if ((x0Var == null || !x0Var.isShowing()) && (documentFile = (g0Var = this.f17901d).getDocumentFile()) != null) {
                a2 a2Var = this.f17910n;
                if (a2Var == null) {
                    a2Var = new a2(documentFile);
                    this.f17910n = a2Var;
                }
                a2 a2Var2 = a2Var;
                Context context = getContext();
                kotlin.jvm.internal.r.d(context, "getContext(...)");
                x0 x0Var2 = new x0(context, this.f17907k, this.f17906j, g0Var.getPageCount(), g0Var.getCurrentPage(), this.f17898a.f17973i ? g0Var.getBookmarkedPages() : null, g0Var.S, documentFile.length(), a2Var2, new l1(this));
                x0Var2.show();
                this.f17911p = x0Var2;
            }
        }
    }

    public final g0 getDocument() {
        return this.f17901d;
    }

    public final eh.a<pg.f0> getOnBack() {
        return this.f17902e;
    }

    public final eh.a<pg.f0> getOnError() {
        return this.f17904g;
    }

    public final eh.a<pg.f0> getOnReady() {
        return this.f17903f;
    }

    public final v1 getOptions() {
        return this.f17898a;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        g0 g0Var = this.f17901d;
        if (g0Var.getDarkChrome$pdfviewer_release() || g0Var.S) {
            i10 = 32;
            i11 = 36;
            i12 = 31;
        } else {
            i10 = 237;
            i11 = 241;
            i12 = 235;
        }
        setBackgroundColor(Color.rgb(i12, i10, i11));
    }

    public final void i() {
        Drawable drawableE;
        ImageButton imageButton = this.B;
        if (imageButton == null) {
            return;
        }
        boolean z10 = this.f17901d.S;
        imageButton.setImageResource(z10 ? R.drawable.pdf_ic_light_mode : R.drawable.pdf_ic_dark_mode);
        int i10 = this.f17906j;
        imageButton.setImageTintList(ColorStateList.valueOf(z10 ? i10 : this.f17907k.f17922b));
        if (z10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(r3.a.d(i10, 41));
            drawableE = gradientDrawable;
        } else {
            drawableE = e();
        }
        imageButton.setBackground(drawableE);
    }

    public final void j() {
        if (this.f17908l) {
            g0 g0Var = this.f17901d;
            int currentPage = g0Var.getCurrentPage();
            int pageCount = g0Var.getPageCount();
            TextView textView = this.f17913r;
            if (textView != null) {
                textView.setText(getContext().getString(R.string.pdf_document_page, Integer.valueOf(currentPage + 1), Integer.valueOf(pageCount)));
            }
            b bVar = this.f17914s;
            if (bVar != null) {
                bVar.f17931e = jh.j.l(pageCount > 0 ? (currentPage + 1.0f) / pageCount : 0.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                bVar.invalidate();
            }
            TextView textView2 = this.f17918x;
            if (textView2 != null) {
                textView2.setText(getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(currentPage + 1), Integer.valueOf(pageCount)));
            }
            ImageButton imageButton = this.f17919y;
            if (imageButton != null) {
                imageButton.setEnabled(currentPage > 0);
                imageButton.setAlpha(currentPage > 0 ? 1.0f : 0.38f);
            }
            ImageButton imageButton2 = this.f17920z;
            if (imageButton2 != null) {
                int i10 = currentPage + 1;
                imageButton2.setEnabled(i10 < pageCount);
                imageButton2.setAlpha(i10 >= pageCount ? 0.38f : 1.0f);
            }
            ImageButton imageButton3 = this.A;
            if (imageButton3 != null) {
                boolean zContains = g0Var.getBookmarkedPages().contains(Integer.valueOf(currentPage));
                imageButton3.setImageResource(zContains ? R.drawable.pdf_ic_bookmark : R.drawable.pdf_ic_bookmark_border);
                imageButton3.setImageTintList(ColorStateList.valueOf(zContains ? this.f17906j : this.f17907k.f17922b));
                imageButton3.setContentDescription(getContext().getString(zContains ? R.string.pdf_document_bookmark_remove : R.string.pdf_document_bookmark_add));
            }
        }
    }

    public final void setOnBack(eh.a<pg.f0> aVar) {
        this.f17902e = aVar;
    }

    public final void setOnError(eh.a<pg.f0> aVar) {
        this.f17904g = aVar;
    }

    public final void setOnReady(eh.a<pg.f0> aVar) {
        this.f17903f = aVar;
    }
}
