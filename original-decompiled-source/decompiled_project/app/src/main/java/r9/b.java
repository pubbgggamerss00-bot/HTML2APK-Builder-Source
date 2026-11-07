package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements vd.d<u9.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23258a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23259b;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23259b = new vd.c("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        eVar.a(f23259b, ((u9.b) obj).f29644a);
    }
}
