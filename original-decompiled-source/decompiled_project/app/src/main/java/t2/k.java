package t2;

import android.graphics.Matrix;
import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements eh.l<o, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.j0 f27840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q1.j0 j0Var, int i10, int i11) {
        super(1);
        this.f27840a = j0Var;
        this.f27841b = i10;
        this.f27842c = i11;
    }

    @Override // eh.l
    public final pg.f0 invoke(o oVar) {
        o oVar2 = oVar;
        a aVar = oVar2.f27864a;
        int iD = oVar2.d(this.f27841b);
        int iD2 = oVar2.d(this.f27842c);
        CharSequence charSequence = aVar.f27748e;
        if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
            StringBuilder sbA = p.g0.a(iD, iD2, "start(", ") or end(", ") is out of range [0..");
            sbA.append(charSequence.length());
            sbA.append("], or start > end!");
            z2.a.a(sbA.toString());
        }
        Path path = new Path();
        u2.j0 j0Var = aVar.f27747d;
        j0Var.f29206f.getSelectionPath(iD, iD2, path);
        int i10 = j0Var.f29208h;
        if (i10 != 0 && !path.isEmpty()) {
            path.offset(CropImageView.DEFAULT_ASPECT_RATIO, i10);
        }
        float f10 = oVar2.f27869f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
        Matrix matrix = new Matrix();
        matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)));
        path.transform(matrix);
        int i11 = (int) 0;
        this.f27840a.f21712a.addPath(path, Float.intBitsToFloat(i11), Float.intBitsToFloat(i11));
        return pg.f0.f21461a;
    }
}
