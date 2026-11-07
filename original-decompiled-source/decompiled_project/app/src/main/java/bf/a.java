package bf;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static AssetManager f4214a;

    public static InputStream a(String str) throws IOException {
        if (f4214a == null) {
            Log.e("PdfBox-Android", "PDFBoxResourceLoader is not initialized, call PDFBoxResourceLoader.init() before use");
        }
        return f4214a.open(str);
    }
}
