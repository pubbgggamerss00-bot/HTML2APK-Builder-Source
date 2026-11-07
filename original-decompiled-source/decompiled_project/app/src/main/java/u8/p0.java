package u8;

import com.yalantis.ucrop.view.CropImageView;
import hh.c;
import java.util.ListIterator;
import x0.u1;
import x0.v1;
import x0.x1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$FarmStage$2$4$1", f = "CatGameScreen.kt", l = {885}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29506a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1.u<f1> f29508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f29509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f29510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h1.u<f1> uVar, float f10, float f11, tg.e<? super p0> eVar) {
        super(2, eVar);
        this.f29508c = uVar;
        this.f29509d = f10;
        this.f29510e = f11;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p0 p0Var = new p0(this.f29508c, this.f29509d, this.f29510e, eVar);
        p0Var.f29507b = obj;
        return p0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179 A[EDGE_INSN: B:56:0x0179->B:53:0x0179 BREAK  A[LOOP:0: B:15:0x003b->B:52:0x0172], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:14:0x0035). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        h1.c0 c0Var;
        ug.a aVar;
        ph.i0 i0Var2;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f29506a;
        int i11 = 1;
        if (i10 == 0) {
            pg.q.b(obj);
            i0Var = (ph.i0) this.f29507b;
            if (ph.j0.d(i0Var)) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0Var = (ph.i0) this.f29507b;
            pg.q.b(obj);
            ListIterator<f1> listIterator = this.f29508c.listIterator();
            while (true) {
                c0Var = (h1.c0) listIterator;
                if (c0Var.hasNext()) {
                    break;
                }
                f1 f1Var = (f1) c0Var.next();
                a aVarA = f1Var.a();
                v1 v1Var = f1Var.f29458j;
                x1 x1Var = f1Var.f29455g;
                u1 u1Var = f1Var.f29453e;
                u1 u1Var2 = f1Var.f29452d;
                u1 u1Var3 = f1Var.f29457i;
                u1 u1Var4 = f1Var.f29451c;
                u1 u1Var5 = f1Var.f29450b;
                a aVar3 = a.f29388a;
                if (aVarA == aVar3) {
                    float floatValue = u1Var2.getFloatValue() - u1Var5.getFloatValue();
                    float floatValue2 = u1Var.getFloatValue() - u1Var4.getFloatValue();
                    aVar = aVar2;
                    i0Var2 = i0Var;
                    if (((float) Math.sqrt((floatValue2 * floatValue2) + (floatValue * floatValue))) < 8.0f) {
                        float f10 = this.f29509d;
                        float f11 = f10 - 90.0f;
                        float f12 = f10 * 0.52f;
                        if (f12 < 60.0f) {
                            f12 = 60.0f;
                        }
                        float f13 = this.f29510e - 80.0f;
                        if (f13 < 10.0f) {
                            f13 = 10.0f;
                        }
                        float f14 = f11 - f12;
                        float f15 = f14 >= 10.0f ? f14 : 10.0f;
                        c.a aVar4 = hh.c.f13027a;
                        float fG = (aVar4.g() * f13) + 40.0f;
                        float fG2 = (aVar4.g() * f15) + f12;
                        float fG3 = aVar4.g();
                        if (fG3 < 0.3f) {
                            x1Var.setValue(a.f29389b);
                            v1Var.f(hh.c.f13028b.d(12, 26));
                            u1Var2.e(fG);
                            u1Var.e(fG2);
                            f1Var.b(u1Var2.getFloatValue() < u1Var5.getFloatValue());
                        } else if (fG3 < 0.45f) {
                            x1Var.setValue(a.f29391d);
                            v1Var.f(6);
                            u1Var2.e(fG);
                            u1Var.e(fG2);
                            f1Var.b(u1Var2.getFloatValue() < u1Var5.getFloatValue());
                        } else {
                            x1Var.setValue(aVar3);
                            u1Var2.e(fG);
                            u1Var.e(fG2);
                            f1Var.b(u1Var2.getFloatValue() < u1Var5.getFloatValue());
                        }
                    } else {
                        double dAtan2 = (float) Math.atan2(floatValue2, floatValue);
                        u1Var5.e((u1Var3.getFloatValue() * ((float) Math.cos(dAtan2)) * 2.0f) + u1Var5.getFloatValue());
                        u1Var4.e((u1Var3.getFloatValue() * ((float) Math.sin(dAtan2)) * 2.0f) + u1Var4.getFloatValue());
                        f1Var.b(floatValue < CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                } else {
                    aVar = aVar2;
                    i0Var2 = i0Var;
                }
                i0Var = i0Var2;
                aVar2 = aVar;
                i11 = 1;
            }
            if (ph.j0.d(i0Var)) {
                this.f29507b = i0Var;
                this.f29506a = i11;
                if (ph.t0.b(33L, this) == aVar2) {
                    return aVar2;
                }
                ListIterator<f1> listIterator2 = this.f29508c.listIterator();
                while (true) {
                    c0Var = (h1.c0) listIterator2;
                    if (c0Var.hasNext()) {
                    }
                    i0Var = i0Var2;
                    aVar2 = aVar;
                    i11 = 1;
                }
                if (ph.j0.d(i0Var)) {
                    return pg.f0.f21461a;
                }
            }
        }
    }
}
