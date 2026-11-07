package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b extends a<String, Uri> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8745a = "application/pdf";

    @Override // f.a
    public final Intent a(Context context, String str) {
        String input = str;
        r.e(input, "input");
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f8745a).putExtra("android.intent.extra.TITLE", input);
        r.d(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
        return intentPutExtra;
    }

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
}
