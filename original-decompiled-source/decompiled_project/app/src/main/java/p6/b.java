package p6;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21331a;

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final q6.c f21332a;

        public a(Context context) {
            this.f21332a = new q6.c(context);
        }

        @Override // p6.b.c
        public final WebResourceResponse a(String str) throws IOException {
            try {
                q6.c cVar = this.f21332a;
                String strSubstring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
                InputStream inputStreamOpen = cVar.f22063a.getAssets().open(strSubstring, 2);
                if (strSubstring.endsWith(".svgz")) {
                    inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                }
                return new WebResourceResponse(q6.c.b(str), null, inputStreamOpen);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* renamed from: p6.b$b, reason: collision with other inner class name */
    public static final class C0245b implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f21333b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a, reason: collision with root package name */
        public final File f21334a;

        public C0245b(Context context, File file) {
            try {
                this.f21334a = new File(q6.c.a(file));
                if (b(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        @Override // p6.b.c
        public final WebResourceResponse a(String str) throws IOException {
            File file;
            File file2 = this.f21334a;
            try {
                String strA = q6.c.a(file2);
                String canonicalPath = new File(file2, str).getCanonicalPath();
                file = canonicalPath.startsWith(strA) ? new File(canonicalPath) : null;
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (file == null) {
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, file2));
                return new WebResourceResponse(null, null, null);
            }
            InputStream fileInputStream = new FileInputStream(file);
            if (file.getPath().endsWith(".svgz")) {
                fileInputStream = new GZIPInputStream(fileInputStream);
            }
            return new WebResourceResponse(q6.c.b(str), null, fileInputStream);
        }

        public final boolean b(Context context) throws IOException {
            String strA = q6.c.a(this.f21334a);
            String strA2 = q6.c.a(context.getCacheDir());
            String strA3 = q6.c.a(context.getDataDir());
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (int i10 = 0; i10 < 5; i10++) {
                if (strA.startsWith(strA3 + f21333b[i10])) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface c {
        WebResourceResponse a(String str);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f21335a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21336b;

        /* renamed from: c, reason: collision with root package name */
        public final c f21337c;

        public d(String str, c cVar) {
            if ("/assets/".charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            this.f21335a = str;
            this.f21336b = "/assets/";
            this.f21337c = cVar;
        }
    }

    public b(ArrayList arrayList) {
        this.f21331a = arrayList;
    }
}
