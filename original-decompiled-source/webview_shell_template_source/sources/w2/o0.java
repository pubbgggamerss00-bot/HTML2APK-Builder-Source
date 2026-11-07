package w2;

import android.content.SharedPreferences;
import androidx.activity.ComponentActivity;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14967a;

    public o0(ComponentActivity componentActivity, String str) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_.-]");
            kotlin.jvm.internal.j.d("compile(...)", patternCompile);
            String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
            kotlin.jvm.internal.j.d("replaceAll(...)", strReplaceAll);
            sharedPreferences = componentActivity.getSharedPreferences("pdfviewer_".concat(x5.p.I(80, strReplaceAll)), 0);
        } else {
            sharedPreferences = null;
        }
        this.f14967a = sharedPreferences;
    }
}
