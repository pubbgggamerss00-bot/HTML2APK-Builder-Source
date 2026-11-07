package androidx.credentials.playservices;

import android.content.Context;
import j9.d0;
import j9.x1;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1734c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.f1732a = i10;
        this.f1733b = obj;
        this.f1734c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1732a) {
            case 0:
                break;
            case 1:
                ((h1.u) this.f1733b).remove((i9.a) this.f1734c);
                break;
            default:
                d0.j((Context) this.f1733b, ((x1.a) this.f1734c).f15643h);
                break;
        }
        return f0.f21461a;
    }
}
