package i9;

import com.yalantis.ucrop.view.CropImageView;
import hh.c;
import ph.i0;
import ph.j0;
import x0.u1;
import x0.x1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$SupportThankYouOverlay$4$2$2$1", f = "SupportThankYouOverlay.kt", l = {413, 434, 438, 447}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public float f14313a;

    /* renamed from: b, reason: collision with root package name */
    public float f14314b;

    /* renamed from: c, reason: collision with root package name */
    public float f14315c;

    /* renamed from: d, reason: collision with root package name */
    public int f14316d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f3.d f14318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f14319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f14320h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f14321j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f3.d dVar, float f10, float f11, f0 f0Var, tg.e<? super e0> eVar) {
        super(2, eVar);
        this.f14318f = dVar;
        this.f14319g = f10;
        this.f14320h = f11;
        this.f14321j = f0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e0 e0Var = new e0(this.f14318f, this.f14319g, this.f14320h, this.f14321j, eVar);
        e0Var.f14317e = obj;
        return e0Var;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((e0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (ph.t0.b(r11, r23) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
    
        if (ph.t0.b(1800, r23) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        if (ph.t0.b(r1, r23) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0223, code lost:
    
        if (ph.t0.b(22, r23) == r8) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e8 -> B:36:0x00ec). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f10;
        i0 i0Var;
        i0 i0Var2;
        float f11;
        float f12;
        float f13;
        x1 x1Var;
        f0 f0Var;
        x1 x1Var2;
        i0 i0Var3;
        u1 u1Var;
        f0 f0Var2;
        f0 f0Var3 = this.f14321j;
        u1 u1Var2 = f0Var3.f14329f;
        x1 x1Var3 = f0Var3.f14333j;
        x1 x1Var4 = f0Var3.f14332i;
        u1 u1Var3 = f0Var3.f14331h;
        u1 u1Var4 = f0Var3.f14328e;
        u1 u1Var5 = f0Var3.f14330g;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14316d;
        int i11 = 4;
        if (i10 == 0) {
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            pg.q.b(obj);
            i0Var = (i0) this.f14317e;
            hh.c.f13027a.getClass();
            long jF = hh.c.f13028b.f(40L, 350L);
            this.f14317e = i0Var;
            this.f14316d = 1;
        } else if (i10 == 1) {
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            i0Var = (i0) this.f14317e;
            pg.q.b(obj);
        } else if (i10 == 2) {
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            f11 = this.f14315c;
            float f14 = this.f14314b;
            float f15 = this.f14313a;
            i0 i0Var4 = (i0) this.f14317e;
            pg.q.b(obj);
            f0Var = f0Var3;
            i0Var3 = i0Var4;
            f12 = f15;
            f13 = f14;
            x1Var = x1Var3;
            x1Var2 = x1Var4;
            f0 f0Var4 = f0Var;
            i0Var2 = i0Var3;
            f0Var3 = f0Var4;
            x1Var4 = x1Var2;
            x1Var3 = x1Var;
            i11 = 4;
            if (!j0.d(i0Var2)) {
            }
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f11 = this.f14315c;
                f13 = this.f14314b;
                f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                f12 = this.f14313a;
                i0Var2 = (i0) this.f14317e;
                pg.q.b(obj);
                if (f0Var3.a() == e.f14311c) {
                    c.a aVar2 = hh.c.f13027a;
                    u1Var5.e(aVar2.g() * f12);
                    u1Var3.e(((f13 - f11) * aVar2.g()) + f11);
                    x1Var4.setValue(Boolean.valueOf(u1Var5.getFloatValue() < u1Var4.getFloatValue()));
                    x1Var3.setValue(e.f14309a);
                }
                if (!j0.d(i0Var2)) {
                    return pg.f0.f21461a;
                }
                int iOrdinal = f0Var3.a().ordinal();
                if (iOrdinal == 0) {
                    f0Var2 = f0Var3;
                    u1Var = u1Var2;
                    float floatValue = u1Var5.getFloatValue() - u1Var4.getFloatValue();
                    float floatValue2 = u1Var3.getFloatValue() - u1Var.getFloatValue();
                    i0 i0Var5 = i0Var2;
                    if (((float) Math.sqrt((floatValue2 * floatValue2) + (floatValue * floatValue))) < 8.0f) {
                        x1Var3.setValue(e.f14310b);
                        i0Var2 = i0Var5;
                        f0Var3 = f0Var2;
                        u1Var2 = u1Var;
                        i11 = 4;
                        if (!j0.d(i0Var2)) {
                        }
                    } else {
                        x1Var = x1Var3;
                        float fAtan2 = (float) Math.atan2(floatValue2, floatValue);
                        float f16 = f0Var2.f14326c;
                        double d10 = fAtan2;
                        u1Var4.e(jh.j.l((((float) Math.cos(d10)) * f16) + u1Var4.getFloatValue(), f10, f12));
                        f0Var = f0Var2;
                        u1Var2 = u1Var;
                        u1Var2.e(jh.j.l((((float) Math.sin(d10)) * f16) + u1Var.getFloatValue(), f11, f13));
                        x1Var4.setValue(Boolean.valueOf(floatValue < f10));
                        i0Var3 = i0Var5;
                        this.f14317e = i0Var3;
                        this.f14313a = f12;
                        this.f14314b = f13;
                        this.f14315c = f11;
                        this.f14316d = 2;
                        x1Var2 = x1Var4;
                    }
                } else if (iOrdinal == 1) {
                    hh.c.f13027a.getClass();
                    f0Var2 = f0Var3;
                    u1Var = u1Var2;
                    long jF2 = hh.c.f13028b.f(1200L, 2600L);
                    i0Var2 = i0Var2;
                    this.f14317e = i0Var2;
                    this.f14313a = f12;
                    this.f14314b = f13;
                    this.f14315c = f11;
                    this.f14316d = 3;
                } else {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    this.f14317e = i0Var2;
                    this.f14313a = f12;
                    this.f14314b = f13;
                    this.f14315c = f11;
                    this.f14316d = i11;
                }
                return aVar;
            }
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            f11 = this.f14315c;
            float f17 = this.f14314b;
            float f18 = this.f14313a;
            i0 i0Var6 = (i0) this.f14317e;
            pg.q.b(obj);
            f13 = f17;
            i0Var2 = i0Var6;
            f12 = f18;
            f0Var2 = f0Var3;
            u1Var = u1Var2;
            if (f0Var2.a() == e.f14310b) {
                c.a aVar3 = hh.c.f13027a;
                u1Var5.e(aVar3.g() * f12);
                u1Var3.e(((f13 - f11) * aVar3.g()) + f11);
                x1Var4.setValue(Boolean.valueOf(u1Var5.getFloatValue() < u1Var4.getFloatValue()));
                x1Var3.setValue(e.f14309a);
            }
            f0Var3 = f0Var2;
            u1Var2 = u1Var;
            i11 = 4;
            if (!j0.d(i0Var2)) {
            }
        }
        float fN0 = this.f14318f.N0(f0Var3.f14325b);
        float f19 = this.f14319g - fN0;
        if (f19 < f10) {
            f19 = f10;
        }
        float f20 = (this.f14320h - fN0) - 60.0f;
        float f21 = f20 >= 60.0f ? f20 : 60.0f;
        i0Var2 = i0Var;
        f11 = 50.0f;
        f12 = f19;
        f13 = f21;
        if (!j0.d(i0Var2)) {
        }
    }
}
