package ka;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final sa.a f16240a = new sa.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        n.a(context).b();
        Set set = com.google.android.gms.common.api.h.f5927a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.g.a();
    }
}
