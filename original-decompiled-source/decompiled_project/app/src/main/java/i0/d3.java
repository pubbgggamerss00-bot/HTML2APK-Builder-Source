package i0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class d3 extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.p f13254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.v f13255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2 f13257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.i2 f13258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(k0.p pVar, y2.v vVar, y2.c0 c0Var, i2 i2Var, q1.i2 i2Var2) {
        super(1);
        this.f13254a = pVar;
        this.f13255b = vVar;
        this.f13256c = c0Var;
        this.f13257d = i2Var;
        this.f13258e = i2Var2;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        float floatValue = this.f13254a.f15885c.getFloatValue();
        if (floatValue != CropImageView.DEFAULT_ASPECT_RATIO) {
            long j10 = this.f13256c.f33683b;
            int i10 = t2.j0.f27838c;
            int iB = this.f13255b.b((int) (j10 >> 32));
            l4 l4VarD = this.f13257d.d();
            p1.e eVarC = l4VarD != null ? l4VarD.f13418a.c(iB) : new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            float fFloor = (float) Math.floor(cVar2.N0(f3.f13279a));
            float f10 = fFloor < 1.0f ? 1.0f : fFloor;
            float f11 = f10 / 2;
            float f12 = eVarC.f21131a + f11;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.i() >> 32)) - f11;
            if (f12 > fIntBitsToFloat) {
                f12 = fIntBitsToFloat;
            }
            if (f12 >= f11) {
                f11 = f12;
            }
            float fFloor2 = ((int) f10) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
            cVar2.j1(this.f13258e, (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(eVarC.f21132b) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(eVarC.f21134d) & BodyPartID.bodyIdMax), f10, floatValue);
        }
        return pg.f0.f21461a;
    }
}
