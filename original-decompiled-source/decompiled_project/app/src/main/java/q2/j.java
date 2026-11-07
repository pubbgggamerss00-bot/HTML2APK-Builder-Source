package q2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.s f21771a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.s f21772b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(eh.a aVar, eh.a aVar2) {
        this.f21771a = (kotlin.jvm.internal.s) aVar;
        this.f21772b = (kotlin.jvm.internal.s) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.a<java.lang.Float>, kotlin.jvm.internal.s] */
    public final eh.a<Float> a() {
        return this.f21772b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v6, types: [eh.a, kotlin.jvm.internal.s] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f21771a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f21772b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
