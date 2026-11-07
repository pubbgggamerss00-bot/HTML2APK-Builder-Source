package m9;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.Scroller;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.v;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.g8;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.g0;
import m9.r0;

/* loaded from: classes.dex */
public final class g0 extends FrameLayout {
    public int A;
    public boolean B;
    public final TreeSet<Integer> C;
    public final LinearLayout D;
    public final TextView E;
    public final ProgressBar F;
    public final TextView G;
    public final u0 H;
    public final LinearLayout I;
    public final TextView K;
    public final ImageButton L;
    public final ImageButton M;
    public final ImageButton N;
    public final d0 O;
    public final e0 P;
    public File Q;
    public int R;
    public boolean S;
    public eh.a<pg.f0> T;
    public eh.a<pg.f0> U;
    public eh.l<? super Integer, pg.f0> V;
    public eh.a<pg.f0> W;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f17773a;

    /* renamed from: a0, reason: collision with root package name */
    public eh.l<? super File, pg.f0> f17774a0;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f17775b;

    /* renamed from: b0, reason: collision with root package name */
    public eh.l<? super File, pg.f0> f17776b0;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f17777c;

    /* renamed from: c0, reason: collision with root package name */
    public eh.l<? super File, pg.f0> f17778c0;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f17779d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17780e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17781f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17782g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17783h;

    /* renamed from: j, reason: collision with root package name */
    public final int f17784j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f17785k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayoutManager f17786l;

    /* renamed from: m, reason: collision with root package name */
    public final c f17787m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray<Double> f17788n;

    /* renamed from: p, reason: collision with root package name */
    public double f17789p;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f17790q;

    /* renamed from: r, reason: collision with root package name */
    public PdfRenderer f17791r;

    /* renamed from: s, reason: collision with root package name */
    public ParcelFileDescriptor f17792s;

    /* renamed from: t, reason: collision with root package name */
    public File f17793t;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f17794v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17795w;

    /* renamed from: x, reason: collision with root package name */
    public int f17796x;

    /* renamed from: y, reason: collision with root package name */
    public float f17797y;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f17798z;

    public static final class a extends v.p {
        public a() {
        }

        @Override // androidx.recyclerview.widget.v.p
        public final void a(androidx.recyclerview.widget.v vVar, int i10) {
            if (i10 == 0) {
                g0 g0Var = g0.this;
                g0Var.l();
                g0Var.j();
                g0Var.v();
            }
        }

        @Override // androidx.recyclerview.widget.v.p
        public final void b(androidx.recyclerview.widget.v vVar, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            g0.this.f();
        }
    }

    public final class b extends v.a0 {

        /* renamed from: t, reason: collision with root package name */
        public final a1 f17800t;

        /* renamed from: u, reason: collision with root package name */
        public int f17801u;

        /* renamed from: v, reason: collision with root package name */
        public volatile int f17802v;

        /* renamed from: w, reason: collision with root package name */
        public volatile int f17803w;

        /* renamed from: x, reason: collision with root package name */
        public Future<?> f17804x;

        /* renamed from: y, reason: collision with root package name */
        public Future<?> f17805y;

        public b(a1 a1Var) {
            super(a1Var);
            this.f17800t = a1Var;
            this.f17801u = -1;
        }

        public final void p() {
            this.f17802v++;
            Future<?> future = this.f17804x;
            if (future != null) {
                future.cancel(false);
            }
            this.f17804x = null;
            q();
            g0.this.f17777c.purge();
            a1 a1Var = this.f17800t;
            Bitmap bitmap = a1Var.f17717d;
            a1Var.f17717d = null;
            a1Var.invalidate();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }

