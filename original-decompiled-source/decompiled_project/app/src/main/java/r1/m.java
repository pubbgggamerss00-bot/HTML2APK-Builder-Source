package r1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final p.y<l> f23107a;

    static {
        z zVar = j.f23079e;
        int i10 = zVar.f23074c;
        k kVar = new k(zVar, zVar, 1);
        int i11 = zVar.f23074c;
        q qVar = j.f23098x;
        int i12 = (qVar.f23074c << 6) | i11;
        l lVar = new l(zVar, qVar, 0);
        int i13 = (i11 << 6) | qVar.f23074c;
        l lVar2 = new l(qVar, zVar, 0);
        p.y yVar = p.j.f20648a;
        p.y<l> yVar2 = new p.y<>();
        yVar2.h(i10 | (i10 << 6), kVar);
        yVar2.h(i12, lVar);
        yVar2.h(i13, lVar2);
        f23107a = yVar2;
    }
}
