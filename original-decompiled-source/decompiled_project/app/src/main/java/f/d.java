package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends a<String[], Uri> {
    @Override // f.a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        r.e(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
        r.d(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override // f.a
    public final a.C0091a<Uri> b(Context context, String[] strArr) {
        String[] input = strArr;
        r.e(input, "input");
        return null;
    }

    @Override // f.a
    public final Object c(Intent intent, int i10) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
