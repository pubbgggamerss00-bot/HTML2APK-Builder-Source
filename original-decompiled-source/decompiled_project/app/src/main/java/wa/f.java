package wa;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31487a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
