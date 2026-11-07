package c2;

/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: b, reason: collision with root package name */
    public final int f4592b;

    public b(int i10) {
        this.f4592b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f4592b == ((b) obj).f4592b;
    }

    public final int hashCode() {
        return this.f4592b;
    }

    public final String toString() {
        return b.b.a(new StringBuilder("AndroidPointerIcon(type="), this.f4592b, ')');
    }
}
