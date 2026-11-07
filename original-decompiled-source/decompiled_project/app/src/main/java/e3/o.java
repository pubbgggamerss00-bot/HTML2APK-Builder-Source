package e3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f8378c = new o(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final o f8379d = new o(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f8380a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8381b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8382a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f8382a == ((a) obj).f8382a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8382a);
        }

        public final String toString() {
            int i10 = this.f8382a;
            return i10 == 1 ? "Linearity.Linear" : i10 == 2 ? "Linearity.FontHinting" : i10 == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public o(int i10, boolean z10) {
        this.f8380a = i10;
        this.f8381b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f8380a == oVar.f8380a && this.f8381b == oVar.f8381b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8381b) + (Integer.hashCode(this.f8380a) * 31);
    }

    public final String toString() {
        return equals(f8378c) ? "TextMotion.Static" : equals(f8379d) ? "TextMotion.Animated" : "Invalid";
    }
}
