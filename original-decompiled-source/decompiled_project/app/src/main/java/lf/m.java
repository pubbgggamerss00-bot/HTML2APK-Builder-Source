package lf;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f17052b = new m();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17053a;

    public m() {
        HashMap map = new HashMap();
        this.f17053a = map;
        HashMap map2 = new HashMap();
        if (map.containsKey("Standard")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Standard", p.class);
        map2.put(o.class, p.class);
        if (map.containsKey("Adobe.PubSec")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Adobe.PubSec", i.class);
        map2.put(g.class, i.class);
    }
}
