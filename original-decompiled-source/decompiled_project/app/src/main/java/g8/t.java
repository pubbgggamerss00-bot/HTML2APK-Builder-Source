package g8;

import com.basitce.htmltoapk.R;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.p;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.account.AccountViewModel$deleteAccount$1", f = "AccountViewModel.kt", l = {EACTags.SEX}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d9.w f11632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, d9.w wVar, tg.e eVar) {
        super(2, eVar);
        this.f11631b = uVar;
        this.f11632c = wVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new t(this.f11631b, this.f11632c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((t) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        u uVar = this.f11631b;
        z0 z0Var = uVar.f11639h;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11630a;
        if (i10 == 0) {
            pg.q.b(obj);
            p pVar = uVar.f11633b;
            this.f11630a = 1;
            objE = pVar.e(this);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            objE = ((pg.p) obj).f21471a;
        }
        if (!(objE instanceof p.a)) {
            Integer num = new Integer(R.string.account_deleted);
            z0Var.getClass();
            z0Var.j(null, num);
            this.f11632c.invoke();
        }
        Throwable thA = pg.p.a(objE);
        if (thA != null) {
            a aVar2 = thA instanceof a ? (a) thA : null;
            Integer num2 = new Integer(w.a(aVar2 != null ? aVar2.f11559a : null));
            z0Var.getClass();
            z0Var.j(null, num2);
        }
        z0 z0Var2 = uVar.f11637f;
        Boolean bool = Boolean.FALSE;
        z0Var2.getClass();
        z0Var2.j(null, bool);
        return f0.f21461a;
    }
}
