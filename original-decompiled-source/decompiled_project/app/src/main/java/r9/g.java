package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements vd.d<u9.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23271a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23272b;

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f23273c;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23272b = new vd.c("startMs", Collections.unmodifiableMap(new HashMap(map)));
        yd.a aVar2 = new yd.a(2);
        HashMap map2 = new HashMap();
        map2.put(yd.d.class, aVar2);
        f23273c = new vd.c("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        u9.f fVar = (u9.f) obj;
        vd.e eVar2 = eVar;
        eVar2.b(f23272b, fVar.f29661a);
        eVar2.b(f23273c, fVar.f29662b);
    }
}
