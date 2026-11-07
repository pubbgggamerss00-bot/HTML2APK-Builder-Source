package t0;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.s3 f25480a = new x0.s3(a.f25481a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<za> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25481a = new a(0);

        @Override // eh.a
        public final za invoke() {
            return new za(0);
        }
    }

    public static final q1.f2 a(v0.c0 c0Var, x0.j jVar) {
        za zaVar = (za) jVar.f(f25480a);
        switch (c0Var.ordinal()) {
            case 0:
                return zaVar.f27600e;
            case 1:
                return b(zaVar.f27600e);
            case 2:
                return zaVar.f27596a;
            case 3:
                return b(zaVar.f27596a);
            case 4:
                return h0.f.f12083a;
            case 5:
                return zaVar.f27599d;
            case 6:
                h0.a aVar = zaVar.f27599d;
                float f10 = (float) 0.0d;
                return h0.a.c(aVar, new h0.c(f10), null, new h0.c(f10), 6);
            case 7:
                return b(zaVar.f27599d);
            case 8:
                return zaVar.f27598c;
            case 9:
                return q1.y1.f21750a;
            case 10:
                return zaVar.f27597b;
            default:
                throw new pg.l();
        }
    }

    public static final h0.a b(h0.a aVar) {
        float f10 = (float) 0.0d;
        return h0.a.c(aVar, null, new h0.c(f10), new h0.c(f10), 3);
    }
}
