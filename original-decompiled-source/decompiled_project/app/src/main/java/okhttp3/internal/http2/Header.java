package okhttp3.internal.http2;

import hi.j;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final j f19582d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f19583e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f19584f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f19585g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f19586h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f19587i;

    /* renamed from: a, reason: collision with root package name */
    public final j f19588a;

    /* renamed from: b, reason: collision with root package name */
    public final j f19589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19590c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        j jVar = j.f13075d;
        f19582d = j.a.b(":");
        f19583e = j.a.b(":status");
        f19584f = j.a.b(":method");
        f19585g = j.a.b(":path");
        f19586h = j.a.b(":scheme");
        f19587i = j.a.b(":authority");
    }

    public Header(j name, j value) {
        r.e(name, "name");
        r.e(value, "value");
        this.f19588a = name;
        this.f19589b = value;
        this.f19590c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return r.a(this.f19588a, header.f19588a) && r.a(this.f19589b, header.f19589b);
    }

    public final int hashCode() {
        return this.f19589b.hashCode() + (this.f19588a.hashCode() * 31);
    }

    public final String toString() {
        return this.f19588a.q() + ": " + this.f19589b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(j.a.b(name), j.a.b(value));
        r.e(name, "name");
        r.e(value, "value");
        j jVar = j.f13075d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(j name, String value) {
        this(name, j.a.b(value));
        r.e(name, "name");
        r.e(value, "value");
        j jVar = j.f13075d;
    }
}
