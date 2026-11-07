package com.htmltoapk.template;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class PdfActivity extends ComponentActivity {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ACCENT = "pdf_accent";
    private static final String EXTRA_COLOR_MODE = "pdf_color_mode";
    private volatile HttpURLConnection connection;
    private File pendingSave;
    private w2.l0 reader;
    private final d.c<String> saveLauncher = registerForActivityResult(new e.b("application/pdf"), new androidx.camera.core.impl.e(4, this));

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public static /* synthetic */ boolean open$default(Companion companion, Context context, Uri uri, int i6, String str, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                i6 = -14575885;
            }
            if ((i7 & 8) != 0) {
                str = "auto";
            }
            return companion.open(context, uri, i6, str);
        }

        public final boolean isPdf(Uri uri) {
            String path;
            return (uri == null || (path = uri.getPath()) == null || !x5.l.j(path, ".pdf", true)) ? false : true;
        }

        public final boolean open(Context context, Uri uri, int i6, String str) {
            kotlin.jvm.internal.j.e("context", context);
            kotlin.jvm.internal.j.e("uri", uri);
            kotlin.jvm.internal.j.e("colorMode", str);
            if (!e5.l.c("content", "https", "http").contains(uri.getScheme())) {
                return false;
            }
            Intent intent = new Intent(context, (Class<?>) PdfActivity.class);
            intent.setData(uri);
            intent.putExtra(PdfActivity.EXTRA_ACCENT, i6);
            intent.putExtra(PdfActivity.EXTRA_COLOR_MODE, str);
            intent.addFlags(1);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        }

        private Companion() {
        }
    }

    private final InputStream input(Uri uri, String str) throws IOException {
        String path;
        if (kotlin.jvm.internal.j.a(uri.getScheme(), "content")) {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new IllegalStateException("Cannot open PDF");
        }
        if (kotlin.jvm.internal.j.a(uri.getScheme(), "https") && kotlin.jvm.internal.j.a(uri.getHost(), TrustedOrigins.LOCAL_HOST) && (path = uri.getPath()) != null && x5.l.n(path, "/assets/www/", false)) {
            String path2 = uri.getPath();
            kotlin.jvm.internal.j.b(path2);
            String strZ = x5.o.z(path2, "/assets/");
            List listB = x5.o.B(strZ, new char[]{'/'});
            if (!listB.isEmpty()) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.j.a((String) it.next(), "..")) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            InputStream inputStreamOpen = getAssets().open(strZ);
            kotlin.jvm.internal.j.b(inputStreamOpen);
            return inputStreamOpen;
        }
        if (!e5.l.c("https", "http").contains(uri.getScheme())) {
            throw new IllegalStateException("Unsupported PDF address");
        }
        URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        this.connection = httpURLConnection;
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        if (str != null && !x5.o.v(str)) {
            httpURLConnection.setRequestProperty("Cookie", str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        kotlin.jvm.internal.j.b(inputStream);
        return inputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$2(PdfActivity pdfActivity) {
        pdfActivity.finish();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$3(PdfActivity pdfActivity, String str, File file) {
        kotlin.jvm.internal.j.e("file", file);
        pdfActivity.pendingSave = file;
        try {
            pdfActivity.saveLauncher.a(w2.y.b(str));
        } catch (Exception unused) {
            pdfActivity.pendingSave = null;
            Toast.makeText(pdfActivity, R.string.pdf_document_export_failed, 0).show();
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$4(PdfActivity pdfActivity, androidx.activity.f0 f0Var) {
        kotlin.jvm.internal.j.e("$this$addCallback", f0Var);
        w2.l0 l0Var = pdfActivity.reader;
        if (l0Var == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        if (!l0Var.f14921v.e()) {
            pdfActivity.finish();
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream onCreate$lambda$6(PdfActivity pdfActivity, Uri uri, String str) throws Exception {
        try {
            if (uri != null) {
                return pdfActivity.input(uri, str);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e6) {
            HttpURLConnection httpURLConnection = pdfActivity.connection;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveLauncher$lambda$0(PdfActivity pdfActivity, Uri uri) {
        File file = pdfActivity.pendingSave;
        pdfActivity.pendingSave = null;
        if (uri == null || file == null) {
            return;
        }
        w2.y.c(pdfActivity, file, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        String string;
        String lastPathSegment;
        Uri data = getIntent().getData();
        if (data == null || (lastPathSegment = data.getLastPathSegment()) == null) {
            string = getString(R.string.pdf_loading);
            kotlin.jvm.internal.j.d("getString(...)", string);
        } else {
            string = x5.o.D(lastPathSegment, '/', lastPathSegment);
            if (x5.o.v(string)) {
                string = null;
            }
            if (string == null) {
            }
        }
        int intExtra = getIntent().getIntExtra(EXTRA_ACCENT, -14575885);
        String stringExtra = getIntent().getStringExtra(EXTRA_COLOR_MODE);
        if (stringExtra == null) {
            stringExtra = "auto";
        }
        if ((1531 & 4) != 0) {
            stringExtra = "auto";
        }
        String str = stringExtra;
        boolean z6 = (1531 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0;
        if ((1531 & 2048) != 0) {
            intExtra = -14575885;
        }
        w2.n0 n0Var = new w2.n0("vertical", "off", str, true, true, true, true, true, true, z6, 1, intExtra, (1531 & 4096) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : string);
        boolean z7 = (getResources().getConfiguration().uiMode & 48) == 32;
        String str2 = n0Var.f14955c;
        if (kotlin.jvm.internal.j.a(str2, "dark")) {
            z7 = true;
        } else if (kotlin.jvm.internal.j.a(str2, "light")) {
            z7 = false;
        }
        androidx.activity.t0 t0Var = z7 ? new androidx.activity.t0(0, 0, 2, androidx.activity.r0.s) : new androidx.activity.t0(0, 0, 1, androidx.activity.s0.s);
        androidx.activity.s.a(this, t0Var, t0Var);
        super.onCreate(bundle);
        w2.l0 l0Var = new w2.l0(this, n0Var, false, 36);
        this.reader = l0Var;
        l0Var.setOnBack(new f0(1, this));
        w2.l0 l0Var2 = this.reader;
        if (l0Var2 == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        l0Var2.getDocument().u(this, new androidx.camera.core.e0(string, this));
        w2.l0 l0Var3 = this.reader;
        if (l0Var3 == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        l0Var3.e(bundle);
        w2.l0 l0Var4 = this.reader;
        if (l0Var4 == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        setContentView(l0Var4);
        a1.a.a(getOnBackPressedDispatcher(), this, new androidx.camera.core.l(this));
        String cookie = data != null ? CookieManager.getInstance().getCookie(data.toString()) : null;
        w2.l0 l0Var5 = this.reader;
        if (l0Var5 == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        t0 t0Var2 = new t0(this, data, cookie, 0);
        w2.t tVar = l0Var5.f14921v;
        tVar.getClass();
        o oVar = new o(1, tVar, t0Var2);
        if (tVar.L) {
            throw new IllegalStateException("Document is already open");
        }
        tVar.L = true;
        tVar.f15025u.execute(new androidx.camera.core.x(8, oVar, tVar));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        w2.l0 l0Var = this.reader;
        if (l0Var == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        l0Var.d();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e("outState", bundle);
        w2.l0 l0Var = this.reader;
        if (l0Var == null) {
            kotlin.jvm.internal.j.g("reader");
            throw null;
        }
        l0Var.g(bundle);
        super.onSaveInstanceState(bundle);
    }
}