        public final void q() {
            this.f17803w++;
            Future<?> future = this.f17805y;
            if (future != null) {
                future.cancel(false);
            }
            this.f17805y = null;
            a1 a1Var = this.f17800t;
            ColorMatrixColorFilter colorMatrixColorFilter = a1.f17713l;
            RectF rectF = a1Var.f17719f;
            Bitmap bitmap = a1Var.f17718e;
            a1Var.f17718e = null;
            rectF.setEmpty();
            a1Var.f17720g = CropImageView.DEFAULT_ASPECT_RATIO;
            a1Var.invalidate();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public final class c extends v.d<b> {
        public c() {
        }

        @Override // androidx.recyclerview.widget.v.d
        public final int a() {
            return g0.this.getPageCount();
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void b(v.a0 a0Var, int i10) {
            b bVar = (b) a0Var;
            a1 a1Var = bVar.f17800t;
            g0 g0Var = g0.this;
            g0Var.f17790q.add(bVar);
            bVar.p();
            bVar.f17801u = i10;
            Double d10 = g0Var.f17788n.get(i10);
            double dDoubleValue = d10 != null ? d10.doubleValue() : g0Var.f17789p;
            a1Var.setRatio(dDoubleValue);
            a1Var.setNight(g0Var.S);
            v.m mVar = g0Var.f17781f ? new v.m(-1, -1) : new v.m(-1, jh.j.m((int) (g0Var.g() * dDoubleValue), 1, 100000));
            mVar.setMargins(g0Var.c(8), g0Var.c(8), g0Var.c(8), g0Var.c(8));
            a1Var.setLayoutParams(mVar);
            a1Var.setContentDescription(g0Var.getContext().getString(R.string.pdf_document_page, Integer.valueOf(i10 + 1), Integer.valueOf(g0Var.getPageCount())));
            g0.a(g0Var, bVar);
        }

        @Override // androidx.recyclerview.widget.v.d
        public final v.a0 c(androidx.recyclerview.widget.v vVar) {
            g0 g0Var = g0.this;
            Context context = g0Var.getContext();
            kotlin.jvm.internal.r.d(context, "getContext(...)");
            a1 a1Var = new a1(context);
            a1Var.setFitWholePage(g0Var.f17781f);
            a1Var.setElevation(2 * g0Var.f17780e);
            b bVar = g0Var.new b(a1Var);
            g0Var.f17790q.add(bVar);
            return bVar;
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void d(v.a0 a0Var) {
            b bVar = (b) a0Var;
            if (bVar.f17800t.getBase() == null && bVar.f17804x == null) {
                g0.a(g0.this, bVar);
            }
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void e(v.a0 a0Var) {
            ((b) a0Var).p();
        }

        @Override // androidx.recyclerview.widget.v.d
        public final void f(v.a0 a0Var) {
            b holder = (b) a0Var;
            kotlin.jvm.internal.r.e(holder, "holder");
            holder.p();
            holder.f17801u = -1;
            g0.this.f17790q.remove(holder);
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f17808a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f17809b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SeekBar f17810c;

        public d(kotlin.jvm.internal.b0 b0Var, g0 g0Var, SeekBar seekBar) {
            this.f17808a = b0Var;
            this.f17809b = g0Var;
            this.f17810c = seekBar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable text) {
            kotlin.jvm.internal.r.e(text, "text");
            kotlin.jvm.internal.b0 b0Var = this.f17808a;
            if (b0Var.f16318a) {
                return;
            }
            String input = text.toString();
            int pageCount = this.f17809b.getPageCount();
            kotlin.jvm.internal.r.e(input, "input");
            Integer numG = mh.s.g(mh.x.W(input).toString());
            Integer numValueOf = null;
            if (numG != null) {
                int iIntValue = numG.intValue();
                if (1 > iIntValue || iIntValue > pageCount) {
                    numG = null;
                }
                if (numG != null) {
                    numValueOf = Integer.valueOf(numG.intValue() - 1);
                }
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                b0Var.f16318a = true;
                this.f17810c.setProgress(iIntValue2);
                b0Var.f16318a = false;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence text, int i10, int i11, int i12) {
            kotlin.jvm.internal.r.e(text, "text");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence text, int i10, int i11, int i12) {
            kotlin.jvm.internal.r.e(text, "text");
        }
    }

    public static final class e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.b0 f17811a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f17812b;

        public e(kotlin.jvm.internal.b0 b0Var, EditText editText) {
            this.f17811a = b0Var;
            this.f17812b = editText;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar bar, int i10, boolean z10) {
            kotlin.jvm.internal.r.e(bar, "bar");
            if (z10) {
                kotlin.jvm.internal.b0 b0Var = this.f17811a;
                if (b0Var.f16318a) {
                    return;
                }
                b0Var.f16318a = true;
                String strValueOf = String.valueOf(i10 + 1);
                EditText editText = this.f17812b;
                editText.setText(strValueOf);
                editText.setSelection(editText.getText().length());
                editText.setError(null);
                b0Var.f16318a = false;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar bar) {
            kotlin.jvm.internal.r.e(bar, "bar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar bar) {
            kotlin.jvm.internal.r.e(bar, "bar");
        }
    }

    public static final class f extends androidx.recyclerview.widget.o {
        @Override // androidx.recyclerview.widget.o
        public final int j() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.o
        public final int k() {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Type inference failed for: r4v10, types: [m9.e0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [m9.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(Context context, v1 v1Var, String str) {
        Boolean boolValueOf;
        androidx.recyclerview.widget.u uVar;
        c2 c2Var;
        androidx.recyclerview.widget.v vVar;
        super(context);
        this.f17773a = v1Var;
        this.f17775b = new Handler(Looper.getMainLooper());
        int i10 = 1;
        this.f17777c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        w1 w1Var = new w1(context, str);
        this.f17779d = w1Var;
        this.f17780e = getResources().getDisplayMetrics().density;
        boolean zA = kotlin.jvm.internal.r.a(v1Var.f17965a, "horizontal");
        this.f17781f = zA;
        int i11 = 0;
        boolean zBooleanValue = (getResources().getConfiguration().uiMode & 48) == 32;
        String str2 = v1Var.f17967c;
        boolean z10 = kotlin.jvm.internal.r.a(str2, "dark") ? true : kotlin.jvm.internal.r.a(str2, "light") ? false : zBooleanValue;
        this.f17782g = z10;
        this.f17783h = z10 ? Color.argb(240, 32, 33, 36) : Color.argb(245, 255, 255, 255);
        this.f17784j = z10 ? -1 : Color.rgb(32, 33, 36);
        c2 c2Var2 = new c2(context);
        this.f17785k = c2Var2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(!zA ? 1 : 0);
        this.f17786l = linearLayoutManager;
        c cVar = new c();
        this.f17787m = cVar;
        this.f17788n = new SparseArray<>();
        this.f17789p = Math.sqrt(2.0d);
        this.f17790q = new LinkedHashSet();
        this.f17796x = -1;
        this.A = -1;
        this.B = true;
        this.C = new TreeSet<>();
        this.D = new LinearLayout(context);
        this.E = new TextView(context);
        this.F = new ProgressBar(context);
        this.G = new TextView(context);
        this.H = (!v1Var.f17971g || zA) ? null : new u0(context, v1Var.f17976l);
        this.O = new Runnable() { // from class: m9.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17761a.G.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(250L).start();
            }
        };
        this.P = new Runnable() { // from class: m9.e0
            /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i12;
                final g0 g0Var = this.f17764a;
                if (g0Var.f17794v || g0Var.R == 0) {
                    return;
                }
                if (!g0Var.f17785k.l0()) {
                    Iterator it = g0Var.f17790q.iterator();
                    while (it.hasNext()) {
                        ((g0.b) it.next()).q();
                    }
                    return;
                }
                if (g0Var.f17785k.getScrollState() != 0) {
                    return;
                }
                u1 u1VarN0 = g0Var.f17785k.n0();
                final float zoom = g0Var.f17785k.getZoom();
                int childCount = g0Var.f17785k.getChildCount();
                boolean z11 = false;
                int i13 = 0;
                while (i13 < childCount) {
                    View childAt = g0Var.f17785k.getChildAt(i13);
                    a1 a1Var = childAt instanceof a1 ? (a1) childAt : null;
                    if (a1Var == null) {
                        i12 = i13;
                    } else {
                        v.a0 a0VarI = g0Var.f17785k.I(a1Var);
                        final g0.b bVar = a0VarI instanceof g0.b ? (g0.b) a0VarI : null;
                        if (bVar != null && bVar.f17801u >= 0) {
                            RectF pageBox = a1Var.getPageBox();
                            float left = a1Var.getLeft() + pageBox.left;
                            float top = a1Var.getTop() + pageBox.top;
                            float left2 = a1Var.getLeft() + pageBox.right;
                            float top2 = a1Var.getTop() + pageBox.bottom;
                            float fMax = Math.max(u1VarN0.f17959a, left);
                            float fMax2 = Math.max(u1VarN0.f17960b, top);
                            float fMin = Math.min(u1VarN0.f17961c, left2);
                            float fMin2 = Math.min(u1VarN0.f17962d, top2);
                            if (fMin - fMax <= CropImageView.DEFAULT_ASPECT_RATIO || fMin2 - fMax2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                i12 = i13;
                                bVar.q();
                            } else {
                                final RectF rectF = new RectF(fMax - a1Var.getLeft(), fMax2 - a1Var.getTop(), fMin - a1Var.getLeft(), fMin2 - a1Var.getTop());
                                if (a1Var.getDetail() == null || a1Var.getDetailZoom() != zoom || !a1Var.getDetailBox().contains(rectF)) {
                                    final RectF rectF2 = new RectF(pageBox);
                                    bVar.f17803w++;
                                    Future<?> future = bVar.f17805y;
                                    if (future != null) {
                                        future.cancel(z11);
                                    }
                                    final int i14 = bVar.f17803w;
                                    final int i15 = bVar.f17801u;
                                    final int iB = gh.a.b(rectF.width() * zoom);
                                    if (iB < 1) {
                                        iB = 1;
                                    }
                                    final int iB2 = gh.a.b(rectF.height() * zoom);
                                    if (iB2 < 1) {
                                        iB2 = 1;
                                    }
                                    i12 = i13;
                                    if (iB * iB2 <= 12000000) {
                                        bVar.f17805y = g0Var.f17777c.submit(new Runnable() { // from class: m9.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v10, types: [T, android.graphics.Bitmap] */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                PdfRenderer pdfRenderer;
                                                final g0 g0Var2 = g0Var;
                                                final g0.b bVar2 = bVar;
                                                final int i16 = i14;
                                                final int i17 = i15;
                                                RectF rectF3 = rectF2;
                                                final float f10 = zoom;
                                                int i18 = iB;
                                                int i19 = iB2;
                                                final RectF rectF4 = rectF;
                                                kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
                                                try {
                                                    if (!g0Var2.f17794v && bVar2.f17803w == i16 && (pdfRenderer = g0Var2.f17791r) != null) {
                                                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i17);
                                                        try {
                                                            float fWidth = rectF3.width();
                                                            int width = pageOpenPage.getWidth();
                                                            if (width < 1) {
                                                                width = 1;
                                                            }
                                                            float f11 = (fWidth / width) * f10;
                                                            Matrix matrix = new Matrix();
                                                            matrix.setScale(f11, f11);
                                                            matrix.postTranslate((-(rectF4.left - rectF3.left)) * f10, (-(rectF4.top - rectF3.top)) * f10);
                                                            ?? CreateBitmap = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
                                                            CreateBitmap.eraseColor(-1);
                                                            g0Var3.f16327a = CreateBitmap;
                                                            pageOpenPage.render(CreateBitmap, null, matrix, 1);
                                                            pg.f0 f0Var = pg.f0.f21461a;
                                                            ch.a.a(pageOpenPage, null);
                                                            T t3 = g0Var3.f16327a;
                                                            kotlin.jvm.internal.r.b(t3);
                                                            final Bitmap bitmap = (Bitmap) t3;
                                                            g0Var2.f17775b.post(new Runnable() { // from class: m9.n
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    g0 g0Var4 = g0Var2;
                                                                    g0.b bVar3 = bVar2;
                                                                    int i20 = i16;
                                                                    int i21 = i17;
                                                                    float f12 = f10;
                                                                    Bitmap bitmap2 = bitmap;
                                                                    RectF rectF5 = rectF4;
                                                                    if (g0Var4.f17794v || bVar3.f17803w != i20 || bVar3.f17801u != i21 || g0Var4.f17785k.getZoom() != f12) {
                                                                        bitmap2.recycle();
                                                                        return;
                                                                    }
                                                                    bVar3.f17805y = null;
                                                                    a1 a1Var2 = bVar3.f17800t;
                                                                    RectF rectF6 = a1Var2.f17719f;
                                                                    Bitmap bitmap3 = a1Var2.f17718e;
                                                                    a1Var2.f17718e = bitmap2;
                                                                    if (bitmap2 != null) {
                                                                        rectF6.set(rectF5);
                                                                    } else {
                                                                        rectF6.setEmpty();
                                                                    }
                                                                    if (bitmap2 == null) {
                                                                        f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                                                                    }
                                                                    a1Var2.f17720g = f12;
                                                                    a1Var2.invalidate();
                                                                    if (bitmap3 != null) {
                                                                        bitmap3.recycle();
                                                                    }
                                                                }
                                                            });
                                                        } finally {
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    if (!(th2 instanceof Exception) && !(th2 instanceof OutOfMemoryError)) {
                                                        throw th2;
                                                    }
                                                    Log.w("PdfDocumentView", "Cannot render PDF detail " + i17, th2);
                                                    Bitmap bitmap2 = (Bitmap) g0Var3.f16327a;
                                                    if (bitmap2 != null) {
                                                        bitmap2.recycle();
                                                    }
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                    i13 = i12 + 1;
                    z11 = false;
                }
            }
        };
        SharedPreferences sharedPreferences = w1Var.f17980a;
        if (sharedPreferences == null) {
            boolValueOf = null;
        } else {
            sharedPreferences = sharedPreferences.contains("night") ? sharedPreferences : null;
            if (sharedPreferences != null) {
                boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("night", false));
            }
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            String str3 = v1Var.f17966b;
            if (kotlin.jvm.internal.r.a(str3, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6996m)) {
                zBooleanValue = true;
            } else if (!kotlin.jvm.internal.r.a(str3, "system")) {
                zBooleanValue = false;
            }
        }
        this.S = zBooleanValue;
        u();
        c2Var2.setLayoutManager(linearLayoutManager);
        c2Var2.setAdapter(cVar);
        c2Var2.setItemAnimator(null);
        c2Var2.setItemViewCacheSize(0);
        v.q.a aVarA = c2Var2.getRecycledViewPool().a(0);
        aVarA.f2769b = 4;
        ArrayList<v.a0> arrayList = aVarA.f2768a;
        while (arrayList.size() > 4) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.f17785k.setVertical(!this.f17781f);
        this.f17785k.setContinuous(!this.f17781f);
        this.f17785k.setZoomEnabled(this.f17773a.f17972h);
        this.f17785k.setOverScrollMode(2);
        if (this.f17781f && (vVar = (uVar = new androidx.recyclerview.widget.u()).f2519a) != (c2Var = this.f17785k)) {
            b0.a aVar = uVar.f2520b;
            if (vVar != null) {
                ArrayList arrayList2 = vVar.f2679l0;
                if (arrayList2 != null) {
                    arrayList2.remove(aVar);
                }
                uVar.f2519a.setOnFlingListener(null);
            }
            uVar.f2519a = c2Var;
            if (c2Var != null) {
                if (c2Var.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                uVar.f2519a.h(aVar);
                uVar.f2519a.setOnFlingListener(uVar);
                new Scroller(uVar.f2519a.getContext(), new DecelerateInterpolator());
                uVar.b();
            }
        }
        this.f17785k.setOnSingleTap(new g8(this, i10));
        this.f17785k.setOnTransformChanged(new j9.y(this, i10));
        this.f17785k.setOnTransformSettled(new f0(this, i11));
        this.f17785k.h(new a());
        addView(this.f17785k, new FrameLayout.LayoutParams(-1, -1));
        u0 u0Var = this.H;
        if (u0Var != null) {
            u0Var.setLabel(new com.basitce.htmltoapk.data.local.dao.l(i10, context, this));
            u0Var.setOnScrub(new eh.l() { // from class: m9.b
                @Override // eh.l
                public final Object invoke(Object obj) {
                    int iM;
                    float fFloatValue = ((Float) obj).floatValue();
                    g0 g0Var = this.f17732a;
                    int i12 = g0Var.R;
                    if (i12 <= 1) {
                        iM = 0;
                    } else {
                        int i13 = i12 - 1;
                        iM = jh.j.m((int) ((jh.j.l(fFloatValue, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * i13) + 0.5f), 0, i13);
                    }
                    LinearLayoutManager linearLayoutManager2 = g0Var.f17786l;
                    linearLayoutManager2.f2434x = jh.j.m(iM, 0, g0Var.R - 1);
                    linearLayoutManager2.f2435y = 0;
                    LinearLayoutManager.d dVar = linearLayoutManager2.f2436z;
                    if (dVar != null) {
                        dVar.f2458a = -1;
                    }
                    linearLayoutManager2.n0();
                    TextView textView = g0Var.K;
                    if (textView != null) {
                        textView.setText(g0Var.getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(iM + 1), Integer.valueOf(g0Var.R)));
                    }
                    return pg.f0.f21461a;
                }
            });
            u0Var.setOnScrubEnd(new androidx.room.c0(this, 2));
            addView(u0Var, new FrameLayout.LayoutParams(-1, -1));
        }
        TextView textView = this.G;
        textView.setTextColor(this.f17784j);
        textView.setTextSize(2, 13.0f);
        textView.setPadding(c(12), c(6), c(12), c(6));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(c(16));
        gradientDrawable.setColor(this.f17783h);
        textView.setBackground(gradientDrawable);
        textView.setElevation(c(3));
        textView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        textView.setImportantForAccessibility(2);
        View view = this.G;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = c(12);
        pg.f0 f0Var = pg.f0.f21461a;
        addView(view, layoutParams);
        this.D.setOrientation(1);
        this.D.setGravity(17);
        this.D.setPadding(c(32), c(32), c(32), c(32));
        this.F.setIndeterminate(true);
        this.F.setIndeterminateTintList(ColorStateList.valueOf(this.f17773a.f17976l));
        this.D.addView(this.F, new LinearLayout.LayoutParams(c(40), c(40)));
        this.E.setText(context.getString(R.string.pdf_document_loading));
        this.E.setTextColor((this.f17782g || this.S) ? -1 : Color.rgb(32, 33, 36));
        this.E.setGravity(17);
        this.E.setPadding(0, c(12), 0, 0);
        this.D.addView(this.E, new LinearLayout.LayoutParams(-2, -2));
        addView(this.D, new FrameLayout.LayoutParams(-1, -2, 17));
        if (this.f17773a.f17969e) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setPadding(c(4), 0, c(4), 0);
            linearLayout.setBackgroundColor(this.f17783h);
            linearLayout.setElevation(c(6));
            linearLayout.setMinimumHeight(c(52));
            linearLayout.setVisibility(8);
            linearLayout.setClickable(true);
            ImageButton imageButtonE = e(R.drawable.pdf_ic_chevron_left, R.string.pdf_document_previous, new androidx.room.n0(this, 2));
            this.L = imageButtonE;
            linearLayout.addView(imageButtonE);
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(this.f17784j);
            textView2.setTextSize(2, 15.0f);
            textView2.setGravity(17);
            textView2.setMinWidth(c(72));
            textView2.setPadding(c(8), c(12), c(8), c(12));
            textView2.setBackground(o(false));
            textView2.setContentDescription(textView2.getContext().getString(R.string.pdf_document_go_to_page));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: m9.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f17766a.q();
                }
            });
            this.K = textView2;
            linearLayout.addView(textView2);
            ImageButton imageButtonE2 = e(R.drawable.pdf_ic_chevron_right, R.string.pdf_document_next, new g(this, i11));
            this.M = imageButtonE2;
            linearLayout.addView(imageButtonE2);
            linearLayout.addView(new View(getContext()), new LinearLayout.LayoutParams(0, 1, 1.0f));
            if (this.f17773a.f17973i) {
                ImageButton imageButtonE3 = e(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add, new eh.a() { // from class: m9.h
                    @Override // eh.a
                    public final Object invoke() {
                        this.f17814a.s();
                        return pg.f0.f21461a;
                    }
                });
                this.N = imageButtonE3;
                linearLayout.addView(imageButtonE3);
            }
            final ImageButton imageButtonE4 = e(R.drawable.pdf_ic_more, R.string.pdf_document_more, new h9.n0(i10));
            imageButtonE4.setOnClickListener(new View.OnClickListener() { // from class: m9.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final g0 g0Var = this.f17825a;
                    v1 v1Var2 = g0Var.f17773a;
                    if (g0Var.R == 0) {
                        return;
                    }
                    PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(g0Var.getContext(), g0Var.f17782g ? android.R.style.Theme.Material : android.R.style.Theme.Material.Light), imageButtonE4);
                    popupMenu.getMenu().add(0, 1, 0, R.string.pdf_document_go_to_page);
                    if (v1Var2.f17973i) {
                        popupMenu.getMenu().add(0, 2, 1, R.string.pdf_document_bookmarks);
                    }
                    popupMenu.getMenu().add(0, 3, 2, R.string.pdf_document_first_page);
                    popupMenu.getMenu().add(0, 4, 3, R.string.pdf_document_last_page);
                    popupMenu.getMenu().add(0, 5, 4, R.string.pdf_document_night_mode).setCheckable(true).setChecked(g0Var.S);
                    if (g0Var.f17785k.l0()) {
                        popupMenu.getMenu().add(0, 6, 5, R.string.pdf_document_reset_zoom);
                    }
                    if (v1Var2.f17974j && g0Var.Q != null) {
                        if (g0Var.f17774a0 != null) {
                            popupMenu.getMenu().add(1, 7, 6, R.string.pdf_document_share);
                        }
                        if (g0Var.f17776b0 != null) {
                            popupMenu.getMenu().add(1, 8, 7, R.string.pdf_document_save);
                        }
                        if (g0Var.f17778c0 != null) {
                            popupMenu.getMenu().add(1, 9, 8, R.string.pdf_document_print);
                        }
                    }
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: m9.w
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // android.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            eh.l<? super File, pg.f0> lVar;
                            eh.l<? super File, pg.f0> lVar2;
                            eh.l<? super File, pg.f0> lVar3;
                            int itemId = menuItem.getItemId();
                            final g0 g0Var2 = g0Var;
                            switch (itemId) {
                                case 1:
                                    g0Var2.q();
                                    return true;
                                case 2:
                                    TreeSet<Integer> treeSet = g0Var2.C;
                                    if (treeSet.isEmpty()) {
                                        Toast.makeText(g0Var2.getContext(), R.string.pdf_document_no_bookmarks, 1).show();
                                        return true;
                                    }
                                    final List listC0 = qg.x.c0(treeSet);
                                    AlertDialog.Builder title = new AlertDialog.Builder(g0Var2.getContext(), g0Var2.f17782g ? android.R.style.Theme.Material.Dialog.Alert : android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(R.string.pdf_document_bookmarks);
                                    ArrayList arrayList3 = new ArrayList(qg.p.h(listC0, 10));
                                    Iterator it = listC0.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(g0Var2.getContext().getString(R.string.pdf_document_page_number, Integer.valueOf(((Number) it.next()).intValue() + 1)));
                                    }
                                    title.setItems((CharSequence[]) arrayList3.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: m9.b0
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i12) {
                                            g0Var2.n(((Number) listC0.get(i12)).intValue());
                                        }
                                    }).setNegativeButton(R.string.pdf_document_close, (DialogInterface.OnClickListener) null).show();
                                    return true;
                                case 3:
                                    g0Var2.n(0);
                                    return true;
                                case 4:
                                    g0Var2.n(g0Var2.R - 1);
                                    return true;
                                case 5:
                                    g0Var2.setNight(!g0Var2.S);
                                    return true;
                                case 6:
                                    g0Var2.f17785k.i0(1.0f, r10.getWidth() / 2.0f, r10.getHeight() / 2.0f);
                                    return true;
                                case 7:
                                    File file = g0Var2.Q;
                                    if (file != null && (lVar = g0Var2.f17774a0) != null) {
                                        lVar.invoke(file);
                                    }
                                    return true;
                                case 8:
                                    File file2 = g0Var2.Q;
                                    if (file2 != null && (lVar2 = g0Var2.f17776b0) != null) {
                                        lVar2.invoke(file2);
                                        return true;
                                    }
                                    return true;
                                case 9:
                                    File file3 = g0Var2.Q;
                                    if (file3 != null && (lVar3 = g0Var2.f17778c0) != null) {
                                        lVar3.invoke(file3);
                                        return true;
                                    }
                                    return true;
                                default:
                                    return true;
                            }
                        }
                    });
                    popupMenu.show();
                }
            });
            linearLayout.addView(imageButtonE4);
            this.I = linearLayout;
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        }
    }

    public static final void a(final g0 g0Var, final b bVar) {
        if (g0Var.f17794v || g0Var.f17785k.getWidth() <= 0 || bVar.f17801u < 0) {
            return;
        }
        final int i10 = bVar.f17802v;
        final int i11 = bVar.f17801u;
        final int iG = g0Var.g();
        int height = g0Var.f17785k.getHeight() - (g0Var.c(8) * 2);
        final int i12 = height < 1 ? 1 : height;
        bVar.f17804x = g0Var.f17777c.submit(new Runnable() { // from class: m9.d
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [T, android.graphics.Bitmap] */
            @Override // java.lang.Runnable
            public final void run() {
                PdfRenderer pdfRenderer;
                int i13;
                u1 u1Var;
                float f10;
                float f11;
                final g0 g0Var2 = this.f17755a;
                final g0.b bVar2 = bVar;
                final int i14 = i10;
                final int i15 = i11;
                final int i16 = iG;
                int i17 = i12;
                kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
                try {
                    if (!g0Var2.f17794v && bVar2.f17802v == i14 && (pdfRenderer = g0Var2.f17791r) != null) {
                        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                        c0Var.f16320a = g0Var2.f17789p;
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i15);
                        try {
                            double height2 = pageOpenPage.getHeight();
                            int width = pageOpenPage.getWidth();
                            if (width < 1) {
                                width = 1;
                            }
                            double d10 = height2 / width;
                            c0Var.f16320a = d10;
                            if (g0Var2.f17781f) {
                                if (i16 <= 0 || i17 <= 0) {
                                    u1Var = new u1(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i16, i17);
                                } else {
                                    float f12 = i16;
                                    float f13 = (float) (f12 * d10);
                                    float f14 = i17;
                                    if (f13 > f14) {
                                        f11 = (float) (f14 / d10);
                                        f10 = f14;
                                    } else {
                                        f10 = f13;
                                        f11 = f12;
                                    }
                                    float f15 = (f12 - f11) / 2.0f;
                                    float f16 = (f14 - f10) / 2.0f;
                                    u1Var = new u1(f15, f16, f11 + f15, f10 + f16);
                                }
                                i13 = (int) (u1Var.f17961c - u1Var.f17959a);
                            } else {
                                i13 = i16;
                            }
                            double dK = jh.j.k(d10, 0.05d, 20.0d);
                            if (i13 < 1) {
                                i13 = 1;
                            }
                            int iSqrt = (int) Math.sqrt(2000000.0d / dK);
                            if (iSqrt < 1) {
                                iSqrt = 1;
                            }
                            int iMin = Math.min(i13, Math.min(1600, iSqrt));
                            ?? CreateBitmap = Bitmap.createBitmap(iMin, jh.j.m((int) (iMin * dK), 1, 4096), Bitmap.Config.ARGB_8888);
                            CreateBitmap.eraseColor(-1);
                            g0Var3.f16327a = CreateBitmap;
                            pageOpenPage.render(CreateBitmap, null, null, 1);
                            pg.f0 f0Var = pg.f0.f21461a;
                            ch.a.a(pageOpenPage, null);
                            T t3 = g0Var3.f16327a;
                            kotlin.jvm.internal.r.b(t3);
                            final Bitmap bitmap = (Bitmap) t3;
                            g0Var2.f17775b.post(new Runnable() { // from class: m9.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    g0 g0Var4 = g0Var2;
                                    g0.b bVar3 = bVar2;
                                    int i18 = i14;
                                    int i19 = i15;
                                    Bitmap bitmap2 = bitmap;
                                    kotlin.jvm.internal.c0 c0Var2 = c0Var;
                                    int i20 = i16;
                                    if (g0Var4.f17794v || bVar3.f17802v != i18 || bVar3.f17801u != i19) {
                                        bitmap2.recycle();
                                        return;
                                    }
                                    bVar3.f17804x = null;
                                    Double d11 = g0Var4.f17788n.get(i19);
                                    double d12 = c0Var2.f16320a;
                                    if (d11 == null || d11.doubleValue() != d12) {
                                        g0Var4.f17788n.put(i19, Double.valueOf(c0Var2.f16320a));
                                        bVar3.f17800t.setRatio(c0Var2.f16320a);
                                        if (!g0Var4.f17781f) {
                                            a1 a1Var = bVar3.f17800t;
                                            ViewGroup.LayoutParams layoutParams = a1Var.getLayoutParams();
                                            layoutParams.height = jh.j.m((int) (i20 * c0Var2.f16320a), 1, 100000);
                                            a1Var.setLayoutParams(layoutParams);
                                        }
                                    }
                                    a1 a1Var2 = bVar3.f17800t;
                                    Bitmap bitmap3 = a1Var2.f17717d;
                                    a1Var2.f17717d = bitmap2;
                                    a1Var2.invalidate();
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    if (g0Var4.f17785k.l0()) {
                                        g0Var4.l();
                                    }
                                }
                            });
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    if (!(th2 instanceof Exception) && !(th2 instanceof OutOfMemoryError)) {
                        throw th2;
                    }
                    Log.w("PdfDocumentView", "Cannot render PDF page " + i15, th2);
                    Bitmap bitmap2 = (Bitmap) g0Var3.f16327a;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    g0Var2.f17775b.post(new Runnable() { // from class: m9.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0.b bVar3 = bVar2;
                            if (bVar3.f17802v == i14) {
                                bVar3.f17804x = null;
                            }
                        }
                    });
                }
            }
        });
    }

    public static final Button r(ContextThemeWrapper contextThemeWrapper, final g0 g0Var, final kotlin.jvm.internal.g0<AlertDialog> g0Var2, int i10, final int i11) {
        Button button = new Button(contextThemeWrapper, null, android.R.attr.borderlessButtonStyle);
        button.setText(i10);
        button.setTextColor(g0Var.f17773a.f17976l);
        button.setAllCaps(false);
        button.setOnClickListener(new View.OnClickListener() { // from class: m9.a0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17710a.n(i11);
                AlertDialog alertDialog = (AlertDialog) g0Var2.f16327a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        });
        return button;
    }

    public final pg.n<Integer, Float> b() {
        androidx.recyclerview.widget.v vVar;
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        if (this.f17781f) {
            return new pg.n<>(Integer.valueOf(getCurrentPage()), fValueOf);
        }
        c2 c2Var = this.f17785k;
        float f10 = c2Var.n0().f17960b;
        Rect rect = new Rect();
        int childCount = c2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c2Var.getChildAt(i10);
            this.f17786l.y(childAt, rect);
            if (f10 >= rect.top && f10 < rect.bottom) {
                v.a0 a0VarJ = androidx.recyclerview.widget.v.J(childAt);
                int iH = (a0VarJ == null || (vVar = a0VarJ.f2724q) == null) ? -1 : vVar.H(a0VarJ);
                if (iH != -1) {
                    Integer numValueOf = Integer.valueOf(iH);
                    float f11 = f10 - rect.top;
                    int iHeight = rect.height();
                    if (iHeight < 1) {
                        iHeight = 1;
                    }
                    return new pg.n<>(numValueOf, Float.valueOf(jh.j.l(f11 / iHeight, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                }
            }
        }
        return new pg.n<>(Integer.valueOf(getCurrentPage()), fValueOf);
    }

    public final int c(int i10) {
        return gh.a.b(i10 * this.f17780e);
    }

    public final boolean d() {
        c2 c2Var = this.f17785k;
        if (!c2Var.l0()) {
            return false;
        }
        c2Var.i0(1.0f, c2Var.getWidth() / 2.0f, c2Var.getHeight() / 2.0f);
        return true;
    }

    public final ImageButton e(int i10, int i11, final eh.a<pg.f0> aVar) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i10);
        imageButton.setImageTintList(ColorStateList.valueOf(this.f17784j));
        imageButton.setBackground(o(true));
        imageButton.setContentDescription(imageButton.getContext().getString(i11));
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(c(48), c(48)));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: m9.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.invoke();
            }
        });
        return imageButton;
    }

    public final void f() {
        if (this.R == 0) {
            return;
        }
        v();
        p();
        u0 u0Var = this.H;
        if (u0Var == null || u0Var.getDragging()) {
            return;
        }
        c2 c2Var = this.f17785k;
        int iComputeVerticalScrollRange = c2Var.computeVerticalScrollRange() - c2Var.computeVerticalScrollExtent();
        u0Var.setFraction(iComputeVerticalScrollRange > 0 ? c2Var.computeVerticalScrollOffset() / iComputeVerticalScrollRange : CropImageView.DEFAULT_ASPECT_RATIO);
        t0 t0Var = u0Var.f17958r;
        if (u0Var.f17943a < 2) {
            return;
        }
        u0Var.removeCallbacks(t0Var);
        if (u0Var.getAlpha() < 1.0f) {
            u0Var.animate().alpha(1.0f).setDuration(120L).start();
        }
        u0Var.postDelayed(t0Var, 1500L);
    }

    public final int g() {
        int width = this.f17785k.getWidth() - (c(8) * 2);
        if (width < 1) {
            return 1;
        }
        return width;
    }

    public final List<Integer> getBookmarkedPages() {
        return qg.x.c0(this.C);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getCurrentPage() {
        androidx.recyclerview.widget.v vVar;
        if (this.R != 0) {
            c2 c2Var = this.f17785k;
            u1 u1VarN0 = c2Var.n0();
            float f10 = u1VarN0.f17962d;
            float f11 = u1VarN0.f17960b;
            boolean z10 = this.f17781f;
            LinearLayoutManager linearLayoutManager = this.f17786l;
            if (z10 || c2Var.canScrollVertically(1)) {
                float f12 = (u1VarN0.f17959a + u1VarN0.f17961c) / 2.0f;
                float fA = z10 ? (f11 + f10) / 2.0f : org.bouncycastle.jcajce.provider.digest.c.a(f10, f11, 0.25f, f11);
                Rect rect = new Rect();
                int childCount = c2Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = c2Var.getChildAt(i10);
                    linearLayoutManager.y(childAt, rect);
                    if (f12 < rect.left || f12 >= rect.right || fA < rect.top || fA >= rect.bottom) {
                        i10++;
                    } else {
                        v.a0 a0VarJ = androidx.recyclerview.widget.v.J(childAt);
                        int iH = (a0VarJ == null || (vVar = a0VarJ.f2724q) == null) ? -1 : vVar.H(a0VarJ);
                        Integer numValueOf = Integer.valueOf(iH);
                        if (iH != -1) {
                            numValueOf = numValueOf;
                        }
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                View viewL0 = linearLayoutManager.L0(0, linearLayoutManager.v(), false);
                int iH2 = viewL0 != null ? v.l.H(viewL0) : -1;
                if (iH2 >= 0) {
                    return iH2;
                }
            } else if (c2Var.getPanY() <= ((1.0f - c2Var.getZoom()) * c2Var.getHeight()) + 1.0f) {
                View viewL02 = linearLayoutManager.L0(linearLayoutManager.v() - 1, -1, false);
                int iH3 = viewL02 == null ? -1 : v.l.H(viewL02);
                numValueOf = iH3 != -1 ? Integer.valueOf(iH3) : null;
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
            }
        }
        return 0;
    }

    public final boolean getDarkChrome$pdfviewer_release() {
        return this.f17782g;
    }

    public final int getDetailTileCount() {
        int i10 = 0;
        LinkedHashSet linkedHashSet = this.f17790q;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f17800t.getDetail() != null && (i10 = i10 + 1) < 0) {
                qg.p.n();
                throw null;
            }
        }
        return i10;
    }

    public final File getDocumentFile() {
        return this.Q;
    }

    public final eh.a<pg.f0> getOnError() {
        return this.U;
    }

    public final eh.l<Integer, pg.f0> getOnPageChanged() {
        return this.V;
    }

    public final eh.l<File, pg.f0> getOnPrint() {
        return this.f17778c0;
    }

    public final eh.a<pg.f0> getOnReady() {
        return this.T;
    }

    public final eh.l<File, pg.f0> getOnSave() {
        return this.f17776b0;
    }

    public final eh.l<File, pg.f0> getOnShare() {
        return this.f17774a0;
    }

    public final eh.a<pg.f0> getOnSingleTap() {
        return this.W;
    }

    public final v1 getOptions() {
        return this.f17773a;
    }

    public final int getPageCount() {
        return this.R;
    }

    public final androidx.recyclerview.widget.v getPageList() {
        return this.f17785k;
    }

    public final int getRenderedPageCount() {
        int i10 = 0;
        LinkedHashSet linkedHashSet = this.f17790q;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f17800t.getBase() != null && (i10 = i10 + 1) < 0) {
                qg.p.n();
                throw null;
            }
        }
        return i10;
    }

