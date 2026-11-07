package i9;

import com.yalantis.ucrop.view.CropImageView;
import hh.c;
import java.util.List;
import java.util.ListIterator;
import ph.i0;
import q1.b1;
import x0.f1;
import x0.k1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$CelebrationConfettiRain$1$1", f = "SupportThankYouOverlay.kt", l = {561}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.u<b> f14403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f14404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f14405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<b1> f14406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h1.u<b> uVar, k1 k1Var, k1 k1Var2, List<b1> list, tg.e<? super y> eVar) {
        super(2, eVar);
        this.f14403b = uVar;
        this.f14404c = k1Var;
        this.f14405d = k1Var2;
        this.f14406e = list;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y(this.f14403b, this.f14404c, this.f14405d, this.f14406e, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        ((y) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        eh.l lVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14402a;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        do {
            final h1.u<b> uVar = this.f14403b;
            final k1 k1Var = this.f14404c;
            final k1 k1Var2 = this.f14405d;
            final List<b1> list = this.f14406e;
            lVar = new eh.l() { // from class: i9.x
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    ((Long) obj2).getClass();
                    k1 k1Var3 = k1Var;
                    if (k1Var3.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                        k1 k1Var4 = k1Var2;
                        if (k1Var4.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                            h1.u uVar2 = uVar;
                            if (uVar2.size() < 120) {
                                for (int i11 = 0; i11 < 2; i11++) {
                                    c.a aVar2 = hh.c.f13027a;
                                    uVar2.add(new b(k1Var3.getFloatValue() * aVar2.g(), -20.0f, (aVar2.g() * 9.0f) + 4.0f, ((b1) qg.x.Q(list, aVar2)).f21656a, (aVar2.g() * 2.8f) + 1.8f, aVar2.g() * 360.0f, 360.0f * aVar2.g(), (aVar2.g() * 4.5f) - 2.25f, hh.c.f13028b.c(2)));
                                }
                            }
                            ListIterator listIterator = uVar2.listIterator();
                            while (true) {
                                h1.c0 c0Var = (h1.c0) listIterator;
                                if (!c0Var.hasNext()) {
                                    break;
                                }
                                b bVar = (b) c0Var.next();
                                float f10 = bVar.f14278b;
                                float f11 = bVar.f14282f;
                                float f12 = f10 + bVar.f14281e;
                                if (f12 > k1Var4.getFloatValue() + 40.0f) {
                                    c0Var.remove();
                                } else {
                                    int iIndexOf = uVar2.indexOf(bVar);
                                    if (iIndexOf >= 0) {
                                        float fSin = (((float) Math.sin(Math.toRadians(f11))) * 1.5f) + bVar.f14277a;
                                        float f13 = bVar.f14283g;
                                        float f14 = bVar.f14284h;
                                        uVar2.set(iIndexOf, new b(fSin, f12, bVar.f14279c, bVar.f14280d, bVar.f14281e, f11 + 1.2f, f13 + f14, f14, bVar.f14285i));
                                    }
                                }
                            }
                        }
                    }
                    return pg.f0.f21461a;
                }
            };
            this.f14402a = 1;
        } while (f1.b(lVar, this) != aVar);
        return aVar;
    }
}
