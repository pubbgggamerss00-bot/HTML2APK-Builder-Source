package yd;

import java.lang.annotation.Annotation;
import yd.d;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f34383a;

    public a(int i10) {
        this.f34383a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f34383a != ((a) ((d) obj)).f34383a) {
            return false;
        }
        Object obj2 = d.a.f34385a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f34383a) + (d.a.f34385a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f34383a + "intEncoding=" + d.a.f34385a + ')';
    }
}
