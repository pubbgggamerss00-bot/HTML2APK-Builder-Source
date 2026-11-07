package r9;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements vd.d<u9.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23253a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final vd.c f23254b;

    /* renamed from: c, reason: collision with root package name */
    public static final vd.c f23255c;

    /* renamed from: d, reason: collision with root package name */
    public static final vd.c f23256d;

    /* renamed from: e, reason: collision with root package name */
    public static final vd.c f23257e;

    static {
        yd.a aVar = new yd.a(1);
        HashMap map = new HashMap();
        map.put(yd.d.class, aVar);
        f23254b = new vd.c("window", Collections.unmodifiableMap(new HashMap(map)));
        yd.a aVar2 = new yd.a(2);
        HashMap map2 = new HashMap();
        map2.put(yd.d.class, aVar2);
        f23255c = new vd.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        yd.a aVar3 = new yd.a(3);
        HashMap map3 = new HashMap();
        map3.put(yd.d.class, aVar3);
        f23256d = new vd.c("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        yd.a aVar4 = new yd.a(4);
        HashMap map4 = new HashMap();
        map4.put(yd.d.class, aVar4);
        f23257e = new vd.c("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // vd.a
    public final void a(Object obj, vd.e eVar) throws IOException {
        u9.a aVar = (u9.a) obj;
        vd.e eVar2 = eVar;
        eVar2.a(f23254b, aVar.f29636a);
        eVar2.a(f23255c, aVar.f29637b);
        eVar2.a(f23256d, aVar.f29638c);
        eVar2.a(f23257e, aVar.f29639d);
    }
}
