package cf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f5418c = {116, 114, 117, 101};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f5419d = {102, 97, 108, 115, 101};

    /* renamed from: e, reason: collision with root package name */
    public static final c f5420e = new c(true);

    /* renamed from: f, reason: collision with root package name */
    public static final c f5421f = new c(false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5422b;

    public c(boolean z10) {
        this.f5422b = z10;
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        gf.a aVar = bVar.f12056d;
        if (this.f5422b) {
            aVar.write(f5418c);
            return null;
        }
        aVar.write(f5419d);
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f5422b);
    }
}
