package nc;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18686a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f18687b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f18688c = new b(1);

    public static class a extends i {
        @Override // nc.i
        public final i a(j jVar, j jVar2) {
            int iCompareTo = jVar.compareTo(jVar2);
            return iCompareTo < 0 ? i.f18687b : iCompareTo > 0 ? i.f18688c : i.f18686a;
        }

        @Override // nc.i
        public final int b() {
            return 0;
        }
    }

    public static final class b extends i {

        /* renamed from: d, reason: collision with root package name */
        public final int f18689d;

        public b(int i10) {
            this.f18689d = i10;
        }

        @Override // nc.i
        public final i a(j jVar, j jVar2) {
            return this;
        }

        @Override // nc.i
        public final int b() {
            return this.f18689d;
        }
    }

    public abstract i a(j jVar, j jVar2);

    public abstract int b();
}
