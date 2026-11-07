package p5;

/* loaded from: classes.dex */
public final class p {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p);
    }

    public final int hashCode() {
        return Integer.hashCode(0) * 31;
    }

    public final String toString() {
        String str = p.class.getSimpleName() + "(0x" + Integer.toHexString(0) + ")";
        kotlin.jvm.internal.r.d(str, "toString(...)");
        return str;
    }
}
