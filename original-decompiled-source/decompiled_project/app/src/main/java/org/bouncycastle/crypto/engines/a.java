package org.bouncycastle.crypto.engines;

import android.content.Context;
import android.widget.Toast;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static String a(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static void b(Context context, int i10, Context context2, int i11) {
        Toast.makeText(context2, context.getString(i10), i11).show();
    }
}
