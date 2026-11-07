package mf;

import java.io.BufferedInputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f18172a = new ConcurrentHashMap();

    public static se.b a(String str) throws Throwable {
        BufferedInputStream bufferedInputStreamD;
        ConcurrentHashMap concurrentHashMap = f18172a;
        se.b bVar = (se.b) concurrentHashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        se.c cVar = new se.c();
        try {
            bufferedInputStreamD = se.c.d(str);
            try {
                cVar.f24912b = false;
                se.b bVarH = cVar.h(bufferedInputStreamD);
                bufferedInputStreamD.close();
                concurrentHashMap.put(bVarH.f24901a, bVarH);
                return bVarH;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStreamD != null) {
                    bufferedInputStreamD.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStreamD = null;
        }
    }
}
