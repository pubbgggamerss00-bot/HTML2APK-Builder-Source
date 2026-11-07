package sc;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<l> f24814a = new CopyOnWriteArrayList<>();

    public static l a(String str) throws GeneralSecurityException {
        Iterator<l> it = f24814a.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(m3.a.a("No KMS client does support: ", str));
    }
}
