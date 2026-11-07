package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import d4.t;
import java.util.concurrent.Executor;
import p5.x;
import pg.f0;
import s8.b2;
import t8.m3;
import t8.v2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1669d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f1666a = i10;
        this.f1667b = obj;
        this.f1668c = obj2;
        this.f1669d = obj3;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f1666a;
        Object obj = this.f1669d;
        Object obj2 = this.f1668c;
        Object obj3 = this.f1667b;
        switch (i10) {
            case 0:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$2((Executor) obj3, (t) obj2, (d4.j) obj);
            default:
                mh.k kVar = v2.f28495e;
                ((n1) obj).setValue(Boolean.FALSE);
                ((m3) obj3).g();
                b2.e((x) obj2);
                return f0.f21461a;
        }
    }
}
