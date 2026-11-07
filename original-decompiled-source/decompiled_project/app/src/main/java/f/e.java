package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.a;

/* loaded from: classes.dex */
public final class e extends a<Uri, Uri> {
    @Override // f.a
    public final Intent a(Context context, Uri uri) {
        Uri uri2 = uri;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (uri2 != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri2);
        }
        return intent;
    }

    @Override // f.a
    public final a.C0091a<Uri> b(Context context, Uri uri) {
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
