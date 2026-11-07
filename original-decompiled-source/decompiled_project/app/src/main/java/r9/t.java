package r9;

import ae.y;
import com.google.android.gms.internal.play_billing.zzji;
import java.util.HashMap;
import r9.h;

/* loaded from: classes.dex */
public final class t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final j f23311a;

    /* renamed from: b, reason: collision with root package name */
    public final o9.b f23312b;

    /* renamed from: c, reason: collision with root package name */
    public final y f23313c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23314d;

    public t(j jVar, o9.b bVar, y yVar, u uVar) {
        this.f23311a = jVar;
        this.f23312b = bVar;
        this.f23313c = yVar;
        this.f23314d = uVar;
    }

    public final void a(o9.a aVar) {
        m0.r rVar = new m0.r();
        i iVar = new i(this.f23311a, aVar, this.f23313c, this.f23312b);
        u uVar = this.f23314d;
        w9.e eVar = uVar.f23318c;
        o9.a aVar2 = iVar.f23288c;
        o9.c cVar = aVar2.f19061b;
        j jVar = iVar.f23286a;
        String strA = jVar.a();
        if (strA == null) {
            throw new NullPointerException("Null backendName");
        }
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        j jVar2 = new j(strA, jVar.b(), cVar);
        h.a aVar3 = new h.a();
        aVar3.f23285f = new HashMap();
        aVar3.f23283d = Long.valueOf(uVar.f23316a.a());
        aVar3.f23284e = Long.valueOf(uVar.f23317b.a());
        String str = iVar.f23287b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar3.f23280a = str;
        T t3 = aVar2.f19060a;
        iVar.f23289d.getClass();
        aVar3.f23282c = new m(iVar.f23290e, ((zzji) t3).zzM());
        aVar2.getClass();
        aVar3.f23281b = null;
        eVar.a(jVar2, aVar3.b(), rVar);
    }
}
