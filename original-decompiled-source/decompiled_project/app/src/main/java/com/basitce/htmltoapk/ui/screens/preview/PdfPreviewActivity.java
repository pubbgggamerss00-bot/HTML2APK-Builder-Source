package com.basitce.htmltoapk.ui.screens.preview;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import b9.a0;
import b9.a3;
import b9.b0;
import b9.h;
import b9.h0;
import b9.t;
import b9.u;
import b9.v;
import b9.w;
import b9.x;
import b9.y2;
import c2.n0;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.ProjectLimits;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;
import com.yalantis.ucrop.view.CropImageView;
import e9.x0;
import eh.l;
import eh.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import m9.g0;
import m9.s1;
import m9.v1;
import n8.f1;
import n8.g;
import n8.g1;
import n8.m1;
import n8.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.i0;
import q8.o1;
import vg.i;
import x0.x1;
import y3.a2;
import y3.d2;
import y3.e2;

/* loaded from: classes.dex */
public final class PdfPreviewActivity extends b9.d {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5788v = 0;

    /* renamed from: e, reason: collision with root package name */
    public g f5789e;

    /* renamed from: f, reason: collision with root package name */
    public s f5790f;

    /* renamed from: g, reason: collision with root package name */
    public m1 f5791g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f5792h;

    /* renamed from: j, reason: collision with root package name */
    public s1 f5793j;

    /* renamed from: k, reason: collision with root package name */
    public a3 f5794k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f5795l;

    /* renamed from: m, reason: collision with root package name */
    public File f5796m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5797n;

    /* renamed from: p, reason: collision with root package name */
    public long f5798p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5799q;

    /* renamed from: r, reason: collision with root package name */
    public final y2 f5800r = new y2();

    /* renamed from: s, reason: collision with root package name */
    public final e.c<Intent> f5801s = registerForActivityResult(new f.g(), new w(this));

    /* renamed from: t, reason: collision with root package name */
    public final e.c<String> f5802t = registerForActivityResult(new f.b(), new x(this));

    public static final class a {
        public static void a(Context context, Uri uri, String title, v1 options) {
            r.e(context, "context");
            r.e(title, "title");
            r.e(options, "options");
            c(context, uri, title, options, "preview", 0L, false);
        }

