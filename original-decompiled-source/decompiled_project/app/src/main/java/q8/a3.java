package q8;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import com.yalantis.ucrop.view.CropImageView;

@vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$WalkingPixelCat$1$2$1", f = "WalkingPixelCat.kt", l = {142, 156, 165, 166, 167, 176}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public float f22100a;

    /* renamed from: b, reason: collision with root package name */
    public float f22101b;

    /* renamed from: c, reason: collision with root package name */
    public int f22102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f22104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f22105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<k> f22106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22107h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f22108j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(boolean z10, float f10, s.b<Float, s.o> bVar, x0.n1<k> n1Var, x0.n1<Boolean> n1Var2, x0.k1 k1Var, tg.e<? super a3> eVar) {
        super(2, eVar);
        this.f22103d = z10;
        this.f22104e = f10;
        this.f22105f = bVar;
        this.f22106g = n1Var;
        this.f22107h = n1Var2;
        this.f22108j = k1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a3(this.f22103d, this.f22104e, this.f22105f, this.f22106g, this.f22107h, this.f22108j, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (ph.t0.b(1600, r16) == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (ph.t0.b(150, r16) != r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        if (ph.t0.b(r0, r16) == r6) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f10;
        float f11;
        x0.k1 k1Var;
        Float f12;
        s.m2 m2VarD;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f22102c;
        float f13 = this.f22104e;
        x0.n1<Boolean> n1Var = this.f22107h;
        x0.n1<k> n1Var2 = this.f22106g;
        switch (i10) {
            case 0:
                pg.q.b(obj);
                if (this.f22103d) {
                    return pg.f0.f21461a;
                }
                int iOrdinal = n1Var2.getValue().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        hh.c.f13027a.getClass();
                        long jF = hh.c.f13028b.f(1500L, 3000L);
                        this.f22102c = 2;
                        break;
                    } else if (iOrdinal == 2) {
                        Float f14 = new Float(-16.0f);
                        s.m2 m2VarD2 = s.m.d(BinaryXmlFormat.RES_XML_CDATA_TYPE, 0, s.d0.f23703a, 2);
                        this.f22102c = 3;
                        if (s.b.c(this.f22105f, f14, m2VarD2, null, this, 12) != aVar) {
                            f12 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                            m2VarD = s.m.d(220, 0, s.d0.f23703a, 2);
                            this.f22102c = 4;
                            if (s.b.c(this.f22105f, f12, m2VarD, null, this, 12) != aVar) {
                                this.f22102c = 5;
                                break;
                            }
                        }
                    } else {
                        if (iOrdinal != 3) {
                            throw new pg.l();
                        }
                        this.f22102c = 6;
                        break;
                    }
                    return aVar;
                }
                f10 = 2.4f;
                f11 = n1Var.getValue().booleanValue() ? 8.0f : f13 - 8.0f;
                do {
                    k1Var = this.f22108j;
                    if (Math.abs(k1Var.getFloatValue() - f11) > 4.0f || n1Var2.getValue() != k.f22267a) {
                        if (n1Var2.getValue() == k.f22267a) {
                            hh.c.f13027a.getClass();
                            if (hh.c.f13028b.c(100) < 35) {
                                n1Var2.setValue(k.f22269c);
                            } else {
                                n1Var2.setValue(k.f22268b);
                            }
                        }
                        return pg.f0.f21461a;
                    }
                    if (n1Var.getValue().booleanValue()) {
                        float floatValue = k1Var.getFloatValue() - f10;
                        if (floatValue < CropImageView.DEFAULT_ASPECT_RATIO) {
                            floatValue = 0.0f;
                        }
                        k1Var.e(floatValue);
                    } else {
                        float floatValue2 = k1Var.getFloatValue() + f10;
                        if (floatValue2 > f13) {
                            floatValue2 = f13;
                        }
                        k1Var.e(floatValue2);
                    }
                    this.f22100a = f10;
                    this.f22101b = f11;
                    this.f22102c = 1;
                } while (ph.t0.b(20L, this) != aVar);
                return aVar;
            case 1:
                f11 = this.f22101b;
                f10 = this.f22100a;
                pg.q.b(obj);
                do {
                    k1Var = this.f22108j;
                    if (Math.abs(k1Var.getFloatValue() - f11) > 4.0f) {
                        break;
                    }
                    if (n1Var2.getValue() == k.f22267a) {
                    }
                    return pg.f0.f21461a;
                } while (ph.t0.b(20L, this) != aVar);
                return aVar;
            case 2:
                pg.q.b(obj);
                if (n1Var2.getValue() == k.f22268b) {
                    n1Var.setValue(Boolean.valueOf(!n1Var.getValue().booleanValue()));
                    n1Var2.setValue(k.f22267a);
                }
                return pg.f0.f21461a;
            case 3:
                pg.q.b(obj);
                f12 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                m2VarD = s.m.d(220, 0, s.d0.f23703a, 2);
                this.f22102c = 4;
                if (s.b.c(this.f22105f, f12, m2VarD, null, this, 12) != aVar) {
                }
                return aVar;
            case 4:
                pg.q.b(obj);
                this.f22102c = 5;
                break;
            case 5:
                pg.q.b(obj);
                if (n1Var2.getValue() == k.f22269c) {
                    n1Var.setValue(Boolean.valueOf(!n1Var.getValue().booleanValue()));
                    n1Var2.setValue(k.f22267a);
                }
                return pg.f0.f21461a;
            case 6:
                pg.q.b(obj);
                if (n1Var2.getValue() == k.f22270d) {
                    n1Var2.setValue(k.f22267a);
                }
                return pg.f0.f21461a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
