package m9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f17980a;

    public w1(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_.-]");
            kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
            kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
            sharedPreferences = context.getSharedPreferences("pdfviewer_".concat(mh.y.b0(80, strReplaceAll)), 0);
        } else {
            sharedPreferences = null;
        }
        this.f17980a = sharedPreferences;
    }
}
