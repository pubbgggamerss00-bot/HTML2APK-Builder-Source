package ci;

import bi.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import re.o;
import zh.h;

/* loaded from: classes2.dex */
public abstract class a implements d, b {
    @Override // ci.b
    public boolean A(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return f();
    }

    @Override // ci.d
    public byte B() {
        F();
        throw null;
    }

    @Override // ci.d
    public short C() {
        F();
        throw null;
    }

    @Override // ci.d
    public float D() {
        F();
        throw null;
    }

    @Override // ci.d
    public double E() {
        F();
        throw null;
    }

    public void F() {
        throw new h(h0.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract List G(ArrayList arrayList, o oVar);

    public void H(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof o) {
                List listG = G(arrayList, (o) obj);
                arrayList.clear();
                if (listG != null) {
                    arrayList.addAll(listG);
                }
            } else {
                arrayList.add((Number) obj);
            }
        }
    }

    @Override // ci.b
    public void b(f descriptor) {
        r.e(descriptor, "descriptor");
    }

    @Override // ci.d
    public b c(f descriptor) {
        r.e(descriptor, "descriptor");
        return this;
    }

    @Override // ci.d
    public d e(f descriptor) {
        r.e(descriptor, "descriptor");
        return this;
    }

    @Override // ci.d
    public boolean f() {
        F();
        throw null;
    }

    @Override // ci.d
    public char h() {
        F();
        throw null;
    }

    @Override // ci.d
    public int i(f enumDescriptor) {
        r.e(enumDescriptor, "enumDescriptor");
        F();
        throw null;
    }

    @Override // ci.b
    public double j(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return E();
    }

    @Override // ci.b
    public long k(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return v();
    }

    @Override // ci.d
    public int m() {
        F();
        throw null;
    }

    @Override // ci.b
    public short n(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return C();
    }

    @Override // ci.b
    public byte o(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return B();
    }

    @Override // ci.b
    public d p(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return e(descriptor.h(i10));
    }

    @Override // ci.d
    public String r() {
        F();
        throw null;
    }

    @Override // ci.b
    public Object s(f descriptor, int i10, zh.b deserializer, Object obj) {
        r.e(descriptor, "descriptor");
        r.e(deserializer, "deserializer");
        if (deserializer.getDescriptor().c() || x()) {
            return q(deserializer);
        }
        return null;
    }

    @Override // ci.b
    public float t(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return D();
    }

    @Override // ci.b
    public Object u(f descriptor, int i10, zh.a deserializer, Object obj) {
        r.e(descriptor, "descriptor");
        r.e(deserializer, "deserializer");
        return q(deserializer);
    }

    @Override // ci.d
    public long v() {
        F();
        throw null;
    }

    @Override // ci.b
    public int w(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return m();
    }

    @Override // ci.d
    public boolean x() {
        return true;
    }

    @Override // ci.b
    public char y(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return h();
    }

    @Override // ci.b
    public String z(f descriptor, int i10) {
        r.e(descriptor, "descriptor");
        return r();
    }
}
