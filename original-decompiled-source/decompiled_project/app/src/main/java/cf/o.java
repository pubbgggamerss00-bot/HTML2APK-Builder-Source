package cf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class o extends b implements v {

    /* renamed from: b, reason: collision with root package name */
    public b f5549b;

    /* renamed from: c, reason: collision with root package name */
    public long f5550c;

    /* renamed from: d, reason: collision with root package name */
    public int f5551d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5552e = false;

    public o(b bVar) throws IOException {
        this.f5549b = bVar;
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        b bVar2 = this.f5549b;
        if (bVar2 != null) {
            return bVar2.f0(bVar);
        }
        m.f5548c.f0(bVar);
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("COSObject{");
        sb.append(this.f5550c);
        sb.append(", ");
        return x0.a.a(sb, this.f5551d, "}");
    }
}
