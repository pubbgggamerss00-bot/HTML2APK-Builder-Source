package v8;

import pg.f0;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30736b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f30735a = i10;
        this.f30736b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f30735a) {
            case 0:
                ((eh.l) this.f30736b).invoke("html_file");
                break;
            default:
                ((n1) this.f30736b).setValue(Boolean.FALSE);
                break;
        }
        return f0.f21461a;
    }
}
