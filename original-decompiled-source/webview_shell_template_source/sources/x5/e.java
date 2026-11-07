package x5;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements Serializable {
    public final Pattern s;

    public e(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.j.d("compile(...)", patternCompile);
        this.s = patternCompile;
    }

    public static d a(e eVar, String str) {
        eVar.getClass();
        kotlin.jvm.internal.j.e("input", str);
        Matcher matcher = eVar.s.matcher(str);
        kotlin.jvm.internal.j.d("matcher(...)", matcher);
        if (matcher.find(0)) {
            return new d(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.s.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    public e(String str, int i6) {
        Pattern patternCompile = Pattern.compile(str, 66);
        kotlin.jvm.internal.j.d("compile(...)", patternCompile);
        this.s = patternCompile;
    }
}
