package sc;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i {
    public static h a(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference<f> atomicReference = r.f24831a;
        synchronized (r.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(r.f24834d);
        }
        h hVar = (h) mapUnmodifiableMap.get(str);
        if (hVar != null) {
            return hVar;
        }
        throw new GeneralSecurityException(m3.a.a("cannot find key template: ", str));
    }
}
