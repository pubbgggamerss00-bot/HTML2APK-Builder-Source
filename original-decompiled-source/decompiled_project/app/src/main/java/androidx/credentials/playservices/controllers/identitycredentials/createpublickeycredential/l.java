package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import b9.j0;
import b9.o1;
import p5.x;
import pg.f0;
import s8.b2;
import t8.v2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1665c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f1663a = i10;
        this.f1664b = obj;
        this.f1665c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1663a;
        Object obj = this.f1665c;
        Object obj2 = this.f1664b;
        switch (i10) {
            case 0:
                break;
            case 1:
                o1.p.a(((j0) obj2).f3903j, (n1) obj);
                break;
            default:
                mh.k kVar = v2.f28495e;
                ((n1) obj).setValue(Boolean.FALSE);
                b2.e((x) obj2);
                break;
        }
        return f0.f21461a;
    }
}
