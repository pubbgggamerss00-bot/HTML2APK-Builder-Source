package ld;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.TimeUnit;
import r1.a0;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements OnFailureListener, r1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17003a;

    public /* synthetic */ k(Object obj) {
        this.f17003a = obj;
    }

    @Override // r1.n
    public double b(double d10) {
        a0 a0Var = (a0) this.f17003a;
        double d11 = a0Var.f23059b;
        return d10 >= a0Var.f23062e ? Math.pow((d11 * d10) + a0Var.f23060c, a0Var.f23058a) : a0Var.f23061d * d10;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        l lVar = (l) this.f17003a;
        lVar.a();
        lVar.f17008e = lVar.f17008e == -1 ? 30L : lVar.f17008e * 2 < 960 ? lVar.f17008e * 2 : 960L;
        lVar.f17007d = lVar.f17006c.schedule(new j(lVar), lVar.f17008e, TimeUnit.SECONDS);
    }
}
