package r3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import q3.e;

/* loaded from: classes.dex */
public class a0 {
    public a0() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, v3.l[] lVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileC = b0.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (b0.a(fileC, resources, i10)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }
}
