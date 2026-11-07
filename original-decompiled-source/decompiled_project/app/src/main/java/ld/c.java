package ld;

/* loaded from: classes2.dex */
public final class c extends kd.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16981a;

    /* renamed from: b, reason: collision with root package name */
    public final id.j f16982b;

    public c(String str, id.j jVar) {
        com.google.android.gms.common.internal.p.d(str);
        this.f16981a = str;
        this.f16982b = jVar;
    }

    public static c c(kd.b bVar) {
        com.google.android.gms.common.internal.p.f(bVar);
        return new c(bVar.b(), null);
    }

    @Override // kd.c
    public final id.j a() {
        return this.f16982b;
    }

    @Override // kd.c
    public final String b() {
        return this.f16981a;
    }
}
