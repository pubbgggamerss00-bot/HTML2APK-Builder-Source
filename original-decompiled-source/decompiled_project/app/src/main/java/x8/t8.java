package x8;

import com.yalantis.ucrop.view.CropImageView;
import f9.a9;
import org.bouncycastle.asn1.cmc.BodyPartID;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectReorderStateKt$rememberProjectReorderState$4$1", f = "ProjectReorderState.kt", l = {173, 175, 180}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t8 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public long f33213a;

    /* renamed from: b, reason: collision with root package name */
    public int f33214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f33215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f33216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f33217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.w0 f33218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(n8 n8Var, float f10, float f11, c0.w0 w0Var, tg.e<? super t8> eVar) {
        super(2, eVar);
        this.f33215c = n8Var;
        this.f33216d = f10;
        this.f33217e = f11;
        this.f33218f = w0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t8(this.f33215c, this.f33216d, this.f33217e, this.f33218f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t8) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0127 -> B:48:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013b -> B:53:0x013c). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objF0;
        long jLongValue;
        Object objF02;
        float f10;
        float fL;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33214b;
        int i11 = 2;
        n8 n8Var = this.f33215c;
        if (i10 == 0) {
            pg.q.b(obj);
            if (n8Var.f() == null) {
                return pg.f0.f21461a;
            }
            a9 a9Var = new a9(1);
            this.f33214b = 1;
            objF0 = x0.f1.a(getContext()).f0(a9Var, this);
        } else if (i10 == 1) {
            pg.q.b(obj);
            objF0 = obj;
        } else if (i10 == 2) {
            jLongValue = this.f33213a;
            pg.q.b(obj);
            objF02 = obj;
            long jLongValue2 = ((Number) objF02).longValue();
            f10 = (jLongValue2 - jLongValue) / 1.0E9f;
            if (f10 > 0.032f) {
            }
            c0.w0 w0Var = n8Var.f32988a;
            if (n8Var.f() != null) {
            }
            fL = 0.0f;
            if (fL == CropImageView.DEFAULT_ASPECT_RATIO) {
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLongValue = this.f33213a;
            pg.q.b(obj);
            n8 n8Var2 = n8Var;
            n8 n8Var3 = n8Var2;
            n8Var3.c(0L);
            n8Var = n8Var3;
            i11 = 2;
            if (n8Var.f() == null) {
                a9 a9Var2 = new a9(1);
                this.f33213a = jLongValue;
                this.f33214b = i11;
                objF02 = x0.f1.a(getContext()).f0(a9Var2, this);
                if (objF02 != aVar) {
                    long jLongValue22 = ((Number) objF02).longValue();
                    f10 = (jLongValue22 - jLongValue) / 1.0E9f;
                    if (f10 > 0.032f) {
                        f10 = 0.032f;
                    }
                    c0.w0 w0Var2 = n8Var.f32988a;
                    if (n8Var.f() != null) {
                        n8Var2 = n8Var;
                    } else {
                        c0.f0 f0VarI = w0Var2.i();
                        float fD = f0VarI.d() + f0VarI.h();
                        float fE = f0VarI.e() - f0VarI.c();
                        float f11 = this.f33216d;
                        float f12 = (i11 * f11) + fD;
                        if (fE < f12) {
                            fE = f12;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (n8Var.e() & BodyPartID.bodyIdMax));
                        float f13 = fD + f11;
                        float f14 = this.f33217e;
                        if (fIntBitsToFloat >= f13 || !w0Var2.b()) {
                            n8Var2 = n8Var;
                            if (Float.intBitsToFloat((int) (n8Var2.e() & BodyPartID.bodyIdMax)) > fE - f11 && w0Var2.d()) {
                                fL = jh.j.l(((Float.intBitsToFloat((int) (n8Var2.e() & BodyPartID.bodyIdMax)) - fE) + f11) / f11, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * f14;
                            }
                        } else {
                            n8Var2 = n8Var;
                            fL = jh.j.l((f13 - Float.intBitsToFloat((int) (n8Var.e() & BodyPartID.bodyIdMax))) / f11, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * (-f14);
                        }
                        if (fL == CropImageView.DEFAULT_ASPECT_RATIO) {
                            jLongValue = jLongValue22;
                            n8Var = n8Var2;
                            i11 = 2;
                            if (n8Var.f() == null) {
                                return pg.f0.f21461a;
                            }
                        } else {
                            float f15 = fL * f10;
                            this.f33213a = jLongValue22;
                            this.f33214b = 3;
                            if (qg.n0.f(this.f33218f, f15, this) != aVar) {
                                jLongValue = jLongValue22;
                                n8 n8Var32 = n8Var2;
                                n8Var32.c(0L);
                                n8Var = n8Var32;
                                i11 = 2;
                                if (n8Var.f() == null) {
                                }
                            }
                        }
                    }
                    fL = 0.0f;
                    if (fL == CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                }
                return aVar;
            }
        }
        jLongValue = ((Number) objF0).longValue();
        if (n8Var.f() == null) {
        }
    }
}
