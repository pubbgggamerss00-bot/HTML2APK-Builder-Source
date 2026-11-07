package i8;

import com.android.billingclient.api.Purchase;
import eh.p;
import java.util.ArrayList;
import pg.f0;
import pg.q;
import ph.i0;
import sh.o0;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$processAllPurchases$2$1$1", f = "BillingManager.kt", l = {395}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Purchase f14252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Purchase purchase, j jVar, tg.e<? super l> eVar) {
        super(2, eVar);
        this.f14252b = purchase;
        this.f14253c = jVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new l(this.f14252b, this.f14253c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((l) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14251a;
        if (i10 == 0) {
            q.b(obj);
            ArrayList arrayListA = this.f14252b.a();
            int size = arrayListA.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayListA.get(i11);
                i11++;
                if (j.f14217r.contains((String) obj2)) {
                    break;
                }
            }
            String str = (String) obj2;
            if (str == null) {
                str = "";
            }
            o0 o0Var = this.f14253c.f14225e;
            this.f14251a = 1;
            if (o0Var.c(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
