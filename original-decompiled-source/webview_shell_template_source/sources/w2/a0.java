package w2;

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
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.htmltoapk.template.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import u0.f0;
import w2.l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a0 extends Dialog {
    public final float A;
    public final Set<Integer> B;
    public final RecyclerView C;
    public final LinearLayout D;
    public final c E;
    public final TextView F;
    public final TextView G;
    public final l0.a s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14865t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14866u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14867v;

    /* renamed from: w, reason: collision with root package name */
    public final List<Integer> f14868w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14869x;

    /* renamed from: y, reason: collision with root package name */
    public final q0 f14870y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.camera.core.streamsharing.c f14871z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i6, int i7) {
            super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(e5.i.h(View.MeasureSpec.getSize(i6) / 0.72f), 1073741824));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u, reason: collision with root package name */
        public final a f14872u;

        /* renamed from: v, reason: collision with root package name */
        public final ImageView f14873v;

        /* renamed from: w, reason: collision with root package name */
        public final ImageView f14874w;

        /* renamed from: x, reason: collision with root package name */
        public final TextView f14875x;

        /* renamed from: y, reason: collision with root package name */
        public int f14876y;

        public b(LinearLayout linearLayout, a aVar, ImageView imageView, ImageView imageView2, TextView textView) {
            super(linearLayout);
            this.f14872u = aVar;
            this.f14873v = imageView;
            this.f14874w = imageView2;
            this.f14875x = textView;
            this.f14876y = -1;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class c extends RecyclerView.e<b> {

        /* renamed from: d, reason: collision with root package name */
        public List<Integer> f14877d;

        /* renamed from: e, reason: collision with root package name */
        public final ColorMatrixColorFilter f14878e = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));

        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int a() {
            List<Integer> list = this.f14877d;
            return list != null ? list.size() : a0.this.f14866u;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void c(RecyclerView.b0 b0Var, final int i6) {
            b bVar = (b) b0Var;
            List<Integer> list = this.f14877d;
            if (list != null) {
                Integer num = (i6 < 0 || i6 >= list.size()) ? null : list.get(i6);
                if (num != null) {
                    i6 = num.intValue();
                }
            }
            bVar.f14876y = i6;
            boolean z6 = i6 == a0.this.f14867v;
            a aVar = bVar.f14872u;
            GradientDrawable gradientDrawable = new GradientDrawable();
            a0 a0Var = a0.this;
            gradientDrawable.setCornerRadius(a0Var.b(10));
            gradientDrawable.setStroke(z6 ? e5.i.h(a0Var.A * 2.5f) : a0Var.b(1), z6 ? a0Var.f14865t : a0Var.s.f14931f);
            aVar.setBackground(gradientDrawable);
            int iB = z6 ? a0.this.b(3) : a0.this.b(1);
            bVar.f14872u.setPadding(iB, iB, iB, iB);
            bVar.f14874w.setVisibility(a0.this.B.contains(Integer.valueOf(i6)) ? 0 : 8);
            int i7 = i6 + 1;
            bVar.f14875x.setText(String.valueOf(i7));
            TextView textView = bVar.f14875x;
            a0 a0Var2 = a0.this;
            textView.setTextColor(z6 ? a0Var2.f14865t : a0Var2.s.f14928c);
            bVar.f14875x.setTypeface(z6 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            bVar.f1441a.setContentDescription(a0.this.getContext().getString(R.string.pdf_document_page_number, Integer.valueOf(i7)));
            View view = bVar.f1441a;
            final a0 a0Var3 = a0.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: w2.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a0 a0Var4 = a0Var3;
                    a0Var4.f14871z.invoke(Integer.valueOf(i6));
                    a0Var4.dismiss();
                }
            });
            Bitmap bitmap = a0.this.f14870y.f14978g.get(Integer.valueOf(i6));
            if (bitmap != null) {
                h(bVar, bitmap);
                return;
            }
            bVar.f14873v.setColorFilter((ColorFilter) null);
            bVar.f14873v.setImageResource(R.drawable.pdf_ic_document);
            bVar.f14873v.setImageTintList(ColorStateList.valueOf(m0.a.e(a0.this.s.f14928c, 89)));
            bVar.f14873v.setScaleType(ImageView.ScaleType.CENTER);
            final q0 q0Var = a0.this.f14870y;
            final com.htmltoapk.template.j0 j0Var = new com.htmltoapk.template.j0(i6, 1, bVar, this);
            q0Var.getClass();
            Bitmap bitmap2 = q0Var.f14978g.get(Integer.valueOf(i6));
            if (bitmap2 != null) {
                j0Var.invoke(bitmap2);
            } else {
                if (q0Var.f14977f) {
                    return;
                }
                q0Var.f14974c.execute(new Runnable() { // from class: w2.p0
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
                        q0 q0Var2 = q0Var;
                        int i8 = i6;
                        com.htmltoapk.template.j0 j0Var2 = j0Var;
                        Bitmap bitmap3 = q0Var2.f14978g.get(Integer.valueOf(i8));
                        if (bitmap3 == null) {
                            if (q0Var2.f14977f) {
                                bitmapCreateBitmap = null;
                                if (bitmapCreateBitmap == null) {
                                    q0Var2.f14978g.put(Integer.valueOf(i8), bitmapCreateBitmap);
                                    bitmap3 = bitmapCreateBitmap;
                                } else {
                                    bitmap3 = null;
                                }
                                if (bitmap3 == null) {
                                    return;
                                }
                            } else {
                                try {
                                    PdfRenderer pdfRenderer = q0Var2.f14976e;
                                    if (pdfRenderer == null) {
                                        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(q0Var2.f14972a, 268435456);
                                        q0Var2.f14975d = parcelFileDescriptorOpen;
                                        PdfRenderer pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpen);
                                        q0Var2.f14976e = pdfRenderer2;
                                        pdfRenderer = pdfRenderer2;
                                    }
                                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i8);
                                    try {
                                        float height = pageOpenPage.getHeight();
                                        int width = pageOpenPage.getWidth();
                                        if (width < 1) {
                                            width = 1;
                                        }
                                        float f6 = height / width;
                                        if (57600 * f6 > 1000000.0f) {
                                            iSqrt = (int) Math.sqrt(1000000.0f / f6);
                                            if (iSqrt < 1) {
                                                iSqrt = 1;
                                            }
                                        } else {
                                            iSqrt = 240;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(iSqrt, u5.d.p(e5.i.h(iSqrt * f6), 1, iSqrt * 4), Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.eraseColor(-1);
                                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                        androidx.activity.c0.c(pageOpenPage, null);
                                    } finally {
                                    }
                                } catch (Exception e6) {
                                    Log.w("PdfThumbnailLoader", "Cannot render page " + i8, e6);
                                }
                                if (bitmapCreateBitmap == null) {
                                }
                                if (bitmap3 == null) {
                                }
                            }
                        }
                        q0Var2.f14973b.post(new androidx.camera.core.processing.concurrent.d(q0Var2, j0Var2, bitmap3, 5));
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 d(ViewGroup viewGroup) {
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            a0 a0Var = a0.this;
            linearLayout.setPadding(a0Var.b(4), a0Var.b(4), a0Var.b(4), a0Var.b(4));
            TypedValue typedValue = new TypedValue();
            linearLayout.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            if (typedValue.resourceId != 0) {
                linearLayout.setForeground(linearLayout.getContext().getDrawable(typedValue.resourceId));
            }
            RecyclerView.n nVar = new RecyclerView.n(-1, -2);
            nVar.setMargins(a0Var.b(2), a0Var.b(4), a0Var.b(2), a0Var.b(4));
            linearLayout.setLayoutParams(nVar);
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.j.d("getContext(...)", context);
            a aVar = new a(context);
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClipToOutline(true);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(a0Var.b(8));
            gradientDrawable.setColor(a0Var.s.f14930e);
            imageView.setBackground(gradientDrawable);
            aVar.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            ImageView imageView2 = new ImageView(viewGroup.getContext());
            imageView2.setImageResource(R.drawable.pdf_ic_bookmark);
            imageView2.setImageTintList(ColorStateList.valueOf(a0Var.f14865t));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a0Var.b(20), a0Var.b(20), 8388661);
            layoutParams.setMargins(a0Var.b(4), a0Var.b(4), a0Var.b(4), a0Var.b(4));
            aVar.addView(imageView2, layoutParams);
            linearLayout.addView(aVar, new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(viewGroup.getContext());
            textView.setTextSize(2, 12.0f);
            textView.setGravity(17);
            textView.setPadding(0, a0Var.b(6), 0, 0);
            linearLayout.addView(textView);
            return new b(linearLayout, aVar, imageView, imageView2, textView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var) {
            b bVar = (b) b0Var;
            kotlin.jvm.internal.j.e("holder", bVar);
            bVar.f14876y = -1;
            bVar.f14873v.setImageDrawable(null);
        }

        public final void h(b bVar, Bitmap bitmap) {
            ImageView imageView = bVar.f14873v;
            imageView.setImageTintList(null);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(bitmap);
            imageView.setColorFilter(a0.this.f14869x ? this.f14878e : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, l0.a aVar, int i6, int i7, int i8, List list, boolean z6, long j6, q0 q0Var, androidx.camera.core.streamsharing.c cVar) {
        super(context);
        kotlin.jvm.internal.j.e("palette", aVar);
        int i9 = aVar.f14928c;
        this.s = aVar;
        this.f14865t = i6;
        this.f14866u = i7;
        this.f14867v = i8;
        this.f14868w = list;
        this.f14869x = z6;
        this.f14870y = q0Var;
        this.f14871z = cVar;
        this.A = context.getResources().getDisplayMetrics().density;
        this.B = e5.q.l(list == null ? e5.s.s : list);
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.C = recyclerView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        c cVar2 = new c();
        this.E = cVar2;
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(aVar.f14926a);
        float fB = b(28);
        gradientDrawable.setCornerRadii(new float[]{fB, fB, fB, fB, 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayout2.setBackground(gradientDrawable);
        View view = new View(getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(b(2));
        gradientDrawable2.setColor(aVar.f14931f);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b(32), b(4));
        layoutParams.gravity = 1;
        layoutParams.topMargin = b(16);
        layoutParams.bottomMargin = b(12);
        linearLayout2.addView(view, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(b(20), 0, b(20), 0);
        TextView textView = new TextView(getContext());
        textView.setText(R.string.pdf_document_pages);
        textView.setTextColor(aVar.f14927b);
        textView.setTextSize(2, 22.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(getContext());
        StringBuilder sb = new StringBuilder();
        sb.append(textView2.getContext().getResources().getQuantityString(R.plurals.pdf_document_page_count, i7, Integer.valueOf(i7)));
        if (j6 > 0) {
            sb.append(" · ");
            sb.append(Formatter.formatShortFileSize(textView2.getContext(), j6));
        }
        String string = sb.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        textView2.setText(string);
        textView2.setTextColor(i9);
        textView2.setTextSize(2, 14.0f);
        linearLayout3.addView(textView2);
        if (list != null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setPadding(0, b(12), 0, b(4));
            String string2 = getContext().getString(R.string.pdf_document_all_pages);
            kotlin.jvm.internal.j.d("getString(...)", string2);
            TextView textViewA = a(string2, R.drawable.pdf_ic_grid, new com.htmltoapk.template.f0(3, this));
            this.F = textViewA;
            linearLayout4.addView(textViewA);
            String string3 = getContext().getString(R.string.pdf_document_bookmarks_count, Integer.valueOf(list.size()));
            kotlin.jvm.internal.j.d("getString(...)", string3);
            TextView textViewA2 = a(string3, R.drawable.pdf_ic_bookmark, new com.htmltoapk.template.h(3, this));
            this.G = textViewA2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, b(32));
            layoutParams2.setMarginStart(b(8));
            linearLayout4.addView(textViewA2, layoutParams2);
            linearLayout3.addView(linearLayout4);
        }
        linearLayout2.addView(linearLayout3);
        FrameLayout frameLayout = new FrameLayout(getContext());
        int iB = (getContext().getResources().getDisplayMetrics().widthPixels - b(32)) / b(108);
        int i10 = iB < 3 ? 3 : iB;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(i10));
        recyclerView.setAdapter(cVar2);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(b(16), b(8), b(16), b(24));
        recyclerView.setOverScrollMode(2);
        frameLayout.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(b(32), b(48), b(32), b(48));
        linearLayout.setVisibility(8);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.pdf_ic_bookmark_border);
        imageView.setImageTintList(ColorStateList.valueOf(i9));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(b(40), b(40)));
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setText(R.string.pdf_document_no_bookmarks);
        textView3.setTextColor(i9);
        textView3.setTextSize(2, 14.0f);
        textView3.setGravity(17);
        textView3.setPadding(0, b(12), 0, 0);
        linearLayout.addView(textView3);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        androidx.camera.core.l lVar = new androidx.camera.core.l(this);
        WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
        f0.d.k(linearLayout2, lVar);
        c(false);
        int i11 = i7 - 1;
        recyclerView.g0(u5.d.p(i8, 0, i11 < 0 ? 0 : i11));
        setContentView(linearLayout2);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
            window.setLayout(-1, e5.i.h(context.getResources().getDisplayMetrics().heightPixels * 0.85f));
            window.setWindowAnimations(android.R.style.Animation.InputMethod);
        }
    }

    public final TextView a(String str, int i6, p5.a<d5.j> aVar) {
        Drawable drawableMutate;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(16);
        textView.setPadding(b(8), 0, b(16), 0);
        textView.setCompoundDrawablePadding(b(8));
        Drawable drawable = textView.getContext().getDrawable(i6);
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            drawableMutate.setBounds(0, 0, b(18), b(18));
            textView.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        }
        textView.setMinHeight(b(32));
        textView.setOnClickListener(new com.htmltoapk.template.q0(aVar, 1));
        return textView;
    }

    public final int b(int i6) {
        return e5.i.h(i6 * this.A);
    }

    public final void c(boolean z6) {
        int i6;
        d(this.F, !z6);
        d(this.G, z6);
        List<Integer> list = this.f14868w;
        List<Integer> list2 = z6 ? list == null ? e5.s.s : list : null;
        c cVar = this.E;
        cVar.f14877d = list2;
        cVar.f1459a.b();
        int i7 = 0;
        boolean z7 = z6 && (list == null || list.isEmpty());
        this.D.setVisibility(z7 ? 0 : 8);
        int i8 = z7 ? 4 : 0;
        RecyclerView recyclerView = this.C;
        recyclerView.setVisibility(i8);
        if (!z6 && (i6 = this.f14867v) >= 0) {
            i7 = i6;
        }
        recyclerView.g0(i7);
    }

    public final void d(TextView textView, boolean z6) {
        if (textView == null) {
            return;
        }
        l0.a aVar = this.s;
        int i6 = this.f14865t;
        int i7 = z6 ? i6 : aVar.f14928c;
        textView.setTextColor(z6 ? i6 : aVar.f14927b);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(i7));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(b(8));
        if (z6) {
            gradientDrawable.setColor(m0.a.e(i6, 41));
        } else {
            gradientDrawable.setStroke(b(1), aVar.f14931f);
        }
        textView.setBackground(gradientDrawable);
        textView.setSelected(z6);
    }
}
