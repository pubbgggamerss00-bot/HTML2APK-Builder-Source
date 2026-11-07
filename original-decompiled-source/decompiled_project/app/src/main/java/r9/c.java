package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements vd.d<u9.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23260a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23261b;

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f23262c;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23261b = new vd.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        yd.a aVar2 = new yd.a(3);
        HashMap map2 = new HashMap();
        map2.put(yd.d.class, aVar2);
        f23262c = new vd.c("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        u9.c cVar = (u9.c) obj;
        vd.e eVar2 = eVar;
        eVar2.b(f23261b, cVar.f29645a);
        eVar2.a(f23262c, cVar.f29646b);
    }
}