        public static void b(Context context, ProjectEntity project, boolean z10) {
            r.e(context, "context");
            r.e(project, "project");
            String sourcePath = project.getSourcePath();
            if (sourcePath == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Uri uriFromFile = Uri.fromFile(new File(sourcePath));
            r.d(uriFromFile, "fromFile(...)");
            c(context, uriFromFile, project.getName(), new v1(project.getName(), 4095), "document", project.getId(), z10);
        }

        public static void c(Context context, Uri uri, String str, v1 v1Var, String str2, long j10, boolean z10) {
            File file;
            if (r.a(uri.getScheme(), "file")) {
                String path = uri.getPath();
                if (path == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                file = new File(path);
            } else {
                file = null;
            }
            if (file != null) {
                uri = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            }
            Intent intentPutExtra = new Intent(context, (Class<?>) PdfPreviewActivity.class).setData(uri).putExtra("title", str);
            v1Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("scrollMode", v1Var.f17965a);
            bundle.putString("nightMode", v1Var.f17966b);
            bundle.putString("colorMode", v1Var.f17967c);
            bundle.putBoolean("rememberPage", v1Var.f17968d);
            bundle.putBoolean("showToolbar", v1Var.f17969e);
            bundle.putBoolean("showPageIndicator", v1Var.f17970f);
            bundle.putBoolean("fastScroll", v1Var.f17971g);
            bundle.putBoolean("zoomEnabled", v1Var.f17972h);
            bundle.putBoolean("bookmarks", v1Var.f17973i);
            bundle.putBoolean("allowExport", v1Var.f17974j);
            bundle.putInt("startPage", v1Var.f17975k);
            bundle.putInt("accentColor", v1Var.f17976l);
            bundle.putString("title", v1Var.f17977m);
            Intent intentPutExtra2 = intentPutExtra.putExtra("pdf_reader_options", bundle).putExtra("pdf_mode", str2).putExtra("pdf_project_id", j10).putExtra("pdf_start_edit", z10);
            if (file != null) {
                intentPutExtra2.putExtra("pdf_file", file.getAbsolutePath());
            }
            context.startActivity(intentPutExtra2.addFlags(1));
        }
    }

    public static final class b extends FrameLayout {

        /* renamed from: a, reason: collision with root package name */
        public final GestureDetector f5803a;

        public b(Context context, v vVar) {
            super(context);
            this.f5803a = new GestureDetector(context, new com.basitce.htmltoapk.ui.screens.preview.a(vVar));
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchTouchEvent(MotionEvent event) {
            r.e(event, "event");
            this.f5803a.onTouchEvent(event);
            return super.dispatchTouchEvent(event);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$edit$1", f = "PdfPreviewActivity.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<ProjectEntity, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f5804a;

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            c cVar = PdfPreviewActivity.this.new c(eVar);
            cVar.f5804a = obj;
            return cVar;
        }

        @Override // eh.p
        public final Object invoke(ProjectEntity projectEntity, tg.e<? super f0> eVar) {
            return ((c) create(projectEntity, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            ProjectEntity projectEntity = (ProjectEntity) this.f5804a;
            int i10 = PdfPreviewActivity.f5788v;
            PdfPreviewActivity pdfPreviewActivity = PdfPreviewActivity.this;
            a.b(pdfPreviewActivity, projectEntity, true);
            pdfPreviewActivity.finish();
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$onCreate$1", f = "PdfPreviewActivity.kt", l = {106}, m = "invokeSuspend")
    public static final class d extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5806a;

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return PdfPreviewActivity.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5806a;
            String strA = null;
            final PdfPreviewActivity pdfPreviewActivity = PdfPreviewActivity.this;
            if (i10 == 0) {
                q.b(obj);
                m1 m1Var = pdfPreviewActivity.f5791g;
                if (m1Var == null) {
                    r.h("settingsRepository");
                    throw null;
                }
                f1 f1Var = m1Var.f18529e;
                this.f5806a = 1;
                obj = gg.a.f(f1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            k9.a aVar2 = (k9.a) obj;
            if (!pdfPreviewActivity.isFinishing() && !pdfPreviewActivity.isDestroyed()) {
                y2 y2Var = pdfPreviewActivity.f5800r;
                int i11 = 0;
                boolean z10 = (pdfPreviewActivity.getResources().getConfiguration().uiMode & 48) == 32;
                v1 v1VarA = v1.a(v1.a.a(pdfPreviewActivity.getIntent().getBundleExtra("pdf_reader_options")), k9.c.a(aVar2, z10).a() ? "dark" : "light", n0.j(o1.b(ProjectKind.PDF).f22292a), y2Var.b(), 1483);
                y2Var.f4168l.setValue(Boolean.valueOf(r.a(v1VarA.f17965a, "horizontal")));
                y2Var.f4169m.setValue(Boolean.valueOf(v1VarA.f17974j));
                if (pdfPreviewActivity.i().equals("document") && pdfPreviewActivity.j() != 0) {
                    int i12 = PdfPreviewActivity.f5788v;
                    strA = m0.r.a("doc_", pdfPreviewActivity.j());
                }
                final g0 g0Var = new g0(pdfPreviewActivity, v1VarA, strA);
                g0Var.w(pdfPreviewActivity, new b9.g(pdfPreviewActivity, i11));
                g0Var.setOnReady(new eh.a() { // from class: b9.q
                    @Override // eh.a
                    public final Object invoke() {
                        PdfPreviewActivity pdfPreviewActivity2 = pdfPreviewActivity;
                        y2 y2Var2 = pdfPreviewActivity2.f5800r;
                        m9.g0 g0Var2 = g0Var;
                        y2Var2.f4161e.f(g0Var2.getPageCount());
                        y2Var2.f4160d.f(g0Var2.getCurrentPage());
                        y2Var2.f4163g.setValue(Boolean.valueOf(g0Var2.S));
                        List<Integer> bookmarkedPages = g0Var2.getBookmarkedPages();
                        kotlin.jvm.internal.r.e(bookmarkedPages, "<set-?>");
                        y2Var2.f4164h.setValue(bookmarkedPages);
                        File documentFile = g0Var2.getDocumentFile();
                        y2Var2.f4162f.h(documentFile != null ? documentFile.length() : 0L);
                        y2Var2.f4158b.setValue(Boolean.TRUE);
                        if (pdfPreviewActivity2.getIntent().getBooleanExtra("pdf_start_edit", false)) {
                            pdfPreviewActivity2.getIntent().removeExtra("pdf_start_edit");
                            pdfPreviewActivity2.h();
                        }
                        return pg.f0.f21461a;
                    }
                });
                g0Var.setOnError(new t(pdfPreviewActivity, i11));
                g0Var.setOnPageChanged(new u(pdfPreviewActivity, i11));
                g0Var.i(pdfPreviewActivity.f5795l);
                y2Var.f4163g.setValue(Boolean.valueOf(g0Var.S));
                pdfPreviewActivity.f5792h = g0Var;
                b bVar = new b(pdfPreviewActivity, new v(pdfPreviewActivity));
                bVar.addView(g0Var, new FrameLayout.LayoutParams(-1, -1));
                c.g.a(pdfPreviewActivity, new f1.b(-836994998, true, new com.basitce.htmltoapk.ui.screens.preview.c(pdfPreviewActivity, aVar2, bVar, v1VarA, z10, g0Var)));
                pdfPreviewActivity.l(g0Var);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity$runOnce$1", f = "PdfPreviewActivity.kt", l = {323}, m = "invokeSuspend")
    public static final class e extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5808a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f5809b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PdfPreviewActivity f5810c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(l<? super tg.e<? super f0>, ? extends Object> lVar, PdfPreviewActivity pdfPreviewActivity, tg.e<? super e> eVar) {
            super(2, eVar);
            this.f5809b = (i) lVar;
            this.f5810c = pdfPreviewActivity;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [eh.l, vg.i] */
        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new e(this.f5809b, this.f5810c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r7v9, types: [eh.l, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            PdfPreviewActivity pdfPreviewActivity = this.f5810c;
            y2 y2Var = pdfPreviewActivity.f5800r;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5808a;
            try {
                try {
                    if (i10 == 0) {
                        q.b(obj);
                        ?? r72 = this.f5809b;
                        this.f5808a = 1;
                        if (r72.invoke(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.b(obj);
                    }
                } catch (Exception e10) {
                    if (e10 instanceof CancellationException) {
                        throw e10;
                    }
                    String message = e10.getMessage();
                    if (message == null) {
                        message = e10.getClass().getSimpleName();
                    }
                    Toast.makeText(pdfPreviewActivity, pdfPreviewActivity.getString(R.string.document_create_failed, message), 1).show();
                }
                return f0.f21461a;
            } finally {
                pdfPreviewActivity.f5797n = false;
                y2Var.f4166j.setValue(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(PdfPreviewActivity pdfPreviewActivity, String str, vg.c cVar) {
        h0 h0Var;
        PdfPreviewActivity pdfPreviewActivity2;
        boolean z10;
        ProjectLimits projectLimits;
        String str2;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f3863h;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h0Var.f3863h = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h0Var = new h0(pdfPreviewActivity, cVar);
            }
        }
        Object objF = h0Var.f3861f;
        ug.a aVar = ug.a.f29706a;
        int i11 = h0Var.f3863h;
        if (i11 == 0) {
            q.b(objF);
            m1 m1Var = pdfPreviewActivity.f5791g;
            if (m1Var == null) {
                r.h("settingsRepository");
                throw null;
            }
            g1 g1Var = m1Var.f18530f;
            h0Var.f3856a = pdfPreviewActivity;
            h0Var.f3857b = str;
            h0Var.f3863h = 1;
            objF = gg.a.f(g1Var, h0Var);
            if (objF != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = h0Var.f3860e;
            str = h0Var.f3859d;
            projectLimits = h0Var.f3858c;
            str2 = h0Var.f3857b;
            pdfPreviewActivity2 = h0Var.f3856a;
            q.b(objF);
            if (!projectLimits.canCreate(str, z10, ((Number) objF).intValue())) {
                return Boolean.TRUE;
            }
            pdfPreviewActivity2.f5800r.f4167k.setValue(str2);
            return Boolean.FALSE;
        }
        str = h0Var.f3857b;
        pdfPreviewActivity = h0Var.f3856a;
        q.b(objF);
        boolean zBooleanValue = ((Boolean) objF).booleanValue();
        ProjectLimits projectLimits2 = ProjectLimits.INSTANCE;
        s sVarK = pdfPreviewActivity.k();
        h0Var.f3856a = pdfPreviewActivity;
        h0Var.f3857b = str;
        h0Var.f3858c = projectLimits2;
        h0Var.f3859d = str;
        h0Var.f3860e = zBooleanValue;
        h0Var.f3863h = 2;
        Object objCountByKind = sVarK.f18583a.countByKind(str, h0Var);
        if (objCountByKind != aVar) {
            pdfPreviewActivity2 = pdfPreviewActivity;
            z10 = zBooleanValue;
            objF = objCountByKind;
            projectLimits = projectLimits2;
            str2 = str;
            if (!projectLimits.canCreate(str, z10, ((Number) objF).intValue())) {
            }
        }
        return aVar;
    }

    public static final Integer m(int[] iArr, int i10) {
        Integer numValueOf = (i10 < 0 || i10 >= iArr.length) ? null : Integer.valueOf(iArr[i10]);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    public final void h() {
        if (!i().equals("document") || j() == 0) {
            Uri data = getIntent().getData();
            if (data == null) {
                return;
            }
            n(new b0(this, data, new c(null), null));
            return;
        }
        Intent intentPutExtra = new Intent(this, (Class<?>) PdfEditorActivity.class).putExtra("pdf_edit_project_id", j());
        r.d(intentPutExtra, "putExtra(...)");
        this.f5801s.a(intentPutExtra);
    }

    public final String i() {
        String stringExtra = getIntent().getStringExtra("pdf_mode");
        return stringExtra == null ? "preview" : stringExtra;
    }

    public final long j() {
        return getIntent().getLongExtra("pdf_project_id", 0L);
    }

    public final s k() {
        s sVar = this.f5790f;
        if (sVar != null) {
            return sVar;
        }
        r.h("projectRepository");
        throw null;
    }

    public final void l(final g0 g0Var) {
        String stringExtra = getIntent().getStringExtra("pdf_file");
        final File file = null;
        if (stringExtra != null) {
            File file2 = new File(stringExtra);
            if (file2.isFile()) {
                file = file2;
            }
        }
        if (file != null) {
            g0Var.getClass();
            final eh.a aVar = new eh.a() { // from class: m9.l
                @Override // eh.a
                public final Object invoke() {
                    return file;
                }
            };
            if (g0Var.f17795w) {
                throw new IllegalStateException("Document is already open");
            }
            g0Var.f17795w = true;
            g0Var.f17777c.execute(new Runnable() { // from class: m9.q
                @Override // java.lang.Runnable
                public final void run() throws FileNotFoundException {
                    eh.a aVar2 = aVar;
                    final g0 g0Var2 = g0Var;
                    try {
                        final File file3 = (File) aVar2.invoke();
                        if (g0Var2.f17794v) {
                            throw new IllegalStateException("cancelled");
                        }
                        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 268435456);
                        g0Var2.f17792s = parcelFileDescriptorOpen;
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                        g0Var2.f17791r = pdfRenderer;
                        final int pageCount = pdfRenderer.getPageCount();
                        if (pageCount <= 0) {
                            throw new IllegalArgumentException("Empty PDF");
                        }
                        final SparseArray sparseArray = new SparseArray();
                        int iMin = Math.min(pageCount, 300);
                        for (int i10 = 0; i10 < iMin; i10++) {
                            if (g0Var2.f17794v) {
                                throw new IllegalStateException("cancelled");
                            }
                            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i10);
                            try {
                                double height = pageOpenPage.getHeight();
                                int width = pageOpenPage.getWidth();
                                if (width < 1) {
                                    width = 1;
                                }
                                sparseArray.put(i10, Double.valueOf(height / width));
                                pg.f0 f0Var = pg.f0.f21461a;
                                ch.a.a(pageOpenPage, null);
                            } finally {
                            }
                        }
                        g0Var2.f17775b.post(new Runnable() { // from class: m9.x
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                pg.n nVar;
                                SharedPreferences sharedPreferences;
                                boolean zBooleanValue;
                                g0 g0Var3 = g0Var2;
                                File file4 = file3;
                                int i11 = pageCount;
                                SparseArray sparseArray2 = sparseArray;
                                if (g0Var3.f17794v) {
                                    return;
                                }
                                v1 v1Var = g0Var3.f17773a;
                                TreeSet<Integer> treeSet = g0Var3.C;
                                c2 c2Var = g0Var3.f17785k;
                                w1 w1Var = g0Var3.f17779d;
                                g0Var3.Q = file4;
                                g0Var3.R = i11;
                                int size = sparseArray2.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    g0Var3.f17788n.put(sparseArray2.keyAt(i12), sparseArray2.valueAt(i12));
                                }
                                Double d10 = (Double) sparseArray2.get(0);
                                g0Var3.f17789p = d10 != null ? d10.doubleValue() : g0Var3.f17789p;
                                treeSet.clear();
                                SharedPreferences sharedPreferences2 = w1Var.f17980a;
                                String string = sharedPreferences2 != null ? sharedPreferences2.getString("bookmarks", null) : null;
                                if (string == null) {
                                    string = "";
                                }
                                List listP = mh.x.P(string, new char[]{','});
                                ArrayList arrayList = new ArrayList();
                                Iterator it = listP.iterator();
                                while (it.hasNext()) {
                                    Integer numG = mh.s.g(mh.x.W((String) it.next()).toString());
                                    if (numG != null) {
                                        arrayList.add(numG);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int size2 = arrayList.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj = arrayList.get(i13);
                                    i13++;
                                    int iIntValue = ((Number) obj).intValue();
                                    if (iIntValue >= 0 && iIntValue < i11) {
                                        arrayList2.add(obj);
                                    }
                                }
                                qg.t.p(qg.x.T(qg.x.x(arrayList2)), treeSet);
                                int i14 = g0Var3.f17796x;
                                if (i14 >= 0) {
                                    nVar = new pg.n(Integer.valueOf(i14), Float.valueOf(g0Var3.f17797y));
                                } else {
                                    boolean z10 = v1Var.f17968d;
                                    float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                                    if (z10 && (sharedPreferences = w1Var.f17980a) != null && sharedPreferences.contains("page")) {
                                        SharedPreferences sharedPreferences3 = w1Var.f17980a;
                                        Integer numValueOf = Integer.valueOf(sharedPreferences3 != null ? sharedPreferences3.getInt("page", 0) : 0);
                                        SharedPreferences sharedPreferences4 = w1Var.f17980a;
                                        if (sharedPreferences4 != null) {
                                            f10 = sharedPreferences4.getFloat("pageFraction", CropImageView.DEFAULT_ASPECT_RATIO);
                                        }
                                        nVar = new pg.n(numValueOf, Float.valueOf(f10));
                                    } else {
                                        nVar = new pg.n(Integer.valueOf(v1Var.f17975k - 1), Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                                    }
                                }
                                int iIntValue2 = ((Number) nVar.f21469a).intValue();
                                float fFloatValue = ((Number) nVar.f21470b).floatValue();
                                Boolean bool = g0Var3.f17798z;
                                if (bool != null && (zBooleanValue = bool.booleanValue()) != g0Var3.S) {
                                    g0Var3.setNight(zBooleanValue);
                                }
                                g0Var3.D.setVisibility(8);
                                LinearLayout linearLayout = g0Var3.I;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                }
                                u0 u0Var = g0Var3.H;
                                if (u0Var != null) {
                                    u0Var.setPageCount(i11);
                                }
                                g0Var3.f17787m.f2727a.a();
                                int iM = jh.j.m(iIntValue2, 0, i11 - 1);
                                if (c2Var.getWidth() > 0) {
                                    g0Var3.m(fFloatValue, iM);
                                } else {
                                    c2Var.addOnLayoutChangeListener(new i0(g0Var3, iM, fFloatValue));
                                }
                                c2Var.post(new b.t(g0Var3, 1));
                            }
                        });
                    } catch (Exception e10) {
                        Log.w("PdfDocumentView", "Cannot open PDF", e10);
                        g0Var2.f17775b.post(new Runnable() { // from class: m9.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                g0 g0Var3 = g0Var2;
                                if (g0Var3.f17794v) {
                                    return;
                                }
                                g0Var3.F.setVisibility(8);
                                g0Var3.E.setText(R.string.pdf_document_error);
                                g0Var3.D.setVisibility(0);
                                eh.a<pg.f0> aVar3 = g0Var3.U;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                }
                            }
                        });
                    }
                }
            });
            return;
        }
        final h hVar = new h(this);
        g0Var.getClass();
        final eh.a aVar2 = new eh.a() { // from class: m9.k
            @Override // eh.a
            public final Object invoke() throws IOException {
                g0 g0Var2 = g0Var;
                b9.h hVar2 = hVar;
                File fileCreateTempFile = File.createTempFile("pdf_document_", ".pdf", g0Var2.getContext().getCacheDir());
                g0Var2.f17793t = fileCreateTempFile;
                kotlin.jvm.internal.r.b(fileCreateTempFile);
                Closeable closeable = (Closeable) hVar2.invoke();
                try {
                    InputStream inputStream = (InputStream) closeable;
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        byte[] bArr = new byte[65536];
                        long j10 = 0;
                        while (!g0Var2.f17794v) {
                            int i10 = inputStream.read(bArr);
                            if (i10 < 0) {
                                pg.f0 f0Var = pg.f0.f21461a;
                                fileOutputStream.close();
                                closeable.close();
                                return fileCreateTempFile;
                            }
                            j10 += i10;
                            if (j10 > 104857600) {
                                throw new IllegalArgumentException("PDF exceeds 100 MB");
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                        throw new IllegalStateException("cancelled");
                    } finally {
                    }
                } finally {
                }
            }
        };
        if (g0Var.f17795w) {
            throw new IllegalStateException("Document is already open");
        }
        g0Var.f17795w = true;
        g0Var.f17777c.execute(new Runnable() { // from class: m9.q
            @Override // java.lang.Runnable
            public final void run() throws FileNotFoundException {
                eh.a aVar22 = aVar2;
                final g0 g0Var2 = g0Var;
                try {
                    final File file3 = (File) aVar22.invoke();
                    if (g0Var2.f17794v) {
                        throw new IllegalStateException("cancelled");
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 268435456);
                    g0Var2.f17792s = parcelFileDescriptorOpen;
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                    g0Var2.f17791r = pdfRenderer;
                    final int pageCount = pdfRenderer.getPageCount();
                    if (pageCount <= 0) {
                        throw new IllegalArgumentException("Empty PDF");
                    }
                    final SparseArray sparseArray = new SparseArray();
                    int iMin = Math.min(pageCount, 300);
                    for (int i10 = 0; i10 < iMin; i10++) {
                        if (g0Var2.f17794v) {
                            throw new IllegalStateException("cancelled");
                        }
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i10);
                        try {
                            double height = pageOpenPage.getHeight();
                            int width = pageOpenPage.getWidth();
                            if (width < 1) {
                                width = 1;
                            }
                            sparseArray.put(i10, Double.valueOf(height / width));
                            pg.f0 f0Var = pg.f0.f21461a;
                            ch.a.a(pageOpenPage, null);
                        } finally {
                        }
                    }
                    g0Var2.f17775b.post(new Runnable() { // from class: m9.x
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            pg.n nVar;
                            SharedPreferences sharedPreferences;
                            boolean zBooleanValue;
                            g0 g0Var3 = g0Var2;
                            File file4 = file3;
                            int i11 = pageCount;
                            SparseArray sparseArray2 = sparseArray;
                            if (g0Var3.f17794v) {
                                return;
                            }
                            v1 v1Var = g0Var3.f17773a;
                            TreeSet<Integer> treeSet = g0Var3.C;
                            c2 c2Var = g0Var3.f17785k;
                            w1 w1Var = g0Var3.f17779d;
                            g0Var3.Q = file4;
                            g0Var3.R = i11;
                            int size = sparseArray2.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                g0Var3.f17788n.put(sparseArray2.keyAt(i12), sparseArray2.valueAt(i12));
                            }
                            Double d10 = (Double) sparseArray2.get(0);
                            g0Var3.f17789p = d10 != null ? d10.doubleValue() : g0Var3.f17789p;
                            treeSet.clear();
                            SharedPreferences sharedPreferences2 = w1Var.f17980a;
                            String string = sharedPreferences2 != null ? sharedPreferences2.getString("bookmarks", null) : null;
                            if (string == null) {
                                string = "";
                            }
                            List listP = mh.x.P(string, new char[]{','});
                            ArrayList arrayList = new ArrayList();
                            Iterator it = listP.iterator();
                            while (it.hasNext()) {
                                Integer numG = mh.s.g(mh.x.W((String) it.next()).toString());
                                if (numG != null) {
                                    arrayList.add(numG);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                int iIntValue = ((Number) obj).intValue();
                                if (iIntValue >= 0 && iIntValue < i11) {
                                    arrayList2.add(obj);
                                }
                            }
                            qg.t.p(qg.x.T(qg.x.x(arrayList2)), treeSet);
                            int i14 = g0Var3.f17796x;
                            if (i14 >= 0) {
                                nVar = new pg.n(Integer.valueOf(i14), Float.valueOf(g0Var3.f17797y));
                            } else {
                                boolean z10 = v1Var.f17968d;
                                float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                                if (z10 && (sharedPreferences = w1Var.f17980a) != null && sharedPreferences.contains("page")) {
                                    SharedPreferences sharedPreferences3 = w1Var.f17980a;
                                    Integer numValueOf = Integer.valueOf(sharedPreferences3 != null ? sharedPreferences3.getInt("page", 0) : 0);
                                    SharedPreferences sharedPreferences4 = w1Var.f17980a;
                                    if (sharedPreferences4 != null) {
                                        f10 = sharedPreferences4.getFloat("pageFraction", CropImageView.DEFAULT_ASPECT_RATIO);
                                    }
                                    nVar = new pg.n(numValueOf, Float.valueOf(f10));
                                } else {
                                    nVar = new pg.n(Integer.valueOf(v1Var.f17975k - 1), Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                                }
                            }
                            int iIntValue2 = ((Number) nVar.f21469a).intValue();
                            float fFloatValue = ((Number) nVar.f21470b).floatValue();
                            Boolean bool = g0Var3.f17798z;
                            if (bool != null && (zBooleanValue = bool.booleanValue()) != g0Var3.S) {
                                g0Var3.setNight(zBooleanValue);
                            }
                            g0Var3.D.setVisibility(8);
                            LinearLayout linearLayout = g0Var3.I;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                            u0 u0Var = g0Var3.H;
                            if (u0Var != null) {
                                u0Var.setPageCount(i11);
                            }
                            g0Var3.f17787m.f2727a.a();
                            int iM = jh.j.m(iIntValue2, 0, i11 - 1);
                            if (c2Var.getWidth() > 0) {
                                g0Var3.m(fFloatValue, iM);
                            } else {
                                c2Var.addOnLayoutChangeListener(new i0(g0Var3, iM, fFloatValue));
                            }
                            c2Var.post(new b.t(g0Var3, 1));
                        }
                    });
                } catch (Exception e10) {
                    Log.w("PdfDocumentView", "Cannot open PDF", e10);
                    g0Var2.f17775b.post(new Runnable() { // from class: m9.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0 g0Var3 = g0Var2;
                            if (g0Var3.f17794v) {
                                return;
                            }
                            g0Var3.F.setVisibility(8);
                            g0Var3.E.setText(R.string.pdf_document_error);
                            g0Var3.D.setVisibility(0);
                            eh.a<pg.f0> aVar3 = g0Var3.U;
                            if (aVar3 != null) {
                                aVar3.invoke();
                            }
                        }
                    });
                }
            }
        });
    }

    public final void n(l<? super tg.e<? super f0>, ? extends Object> lVar) {
        if (this.f5797n) {
            return;
        }
        this.f5797n = true;
        this.f5800r.f4166j.setValue(Boolean.TRUE);
        ph.h.c(androidx.lifecycle.u.a(this), null, null, new e(lVar, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b9.d, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        k9.g.a(this);
        this.f5795l = bundle;
        if ((bundle == null || (stringExtra = bundle.getString("pdf_reader_title")) == null) && (stringExtra = getIntent().getStringExtra("title")) == null) {
            stringExtra = getString(R.string.pdf_source);
            r.d(stringExtra, "getString(...)");
        }
        y2 y2Var = this.f5800r;
        y2Var.getClass();
        x1 x1Var = y2Var.f4172p;
        x1 x1Var2 = y2Var.f4171o;
        x1 x1Var3 = y2Var.f4170n;
        y2Var.f4157a.setValue(stringExtra);
        y2Var.f4165i.setValue(Boolean.valueOf(bundle != null ? bundle.getBoolean("pdf_reader_chrome", true) : true));
        int i10 = 0;
        y2Var.f4174r.setValue(Boolean.valueOf(bundle != null ? bundle.getBoolean("pdf_reader_added", false) : false));
        this.f5798p = bundle != null ? bundle.getLong("pdf_reader_added_id", 0L) : 0L;
        x1Var3.setValue(Boolean.valueOf(i().equals("document") && j() != 0));
        Boolean bool = (Boolean) x1Var3.getValue();
        bool.getClass();
        x1Var2.setValue(bool);
        x1Var.setValue(Boolean.valueOf(i().equals("external") && getIntent().getData() != null));
        y2Var.f4173q.setValue(Boolean.valueOf(((Boolean) x1Var2.getValue()).booleanValue() || ((Boolean) x1Var.getValue()).booleanValue()));
        if (!i().equals("preview")) {
            ph.h.c(androidx.lifecycle.u.a(this), null, null, new d(null), 3);
            return;
        }
        v1 v1VarA = v1.a.a(getIntent().getBundleExtra("pdf_reader_options"));
        String strB = v1VarA.f17977m;
        if (mh.x.A(strB)) {
            strB = y2Var.b();
        }
        final s1 s1Var = new s1(this, v1.a(v1VarA, null, 0, strB, 4095));
        s1Var.setOnBack(new eh.a() { // from class: b9.y
            @Override // eh.a
            public final Object invoke() {
                int i11 = PdfPreviewActivity.f5788v;
                this.f4151a.finish();
                return pg.f0.f21461a;
            }
        });
        s1Var.getDocument().w(this, new l() { // from class: b9.z
            @Override // eh.l
            public final Object invoke(Object obj) {
                Object objA;
                m9.s1 s1Var2 = s1Var;
                File file = (File) obj;
                int i11 = PdfPreviewActivity.f5788v;
                kotlin.jvm.internal.r.e(file, "file");
                PdfPreviewActivity pdfPreviewActivity = this.f4185a;
                pdfPreviewActivity.f5796m = file;
                try {
                    e.c<String> cVar = pdfPreviewActivity.f5802t;
                    Handler handler = m9.r0.f17892a;
                    cVar.a(m9.r0.a(s1Var2.getOptions().f17977m));
                    objA = pg.f0.f21461a;
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (pg.p.a(objA) != null) {
                    pdfPreviewActivity.f5796m = null;
                }
                return pg.f0.f21461a;
            }
        });
        Bundle bundle2 = this.f5795l;
        s1Var.f17901d.i(bundle2);
        if (bundle2 != null && !bundle2.getBoolean("pdf_reader_layout_chrome", true)) {
            s1Var.f17909m = false;
        }
        Window window = getWindow();
        getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        x0 e2Var = i11 >= 35 ? new e2(window) : i11 >= 30 ? new d2(window) : new a2(window);
        e2Var.c(!r2.getDarkChrome$pdfviewer_release());
        e2Var.b(!r2.getDarkChrome$pdfviewer_release());
        b.h0.a(getOnBackPressedDispatcher(), this, new a0(i10, s1Var, this));
        this.f5793j = s1Var;
        this.f5792h = s1Var.getDocument();
        setContentView(s1Var);
        l(s1Var.getDocument());
    }

    @Override // b9.d, android.app.Activity
    public final void onDestroy() {
        s1 s1Var = this.f5793j;
        if (s1Var != null) {
            m9.x0 x0Var = s1Var.f17911p;
            if (x0Var != null) {
                x0Var.dismiss();
            }
            s1Var.f17911p = null;
            final m9.a2 a2Var = s1Var.f17910n;
            if (a2Var != null && !a2Var.f17730f) {
                a2Var.f17730f = true;
                a2Var.f17726b.removeCallbacksAndMessages(null);
                a2Var.f17727c.execute(new Runnable() { // from class: m9.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a2 a2Var2 = a2Var;
                        try {
                            PdfRenderer pdfRenderer = a2Var2.f17729e;
                            if (pdfRenderer != null) {
                                pdfRenderer.close();
                                pg.f0 f0Var = pg.f0.f21461a;
                            }
                        } catch (Throwable th2) {
                            pg.q.a(th2);
                        }
                        try {
                            ParcelFileDescriptor parcelFileDescriptor = a2Var2.f17728d;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                                pg.f0 f0Var2 = pg.f0.f21461a;
                            }
                        } catch (Throwable th3) {
                            pg.q.a(th3);
                        }
                        a2Var2.f17731g.evictAll();
                    }
                });
                a2Var.f17727c.shutdown();
            }
            s1Var.f17910n = null;
            s1.b bVar = s1Var.f17914s;
            if (bVar != null) {
                bVar.a(false);
            }
            s1Var.f17901d.h();
        }
        g0 g0Var = this.f5792h;
        if (g0Var != null) {
            g0Var.h();
        }
        a3 a3Var = this.f5794k;
        if (a3Var != null) {
            a3Var.l(false);
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.k, o3.d, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        r.e(outState, "outState");
        g0 g0Var = this.f5792h;
        if (!this.f5799q) {
            s1 s1Var = this.f5793j;
            if (s1Var != null) {
                s1Var.f17901d.k(outState);
                outState.putBoolean("pdf_reader_layout_chrome", s1Var.f17909m);
            } else if (g0Var != null) {
                g0Var.k(outState);
            } else {
                Bundle bundle = this.f5795l;
                if (bundle != null) {
                    outState.putAll(bundle);
                }
            }
        }
        y2 y2Var = this.f5800r;
        outState.putString("pdf_reader_title", y2Var.b());
        outState.putBoolean("pdf_reader_chrome", ((Boolean) y2Var.f4165i.getValue()).booleanValue());
        outState.putBoolean("pdf_reader_added", ((Boolean) y2Var.f4174r.getValue()).booleanValue());
        outState.putLong("pdf_reader_added_id", this.f5798p);
        super.onSaveInstanceState(outState);
    }
}
