package yd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34396a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34397b;

    /* renamed from: c, reason: collision with root package name */
    public final vd.d<Object> f34398c;

    public static final class a implements wd.a<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f34399a = new g();
    }

    public h(HashMap map, HashMap map2, vd.d dVar) {
        this.f34396a = map;
        this.f34397b = map2;
        this.f34398c = dVar;
    }

    public final void a(u9.a aVar, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        HashMap map = this.f34397b;
        vd.d<Object> dVar = this.f34398c;
        HashMap map2 = this.f34396a;
        f fVar = new f(byteArrayOutputStream, map2, map, dVar);
        vd.d dVar2 = (vd.d) map2.get(u9.a.class);
        if (dVar2 != null) {
            dVar2.a(aVar, fVar);
        } else {
            throw new vd.b("No encoder for " + u9.a.class);
        }
    }
}
