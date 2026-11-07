package dc;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7827c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f7828a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f7829b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f7829b = f7827c;
        bVar.f7828a = cVar;
        return bVar;
    }

    @Override // dc.c
    public final Object zza() {
        Object objZza;
        Object obj = this.f7829b;
        Object obj2 = f7827c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f7829b;
                if (objZza == obj2) {
                    objZza = this.f7828a.zza();
                    Object obj3 = this.f7829b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f7829b = objZza;
                    this.f7828a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
