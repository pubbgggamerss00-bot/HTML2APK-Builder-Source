package a9;

import com.yalantis.ucrop.view.CropImageView;
import hh.c;
import java.util.List;
import java.util.ListIterator;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.premium.PremiumScreenKt$ConfettiRain$1$1", f = "PremiumScreen.kt", l = {1463}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.u<d> f316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<q1.b1> f319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(h1.u<d> uVar, x0.k1 k1Var, x0.k1 k1Var2, List<q1.b1> list, tg.e<? super u0> eVar) {
        super(2, eVar);
        this.f316b = uVar;
        this.f317c = k1Var;
        this.f318d = k1Var2;
        this.f319e = list;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u0(this.f316b, this.f317c, this.f318d, this.f319e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        ((u0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        eh.l lVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f315a;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        do {
            final h1.u<d> uVar = this.f316b;
            final x0.k1 k1Var = this.f317c;
            final x0.k1 k1Var2 = this.f318d;
            final List<q1.b1> list = this.f319e;
            lVar = new eh.l() { // from class: a9.t0
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    ((Long) obj2).getClass();
                    x0.k1 k1Var3 = k1Var;
                    if (k1Var3.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                        x0.k1 k1Var4 = k1Var2;
                        if (k1Var4.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                            h1.u uVar2 = uVar;
                            if (uVar2.size() < 150) {
                                for (int i11 = 0; i11 < 2; i11++) {
                                    c.a aVar2 = hh.c.f13027a;
                                    uVar2.add(new d(k1Var3.getFloatValue() * aVar2.g(), -20.0f, (aVar2.g() * 8.0f) + 4.0f, ((q1.b1) qg.x.Q(list, aVar2)).f21656a, (aVar2.g() * 2.5f) + 1.5f, aVar2.g() * 360.0f, aVar2.g() * 360.0f, (aVar2.g() * 4.0f) - 2.0f, hh.c.f13028b.c(2)));
                                }
                            }
                            ListIterator listIterator = uVar2.listIterator();
                            while (true) {
                                h1.c0 c0Var = (h1.c0) listIterator;
                                if (!c0Var.hasNext()) {
                                    break;
                                }
                                d dVar = (d) c0Var.next();
                                float f10 = dVar.f177b;
                                float f11 = dVar.f181f;
                                float f12 = f10 + dVar.f180e;
                                if (f12 > k1Var4.getFloatValue() + 40.0f) {
                                    c0Var.remove();
                                } else {
                                    int iIndexOf = uVar2.indexOf(dVar);
                                    if (iIndexOf >= 0) {
                                        float fSin = (((float) Math.sin(Math.toRadians(f11))) * 1.5f) + dVar.f176a;
                                        float f13 = dVar.f182g;
                                        float f14 = dVar.f183h;
                                        uVar2.set(iIndexOf, new d(fSin, f12, dVar.f178c, dVar.f179d, dVar.f180e, f11 + 1.0f, f13 + f14, f14, dVar.f184i));
                                    }
                                }
                            }
                        }
                    }
                    return pg.f0.f21461a;
                }
            };
            this.f315a = 1;
        } while (x0.f1.b(lVar, this) != aVar);
        return aVar;
    }
}
