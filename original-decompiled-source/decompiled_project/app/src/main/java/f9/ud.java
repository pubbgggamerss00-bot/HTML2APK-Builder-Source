package f9;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class ud extends f.c {
    @Override // f.c, f.a
    /* renamed from: d */
    public final Intent a(Context context, String input) {
        kotlin.jvm.internal.r.e(input, "input");
        Intent intentA = super.a(context, input);
        intentA.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/html", "text/plain", "application/xhtml+xml"});
        return intentA;
    }
}
