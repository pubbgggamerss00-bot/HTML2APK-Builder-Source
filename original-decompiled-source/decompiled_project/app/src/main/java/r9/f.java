package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements vd.d<u9.e> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23268a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23269b;

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f23270c;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23269b = new vd.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        yd.a aVar2 = new yd.a(2);
        HashMap map2 = new HashMap();
        map2.put(yd.d.class, aVar2);
        f23270c = new vd.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        u9.e eVar2 = (u9.e) obj;
        vd.e eVar3 = eVar;
        eVar3.b(f23269b, eVar2.f29659a);
        eVar3.b(f23270c, eVar2.f29660b);
    }
}