    public final float getZoom() {
        return this.f17785k.getZoom();
    }

    public final void h() {
        if (this.f17794v) {
            return;
        }
        j();
        this.f17794v = true;
        this.f17775b.removeCallbacks(this.P);
        this.f17775b.removeCallbacks(this.O);
        Iterator it = this.f17790q.iterator();
        while (it.hasNext()) {
            ((b) it.next()).p();
        }
        this.f17790q.clear();
        this.f17785k.setAdapter(null);
        this.f17777c.getQueue().clear();
        this.f17777c.execute(new Runnable() { // from class: m9.i
            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var = this.f17820a;
                try {
                    PdfRenderer pdfRenderer = g0Var.f17791r;
                    if (pdfRenderer != null) {
                        pdfRenderer.close();
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                } catch (Throwable th2) {
                    pg.q.a(th2);
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptor = g0Var.f17792s;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                } catch (Throwable th3) {
                    pg.q.a(th3);
                }
                File file = g0Var.f17793t;
                if (file != null) {
                    file.delete();
                }
            }
        });
        this.f17777c.shutdown();
    }

    public final void i(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("pdf_document_page")) {
            return;
        }
        this.f17796x = bundle.getInt("pdf_document_page");
        this.f17797y = bundle.getFloat("pdf_document_fraction");
        if (bundle.containsKey("pdf_document_night")) {
            this.f17798z = Boolean.valueOf(bundle.getBoolean("pdf_document_night"));
        }
    }

    public final void j() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorPutFloat;
        if (!this.f17773a.f17968d || this.R == 0 || this.f17794v) {
            return;
        }
        pg.n<Integer, Float> nVarB = b();
        int iIntValue = nVarB.f21469a.intValue();
        float fFloatValue = nVarB.f21470b.floatValue();
        SharedPreferences sharedPreferences = this.f17779d.f17980a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt("page", iIntValue)) == null || (editorPutFloat = editorPutInt.putFloat("pageFraction", jh.j.l(fFloatValue, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f))) == null) {
            return;
        }
        editorPutFloat.apply();
    }

    public final void k(Bundle bundle) {
        if (this.R == 0) {
            int i10 = this.f17796x;
            if (i10 >= 0) {
                bundle.putInt("pdf_document_page", i10);
                return;
            }
            return;
        }
        pg.n<Integer, Float> nVarB = b();
        int iIntValue = nVarB.f21469a.intValue();
        float fFloatValue = nVarB.f21470b.floatValue();
        bundle.putInt("pdf_document_page", iIntValue);
        bundle.putFloat("pdf_document_fraction", fFloatValue);
        bundle.putBoolean("pdf_document_night", this.S);
    }

    public final void l() {
        Handler handler = this.f17775b;
        e0 e0Var = this.P;
        handler.removeCallbacks(e0Var);
        handler.postDelayed(e0Var, 120L);
    }

    public final void m(float f10, int i10) {
        boolean z10 = this.f17781f;
        LinearLayoutManager linearLayoutManager = this.f17786l;
        if (z10) {
            linearLayoutManager.p0(i10);
            return;
        }
        double dG = g();
        linearLayoutManager.f2434x = i10;
        linearLayoutManager.f2435y = -((int) (f10 * ((c(8) * 2) + ((int) (dG * (this.f17788n.get(i10) != null ? r0.doubleValue() : this.f17789p))))));
        LinearLayoutManager.d dVar = linearLayoutManager.f2436z;
        if (dVar != null) {
            dVar.f2458a = -1;
        }
        linearLayoutManager.n0();
    }

    public final void n(int i10) {
        if (this.R == 0) {
            return;
        }
        boolean z10 = this.f17781f;
        c2 c2Var = this.f17785k;
        if (z10) {
            c2Var.m0();
        } else {
            if (c2Var.M0) {
                c2Var.T0 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                c2Var.S0 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            c2Var.invalidate();
        }
        int iM = jh.j.m(i10, 0, this.R - 1);
        LinearLayoutManager linearLayoutManager = this.f17786l;
        linearLayoutManager.f2434x = iM;
        linearLayoutManager.f2435y = 0;
        LinearLayoutManager.d dVar = linearLayoutManager.f2436z;
        if (dVar != null) {
            dVar.f2458a = -1;
        }
        linearLayoutManager.n0();
        c2Var.post(new Runnable() { // from class: m9.e
            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var = this.f17763a;
                g0Var.v();
                g0Var.j();
                g0Var.l();
            }
        });
    }

    public final Drawable o(boolean z10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(z10 ? android.R.attr.selectableItemBackgroundBorderless : android.R.attr.selectableItemBackground, typedValue, true);
        if (typedValue.resourceId != 0) {
            return getContext().getDrawable(typedValue.resourceId);
        }
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        final pg.n<Integer, Float> nVarB = (this.R <= 0 || i12 <= 0) ? null : b();
        super.onSizeChanged(i10, i11, i12, i13);
        if (nVarB != null) {
            if (i10 == i12 && i11 == i13) {
                return;
            }
            this.f17775b.post(new Runnable() { // from class: m9.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    g0 g0Var = this.f17708a;
                    pg.n nVar = nVarB;
                    if (g0Var.f17794v) {
                        return;
                    }
                    Iterator it = g0Var.f17790q.iterator();
                    while (it.hasNext()) {
                        ((g0.b) it.next()).p();
                    }
                    g0Var.f17787m.f2727a.a();
                    g0Var.m(((Number) nVar.f21470b).floatValue(), ((Number) nVar.f21469a).intValue());
                }
            });
        }
    }

    public final void p() {
        if (!this.f17773a.f17970f || this.R == 0) {
            return;
        }
        if (this.I == null || !this.B) {
            Handler handler = this.f17775b;
            d0 d0Var = this.O;
            handler.removeCallbacks(d0Var);
            TextView textView = this.G;
            textView.animate().cancel();
            textView.setAlpha(1.0f);
            handler.postDelayed(d0Var, 1500L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.app.AlertDialog, android.app.Dialog] */
    public final void q() {
        if (this.R == 0) {
            return;
        }
        Context context = getContext();
        int i10 = android.R.style.Theme.Material.Light.Dialog.Alert;
        boolean z10 = this.f17782g;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z10 ? 16974374 : 16974394);
        EditText editText = new EditText(contextThemeWrapper);
        editText.setInputType(2);
        editText.setImeOptions(2);
        editText.setHint(editText.getContext().getString(R.string.pdf_document_page_short, 1, Integer.valueOf(this.R)));
        editText.setText(String.valueOf(getCurrentPage() + 1));
        editText.selectAll();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(c(24), c(8), c(24), 0);
        linearLayout.addView(editText);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        if (this.R > 1) {
            kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
            SeekBar seekBar = new SeekBar(contextThemeWrapper);
            seekBar.setMax(this.R - 1);
            seekBar.setProgress(getCurrentPage());
            v1 v1Var = this.f17773a;
            seekBar.setProgressTintList(ColorStateList.valueOf(v1Var.f17976l));
            seekBar.setThumbTintList(ColorStateList.valueOf(v1Var.f17976l));
            seekBar.setPadding(c(8), c(16), c(8), c(8));
            seekBar.setOnSeekBarChangeListener(new e(b0Var, editText));
            editText.addTextChangedListener(new d(b0Var, this, seekBar));
            linearLayout.addView(seekBar);
            LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(r(contextThemeWrapper, this, g0Var, R.string.pdf_document_first_page, 0));
            linearLayout2.addView(new View(contextThemeWrapper), new LinearLayout.LayoutParams(0, 1, 1.0f));
            linearLayout2.addView(r(contextThemeWrapper, this, g0Var, R.string.pdf_document_last_page, this.R - 1));
            linearLayout.addView(linearLayout2);
        }
        Context context2 = getContext();
        if (z10) {
            i10 = 16974374;
        }
        final ?? Create = new AlertDialog.Builder(context2, i10).setTitle(R.string.pdf_document_go_to_page).setView(linearLayout).setPositiveButton(R.string.pdf_document_go, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.pdf_document_cancel, (DialogInterface.OnClickListener) null).create();
        g0Var.f16327a = Create;
        final r rVar = new r(editText, this, Create);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: m9.s
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 2) {
                    return false;
                }
                rVar.invoke();
                return true;
            }
        });
        Create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: m9.u
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = Create;
                Button button = alertDialog.getButton(-1);
                g0 g0Var2 = this;
                button.setTextColor(g0Var2.f17773a.f17976l);
                final r rVar2 = rVar;
                button.setOnClickListener(new View.OnClickListener() { // from class: m9.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rVar2.invoke();
                    }
                });
                alertDialog.getButton(-2).setTextColor(g0Var2.f17773a.f17976l);
            }
        });
        Window window = Create.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        Create.show();
    }

    public final void s() {
        SharedPreferences.Editor editorEdit;
        if (this.R == 0) {
            return;
        }
        int currentPage = getCurrentPage();
        Integer numValueOf = Integer.valueOf(currentPage);
        TreeSet<Integer> treeSet = this.C;
        if (treeSet.remove(numValueOf)) {
            Toast.makeText(getContext(), R.string.pdf_document_bookmark_removed, 0).show();
        } else {
            treeSet.add(Integer.valueOf(currentPage));
            Toast.makeText(getContext(), getContext().getString(R.string.pdf_document_bookmark_added, Integer.valueOf(currentPage + 1)), 0).show();
        }
        w1 w1Var = this.f17779d;
        w1Var.getClass();
        SharedPreferences sharedPreferences = w1Var.f17980a;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = treeSet.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next.intValue() >= 0) {
                    arrayList.add(next);
                }
            }
            SharedPreferences.Editor editorPutString = editorEdit.putString("bookmarks", qg.x.I(qg.x.T(qg.x.x(arrayList)), ",", null, null, null, 62));
            if (editorPutString != null) {
                editorPutString.apply();
            }
        }
        v();
    }

    public final void setNight(boolean z10) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        this.S = z10;
        Iterator it = this.f17790q.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f17800t.setNight(z10);
        }
        u();
        SharedPreferences sharedPreferences = this.f17779d.f17980a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("night", z10)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    public final void setOnError(eh.a<pg.f0> aVar) {
        this.U = aVar;
    }

    public final void setOnPageChanged(eh.l<? super Integer, pg.f0> lVar) {
        this.V = lVar;
    }

    public final void setOnPrint(eh.l<? super File, pg.f0> lVar) {
        this.f17778c0 = lVar;
    }

    public final void setOnReady(eh.a<pg.f0> aVar) {
        this.T = aVar;
    }

    public final void setOnSave(eh.l<? super File, pg.f0> lVar) {
        this.f17776b0 = lVar;
    }

    public final void setOnShare(eh.l<? super File, pg.f0> lVar) {
        this.f17774a0 = lVar;
    }

    public final void setOnSingleTap(eh.a<pg.f0> aVar) {
        this.W = aVar;
    }

    public final void t(int i10) {
        if (this.R == 0) {
            return;
        }
        int iM = jh.j.m(getCurrentPage() + i10, 0, this.R - 1);
        if (Math.abs(iM - getCurrentPage()) > 1 || this.f17785k.l0()) {
            n(iM);
            return;
        }
        f fVar = new f(getContext());
        fVar.f2782a = iM;
        this.f17786l.z0(fVar);
    }

    public final void u() {
        int i10;
        int i11;
        int i12;
        if (this.f17782g || this.S) {
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

    public final void v() {
        if (this.R == 0) {
            return;
        }
        int currentPage = getCurrentPage();
        int i10 = currentPage + 1;
        String string = getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(i10), Integer.valueOf(this.R));
        kotlin.jvm.internal.r.d(string, "getString(...)");
        this.G.setText(string);
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(string);
        }
        ImageButton imageButton = this.L;
        if (imageButton != null) {
            imageButton.setEnabled(currentPage > 0);
        }
        if (imageButton != null) {
            imageButton.setAlpha(currentPage > 0 ? 1.0f : 0.38f);
        }
        ImageButton imageButton2 = this.M;
        if (imageButton2 != null) {
            imageButton2.setEnabled(i10 < this.R);
        }
        if (imageButton2 != null) {
            imageButton2.setAlpha(i10 < this.R ? 1.0f : 0.38f);
        }
        ImageButton imageButton3 = this.N;
        if (imageButton3 != null) {
            boolean zContains = this.C.contains(Integer.valueOf(currentPage));
            imageButton3.setImageResource(zContains ? R.drawable.pdf_ic_bookmark : R.drawable.pdf_ic_bookmark_border);
            imageButton3.setImageTintList(ColorStateList.valueOf(zContains ? this.f17773a.f17976l : this.f17784j));
            imageButton3.setContentDescription(getContext().getString(zContains ? R.string.pdf_document_bookmark_remove : R.string.pdf_document_bookmark_add));
        }
        if (currentPage != this.A) {
            this.A = currentPage;
            eh.l<? super Integer, pg.f0> lVar = this.V;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(currentPage));
            }
        }
    }

    public final void w(final Activity activity, eh.l<? super File, pg.f0> lVar) {
        final String str = this.f17773a.f17977m;
        if (mh.x.A(str)) {
            str = "document";
        }
        this.f17774a0 = new t(activity, str, 0);
        this.f17778c0 = new eh.l() { // from class: m9.c0
            @Override // eh.l
            public final Object invoke(Object obj) {
                Activity activity2 = activity;
                String str2 = str;
                File it = (File) obj;
                kotlin.jvm.internal.r.e(it, "it");
                Handler handler = r0.f17892a;
                try {
                    Object systemService = activity2.getSystemService("print");
                    kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.print.PrintManager");
                    ((PrintManager) systemService).print(mh.x.J(r0.a(str2), ".pdf"), new r0.a(it, r0.a(str2)), new PrintAttributes.Builder().build());
                } catch (Exception e10) {
                    Log.w("PdfExport", "Export failed", e10);
                    Toast.makeText(activity2, R.string.pdf_document_export_failed, 0).show();
                }
                return pg.f0.f21461a;
            }
        };
        this.f17776b0 = lVar;
    }
}
