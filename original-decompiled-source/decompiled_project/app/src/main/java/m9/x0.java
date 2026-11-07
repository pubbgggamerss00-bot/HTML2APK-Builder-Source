package m9;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.text.format.Formatter;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.v;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.b9;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import m9.s1;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import y3.q0;

/* loaded from: classes.dex */
public final class x0 extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final s1.a f17985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17988d;

    /* renamed from: e, reason: collision with root package name */
    public final List<Integer> f17989e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17990f;

    /* renamed from: g, reason: collision with root package name */
    public final a2 f17991g;

    /* renamed from: h, reason: collision with root package name */
    public final l1 f17992h;

    /* renamed from: j, reason: collision with root package name */
    public final float f17993j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<Integer> f17994k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.recyclerview.widget.v f17995l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f17996m;

    /* renamed from: n, reason: collision with root package name */
    public final c f17997n;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f17998p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f17999q;

    public static final class a extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(gh.a.b(View.MeasureSpec.getSize(i10) / 0.72f), 1073741824));
        }
    }

    public static final class b extends v.a0 {

        /* renamed from: t, reason: collision with root package name */
        public final a f18000t;

        /* renamed from: u, reason: collision with root package name */
        public final ImageView f18001u;

        /* renamed from: v, reason: collision with root package name */
        public final ImageView f18002v;

        /* renamed from: w, reason: collision with root package name */
        public final TextView f18003w;

        /* renamed from: x, reason: collision with root package name */
        public int f18004x;

        public b(LinearLayout linearLayout, a aVar, ImageView imageView, ImageView imageView2, TextView textView) {
            super(linearLayout);
            this.f18000t = aVar;
            this.f18001u = imageView;
            this.f18002v = imageView2;
            this.f18003w = textView;
            this.f18004x = -1;
        }
    }

    public final class c extends v.d<b> {

        /* renamed from: c, reason: collision with root package name */
        public List<Integer> f18005c;

        /* renamed from: d, reason: collision with root package name */
        public final ColorMatrixColorFilter f18006d = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO}));

        public c() {
        }

        @Override // androidx.recyclerview.widget.v.d
        public final int a() {
            List<Integer> list = this.f18005c;
            return list != null ? list.size() : x0.this.f17987c;
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void b(v.a0 a0Var, final int i10) {
            Integer num;
            b bVar = (b) a0Var;
            List<Integer> list = this.f18005c;
            if (list != null && (num = (Integer) qg.x.E(i10, list)) != null) {
                i10 = num.intValue();
            }
            bVar.f18004x = i10;
            boolean z10 = i10 == x0.this.f17988d;
            a aVar = bVar.f18000t;
            GradientDrawable gradientDrawable = new GradientDrawable();
            x0 x0Var = x0.this;
            gradientDrawable.setCornerRadius(x0Var.b(10));
            gradientDrawable.setStroke(z10 ? gh.a.b(x0Var.f17993j * 2.5f) : x0Var.b(1), z10 ? x0Var.f17986b : x0Var.f17985a.f17926f);
            aVar.setBackground(gradientDrawable);
            int iB = z10 ? x0.this.b(3) : x0.this.b(1);
            bVar.f18000t.setPadding(iB, iB, iB, iB);
            bVar.f18002v.setVisibility(x0.this.f17994k.contains(Integer.valueOf(i10)) ? 0 : 8);
            int i11 = i10 + 1;
            bVar.f18003w.setText(String.valueOf(i11));
            TextView textView = bVar.f18003w;
            x0 x0Var2 = x0.this;
            textView.setTextColor(z10 ? x0Var2.f17986b : x0Var2.f17985a.f17923c);
            bVar.f18003w.setTypeface(z10 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            bVar.f2708a.setContentDescription(x0.this.getContext().getString(R.string.pdf_document_page_number, Integer.valueOf(i11)));
            View view = bVar.f2708a;
            final x0 x0Var3 = x0.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: m9.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x0 x0Var4 = x0Var3;
                    x0Var4.f17992h.invoke(Integer.valueOf(i10));
                    x0Var4.dismiss();
                }
            });
            Bitmap bitmap = x0.this.f17991g.f17731g.get(Integer.valueOf(i10));
            if (bitmap != null) {
                g(bVar, bitmap);
                return;
            }
            bVar.f18001u.setColorFilter((ColorFilter) null);
            bVar.f18001u.setImageResource(R.drawable.pdf_ic_document);
            bVar.f18001u.setImageTintList(ColorStateList.valueOf(r3.a.d(x0.this.f17985a.f17923c, 89)));
            bVar.f18001u.setScaleType(ImageView.ScaleType.CENTER);
            final a2 a2Var = x0.this.f17991g;
            final z0 z0Var = new z0(bVar, i10, this);
            a2Var.getClass();
            Bitmap bitmap2 = a2Var.f17731g.get(Integer.valueOf(i10));
            if (bitmap2 != null) {
                z0Var.invoke(bitmap2);
            } else {
                if (a2Var.f17730f) {
                    return;
                }
                a2Var.f17727c.execute(new Runnable() { // from class: m9.y1
                    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
                    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() throws FileNotFoundException {
                        int iSqrt;
                        Bitmap bitmapCreateBitmap;
                        final a2 a2Var2 = a2Var;
                        int i12 = i10;
                        final z0 z0Var2 = z0Var;
                        final Bitmap bitmap3 = a2Var2.f17731g.get(Integer.valueOf(i12));
                        if (bitmap3 == null) {
                            if (a2Var2.f17730f) {
                                bitmapCreateBitmap = null;
                                if (bitmapCreateBitmap == null) {
                                    a2Var2.f17731g.put(Integer.valueOf(i12), bitmapCreateBitmap);
                                    bitmap3 = bitmapCreateBitmap;
                                } else {
                                    bitmap3 = null;
                                }
                                if (bitmap3 == null) {
                                    return;
                                }
                            } else {
                                try {
                                    PdfRenderer pdfRenderer = a2Var2.f17729e;
                                    if (pdfRenderer == null) {
                                        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(a2Var2.f17725a, 268435456);
                                        a2Var2.f17728d = parcelFileDescriptorOpen;
                                        PdfRenderer pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpen);
                                        a2Var2.f17729e = pdfRenderer2;
                                        pdfRenderer = pdfRenderer2;
                                    }
                                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i12);
                                    try {
                                        float height = pageOpenPage.getHeight();
                                        int width = pageOpenPage.getWidth();
                                        if (width < 1) {
                                            width = 1;
                                        }
                                        float f10 = height / width;
                                        if (57600 * f10 > 1000000.0f) {
                                            iSqrt = (int) Math.sqrt(1000000.0f / f10);
                                            if (iSqrt < 1) {
                                                iSqrt = 1;
                                            }
                                        } else {
                                            iSqrt = 240;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(iSqrt, jh.j.m(gh.a.b(iSqrt * f10), 1, iSqrt * 4), Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.eraseColor(-1);
                                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                        ch.a.a(pageOpenPage, null);
                                    } finally {
                                    }
                                } catch (Exception e10) {
                                    Log.w("PdfThumbnailLoader", "Cannot render page " + i12, e10);
                                }
                                if (bitmapCreateBitmap == null) {
                                }
                                if (bitmap3 == null) {
                                }
                            }
                        }
                        a2Var2.f17726b.post(new Runnable() { // from class: m9.z1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a2 a2Var3 = a2Var2;
                                z0 z0Var3 = z0Var2;
                                Bitmap bitmap4 = bitmap3;
                                if (a2Var3.f17730f) {
                                    return;
                                }
                                z0Var3.invoke(bitmap4);
                            }
                        });
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.v.d
        public final v.a0 c(androidx.recyclerview.widget.v vVar) {
            LinearLayout linearLayout = new LinearLayout(vVar.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            x0 x0Var = x0.this;
            linearLayout.setPadding(x0Var.b(4), x0Var.b(4), x0Var.b(4), x0Var.b(4));
            TypedValue typedValue = new TypedValue();
            linearLayout.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            if (typedValue.resourceId != 0) {
                linearLayout.setForeground(linearLayout.getContext().getDrawable(typedValue.resourceId));
            }
            v.m mVar = new v.m(-1, -2);
            mVar.setMargins(x0Var.b(2), x0Var.b(4), x0Var.b(2), x0Var.b(4));
            linearLayout.setLayoutParams(mVar);
            Context context = vVar.getContext();
            kotlin.jvm.internal.r.d(context, "getContext(...)");
            a aVar = new a(context);
            ImageView imageView = new ImageView(vVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClipToOutline(true);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(x0Var.b(8));
            gradientDrawable.setColor(x0Var.f17985a.f17925e);
            imageView.setBackground(gradientDrawable);
            aVar.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            ImageView imageView2 = new ImageView(vVar.getContext());
            imageView2.setImageResource(R.drawable.pdf_ic_bookmark);
            imageView2.setImageTintList(ColorStateList.valueOf(x0Var.f17986b));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(x0Var.b(20), x0Var.b(20), 8388661);
            layoutParams.setMargins(x0Var.b(4), x0Var.b(4), x0Var.b(4), x0Var.b(4));
            pg.f0 f0Var = pg.f0.f21461a;
            aVar.addView(imageView2, layoutParams);
            linearLayout.addView(aVar, new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(vVar.getContext());
            textView.setTextSize(2, 12.0f);
            textView.setGravity(17);
            textView.setPadding(0, x0Var.b(6), 0, 0);
            linearLayout.addView(textView);
            return new b(linearLayout, aVar, imageView, imageView2, textView);
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void f(v.a0 a0Var) {
            b holder = (b) a0Var;
            kotlin.jvm.internal.r.e(holder, "holder");
            holder.f18004x = -1;
            holder.f18001u.setImageDrawable(null);
        }

        public final void g(b bVar, Bitmap bitmap) {
            ImageView imageView = bVar.f18001u;
            imageView.setImageTintList(null);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(bitmap);
            imageView.setColorFilter(x0.this.f17990f ? this.f18006d : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, s1.a palette, int i10, int i11, int i12, List list, boolean z10, long j10, a2 a2Var, l1 l1Var) {
        super(context);
        kotlin.jvm.internal.r.e(palette, "palette");
        int i13 = palette.f17923c;
        this.f17985a = palette;
        this.f17986b = i10;
        this.f17987c = i11;
        this.f17988d = i12;
        this.f17989e = list;
        this.f17990f = z10;
        this.f17991g = a2Var;
        this.f17992h = l1Var;
        this.f17993j = context.getResources().getDisplayMetrics().density;
        this.f17994k = qg.x.h0(list == null ? qg.z.f22752a : list);
        androidx.recyclerview.widget.v vVar = new androidx.recyclerview.widget.v(context);
        this.f17995l = vVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17996m = linearLayout;
        c cVar = new c();
        this.f17997n = cVar;
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(palette.f17921a);
        float fB = b(28);
        gradientDrawable.setCornerRadii(new float[]{fB, fB, fB, fB, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO});
        linearLayout2.setBackground(gradientDrawable);
        View view = new View(getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(b(2));
        gradientDrawable2.setColor(palette.f17926f);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b(32), b(4));
        layoutParams.gravity = 1;
        layoutParams.topMargin = b(16);
        layoutParams.bottomMargin = b(12);
        pg.f0 f0Var = pg.f0.f21461a;
        linearLayout2.addView(view, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(b(20), 0, b(20), 0);
        TextView textView = new TextView(getContext());
        textView.setText(R.string.pdf_document_pages);
        textView.setTextColor(palette.f17922b);
        textView.setTextSize(2, 22.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(getContext());
        StringBuilder sb = new StringBuilder();
        sb.append(textView2.getContext().getResources().getQuantityString(R.plurals.pdf_document_page_count, i11, Integer.valueOf(i11)));
        if (j10 > 0) {
            sb.append(" · ");
            sb.append(Formatter.formatShortFileSize(textView2.getContext(), j10));
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        textView2.setText(string);
        textView2.setTextColor(i13);
        textView2.setTextSize(2, 14.0f);
        linearLayout3.addView(textView2);
        if (list != null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setPadding(0, b(12), 0, b(4));
            String string2 = getContext().getString(R.string.pdf_document_all_pages);
            kotlin.jvm.internal.r.d(string2, "getString(...)");
            TextView textViewA = a(R.drawable.pdf_ic_grid, new b9(this, 1), string2);
            this.f17998p = textViewA;
            linearLayout4.addView(textViewA);
            String string3 = getContext().getString(R.string.pdf_document_bookmarks_count, Integer.valueOf(list.size()));
            kotlin.jvm.internal.r.d(string3, "getString(...)");
            TextView textViewA2 = a(R.drawable.pdf_ic_bookmark, new j9.w0(this, 1), string3);
            this.f17999q = textViewA2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, b(32));
            layoutParams2.setMarginStart(b(8));
            linearLayout4.addView(textViewA2, layoutParams2);
            linearLayout3.addView(linearLayout4);
        }
        linearLayout2.addView(linearLayout3);
        FrameLayout frameLayout = new FrameLayout(getContext());
        int iB = (getContext().getResources().getDisplayMetrics().widthPixels - b(32)) / b(HeaderItem.DATA_START_OFFSET);
        int i14 = iB < 3 ? 3 : iB;
        getContext();
        vVar.setLayoutManager(new GridLayoutManager(i14));
        vVar.setAdapter(cVar);
        vVar.setClipToPadding(false);
        vVar.setPadding(b(16), b(8), b(16), b(24));
        vVar.setOverScrollMode(2);
        frameLayout.addView(vVar, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(b(32), b(48), b(32), b(48));
        linearLayout.setVisibility(8);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.pdf_ic_bookmark_border);
        imageView.setImageTintList(ColorStateList.valueOf(i13));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(b(40), b(40)));
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setText(R.string.pdf_document_no_bookmarks);
        textView3.setTextColor(i13);
        textView3.setTextSize(2, 14.0f);
        textView3.setGravity(17);
        textView3.setPadding(0, b(12), 0, 0);
        linearLayout.addView(textView3);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        y3.u uVar = new y3.u() { // from class: m9.v0
            @Override // y3.u
            public final y3.i1 c(View view2, y3.i1 i1Var) {
                kotlin.jvm.internal.r.e(view2, "<unused var>");
                int i15 = i1Var.f33825a.i(2).f23166d;
                x0 x0Var = this.f17964a;
                x0Var.f17995l.setPadding(x0Var.b(16), x0Var.b(8), x0Var.b(16), x0Var.b(24) + i15);
                return i1Var;
            }
        };
        Field field = y3.q0.f33885a;
        q0.c.b(linearLayout2, uVar);
        c(false);
        int i15 = i11 - 1;
        vVar.c0(jh.j.m(i12, 0, i15 < 0 ? 0 : i15));
        setContentView(linearLayout2);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
            window.setLayout(-1, gh.a.b(context.getResources().getDisplayMetrics().heightPixels * 0.85f));
            window.setWindowAnimations(android.R.style.Animation.InputMethod);
        }
    }

    public final TextView a(int i10, final eh.a aVar, String str) {
        Drawable drawableMutate;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(16);
        textView.setPadding(b(8), 0, b(16), 0);
        textView.setCompoundDrawablePadding(b(8));
        Drawable drawable = textView.getContext().getDrawable(i10);
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            drawableMutate.setBounds(0, 0, b(18), b(18));
            textView.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        }
        textView.setMinHeight(b(32));
        textView.setOnClickListener(new View.OnClickListener() { // from class: m9.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.invoke();
            }
        });
        return textView;
    }

    public final int b(int i10) {
        return gh.a.b(i10 * this.f17993j);
    }

    public final void c(boolean z10) {
        int i10;
        d(this.f17998p, !z10);
        d(this.f17999q, z10);
        List<Integer> list = this.f17989e;
        List<Integer> list2 = z10 ? list == null ? qg.z.f22752a : list : null;
        c cVar = this.f17997n;
        cVar.f18005c = list2;
        cVar.f2727a.a();
        int i11 = 0;
        boolean z11 = z10 && (list == null || list.isEmpty());
        this.f17996m.setVisibility(z11 ? 0 : 8);
        int i12 = z11 ? 4 : 0;
        androidx.recyclerview.widget.v vVar = this.f17995l;
        vVar.setVisibility(i12);
        if (!z10 && (i10 = this.f17988d) >= 0) {
            i11 = i10;
        }
        vVar.c0(i11);
    }

    public final void d(TextView textView, boolean z10) {
        if (textView == null) {
            return;
        }
        s1.a aVar = this.f17985a;
        int i10 = this.f17986b;
        int i11 = z10 ? i10 : aVar.f17923c;
        textView.setTextColor(z10 ? i10 : aVar.f17922b);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(i11));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(b(8));
        if (z10) {
            gradientDrawable.setColor(r3.a.d(i10, 41));
        } else {
            gradientDrawable.setStroke(b(1), aVar.f17926f);
        }
        textView.setBackground(gradientDrawable);
        textView.setSelected(z10);
    }
}
