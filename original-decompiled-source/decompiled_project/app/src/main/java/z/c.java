package z;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements eh.p<Integer, f3.r, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f34469a = new c(2);

    @Override // eh.p
    public final Integer invoke(Integer num, f3.r rVar) {
        return Integer.valueOf(Math.round((1 + (rVar != f3.r.f8828a ? (-1.0f) * (-1) : -1.0f)) * (num.intValue() / 2.0f)));
    }
}
