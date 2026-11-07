package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public class c extends a<String, Uri> {
    @Override // f.a
    public final a.C0091a<Uri> b(Context context, String str) {
        String input = str;
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

    @Override // f.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        r.e(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        r.d(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }
}
