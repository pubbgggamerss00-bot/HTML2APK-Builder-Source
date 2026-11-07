package xd;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import vd.g;

/* loaded from: classes2.dex */
public final class e implements wd.a<e> {

    /* renamed from: e, reason: collision with root package name */
    public static final xd.a f33546e = new xd.a();

    /* renamed from: f, reason: collision with root package name */
    public static final b f33547f = new b();

    /* renamed from: g, reason: collision with root package name */
    public static final c f33548g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final a f33549h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f33550a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f33551b;

    /* renamed from: c, reason: collision with root package name */
    public final xd.a f33552c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33553d;

    public static final class a implements vd.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f33554a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f33554a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // vd.a
        public final void a(Object obj, g gVar) throws IOException {
            gVar.add(f33554a.format((Date) obj));
        }
    }

    public e() {
        HashMap map = new HashMap();
        this.f33550a = map;
        HashMap map2 = new HashMap();
        this.f33551b = map2;
        this.f33552c = f33546e;
        this.f33553d = false;
        map2.put(String.class, f33547f);
        map.remove(String.class);
        map2.put(Boolean.class, f33548g);
        map.remove(Boolean.class);
        map2.put(Date.class, f33549h);
        map.remove(Date.class);
    }

    public final wd.a a(Class cls, vd.d dVar) {
        this.f33550a.put(cls, dVar);
        this.f33551b.remove(cls);
        return this;
    }
}
