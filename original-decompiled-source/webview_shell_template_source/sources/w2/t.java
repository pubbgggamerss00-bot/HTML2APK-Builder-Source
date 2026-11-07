package w2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.htmltoapk.template.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends FrameLayout {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f15007r0 = 0;
    public final int A;
    public final s0 B;
    public final LinearLayoutManager C;
    public final b D;
    public final SparseArray<Double> E;
    public double F;
    public final LinkedHashSet G;
    public PdfRenderer H;
    public ParcelFileDescriptor I;
    public File J;
    public volatile boolean K;
    public boolean L;
    public int M;
    public float N;
    public Boolean O;
    public int P;
    public boolean Q;
    public final TreeSet<Integer> R;
    public final LinearLayout S;
    public final TextView T;
    public final ProgressBar U;
    public final TextView V;
    public final z W;

    /* renamed from: a0, reason: collision with root package name */
    public final LinearLayout f15008a0;

    /* renamed from: b0, reason: collision with root package name */
    public final TextView f15009b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ImageButton f15010c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ImageButton f15011d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ImageButton f15012e0;

    /* renamed from: f0, reason: collision with root package name */
    public final p f15013f0;

    /* renamed from: g0, reason: collision with root package name */
    public final w2.e f15014g0;

    /* renamed from: h0, reason: collision with root package name */
    public File f15015h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f15016i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f15017j0;

    /* renamed from: k0, reason: collision with root package name */
    public p5.a<d5.j> f15018k0;

    /* renamed from: l0, reason: collision with root package name */
    public p5.a<d5.j> f15019l0;

    /* renamed from: m0, reason: collision with root package name */
    public p5.l<? super Integer, d5.j> f15020m0;

    /* renamed from: n0, reason: collision with root package name */
    public p5.a<d5.j> f15021n0;

    /* renamed from: o0, reason: collision with root package name */
    public p5.l<? super File, d5.j> f15022o0;
    public p5.l<? super File, d5.j> p0;

    /* renamed from: q0, reason: collision with root package name */
    public p5.l<? super File, d5.j> f15023q0;
    public final n0 s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f15024t;

    /* renamed from: u, reason: collision with root package name */
    public final ThreadPoolExecutor f15025u;

    /* renamed from: v, reason: collision with root package name */
    public final o0 f15026v;

    /* renamed from: w, reason: collision with root package name */
    public final float f15027w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15028x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15029y;

    /* renamed from: z, reason: collision with root package name */
    public final int f15030z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class a extends RecyclerView.b0 {

        /* renamed from: u, reason: collision with root package name */
        public final c0 f15031u;

        /* renamed from: v, reason: collision with root package name */
        public int f15032v;

        /* renamed from: w, reason: collision with root package name */
        public volatile int f15033w;

        /* renamed from: x, reason: collision with root package name */
        public volatile int f15034x;

        /* renamed from: y, reason: collision with root package name */
        public Future<?> f15035y;

        /* renamed from: z, reason: collision with root package name */
        public Future<?> f15036z;

        public a(c0 c0Var) {
            super(c0Var);
            this.f15031u = c0Var;
            this.f15032v = -1;
        }

        public final void q() {
            this.f15033w++;
            Future<?> future = this.f15035y;
            if (future != null) {
                future.cancel(false);
            }
            this.f15035y = null;
            r();
            t.this.f15025u.purge();
            c0 c0Var = this.f15031u;
            Bitmap bitmap = c0Var.f14885v;
            c0Var.f14885v = null;
            c0Var.invalidate();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }

        public final void r() {
            this.f15034x++;
            Future<?> future = this.f15036z;
            if (future != null) {
                future.cancel(false);
            }
            this.f15036z = null;
            c0 c0Var = this.f15031u;
            ColorMatrixColorFilter colorMatrixColorFilter = c0.C;
            RectF rectF = c0Var.f14887x;
            Bitmap bitmap = c0Var.f14886w;
            c0Var.f14886w = null;
            rectF.setEmpty();
            c0Var.f14888y = 0.0f;
            c0Var.invalidate();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class b extends RecyclerView.e<a> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int a() {
            return t.this.getPageCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void c(RecyclerView.b0 b0Var, int i6) {
            a aVar = (a) b0Var;
            c0 c0Var = aVar.f15031u;
            t tVar = t.this;
            tVar.G.add(aVar);
            aVar.q();
            aVar.f15032v = i6;
            Double d7 = tVar.E.get(i6);
            double dDoubleValue = d7 != null ? d7.doubleValue() : tVar.F;
            c0Var.setRatio(dDoubleValue);
            c0Var.setNight(tVar.f15017j0);
            RecyclerView.n nVar = tVar.f15028x ? new RecyclerView.n(-1, -1) : new RecyclerView.n(-1, u5.d.p((int) (tVar.h() * dDoubleValue), 1, 100000));
            nVar.setMargins(tVar.d(8), tVar.d(8), tVar.d(8), tVar.d(8));
            c0Var.setLayoutParams(nVar);
            c0Var.setContentDescription(tVar.getContext().getString(R.string.pdf_document_page, Integer.valueOf(i6 + 1), Integer.valueOf(tVar.getPageCount())));
            t.a(tVar, aVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 d(ViewGroup viewGroup) {
            t tVar = t.this;
            Context context = tVar.getContext();
            kotlin.jvm.internal.j.d("getContext(...)", context);
            c0 c0Var = new c0(context);
            c0Var.setFitWholePage(tVar.f15028x);
            c0Var.setElevation(2 * tVar.f15027w);
            a aVar = tVar.new a(c0Var);
            tVar.G.add(aVar);
            return aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void e(RecyclerView.b0 b0Var) {
            a aVar = (a) b0Var;
            if (aVar.f15031u.getBase() == null && aVar.f15035y == null) {
                t.a(t.this, aVar);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void f(RecyclerView.b0 b0Var) {
            ((a) b0Var).q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var) {
            a aVar = (a) b0Var;
            kotlin.jvm.internal.j.e("holder", aVar);
            aVar.q();
            aVar.f15032v = -1;
            t.this.G.remove(aVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c implements TextWatcher {
        public final /* synthetic */ kotlin.jvm.internal.n s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ t f15038t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SeekBar f15039u;

        public c(kotlin.jvm.internal.n nVar, t tVar, SeekBar seekBar) {
            this.s = nVar;
            this.f15038t = tVar;
            this.f15039u = seekBar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.j.e("text", editable);
            kotlin.jvm.internal.n nVar = this.s;
            if (nVar.s) {
                return;
            }
            String string = editable.toString();
            int pageCount = this.f15038t.getPageCount();
            kotlin.jvm.internal.j.e("input", string);
            Integer numI = x5.k.i(x5.o.G(string).toString());
            Integer numValueOf = null;
            if (numI != null) {
                int iIntValue = numI.intValue();
                if (1 > iIntValue || iIntValue > pageCount) {
                    numI = null;
                }
                if (numI != null) {
                    numValueOf = Integer.valueOf(numI.intValue() - 1);
                }
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                nVar.s = true;
                this.f15039u.setProgress(iIntValue2);
                nVar.s = false;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            kotlin.jvm.internal.j.e("text", charSequence);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            kotlin.jvm.internal.j.e("text", charSequence);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.n f15040a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f15041b;

        public d(kotlin.jvm.internal.n nVar, EditText editText) {
            this.f15040a = nVar;
            this.f15041b = editText;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z6) {
            kotlin.jvm.internal.j.e("bar", seekBar);
            if (z6) {
                kotlin.jvm.internal.n nVar = this.f15040a;
                if (nVar.s) {
                    return;
                }
                nVar.s = true;
                String strValueOf = String.valueOf(i6 + 1);
                EditText editText = this.f15041b;
                editText.setText(strValueOf);
                editText.setSelection(editText.getText().length());
                editText.setError(null);
                nVar.s = false;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.j.e("bar", seekBar);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.j.e("bar", seekBar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e extends androidx.recyclerview.widget.o {
        @Override // androidx.recyclerview.widget.o
        public final int l() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.o
        public final int m() {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(ComponentActivity componentActivity, n0 n0Var, String str) {
        Boolean boolValueOf;
        super(componentActivity);
        this.s = n0Var;
        this.f15024t = new Handler(Looper.getMainLooper());
        this.f15025u = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        o0 o0Var = new o0(componentActivity, str);
        this.f15026v = o0Var;
        this.f15027w = getResources().getDisplayMetrics().density;
        boolean zA = kotlin.jvm.internal.j.a(n0Var.f14953a, "horizontal");
        this.f15028x = zA;
        boolean zBooleanValue = (getResources().getConfiguration().uiMode & 48) == 32;
        String str2 = n0Var.f14955c;
        boolean z6 = kotlin.jvm.internal.j.a(str2, "dark") ? true : kotlin.jvm.internal.j.a(str2, "light") ? false : zBooleanValue;
        this.f15029y = z6;
        this.f15030z = z6 ? Color.argb(240, 32, 33, 36) : Color.argb(245, 255, 255, 255);
        this.A = z6 ? -1 : Color.rgb(32, 33, 36);
        s0 s0Var = new s0(componentActivity);
        this.B = s0Var;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(!zA ? 1 : 0);
        this.C = linearLayoutManager;
        b bVar = new b();
        this.D = bVar;
        this.E = new SparseArray<>();
        this.F = Math.sqrt(2.0d);
        this.G = new LinkedHashSet();
        this.M = -1;
        this.P = -1;
        this.Q = true;
        this.R = new TreeSet<>();
        this.S = new LinearLayout(componentActivity);
        this.T = new TextView(componentActivity);
        this.U = new ProgressBar(componentActivity);
        this.V = new TextView(componentActivity);
        this.W = (!n0Var.f14959g || zA) ? null : new z(componentActivity, n0Var.f14963l);
        this.f15013f0 = new p(this, 1);
        this.f15014g0 = new w2.e(this, 1);
        SharedPreferences sharedPreferences = o0Var.f14967a;
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
            String str3 = n0Var.f14954b;
            if (kotlin.jvm.internal.j.a(str3, "on")) {
                zBooleanValue = true;
            } else if (!kotlin.jvm.internal.j.a(str3, "system")) {
                zBooleanValue = false;
            }
        }
        this.f15017j0 = zBooleanValue;
        s();
        s0Var.setLayoutManager(linearLayoutManager);
        s0Var.setAdapter(bVar);
        s0Var.setItemAnimator(null);
        s0Var.setItemViewCacheSize(0);
        RecyclerView.r.a aVarA = s0Var.getRecycledViewPool().a(0);
        aVarA.f1500b = 4;
        ArrayList<RecyclerView.b0> arrayList = aVarA.f1499a;
        while (arrayList.size() > 4) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.B.setVertical(!this.f15028x);
        this.B.setContinuous(!this.f15028x);
        this.B.setZoomEnabled(this.s.h);
        this.B.setOverScrollMode(2);
        if (this.f15028x) {
            new androidx.recyclerview.widget.u().a(this.B);
        }
        this.B.setOnSingleTap(new com.htmltoapk.template.f0(2, this));
        final int i6 = 1;
        this.B.setOnTransformChanged(new p5.a(this) { // from class: w2.b

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ t f14880t;

            {
                this.f14880t = this;
            }

            @Override // p5.a
            public final Object a() {
                switch (i6) {
                    case 0:
                        this.f14880t.i();
                        break;
                    default:
                        this.f14880t.g();
                        break;
                }
                return d5.j.f12745a;
            }
        });
        this.B.setOnTransformSettled(new w2.a(this, 0));
        this.B.j(new s(this));
        addView(this.B, new FrameLayout.LayoutParams(-1, -1));
        z zVar = this.W;
        if (zVar != null) {
            zVar.setLabel(new androidx.camera.core.d0(2, componentActivity, this));
            zVar.setOnScrub(new androidx.camera.camera2.interop.f(6, this));
            final int i7 = 0;
            zVar.setOnScrubEnd(new p5.a(this) { // from class: w2.b

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ t f14880t;

                {
                    this.f14880t = this;
                }

                @Override // p5.a
                public final Object a() {
                    switch (i7) {
                        case 0:
                            this.f14880t.i();
                            break;
                        default:
                            this.f14880t.g();
                            break;
                    }
                    return d5.j.f12745a;
                }
            });
            addView(zVar, new FrameLayout.LayoutParams(-1, -1));
        }
        TextView textView = this.V;
        textView.setTextColor(this.A);
        textView.setTextSize(2, 13.0f);
        textView.setPadding(d(12), d(6), d(12), d(6));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(d(16));
        gradientDrawable.setColor(this.f15030z);
        textView.setBackground(gradientDrawable);
        textView.setElevation(d(3));
        textView.setAlpha(0.0f);
        textView.setImportantForAccessibility(2);
        View view = this.V;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = d(12);
        addView(view, layoutParams);
        this.S.setOrientation(1);
        this.S.setGravity(17);
        this.S.setPadding(d(32), d(32), d(32), d(32));
        this.U.setIndeterminate(true);
        this.U.setIndeterminateTintList(ColorStateList.valueOf(this.s.f14963l));
        this.S.addView(this.U, new LinearLayout.LayoutParams(d(40), d(40)));
        this.T.setText(componentActivity.getString(R.string.pdf_document_loading));
        this.T.setTextColor((this.f15029y || this.f15017j0) ? -1 : Color.rgb(32, 33, 36));
        this.T.setGravity(17);
        this.T.setPadding(0, d(12), 0, 0);
        this.S.addView(this.T, new LinearLayout.LayoutParams(-2, -2));
        addView(this.S, new FrameLayout.LayoutParams(-1, -2, 17));
        if (this.s.f14957e) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setPadding(d(4), 0, d(4), 0);
            linearLayout.setBackgroundColor(this.f15030z);
            linearLayout.setElevation(d(6));
            linearLayout.setMinimumHeight(d(52));
            linearLayout.setVisibility(8);
            linearLayout.setClickable(true);
            ImageButton imageButtonF = f(R.drawable.pdf_ic_chevron_left, R.string.pdf_document_previous, new w2.c(1, this));
            this.f15010c0 = imageButtonF;
            linearLayout.addView(imageButtonF);
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(this.A);
            textView2.setTextSize(2, 15.0f);
            textView2.setGravity(17);
            textView2.setMinWidth(d(72));
            textView2.setPadding(d(8), d(12), d(8), d(12));
            textView2.setBackground(m(false));
            textView2.setContentDescription(textView2.getContext().getString(R.string.pdf_document_go_to_page));
            textView2.setOnClickListener(new g(0, this));
            this.f15009b0 = textView2;
            linearLayout.addView(textView2);
            ImageButton imageButtonF2 = f(R.drawable.pdf_ic_chevron_right, R.string.pdf_document_next, new w2.a(this, 1));
            this.f15011d0 = imageButtonF2;
            linearLayout.addView(imageButtonF2);
            linearLayout.addView(new View(getContext()), new LinearLayout.LayoutParams(0, 1, 1.0f));
            if (this.s.f14960i) {
                ImageButton imageButtonF3 = f(R.drawable.pdf_ic_bookmark_border, R.string.pdf_document_bookmark_add, new h0(this, 2));
                this.f15012e0 = imageButtonF3;
                linearLayout.addView(imageButtonF3);
            }
            final ImageButton imageButtonF4 = f(R.drawable.pdf_ic_more, R.string.pdf_document_more, new h());
            imageButtonF4.setOnClickListener(new View.OnClickListener() { // from class: w2.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final t tVar = this.s;
                    n0 n0Var2 = tVar.s;
                    if (tVar.f15016i0 == 0) {
                        return;
                    }
                    PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(tVar.getContext(), tVar.f15029y ? android.R.style.Theme.Material : android.R.style.Theme.Material.Light), imageButtonF4);
                    popupMenu.getMenu().add(0, 1, 0, R.string.pdf_document_go_to_page);
                    if (n0Var2.f14960i) {
                        popupMenu.getMenu().add(0, 2, 1, R.string.pdf_document_bookmarks);
                    }
                    popupMenu.getMenu().add(0, 3, 2, R.string.pdf_document_first_page);
                    popupMenu.getMenu().add(0, 4, 3, R.string.pdf_document_last_page);
                    popupMenu.getMenu().add(0, 5, 4, R.string.pdf_document_night_mode).setCheckable(true).setChecked(tVar.f15017j0);
                    if (tVar.B.p0()) {
                        popupMenu.getMenu().add(0, 6, 5, R.string.pdf_document_reset_zoom);
                    }
                    if (n0Var2.f14961j && tVar.f15015h0 != null) {
                        if (tVar.f15022o0 != null) {
                            popupMenu.getMenu().add(1, 7, 6, R.string.pdf_document_share);
                        }
                        if (tVar.p0 != null) {
                            popupMenu.getMenu().add(1, 8, 7, R.string.pdf_document_save);
                        }
                        if (tVar.f15023q0 != null) {
                            popupMenu.getMenu().add(1, 9, 8, R.string.pdf_document_print);
                        }
                    }
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: w2.q
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // android.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            p5.l<? super File, d5.j> lVar;
                            p5.l<? super File, d5.j> lVar2;
                            p5.l<? super File, d5.j> lVar3;
                            int itemId = menuItem.getItemId();
                            final t tVar2 = tVar;
                            switch (itemId) {
                                case 1:
                                    tVar2.o();
                                    return true;
                                case 2:
                                    TreeSet<Integer> treeSet = tVar2.R;
                                    if (treeSet.isEmpty()) {
                                        Toast.makeText(tVar2.getContext(), R.string.pdf_document_no_bookmarks, 1).show();
                                        return true;
                                    }
                                    final List listK = e5.q.k(treeSet);
                                    AlertDialog.Builder title = new AlertDialog.Builder(tVar2.getContext(), tVar2.f15029y ? android.R.style.Theme.Material.Dialog.Alert : android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(R.string.pdf_document_bookmarks);
                                    ArrayList arrayList2 = new ArrayList(e5.m.d(listK));
                                    Iterator it = listK.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(tVar2.getContext().getString(R.string.pdf_document_page_number, Integer.valueOf(((Number) it.next()).intValue() + 1)));
                                    }
                                    title.setItems((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: w2.r
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i8) {
                                            tVar2.l(((Number) listK.get(i8)).intValue());
                                        }
                                    }).setNegativeButton(R.string.pdf_document_close, (DialogInterface.OnClickListener) null).show();
                                    return true;
                                case 3:
                                    tVar2.l(0);
                                    return true;
                                case 4:
                                    tVar2.l(tVar2.f15016i0 - 1);
                                    return true;
                                case 5:
                                    tVar2.setNight(!tVar2.f15017j0);
                                    return true;
                                case 6:
                                    tVar2.B.m0(1.0f, r10.getWidth() / 2.0f, r10.getHeight() / 2.0f);
                                    return true;
                                case 7:
                                    File file = tVar2.f15015h0;
                                    if (file != null && (lVar = tVar2.f15022o0) != null) {
                                        lVar.invoke(file);
                                    }
                                    return true;
                                case 8:
                                    File file2 = tVar2.f15015h0;
                                    if (file2 != null && (lVar2 = tVar2.p0) != null) {
                                        lVar2.invoke(file2);
                                        return true;
                                    }
                                    return true;
                                case 9:
                                    File file3 = tVar2.f15015h0;
                                    if (file3 != null && (lVar3 = tVar2.f15023q0) != null) {
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
            linearLayout.addView(imageButtonF4);
            this.f15008a0 = linearLayout;
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        }
    }

    public static final void a(final t tVar, final a aVar) {
        if (tVar.K || tVar.B.getWidth() <= 0 || aVar.f15032v < 0) {
            return;
        }
        final int i6 = aVar.f15033w;
        final int i7 = aVar.f15032v;
        final int iH = tVar.h();
        int height = tVar.B.getHeight() - (tVar.d(8) * 2);
        final int i8 = height < 1 ? 1 : height;
        aVar.f15035y = tVar.f15025u.submit(new Runnable() { // from class: w2.f
            /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[PHI: r14
              0x0083: PHI (r14v18 double) = (r14v11 double), (r14v12 double) binds: [B:33:0x0081, B:36:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() throws Throwable {
                Bitmap bitmap;
                final Bitmap bitmapCreateBitmap;
                PdfRenderer pdfRenderer;
                Throwable th;
                m0 m0Var;
                int i9;
                float f6;
                float f7;
                int iSqrt;
                final t tVar2 = this.s;
                final t.a aVar2 = aVar;
                final int i10 = i6;
                final int i11 = i7;
                final int i12 = iH;
                int i13 = i8;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = null;
                }
                if (!tVar2.K && aVar2.f15033w == i10 && (pdfRenderer = tVar2.H) != null) {
                    final kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o();
                    oVar.s = tVar2.F;
                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i11);
                    try {
                        double height2 = pageOpenPage.getHeight();
                        int width = pageOpenPage.getWidth();
                        if (width < 1) {
                            width = 1;
                        }
                        double d7 = height2 / width;
                        oVar.s = d7;
                        if (tVar2.f15028x) {
                            try {
                                if (i12 <= 0 || i13 <= 0) {
                                    m0Var = new m0(0.0f, 0.0f, i12, i13);
                                } else {
                                    float f8 = i12;
                                    float f9 = (float) (f8 * d7);
                                    float f10 = i13;
                                    if (f9 > f10) {
                                        f7 = (float) (f10 / d7);
                                        f6 = f10;
                                    } else {
                                        f6 = f9;
                                        f7 = f8;
                                    }
                                    float f11 = (f8 - f7) / 2.0f;
                                    float f12 = (f10 - f6) / 2.0f;
                                    m0Var = new m0(f11, f12, f7 + f11, f6 + f12);
                                }
                                i9 = (int) (m0Var.f14945c - m0Var.f14943a);
                            } catch (Throwable th3) {
                                th = th3;
                                bitmap = null;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    try {
                                        androidx.activity.c0.c(pageOpenPage, th);
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        bitmapCreateBitmap = bitmap;
                                        if (th instanceof Exception) {
                                        }
                                        Log.w("PdfDocumentView", "Cannot render PDF page " + i11, th);
                                        if (bitmapCreateBitmap != null) {
                                        }
                                        tVar2.f15024t.post(new androidx.camera.core.imagecapture.s(i10, 1, aVar2));
                                    }
                                }
                            }
                        } else {
                            i9 = i12;
                        }
                        double d8 = 0.05d;
                        if (d7 >= 0.05d) {
                            d8 = 20.0d;
                            if (d7 > 20.0d) {
                            }
                            if (i9 < 1) {
                            }
                            iSqrt = (int) Math.sqrt(2000000.0d / d7);
                            if (iSqrt < 1) {
                            }
                            int iMin = Math.min(i9, Math.min(1600, iSqrt));
                            bitmapCreateBitmap = Bitmap.createBitmap(iMin, u5.d.p((int) (iMin * d7), 1, 4096), Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.eraseColor(-1);
                            pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                            androidx.activity.c0.c(pageOpenPage, null);
                            Handler handler = tVar2.f15024t;
                            Runnable runnable = new Runnable() { // from class: w2.n
                                @Override // java.lang.Runnable
                                public final void run() {
                                    t tVar3 = tVar2;
                                    t.a aVar3 = aVar2;
                                    int i14 = i10;
                                    int i15 = i11;
                                    Bitmap bitmap2 = bitmapCreateBitmap;
                                    kotlin.jvm.internal.o oVar2 = oVar;
                                    int i16 = i12;
                                    if (tVar3.K || aVar3.f15033w != i14 || aVar3.f15032v != i15) {
                                        bitmap2.recycle();
                                        return;
                                    }
                                    aVar3.f15035y = null;
                                    Double d9 = tVar3.E.get(i15);
                                    double d10 = oVar2.s;
                                    if (d9 == null || d9.doubleValue() != d10) {
                                        tVar3.E.put(i15, Double.valueOf(oVar2.s));
                                        aVar3.f15031u.setRatio(oVar2.s);
                                        if (!tVar3.f15028x) {
                                            c0 c0Var = aVar3.f15031u;
                                            ViewGroup.LayoutParams layoutParams = c0Var.getLayoutParams();
                                            layoutParams.height = u5.d.p((int) (i16 * oVar2.s), 1, 100000);
                                            c0Var.setLayoutParams(layoutParams);
                                        }
                                    }
                                    c0 c0Var2 = aVar3.f15031u;
                                    Bitmap bitmap3 = c0Var2.f14885v;
                                    c0Var2.f14885v = bitmap2;
                                    c0Var2.invalidate();
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    if (tVar3.B.p0()) {
                                        tVar3.j();
                                    }
                                }
                            };
                            bitmapCreateBitmap = bitmapCreateBitmap;
                            handler.post(runnable);
                            return;
                        }
                        d7 = d8;
                        if (i9 < 1) {
                            i9 = 1;
                        }
                        iSqrt = (int) Math.sqrt(2000000.0d / d7);
                        if (iSqrt < 1) {
                            iSqrt = 1;
                        }
                        int iMin2 = Math.min(i9, Math.min(1600, iSqrt));
                        bitmapCreateBitmap = Bitmap.createBitmap(iMin2, u5.d.p((int) (iMin2 * d7), 1, 4096), Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.eraseColor(-1);
                        try {
                            pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                            try {
                                androidx.activity.c0.c(pageOpenPage, null);
                                Handler handler2 = tVar2.f15024t;
                                try {
                                    Runnable runnable2 = new Runnable() { // from class: w2.n
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            t tVar3 = tVar2;
                                            t.a aVar3 = aVar2;
                                            int i14 = i10;
                                            int i15 = i11;
                                            Bitmap bitmap2 = bitmapCreateBitmap;
                                            kotlin.jvm.internal.o oVar2 = oVar;
                                            int i16 = i12;
                                            if (tVar3.K || aVar3.f15033w != i14 || aVar3.f15032v != i15) {
                                                bitmap2.recycle();
                                                return;
                                            }
                                            aVar3.f15035y = null;
                                            Double d9 = tVar3.E.get(i15);
                                            double d10 = oVar2.s;
                                            if (d9 == null || d9.doubleValue() != d10) {
                                                tVar3.E.put(i15, Double.valueOf(oVar2.s));
                                                aVar3.f15031u.setRatio(oVar2.s);
                                                if (!tVar3.f15028x) {
                                                    c0 c0Var = aVar3.f15031u;
                                                    ViewGroup.LayoutParams layoutParams = c0Var.getLayoutParams();
                                                    layoutParams.height = u5.d.p((int) (i16 * oVar2.s), 1, 100000);
                                                    c0Var.setLayoutParams(layoutParams);
                                                }
                                            }
                                            c0 c0Var2 = aVar3.f15031u;
                                            Bitmap bitmap3 = c0Var2.f14885v;
                                            c0Var2.f14885v = bitmap2;
                                            c0Var2.invalidate();
                                            if (bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            if (tVar3.B.p0()) {
                                                tVar3.j();
                                            }
                                        }
                                    };
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    handler2.post(runnable2);
                                    return;
                                } catch (Throwable th6) {
                                    th = th6;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            bitmap = bitmapCreateBitmap;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bitmap = null;
                    }
                    if ((th instanceof Exception) && !(th instanceof OutOfMemoryError)) {
                        throw th;
                    }
                    Log.w("PdfDocumentView", "Cannot render PDF page " + i11, th);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    tVar2.f15024t.post(new androidx.camera.core.imagecapture.s(i10, 1, aVar2));
                }
            }
        });
    }

    public static final Button p(ContextThemeWrapper contextThemeWrapper, final t tVar, final kotlin.jvm.internal.p<AlertDialog> pVar, int i6, final int i7) {
        Button button = new Button(contextThemeWrapper, null, android.R.attr.borderlessButtonStyle);
        button.setText(i6);
        button.setTextColor(tVar.s.f14963l);
        button.setAllCaps(false);
        button.setOnClickListener(new View.OnClickListener() { // from class: w2.o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.s.l(i7);
                AlertDialog alertDialog = (AlertDialog) pVar.s;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        });
        return button;
    }

    public final d5.c<Integer, Float> b() {
        RecyclerView recyclerView;
        Float fValueOf = Float.valueOf(0.0f);
        if (this.f15028x) {
            return new d5.c<>(Integer.valueOf(getCurrentPage()), fValueOf);
        }
        s0 s0Var = this.B;
        float f6 = s0Var.r0().f14944b;
        Rect rect = new Rect();
        int childCount = s0Var.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = s0Var.getChildAt(i6);
            this.C.y(childAt, rect);
            if (f6 >= rect.top && f6 < rect.bottom) {
                RecyclerView.b0 b0VarM = RecyclerView.M(childAt);
                int iJ = (b0VarM == null || (recyclerView = b0VarM.f1457r) == null) ? -1 : recyclerView.J(b0VarM);
                if (iJ != -1) {
                    Integer numValueOf = Integer.valueOf(iJ);
                    float f7 = f6 - rect.top;
                    int iHeight = rect.height();
                    if (iHeight < 1) {
                        iHeight = 1;
                    }
                    return new d5.c<>(numValueOf, Float.valueOf(u5.d.o(f7 / iHeight, 0.0f, 1.0f)));
                }
            }
        }
        return new d5.c<>(Integer.valueOf(getCurrentPage()), fValueOf);
    }

    public final void c(p5.a<? extends InputStream> aVar, File file) {
        InputStream inputStreamA = aVar.a();
        try {
            InputStream inputStream = inputStreamA;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[65536];
                long j6 = 0;
                while (!this.K) {
                    int i6 = inputStream.read(bArr);
                    if (i6 < 0) {
                        fileOutputStream.close();
                        androidx.activity.c0.d(inputStreamA, null);
                        return;
                    } else {
                        j6 += i6;
                        if (j6 > 104857600) {
                            throw new IllegalArgumentException("PDF exceeds 100 MB");
                        }
                        fileOutputStream.write(bArr, 0, i6);
                    }
                }
                throw new IllegalStateException("cancelled");
            } finally {
            }
        } finally {
        }
    }

    public final int d(int i6) {
        return e5.i.h(i6 * this.f15027w);
    }

    public final boolean e() {
        s0 s0Var = this.B;
        if (!s0Var.p0()) {
            return false;
        }
        s0Var.m0(1.0f, s0Var.getWidth() / 2.0f, s0Var.getHeight() / 2.0f);
        return true;
    }

    public final ImageButton f(int i6, int i7, p5.a<d5.j> aVar) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i6);
        imageButton.setImageTintList(ColorStateList.valueOf(this.A));
        imageButton.setBackground(m(true));
        imageButton.setContentDescription(imageButton.getContext().getString(i7));
        imageButton.setLayoutParams(new LinearLayout.LayoutParams(d(48), d(48)));
        imageButton.setOnClickListener(new com.google.android.material.datepicker.r(1, aVar));
        return imageButton;
    }

    public final void g() {
        if (this.f15016i0 == 0) {
            return;
        }
        t();
        n();
        z zVar = this.W;
        if (zVar == null || zVar.getDragging()) {
            return;
        }
        s0 s0Var = this.B;
        int iComputeVerticalScrollRange = s0Var.computeVerticalScrollRange() - s0Var.computeVerticalScrollExtent();
        zVar.setFraction(iComputeVerticalScrollRange > 0 ? s0Var.computeVerticalScrollOffset() / iComputeVerticalScrollRange : 0.0f);
        androidx.activity.d dVar = zVar.H;
        if (zVar.s < 2) {
            return;
        }
        zVar.removeCallbacks(dVar);
        if (zVar.getAlpha() < 1.0f) {
            zVar.animate().alpha(1.0f).setDuration(120L).start();
        }
        zVar.postDelayed(dVar, 1500L);
    }

    public final List<Integer> getBookmarkedPages() {
        return e5.q.k(this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getCurrentPage() {
        RecyclerView recyclerView;
        if (this.f15016i0 != 0) {
            s0 s0Var = this.B;
            m0 m0VarR0 = s0Var.r0();
            float f6 = m0VarR0.f14946d;
            float f7 = m0VarR0.f14944b;
            boolean z6 = this.f15028x;
            LinearLayoutManager linearLayoutManager = this.C;
            if (z6 || s0Var.canScrollVertically(1)) {
                float f8 = (m0VarR0.f14943a + m0VarR0.f14945c) / 2.0f;
                float f9 = z6 ? (f7 + f6) / 2.0f : f7 + ((f6 - f7) * 0.25f);
                Rect rect = new Rect();
                int childCount = s0Var.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = s0Var.getChildAt(i6);
                    linearLayoutManager.y(childAt, rect);
                    if (f8 < rect.left || f8 >= rect.right || f9 < rect.top || f9 >= rect.bottom) {
                        i6++;
                    } else {
                        RecyclerView.b0 b0VarM = RecyclerView.M(childAt);
                        int iJ = (b0VarM == null || (recyclerView = b0VarM.f1457r) == null) ? -1 : recyclerView.J(b0VarM);
                        Integer numValueOf = Integer.valueOf(iJ);
                        if (iJ != -1) {
                            numValueOf = numValueOf;
                        }
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                int iM0 = linearLayoutManager.M0();
                if (iM0 >= 0) {
                    return iM0;
                }
            } else if (s0Var.getPanY() <= ((1.0f - s0Var.getZoom()) * s0Var.getHeight()) + 1.0f) {
                int iN0 = linearLayoutManager.N0();
                numValueOf = iN0 != -1 ? Integer.valueOf(iN0) : null;
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
            }
        }
        return 0;
    }

    public final boolean getDarkChrome$pdfviewer_release() {
        return this.f15029y;
    }

    public final int getDetailTileCount() {
        int i6 = 0;
        LinkedHashSet linkedHashSet = this.G;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f15031u.getDetail() != null && (i6 = i6 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i6;
    }

    public final File getDocumentFile() {
        return this.f15015h0;
    }

    public final p5.a<d5.j> getOnError() {
        return this.f15019l0;
    }

    public final p5.l<Integer, d5.j> getOnPageChanged() {
        return this.f15020m0;
    }

    public final p5.l<File, d5.j> getOnPrint() {
        return this.f15023q0;
    }

    public final p5.a<d5.j> getOnReady() {
        return this.f15018k0;
    }

    public final p5.l<File, d5.j> getOnSave() {
        return this.p0;
    }

    public final p5.l<File, d5.j> getOnShare() {
        return this.f15022o0;
    }

    public final p5.a<d5.j> getOnSingleTap() {
        return this.f15021n0;
    }

    public final n0 getOptions() {
        return this.s;
    }

    public final int getPageCount() {
        return this.f15016i0;
    }

    public final RecyclerView getPageList() {
        return this.B;
    }

    public final int getRenderedPageCount() {
        int i6 = 0;
        LinkedHashSet linkedHashSet = this.G;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f15031u.getBase() != null && (i6 = i6 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i6;
    }

    public final float getZoom() {
        return this.B.getZoom();
    }

    public final int h() {
        int width = this.B.getWidth() - (d(8) * 2);
        if (width < 1) {
            return 1;
        }
        return width;
    }

    public final void i() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorPutFloat;
        if (!this.s.f14956d || this.f15016i0 == 0 || this.K) {
            return;
        }
        d5.c<Integer, Float> cVarB = b();
        int iIntValue = cVarB.s.intValue();
        float fFloatValue = cVarB.f12739t.floatValue();
        SharedPreferences sharedPreferences = this.f15026v.f14967a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt("page", iIntValue)) == null || (editorPutFloat = editorPutInt.putFloat("pageFraction", u5.d.o(fFloatValue, 0.0f, 1.0f))) == null) {
            return;
        }
        editorPutFloat.apply();
    }

    public final void j() {
        Handler handler = this.f15024t;
        w2.e eVar = this.f15014g0;
        handler.removeCallbacks(eVar);
        handler.postDelayed(eVar, 120L);
    }

    public final void k(float f6, int i6) {
        boolean z6 = this.f15028x;
        LinearLayoutManager linearLayoutManager = this.C;
        if (z6) {
            linearLayoutManager.p0(i6);
            return;
        }
        double dH = h();
        linearLayoutManager.f1375x = i6;
        linearLayoutManager.f1376y = -((int) (f6 * ((d(8) * 2) + ((int) (dH * (this.E.get(i6) != null ? r0.doubleValue() : this.F))))));
        LinearLayoutManager.d dVar = linearLayoutManager.f1377z;
        if (dVar != null) {
            dVar.s = -1;
        }
        linearLayoutManager.n0();
    }

    public final void l(int i6) {
        if (this.f15016i0 == 0) {
            return;
        }
        boolean z6 = this.f15028x;
        s0 s0Var = this.B;
        if (z6) {
            s0Var.q0();
        } else {
            if (s0Var.f14987d1) {
                s0Var.f14994k1 = 0.0f;
            } else {
                s0Var.f14993j1 = 0.0f;
            }
            s0Var.invalidate();
        }
        int iP = u5.d.p(i6, 0, this.f15016i0 - 1);
        LinearLayoutManager linearLayoutManager = this.C;
        linearLayoutManager.f1375x = iP;
        linearLayoutManager.f1376y = 0;
        LinearLayoutManager.d dVar = linearLayoutManager.f1377z;
        if (dVar != null) {
            dVar.s = -1;
        }
        linearLayoutManager.n0();
        s0Var.post(new androidx.activity.o(6, this));
    }

    public final Drawable m(boolean z6) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(z6 ? android.R.attr.selectableItemBackgroundBorderless : android.R.attr.selectableItemBackground, typedValue, true);
        if (typedValue.resourceId != 0) {
            return getContext().getDrawable(typedValue.resourceId);
        }
        return null;
    }

    public final void n() {
        if (!this.s.f14958f || this.f15016i0 == 0) {
            return;
        }
        if (this.f15008a0 == null || !this.Q) {
            Handler handler = this.f15024t;
            p pVar = this.f15013f0;
            handler.removeCallbacks(pVar);
            TextView textView = this.V;
            textView.animate().cancel();
            textView.setAlpha(1.0f);
            handler.postDelayed(pVar, 1500L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.app.AlertDialog, android.app.Dialog, java.lang.Object] */
    public final void o() {
        if (this.f15016i0 == 0) {
            return;
        }
        Context context = getContext();
        int i6 = android.R.style.Theme.Material.Light.Dialog.Alert;
        boolean z6 = this.f15029y;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z6 ? 16974374 : 16974394);
        EditText editText = new EditText(contextThemeWrapper);
        editText.setInputType(2);
        editText.setImeOptions(2);
        editText.setHint(editText.getContext().getString(R.string.pdf_document_page_short, 1, Integer.valueOf(this.f15016i0)));
        editText.setText(String.valueOf(getCurrentPage() + 1));
        editText.selectAll();
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(d(24), d(8), d(24), 0);
        linearLayout.addView(editText);
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        if (this.f15016i0 > 1) {
            kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n();
            SeekBar seekBar = new SeekBar(contextThemeWrapper);
            seekBar.setMax(this.f15016i0 - 1);
            seekBar.setProgress(getCurrentPage());
            n0 n0Var = this.s;
            seekBar.setProgressTintList(ColorStateList.valueOf(n0Var.f14963l));
            seekBar.setThumbTintList(ColorStateList.valueOf(n0Var.f14963l));
            seekBar.setPadding(d(8), d(16), d(8), d(8));
            seekBar.setOnSeekBarChangeListener(new d(nVar, editText));
            editText.addTextChangedListener(new c(nVar, this, seekBar));
            linearLayout.addView(seekBar);
            LinearLayout linearLayout2 = new LinearLayout(contextThemeWrapper);
            linearLayout2.setOrientation(0);
            linearLayout2.addView(p(contextThemeWrapper, this, pVar, R.string.pdf_document_first_page, 0));
            linearLayout2.addView(new View(contextThemeWrapper), new LinearLayout.LayoutParams(0, 1, 1.0f));
            linearLayout2.addView(p(contextThemeWrapper, this, pVar, R.string.pdf_document_last_page, this.f15016i0 - 1));
            linearLayout.addView(linearLayout2);
        }
        Context context2 = getContext();
        if (z6) {
            i6 = 16974374;
        }
        final ?? Create = new AlertDialog.Builder(context2, i6).setTitle(R.string.pdf_document_go_to_page).setView(linearLayout).setPositiveButton(R.string.pdf_document_go, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.pdf_document_cancel, (DialogInterface.OnClickListener) null).create();
        pVar.s = Create;
        final com.htmltoapk.template.t0 t0Var = new com.htmltoapk.template.t0(editText, this, Create, 1);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: w2.k
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                if (i7 != 2) {
                    return false;
                }
                t0Var.a();
                return true;
            }
        });
        Create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: w2.l
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = Create;
                Button button = alertDialog.getButton(-1);
                t tVar = this;
                button.setTextColor(tVar.s.f14963l);
                button.setOnClickListener(new com.htmltoapk.template.q0(t0Var, 2));
                alertDialog.getButton(-2).setTextColor(tVar.s.f14963l);
            }
        });
        Window window = Create.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        Create.show();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        d5.c<Integer, Float> cVarB = (this.f15016i0 <= 0 || i8 <= 0) ? null : b();
        super.onSizeChanged(i6, i7, i8, i9);
        if (cVarB != null) {
            if (i6 == i8 && i7 == i9) {
                return;
            }
            this.f15024t.post(new com.htmltoapk.template.u0(2, this, cVarB));
        }
    }

    public final void q() {
        SharedPreferences.Editor editorEdit;
        if (this.f15016i0 == 0) {
            return;
        }
        int currentPage = getCurrentPage();
        Integer numValueOf = Integer.valueOf(currentPage);
        TreeSet<Integer> treeSet = this.R;
        if (treeSet.remove(numValueOf)) {
            Toast.makeText(getContext(), R.string.pdf_document_bookmark_removed, 0).show();
        } else {
            treeSet.add(Integer.valueOf(currentPage));
            Toast.makeText(getContext(), getContext().getString(R.string.pdf_document_bookmark_added, Integer.valueOf(currentPage + 1)), 0).show();
        }
        o0 o0Var = this.f15026v;
        o0Var.getClass();
        SharedPreferences sharedPreferences = o0Var.f14967a;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = treeSet.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next.intValue() >= 0) {
                    arrayList.add(next);
                }
            }
            SharedPreferences.Editor editorPutString = editorEdit.putString("bookmarks", e5.q.h(e5.q.i(e5.q.f(arrayList)), ",", null, 62));
            if (editorPutString != null) {
                editorPutString.apply();
            }
        }
        t();
    }

    public final void r(int i6) {
        if (this.f15016i0 == 0) {
            return;
        }
        int iP = u5.d.p(getCurrentPage() + i6, 0, this.f15016i0 - 1);
        if (Math.abs(iP - getCurrentPage()) > 1 || this.B.p0()) {
            l(iP);
            return;
        }
        e eVar = new e(getContext());
        eVar.f1512a = iP;
        this.C.A0(eVar);
    }

    public final void s() {
        int i6;
        int i7;
        int i8;
        if (this.f15029y || this.f15017j0) {
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

    public final void setNight(boolean z6) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        this.f15017j0 = z6;
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f15031u.setNight(z6);
        }
        s();
        SharedPreferences sharedPreferences = this.f15026v.f14967a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("night", z6)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    public final void setOnError(p5.a<d5.j> aVar) {
        this.f15019l0 = aVar;
    }

    public final void setOnPageChanged(p5.l<? super Integer, d5.j> lVar) {
        this.f15020m0 = lVar;
    }

    public final void setOnPrint(p5.l<? super File, d5.j> lVar) {
        this.f15023q0 = lVar;
    }

    public final void setOnReady(p5.a<d5.j> aVar) {
        this.f15018k0 = aVar;
    }

    public final void setOnSave(p5.l<? super File, d5.j> lVar) {
        this.p0 = lVar;
    }

    public final void setOnShare(p5.l<? super File, d5.j> lVar) {
        this.f15022o0 = lVar;
    }

    public final void setOnSingleTap(p5.a<d5.j> aVar) {
        this.f15021n0 = aVar;
    }

    public final void t() {
        if (this.f15016i0 == 0) {
            return;
        }
        int currentPage = getCurrentPage();
        int i6 = currentPage + 1;
        String string = getContext().getString(R.string.pdf_document_page_short, Integer.valueOf(i6), Integer.valueOf(this.f15016i0));
        kotlin.jvm.internal.j.d("getString(...)", string);
        this.V.setText(string);
        TextView textView = this.f15009b0;
        if (textView != null) {
            textView.setText(string);
        }
        ImageButton imageButton = this.f15010c0;
        if (imageButton != null) {
            imageButton.setEnabled(currentPage > 0);
        }
        ImageButton imageButton2 = this.f15010c0;
        if (imageButton2 != null) {
            imageButton2.setAlpha(currentPage > 0 ? 1.0f : 0.38f);
        }
        ImageButton imageButton3 = this.f15011d0;
        if (imageButton3 != null) {
            imageButton3.setEnabled(i6 < this.f15016i0);
        }
        ImageButton imageButton4 = this.f15011d0;
        if (imageButton4 != null) {
            imageButton4.setAlpha(i6 < this.f15016i0 ? 1.0f : 0.38f);
        }
        ImageButton imageButton5 = this.f15012e0;
        if (imageButton5 != null) {
            boolean zContains = this.R.contains(Integer.valueOf(currentPage));
            imageButton5.setImageResource(zContains ? R.drawable.pdf_ic_bookmark : R.drawable.pdf_ic_bookmark_border);
            imageButton5.setImageTintList(ColorStateList.valueOf(zContains ? this.s.f14963l : this.A));
            imageButton5.setContentDescription(getContext().getString(zContains ? R.string.pdf_document_bookmark_remove : R.string.pdf_document_bookmark_add));
        }
        if (currentPage != this.P) {
            this.P = currentPage;
            p5.l<? super Integer, d5.j> lVar = this.f15020m0;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(currentPage));
            }
        }
    }

    public final void u(ComponentActivity componentActivity, p5.l lVar) {
        String str = this.s.f14964m;
        if (x5.o.v(str)) {
            str = "document";
        }
        this.f15022o0 = new androidx.camera.core.f0(str, componentActivity);
        this.f15023q0 = new androidx.camera.camera2.interop.h(componentActivity, str);
        this.p0 = lVar;
    }
}
