package kc;

/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16290c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile k f16291a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f16292b;

    /* JADX WARN: Multi-variable type inference failed */
    public static h b(i iVar) {
        if (iVar instanceof h) {
            return (h) iVar;
        }
        h hVar = new h();
        hVar.f16292b = f16290c;
        hVar.f16291a = iVar;
        return hVar;
    }

    @Override // kc.k
    public final Object a() {
        Object objA;
        Object obj = this.f16292b;
        Object obj2 = f16290c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f16292b;
                if (objA == obj2) {
                    objA = this.f16291a.a();
                    Object obj3 = this.f16292b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f16292b = objA;
                    this.f16291a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
