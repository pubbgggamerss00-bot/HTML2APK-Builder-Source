package m0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final a f17593a;

    /* renamed from: b, reason: collision with root package name */
    public final a f17594b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17595c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e3.g f17596a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17597b;

        /* renamed from: c, reason: collision with root package name */
        public final long f17598c;

        public a(e3.g gVar, int i10, long j10) {
            this.f17596a = gVar;
            this.f17597b = i10;
            this.f17598c = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17596a == aVar.f17596a && this.f17597b == aVar.f17597b && this.f17598c == aVar.f17598c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f17598c) + androidx.datastore.preferences.protobuf.a1.a(this.f17597b, this.f17596a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "AnchorInfo(direction=" + this.f17596a + ", offset=" + this.f17597b + ", selectableId=" + this.f17598c + ')';
        }
    }

    public z(a aVar, a aVar2, boolean z10) {
        this.f17593a = aVar;
        this.f17594b = aVar2;
        this.f17595c = z10;
    }

    public static z a(z zVar, a aVar, a aVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            aVar = zVar.f17593a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = zVar.f17594b;
        }
        if ((i10 & 4) != 0) {
            z10 = zVar.f17595c;
        }
        zVar.getClass();
        return new z(aVar, aVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.r.a(this.f17593a, zVar.f17593a) && kotlin.jvm.internal.r.a(this.f17594b, zVar.f17594b) && this.f17595c == zVar.f17595c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17595c) + ((this.f17594b.hashCode() + (this.f17593a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f17593a + ", end=" + this.f17594b + ", handlesCrossed=" + this.f17595c + ')';
    }
}
