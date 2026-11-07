package rd;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f23435a = new x0();

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }
}
