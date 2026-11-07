package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements vd.d<u9.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23263a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23264b;

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f23265c;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23264b = new vd.c("logSource", Collections.unmodifiableMap(new HashMap(map)));
        yd.a aVar2 = new yd.a(2);
        HashMap map2 = new HashMap();
        map2.put(yd.d.class, aVar2);
        f23265c = new vd.c("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        u9.d dVar = (u9.d) obj;
        vd.e eVar2 = eVar;
        eVar2.a(f23264b, dVar.f29657a);
        eVar2.a(f23265c, dVar.f29658b);
    }
}
